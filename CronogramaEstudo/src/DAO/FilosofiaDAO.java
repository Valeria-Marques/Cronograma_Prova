package DAO;

import Modelo.Filosofia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class FilosofiaDAO extends ExecuteSQL{
    public FilosofiaDAO(Connection con) {
        super(con);
    }
    
     public String InserirFilosofia(Filosofia f) {
        String sql = "INSERT INTO filosofia VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getConteudo());
            ps.setString(2, f.getData());
            ps.setString(3, f.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirFilosofia(Filosofia f) {
        String sql = "DELETE FROM filosofia WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, f.getId());
            ps.setString(2, f.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Filosofia> ListarFilosofia() {
        String sql = "SELECT id,conteudo,data,hora FROM filosofia";
        List<Filosofia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Filosofia f = new Filosofia();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Filosofia> PesquisarNomeFilosofia(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM filosofia WHERE conteudo LIKE '%" + nome + "%'";
        List<Filosofia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Filosofia f = new Filosofia();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Filosofia> ListarComboFilosofia() {
        String sql = "SELECT conteudo FROM filosofia ORDER BY conteudo";
        List<Filosofia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Filosofia f = new Filosofia();
                    f.setConteudo(rs.getString(1));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Filosofia> ConsultaCodigoFilosofia(String nome) {
        String sql = "SELECT id FROM filosofia WHERE conteudo = '" + nome + "'";
        List<Filosofia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Filosofia f = new Filosofia();
                    f.setId(rs.getInt(1));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Filosofia> PesquisarCodigoFilosofia(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM filosofia WHERE id LIKE'" + C + "%'";
        List<Filosofia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Filosofia f = new Filosofia();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarFilosofia(Filosofia f) {
        String sql = "update filosofia set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getConteudo());
            ps.setString(2, f.getData());
            ps.setString(3, f.getHora());
            ps.setInt(4, f.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Filosofia> CapturarFilosofia(int cod) {
        String sql = "SELECT * FROM filosofia WHERE id = " + cod + " ";
        List<Filosofia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Filosofia f = new Filosofia();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarFilosofia(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM filosofia WHERE id = " + cod + "";
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
