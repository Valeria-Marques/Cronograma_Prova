package DAO;

import Modelo.Quimica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class QuimicaDAO extends ExecuteSQL{
    public QuimicaDAO(Connection con) {
        super(con);
    }
    
     public String InserirQuimica(Quimica q) {
        String sql = "INSERT INTO quimica VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, q.getConteudo());
            ps.setString(2, q.getData());
            ps.setString(3, q.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirQuimica(Quimica q) {
        String sql = "DELETE FROM quimica WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, q.getId());
            ps.setString(2, q.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Quimica> ListarQuimica() {
        String sql = "SELECT id,conteudo,data,hora FROM quimica";
        List<Quimica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Quimica q = new Quimica();
                    q.setId(rs.getInt(1));
                    q.setConteudo(rs.getString(2));
                    q.setData(rs.getString(3));
                    q.setHora(rs.getString(4));
                    lista.add(q);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Quimica> PesquisarNomeQuimica(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM quimica WHERE conteudo LIKE '%" + nome + "%'";
        List<Quimica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Quimica q = new Quimica();
                    q.setId(rs.getInt(1));
                    q.setConteudo(rs.getString(2));
                    q.setData(rs.getString(3));
                    q.setHora(rs.getString(4));
                    lista.add(q);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Quimica> ListarComboQuimica() {
        String sql = "SELECT conteudo FROM quimica ORDER BY conteudo";
        List<Quimica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Quimica q = new Quimica();
                    q.setConteudo(rs.getString(1));
                    lista.add(q);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Quimica> ConsultaCodigoQuimica(String nome) {
        String sql = "SELECT id FROM quimica WHERE conteudo = '" + nome + "'";
        List<Quimica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Quimica q = new Quimica();
                    q.setId(rs.getInt(1));
                    lista.add(q);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Quimica> PesquisarCodigoQuimica(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM quimica WHERE id LIKE'" + C + "%'";
        List<Quimica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Quimica q = new Quimica();
                    q.setId(rs.getInt(1));
                    q.setConteudo(rs.getString(2));
                    q.setData(rs.getString(3));
                    q.setHora(rs.getString(4));
                    lista.add(q);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarQuimica(Quimica q) {
        String sql = "update quimica set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, q.getConteudo());
            ps.setString(2, q.getData());
            ps.setString(3, q.getHora());
            ps.setInt(4, q.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Quimica> CapturarQuimica(int cod) {
        String sql = "SELECT * FROM quimica WHERE id = " + cod + " ";
        List<Quimica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Quimica q = new Quimica();
                    q.setId(rs.getInt(1));
                    q.setConteudo(rs.getString(2));
                    q.setData(rs.getString(3));
                    q.setHora(rs.getString(4));
                    lista.add(q);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarQuimica(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM quimica WHERE id = " + cod + "";
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
