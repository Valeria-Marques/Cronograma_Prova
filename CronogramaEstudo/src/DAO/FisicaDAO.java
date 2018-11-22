package DAO;

import Modelo.Fisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class FisicaDAO extends ExecuteSQL{
    public FisicaDAO(Connection con) {
        super(con);
    }
    
     public String InserirFisica(Fisica f) {
        String sql = "INSERT INTO fisica VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getConteudo());
            ps.setString(2, f.getData());
            ps.setString(3, f.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
     
     public String ExcluirFisica(Fisica f) {
        String sql = "DELETE FROM fisica WHERE id = ? AND conteudo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, f.getId());
            ps.setString(2, f.getConteudo());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
      public List<Fisica> ListarFisica() {
        String sql = "SELECT id,conteudo,data,hora FROM fisica";
        List<Fisica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Fisica f = new Fisica();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

      public List<Fisica> PesquisarNomeFisica(String nome) {
        String sql = "SELECT id,conteudo,data,hora FROM fisica WHERE conteudo LIKE '%" + nome + "%'";
        List<Fisica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Fisica f = new Fisica();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

       public List<Fisica> ListarComboFisica() {
        String sql = "SELECT conteudo FROM fisica ORDER BY conteudo";
        List<Fisica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Fisica f = new Fisica();
                    f.setConteudo(rs.getString(1));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }
       
       public List<Fisica> ConsultaCodigoFisica(String nome) {
        String sql = "SELECT id FROM fisica WHERE conteudo = '" + nome + "'";
        List<Fisica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Fisica f = new Fisica();
                    f.setId(rs.getInt(1));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public List<Fisica> PesquisarCodigoFisica(String C) {
        String sql = "SELECT id,conteudo,data,hora FROM fisica WHERE id LIKE'" + C + "%'";
        List<Fisica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Fisica f = new Fisica();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    public String AlterarFisica(Fisica f) {
        String sql = "update fisica set conteudo = ?,data = ?,hora = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getConteudo());
            ps.setString(2, f.getData());
            ps.setString(3, f.getHora());
            ps.setInt(4, f.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }  
     
    public List<Fisica> CapturarFisica(int cod) {
        String sql = "SELECT * FROM fisica WHERE id = " + cod + " ";
        List<Fisica> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Fisica f = new Fisica();
                    f.setId(rs.getInt(1));
                    f.setConteudo(rs.getString(2));
                    f.setData(rs.getString(3));
                    f.setHora(rs.getString(4));
                    lista.add(f);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
     public boolean TestarFisica(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM fisica WHERE id = " + cod + "";
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
