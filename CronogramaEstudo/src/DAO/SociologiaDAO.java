package DAO;

import Modelo.Sociologia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class SociologiaDAO extends ExecuteSQL{
    public SociologiaDAO(Connection con) {
        super(con);
    }
    
     public String InserirSociologia(Sociologia s) {
        String sql = "INSERT INTO sociologia VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, s.getConteudo());
            ps.setString(2, s.getData());
            ps.setString(3, s.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirSociologia(Sociologia s) {
        String sql = "DELETE FROM sociologia WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Sociologia> ListarSociologia() {
        String sql = "SELECT id,conteudo,data,hora FROM sociologia";
        List<Sociologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Sociologia s = new Sociologia();
                    s.setId(rs.getInt(1));
                    s.setConteudo(rs.getString(2));
                    s.setData(rs.getString(3));
                    s.setHora(rs.getString(4));
                    lista.add(s);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Sociologia> PesquisarNomeSociologia(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM sociologia WHERE conteudo LIKE '%" + nome + "%'";
        List<Sociologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Sociologia s = new Sociologia();
                    s.setId(rs.getInt(1));
                    s.setConteudo(rs.getString(2));
                    s.setData(rs.getString(3));
                    s.setHora(rs.getString(4));
                    lista.add(s);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Sociologia> ListarComboSociologia() {
        String sql = "SELECT conteudo FROM sociologia ORDER BY conteudo";
        List<Sociologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Sociologia s = new Sociologia();
                    s.setConteudo(rs.getString(1));
                    lista.add(s);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Sociologia> ConsultaCodigoSociologia(String nome) {
        String sql = "SELECT id FROM sociologia WHERE conteudo = '" + nome + "'";
        List<Sociologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Sociologia s = new Sociologia();
                    s.setId(rs.getInt(1));
                    lista.add(s);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Sociologia> PesquisarCodigoSociologia(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM sociologia WHERE id LIKE'" + C + "%'";
        List<Sociologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Sociologia s = new Sociologia();
                    s.setId(rs.getInt(1));
                    s.setConteudo(rs.getString(2));
                    s.setData(rs.getString(3));
                    s.setHora(rs.getString(4));
                    lista.add(s);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarSociologia(Sociologia s) {
        String sql = "update sociologia set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, s.getConteudo());
            ps.setString(2, s.getData());
            ps.setString(3, s.getHora());
            ps.setInt(4, s.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Sociologia> CapturarSociologia(int cod) {
        String sql = "SELECT * FROM sociologia WHERE id = " + cod + " ";
        List<Sociologia> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Sociologia s = new Sociologia();
                    s.setId(rs.getInt(1));
                    s.setConteudo(rs.getString(2));
                    s.setData(rs.getString(3));
                    s.setHora(rs.getString(4));
                    lista.add(s);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarSociologia(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM sociologia WHERE id = " + cod + "";
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
