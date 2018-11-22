package DAO;

import Modelo.Ingles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class InglesDAO extends ExecuteSQL{
    public InglesDAO(Connection con) {
        super(con);
    }
    
     public String InserirIngles(Ingles i) {
        String sql = "INSERT INTO ingles VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, i.getConteudo());
            ps.setString(2, i.getData());
            ps.setString(3, i.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirIngles(Ingles i) {
        String sql = "DELETE FROM ingles WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, i.getId());
            ps.setString(2, i.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Ingles> ListarIngles() {
        String sql = "SELECT id,conteudo,data,hora FROM ingles";
        List<Ingles> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ingles i = new Ingles();
                    i.setId(rs.getInt(1));
                    i.setConteudo(rs.getString(2));
                    i.setData(rs.getString(3));
                    i.setHora(rs.getString(4));
                    lista.add(i);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Ingles> PesquisarNomeIngles(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM ingles WHERE conteudo LIKE '%" + nome + "%'";
        List<Ingles> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ingles i = new Ingles();
                    i.setId(rs.getInt(1));
                    i.setConteudo(rs.getString(2));
                    i.setData(rs.getString(3));
                    i.setHora(rs.getString(4));
                    lista.add(i);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Ingles> ListarComboIngles() {
        String sql = "SELECT conteudo FROM ingles ORDER BY conteudo";
        List<Ingles> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ingles i = new Ingles();
                    i.setConteudo(rs.getString(1));
                    lista.add(i);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Ingles> ConsultaCodigoIngles(String nome) {
        String sql = "SELECT id FROM ingles WHERE conteudo = '" + nome + "'";
        List<Ingles> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Ingles i = new Ingles();
                    i.setId(rs.getInt(1));
                    lista.add(i);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Ingles> PesquisarCodigoIngles(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM ingles WHERE id LIKE'" + C + "%'";
        List<Ingles> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ingles i = new Ingles();
                    i.setId(rs.getInt(1));
                    i.setConteudo(rs.getString(2));
                    i.setData(rs.getString(3));
                    i.setHora(rs.getString(4));
                    lista.add(i);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarIngles(Ingles i) {
        String sql = "update ingles set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, i.getConteudo());
            ps.setString(2, i.getData());
            ps.setString(3, i.getHora());
            ps.setInt(4, i.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Ingles> CapturarIngles(int cod) {
        String sql = "SELECT * FROM ingles WHERE id = " + cod + " ";
        List<Ingles> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Ingles i = new Ingles();
                    i.setId(rs.getInt(1));
                    i.setConteudo(rs.getString(2));
                    i.setData(rs.getString(3));
                    i.setHora(rs.getString(4));
                    lista.add(i);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarIngles(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM ingles WHERE id = " + cod + "";
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
