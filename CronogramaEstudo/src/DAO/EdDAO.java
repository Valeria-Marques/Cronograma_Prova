
package DAO;

import Modelo.Ed;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class EdDAO extends ExecuteSQL{
    public EdDAO(Connection con) {
        super(con);
    }
    
     public String InserirEd(Ed e) {
        String sql = "INSERT INTO ed VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, e.getConteudo());
            ps.setString(2, e.getData());
            ps.setString(3, e.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirEd(Ed e) {
        String sql = "DELETE FROM ed WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, e.getId());
            ps.setString(2, e.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Ed> ListarEd() {
        String sql = "SELECT id,conteudo,data,hora FROM ed";
        List<Ed> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ed e = new Ed();
                    e.setId(rs.getInt(1));
                    e.setConteudo(rs.getString(2));
                    e.setData(rs.getString(3));
                    e.setHora(rs.getString(4));
                    lista.add(e);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Ed> PesquisarNomeEd(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM ed WHERE conteudo LIKE '%" + nome + "%'";
        List<Ed> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ed e = new Ed();
                    e.setId(rs.getInt(1));
                    e.setConteudo(rs.getString(2));
                    e.setData(rs.getString(3));
                    e.setHora(rs.getString(4));
                    lista.add(e);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Ed> ListarComboEd() {
        String sql = "SELECT conteudo FROM ed ORDER BY conteudo";
        List<Ed> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ed e = new Ed();
                    e.setConteudo(rs.getString(1));
                    lista.add(e);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Ed> ConsultaCodigoEd(String nome) {
        String sql = "SELECT id FROM ed WHERE conteudo = '" + nome + "'";
        List<Ed> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Ed e = new Ed();
                    e.setId(rs.getInt(1));
                    lista.add(e);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Ed> PesquisarCodigoEd(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM ed WHERE id LIKE'" + C + "%'";
        List<Ed> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ed e = new Ed();
                    e.setId(rs.getInt(1));
                    e.setConteudo(rs.getString(2));
                    e.setData(rs.getString(3));
                    e.setHora(rs.getString(4));
                    lista.add(e);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarEd(Ed e) {
        String sql = "update ed set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, e.getConteudo());
            ps.setString(2, e.getData());
            ps.setString(3, e.getHora());
            ps.setInt(4, e.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Ed> CapturarEd(int cod) {
        String sql = "SELECT * FROM ed WHERE id = " + cod + " ";
        List<Ed> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ed e = new Ed();
                    e.setId(rs.getInt(1));
                    e.setConteudo(rs.getString(2));
                    e.setData(rs.getString(3));
                    e.setHora(rs.getString(4));
                    lista.add(e);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarEd(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM ed WHERE id = " + cod + "";
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
