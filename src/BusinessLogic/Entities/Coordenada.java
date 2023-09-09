package BusinessLogic.Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DataAccess.SQLiteDataHelper;

import Framework.AppException;

public class Coordenada implements IAccion{
    public int jaIdCoordenadas;
    public String jaNombreCoordenadas;
  
    

    public Coordenada( String jaNombreCoordenadas){
        this.jaNombreCoordenadas =jaNombreCoordenadas;
    }

    // insert
    public boolean insert() throws AppException{
        String query = " INSERT INTO JACOORDENADAS(Nombre_Cordenadas) VALUES (?)";
        try {
            Connection  conn = SQLiteDataHelper.jaOpenConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, getJaNombreCoordenadas());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "insert()");
        }
        //System.out.println(getJaNombreCoordenadas());
    }
    // getAll

    public int getJaIdCoordenadas() {
        return jaIdCoordenadas;
    }

    public void setJaIdCoordenadas(int jaIdCoordenadas) {
        this.jaIdCoordenadas = jaIdCoordenadas;
    }

    public String getJaNombreCoordenadas() {
        return jaNombreCoordenadas;
    }

    public void setJaNombreCoordenadas(String jaNombreCoordenadas) {
        this.jaNombreCoordenadas = jaNombreCoordenadas;
    }

    @Override
    public void getAllDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDatos'");
    }

    
    
}
