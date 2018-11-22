package DAO;

import Modelo.Historia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class HistoriaDAO extends ExecuteSQL{
    public HistoriaDAO(Connection con) {
        super(con);
    }
    
     public String InserirHistoria(Historia h) {
        String sql = "INSERT INTO historia VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, h.getConteudo());
            ps.setString(2, h.getData());
            ps.setString(3, h.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirHistoria(Historia h) {
        String sql = "DELETE FROM historia WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, h.getId());
            ps.setString(2, h.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Historia> ListarHistoria() {
        String sql = "SELECT id,conteudo,data,hora FROM historia";
        List<Historia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Historia h = new Historia();
                    h.setId(rs.getInt(1));
                    h.setConteudo(rs.getString(2));
                    h.setData(rs.getString(3));
                    h.setHora(rs.getString(4));
                    lista.add(h);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Historia> PesquisarNomeHistoria(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM historia WHERE conteudo LIKE '%" + nome + "%'";
        List<Historia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Historia h = new Historia();
                    h.setId(rs.getInt(1));
                    h.setConteudo(rs.getString(2));
                    h.setData(rs.getString(3));
                    h.setHora(rs.getString(4));
                    lista.add(h);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Historia> ListarComboHistoria() {
        String sql = "SELECT conteudo FROM historia ORDER BY conteudo";
        List<Historia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Historia h = new Historia();
                    h.setConteudo(rs.getString(1));
                    lista.add(h);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Historia> ConsultaCodigoHistoria(String nome) {
        String sql = "SELECT id FROM historia WHERE conteudo = '" + nome + "'";
        List<Historia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Historia h = new Historia();
                    h.setId(rs.getInt(1));
                    lista.add(h);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Historia> PesquisarCodigoHistoria(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM historia WHERE id LIKE'" + C + "%'";
        List<Historia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Historia h = new Historia();
                    h.setId(rs.getInt(1));
                    h.setConteudo(rs.getString(2));
                    h.setData(rs.getString(3));
                    h.setHora(rs.getString(4));
                    lista.add(h);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarHistoria(Historia h) {
        String sql = "update historia set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, h.getConteudo());
            ps.setString(2, h.getData());
            ps.setString(3, h.getHora());
            ps.setInt(4, h.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Historia> CapturarHistoria(int cod) {
        String sql = "SELECT * FROM historia WHERE id = " + cod + " ";
        List<Historia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Historia h = new Historia();
                    h.setId(rs.getInt(1));
                    h.setConteudo(rs.getString(2));
                    h.setData(rs.getString(3));
                    h.setHora(rs.getString(4));
                    lista.add(h);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarHistoria(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM historia WHERE id = " + cod + "";
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
