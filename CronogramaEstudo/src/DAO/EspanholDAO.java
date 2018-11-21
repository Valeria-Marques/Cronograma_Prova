
package DAO;

import Modelo.Espanhol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class EspanholDAO extends ExecuteSQL{
    public EspanholDAO(Connection con) {
        super(con);
    }
    
     public String InserirEspanhol(Espanhol e) {
        String sql = "INSERT INTO espanhol VALUES (0,?,?,?)";
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
     
     public String ExcluirEspanhol(Espanhol e) {
        String sql = "DELETE FROM espanhol WHERE id = ? AND conteudo = ?";
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
    
      public List<Espanhol> ListarEspanhol() {
        String sql = "SELECT id,conteudo,data,hora FROM espanhol";
        List<Espanhol> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Espanhol e = new Espanhol();
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

      public List<Espanhol> PesquisarNomeEspanhol(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM espanhol WHERE conteudo LIKE '%" + nome + "%'";
        List<Espanhol> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Espanhol e = new Espanhol();
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

       public List<Espanhol> ListarComboEspanhol() {
        String sql = "SELECT conteudo FROM espanhol ORDER BY conteudo";
        List<Espanhol> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Espanhol e = new Espanhol();
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
       
       public List<Espanhol> ConsultaCodigoEspanhol(String nome) {
        String sql = "SELECT id FROM espanhol WHERE conteudo = '" + nome + "'";
        List<Espanhol> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Espanhol e = new Espanhol();
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
    public List<Espanhol> PesquisarCodigoEspanhol(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM espanhol WHERE id LIKE'" + C + "%'";
        List<Espanhol> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Espanhol e = new Espanhol();
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
    public String AlterarEspanhol(Espanhol e) {
        String sql = "update espanhol set conteudo = ?,data = ?,hora = ? where id = ? ";
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
     
    public List<Espanhol> CapturarEspanhol(int cod) {
        String sql = "SELECT * FROM espanhol WHERE id = " + cod + " ";
        List<Espanhol> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Espanhol e = new Espanhol();
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
    
     public boolean TestarEspanhol(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM espanhol WHERE id = " + cod + "";
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
