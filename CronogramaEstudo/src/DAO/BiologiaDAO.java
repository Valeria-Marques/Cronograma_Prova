
package DAO;

import Modelo.Biologia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BiologiaDAO extends ExecuteSQL{
    public BiologiaDAO(Connection con) {
        super(con);
    }
    
     public String InserirBiologia(Biologia b) {
        String sql = "INSERT INTO biologia VALUES (0,?,?,?)";
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
     
     public String ExcluirBiologia(Biologia b) {
        String sql = "DELETE FROM biologia WHERE id = ? AND conteudo = ?";
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
    
      public List<Biologia> ListarBiologia() {
        String sql = "SELECT id,conteudo,data,hora FROM biologia";
        List<Biologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Biologia b = new Biologia();
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

      public List<Biologia> PesquisarNomeBiologia(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM biologia WHERE conteudo LIKE '%" + nome + "%'";
        List<Biologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Biologia b = new Biologia();
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

       public List<Biologia> ListarComboBiologia() {
        String sql = "SELECT conteudo FROM biologia ORDER BY conteudo";
        List<Biologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Biologia b = new Biologia();
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
       
       public List<Biologia> ConsultaCodigoBiologia(String nome) {
        String sql = "SELECT id FROM biologia WHERE conteudo = '" + nome + "'";
        List<Biologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Biologia b = new Biologia();
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
    public List<Biologia> PesquisarCodigoBiologia(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM biologia WHERE id LIKE'" + C + "%'";
        List<Biologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Biologia b = new Biologia();
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
    public String AlterarBiologia(Biologia b) {
        String sql = "update biologia set conteudo = ?,data = ?,hora = ? where id = ? ";
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
     
    public List<Biologia> CapturarBiologia(int cod) {
        String sql = "SELECT * FROM biologia WHERE id = " + cod + " ";
        List<Biologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Biologia b = new Biologia();
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
    
     public boolean TestarBiologia(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM biologia WHERE id = " + cod + "";
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
