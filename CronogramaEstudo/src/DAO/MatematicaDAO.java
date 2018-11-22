package DAO;

import Modelo.Matematica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MatematicaDAO extends ExecuteSQL{
    public MatematicaDAO(Connection con) {
        super(con);
    }
    
     public String InserirMatematica(Matematica m) {
        String sql = "INSERT INTO matematica VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, m.getConteudo());
            ps.setString(2, m.getData());
            ps.setString(3, m.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirMatematica(Matematica m) {
        String sql = "DELETE FROM matematica WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, m.getId());
            ps.setString(2, m.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Matematica> ListarMatematica() {
        String sql = "SELECT id,conteudo,data,hora FROM matematica";
        List<Matematica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Matematica m = new Matematica();
                    m.setId(rs.getInt(1));
                    m.setConteudo(rs.getString(2));
                    m.setData(rs.getString(3));
                    m.setHora(rs.getString(4));
                    lista.add(m);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Matematica> PesquisarNomeMatematica(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM matematica WHERE conteudo LIKE '%" + nome + "%'";
        List<Matematica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Matematica m = new Matematica();
                    m.setId(rs.getInt(1));
                    m.setConteudo(rs.getString(2));
                    m.setData(rs.getString(3));
                    m.setHora(rs.getString(4));
                    lista.add(m);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Matematica> ListarComboMatematica() {
        String sql = "SELECT conteudo FROM matematica ORDER BY conteudo";
        List<Matematica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Matematica m = new Matematica();
                    m.setConteudo(rs.getString(1));
                    lista.add(m);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Matematica> ConsultaCodigoMatematica(String nome) {
        String sql = "SELECT id FROM matematica WHERE conteudo = '" + nome + "'";
        List<Matematica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Matematica m = new Matematica();
                    m.setId(rs.getInt(1));
                    lista.add(m);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Matematica> PesquisarCodigoMatematica(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM matematica WHERE id LIKE'" + C + "%'";
        List<Matematica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Matematica m = new Matematica();
                    m.setId(rs.getInt(1));
                    m.setConteudo(rs.getString(2));
                    m.setData(rs.getString(3));
                    m.setHora(rs.getString(4));
                    lista.add(m);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarMatematica(Matematica m) {
        String sql = "update matematica set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, m.getConteudo());
            ps.setString(2, m.getData());
            ps.setString(3, m.getHora());
            ps.setInt(4, m.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Matematica> CapturarMatematica(int cod) {
        String sql = "SELECT * FROM matematica WHERE id = " + cod + " ";
        List<Matematica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Matematica m = new Matematica();
                    m.setId(rs.getInt(1));
                    m.setConteudo(rs.getString(2));
                    m.setData(rs.getString(3));
                    m.setHora(rs.getString(4));
                    lista.add(m);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarMatematica(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM matematica WHERE id = " + cod + "";
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
