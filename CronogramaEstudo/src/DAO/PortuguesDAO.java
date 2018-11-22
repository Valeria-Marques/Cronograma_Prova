package DAO;

import Modelo.Portugues;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PortuguesDAO extends ExecuteSQL{
    public PortuguesDAO(Connection con) {
        super(con);
    }
    
     public String InserirPortugues(Portugues p) {
        String sql = "INSERT INTO portugues VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getConteudo());
            ps.setString(2, p.getData());
            ps.setString(3, p.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirPortugues(Portugues p) {
        String sql = "DELETE FROM portugues WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Portugues> ListarPortugues() {
        String sql = "SELECT id,conteudo,data,hora FROM portugues";
        List<Portugues> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Portugues p = new Portugues();
                    p.setId(rs.getInt(1));
                    p.setConteudo(rs.getString(2));
                    p.setData(rs.getString(3));
                    p.setHora(rs.getString(4));
                    lista.add(p);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Portugues> PesquisarNomePortugues(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM portugues WHERE conteudo LIKE '%" + nome + "%'";
        List<Portugues> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Portugues p = new Portugues();
                    p.setId(rs.getInt(1));
                    p.setConteudo(rs.getString(2));
                    p.setData(rs.getString(3));
                    p.setHora(rs.getString(4));
                    lista.add(p);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Portugues> ListarComboPortugues() {
        String sql = "SELECT conteudo FROM portugues ORDER BY conteudo";
        List<Portugues> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Portugues p = new Portugues();
                    p.setConteudo(rs.getString(1));
                    lista.add(p);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Portugues> ConsultaCodigoPortugues(String nome) {
        String sql = "SELECT id FROM portugues WHERE conteudo = '" + nome + "'";
        List<Portugues> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Portugues p = new Portugues();
                    p.setId(rs.getInt(1));
                    lista.add(p);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Portugues> PesquisarCodigoPortugues(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM portugues WHERE id LIKE'" + C + "%'";
        List<Portugues> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Portugues p = new Portugues();
                    p.setId(rs.getInt(1));
                    p.setConteudo(rs.getString(2));
                    p.setData(rs.getString(3));
                    p.setHora(rs.getString(4));
                    lista.add(p);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarPortugues(Portugues p) {
        String sql = "update portugues set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getConteudo());
            ps.setString(2, p.getData());
            ps.setString(3, p.getHora());
            ps.setInt(4, p.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Portugues> CapturarPortugues(int cod) {
        String sql = "SELECT * FROM portugues WHERE id = " + cod + " ";
        List<Portugues> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Portugues p = new Portugues();
                    p.setId(rs.getInt(1));
                    p.setConteudo(rs.getString(2));
                    p.setData(rs.getString(3));
                    p.setHora(rs.getString(4));
                    lista.add(p);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarPortugues(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM portugues WHERE id = " + cod + "";
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
