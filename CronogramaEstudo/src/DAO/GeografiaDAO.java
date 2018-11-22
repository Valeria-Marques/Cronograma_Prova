package DAO;

import Modelo.Geografia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class GeografiaDAO extends ExecuteSQL{
    public GeografiaDAO(Connection con) {
        super(con);
    }
    
     public String InserirGeografia(Geografia g) {
        String sql = "INSERT INTO fisica VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, g.getConteudo());
            ps.setString(2, g.getData());
            ps.setString(3, g.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirGeografia(Geografia g) {
        String sql = "DELETE FROM geografia WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, g.getId());
            ps.setString(2, g.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Geografia> ListarGeografia() {
        String sql = "SELECT id,conteudo,data,hora FROM geografia";
        List<Geografia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Geografia g = new Geografia();
                    g.setId(rs.getInt(1));
                    g.setConteudo(rs.getString(2));
                    g.setData(rs.getString(3));
                    g.setHora(rs.getString(4));
                    lista.add(g);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Geografia> PesquisarNomeGeografia(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM geografia WHERE conteudo LIKE '%" + nome + "%'";
        List<Geografia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Geografia g = new Geografia();
                    g.setId(rs.getInt(1));
                    g.setConteudo(rs.getString(2));
                    g.setData(rs.getString(3));
                    g.setHora(rs.getString(4));
                    lista.add(g);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Geografia> ListarComboGeografia() {
        String sql = "SELECT conteudo FROM geografia ORDER BY conteudo";
        List<Geografia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Geografia g = new Geografia();
                    g.setConteudo(rs.getString(1));
                    lista.add(g);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Geografia> ConsultaCodigoGeografia(String nome) {
        String sql = "SELECT id FROM geografia WHERE conteudo = '" + nome + "'";
        List<Geografia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Geografia g = new Geografia();
                    g.setId(rs.getInt(1));
                    lista.add(g);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Geografia> PesquisarCodigoGeografia(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM geografia WHERE id LIKE'" + C + "%'";
        List<Geografia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Geografia g = new Geografia();
                    g.setId(rs.getInt(1));
                    g.setConteudo(rs.getString(2));
                    g.setData(rs.getString(3));
                    g.setHora(rs.getString(4));
                    lista.add(g);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarGeografia(Geografia g) {
        String sql = "update geografia set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, g.getConteudo());
            ps.setString(2, g.getData());
            ps.setString(3, g.getHora());
            ps.setInt(4, g.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Geografia> CapturarGeografia(int cod) {
        String sql = "SELECT * FROM geografia WHERE id = " + cod + " ";
        List<Geografia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                   Geografia g = new Geografia();
                    g.setId(rs.getInt(1));
                    g.setConteudo(rs.getString(2));
                    g.setData(rs.getString(3));
                    g.setHora(rs.getString(4));
                    lista.add(g);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarGeografia(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM geografia WHERE id = " + cod + "";
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
