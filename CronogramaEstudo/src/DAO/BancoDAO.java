
package DAO;

import Modelo.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BancoDAO extends ExecuteSQL{
    public BancoDAO(Connection con) {
        super(con);
    }
    
     public String InserirBanco(Banco b) {
        String sql = "INSERT INTO banco VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, b.getConteudo());
            ps.setString(2, b.getData());
            ps.setString(3, b.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     
     public String ExcluirBanco(Banco b) {
        String sql = "DELETE FROM banco WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, b.getId());
            ps.setString(2, b.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
      public List<Banco> ListarBanco() {
        String sql = "SELECT id,conteudo,data,hora FROM banco";
        List<Banco> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Banco b = new Banco();
                    b.setId(rs.getInt(1));
                    b.setConteudo(rs.getString(2));
                    b.setData(rs.getString(3));
                    b.setHora(rs.getString(4));
                    lista.add(b);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

      public List<Banco> PesquisarNomeBanco(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM banco WHERE conteudo LIKE '%" + nome + "%'";
        List<Banco> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Banco b = new Banco();
                    b.setId(rs.getInt(1));
                    b.setConteudo(rs.getString(2));
                    b.setData(rs.getString(3));
                    b.setHora(rs.getString(4));
                    lista.add(b);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

       public List<Banco> ListarComboBanco() {
        String sql = "SELECT conteudo FROM banco ORDER BY conteudo";
        List<Banco> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Banco b = new Banco();
                    b.setConteudo(rs.getString(1));
                    lista.add(b);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
       
       public List<Banco> ConsultaCodigoBanco(String nome) {
        String sql = "SELECT id FROM banco WHERE conteudo = '" + nome + "'";
        List<Banco> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Banco b = new Banco();
                    b.setId(rs.getInt(1));
                    lista.add(b);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    public List<Banco> PesquisarCodigoBanco(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM banco WHERE id LIKE'" + C + "%'";
        List<Banco> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Banco b = new Banco();
                    b.setId(rs.getInt(1));
                    b.setConteudo(rs.getString(2));
                    b.setData(rs.getString(3));
                    b.setHora(rs.getString(4));
                    lista.add(b);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    public String AlterarBanco(Banco b) {
        String sql = "update banco set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, b.getConteudo());
            ps.setString(2, b.getData());
            ps.setString(3, b.getHora());
            ps.setInt(4, b.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }  
     
    public List<Banco> CapturarBanco(int cod) {
        String sql = "SELECT * FROM banco WHERE id = " + cod + " ";
        List<Banco> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Banco b = new Banco();
                    b.setId(rs.getInt(1));
                    b.setConteudo(rs.getString(2));
                    b.setData(rs.getString(3));
                    b.setHora(rs.getString(4));
                    lista.add(b);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
     public boolean TestarBanco(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM banco WHERE id = " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Resultado = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return Resultado;
    }


      
}
