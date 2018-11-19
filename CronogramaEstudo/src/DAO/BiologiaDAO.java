
package DAO;

import Modelo.Biologia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BiologiaDAO extends ExecuteSQL{
    public BiologiaDAO(Connection con) {
        super(con);
    }
    
     public String InserirBiologia(Biologia b) {
        String sql = "INSERT INTO biologia VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, b.getConteudo());
            ps.setString(2, b.getData());
            ps.setString(3, b.getHora());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     
     
     
     

      
}
