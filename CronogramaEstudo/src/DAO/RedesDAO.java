package DAO;

import Modelo.Redes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class RedesDAO extends ExecuteSQL{
    public RedesDAO(Connection con) {
        super(con);
    }
    
     public String InserirRedes(Redes r) {
        String sql = "INSERT INTO redes VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, r.getConteudo());
            ps.setString(2, r.getData());
            ps.setString(3, r.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirRedes(Redes r) {
        String sql = "DELETE FROM redes WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, r.getId());
            ps.setString(2, r.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Redes> ListarRedes() {
        String sql = "SELECT id,conteudo,data,hora FROM redes";
        List<Redes> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Redes r = new Redes();
                    r.setId(rs.getInt(1));
                    r.setConteudo(rs.getString(2));
                    r.setData(rs.getString(3));
                    r.setHora(rs.getString(4));
                    lista.add(r);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Redes> PesquisarNomeRedes(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM redes WHERE conteudo LIKE '%" + nome + "%'";
        List<Redes> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Redes r = new Redes();
                    r.setId(rs.getInt(1));
                    r.setConteudo(rs.getString(2));
                    r.setData(rs.getString(3));
                    r.setHora(rs.getString(4));
                    lista.add(r);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Redes> ListarComboRedes() {
        String sql = "SELECT conteudo FROM redes ORDER BY conteudo";
        List<Redes> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Redes r = new Redes();
                    r.setConteudo(rs.getString(1));
                    lista.add(r);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Redes> ConsultaCodigoRedes(String nome) {
        String sql = "SELECT id FROM redes WHERE conteudo = '" + nome + "'";
        List<Redes> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Redes r = new Redes();
                    r.setId(rs.getInt(1));
                    lista.add(r);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Redes> PesquisarCodigoRedes(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM redes WHERE id LIKE'" + C + "%'";
        List<Redes> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Redes r = new Redes();
                    r.setId(rs.getInt(1));
                    r.setConteudo(rs.getString(2));
                    r.setData(rs.getString(3));
                    r.setHora(rs.getString(4));
                    lista.add(r);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarRedes(Redes r) {
        String sql = "update redes set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, r.getConteudo());
            ps.setString(2, r.getData());
            ps.setString(3, r.getHora());
            ps.setInt(4, r.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Redes> CapturarRedes(int cod) {
        String sql = "SELECT * FROM redes WHERE id = " + cod + " ";
        List<Redes> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Redes r = new Redes();
                    r.setId(rs.getInt(1));
                    r.setConteudo(rs.getString(2));
                    r.setData(rs.getString(3));
                    r.setHora(rs.getString(4));
                    lista.add(r);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarRedes(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM redes WHERE id = " + cod + "";
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
