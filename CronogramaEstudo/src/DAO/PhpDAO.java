package DAO;

import Modelo.Php;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PhpDAO extends ExecuteSQL{
    public PhpDAO(Connection con) {
        super(con);
    }
    
     public String InserirPhp(Php p) {
        String sql = "INSERT INTO php VALUES (0,?,?,?)";
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
     
     public String ExcluirPhp(Php p) {
        String sql = "DELETE FROM php WHERE id = ? AND conteudo = ?";
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
    
      public List<Php> ListarPhp() {
        String sql = "SELECT id,conteudo,data,hora FROM php";
        List<Php> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Php p = new Php();
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

      public List<Php> PesquisarNomePhp(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM php WHERE conteudo LIKE '%" + nome + "%'";
        List<Php> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Php p = new Php();
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

       public List<Php> ListarComboPhp() {
        String sql = "SELECT conteudo FROM php ORDER BY conteudo";
        List<Php> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Php p = new Php();
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
       
       public List<Php> ConsultaCodigoPhp(String nome) {
        String sql = "SELECT id FROM php WHERE conteudo = '" + nome + "'";
        List<Php> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Php p = new Php();
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
    public List<Php> PesquisarCodigoPhp(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM php WHERE id LIKE'" + C + "%'";
        List<Php> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Php p = new Php();
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
    public String AlterarPhp(Php p) {
        String sql = "update php set conteudo = ?,data = ?,hora = ? where id = ? ";
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
     
    public List<Php> CapturarPhp(int cod) {
        String sql = "SELECT * FROM php WHERE id = " + cod + " ";
        List<Php> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Php p = new Php();
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
    
     public boolean TestarPhp(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM php WHERE id = " + cod + "";
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
