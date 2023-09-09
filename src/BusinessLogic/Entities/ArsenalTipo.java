package BusinessLogic.Entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DataAccess.SQLiteDataHelper;
import Framework.AppException;
import DataAccess.SQLiteDataHelper;

public class ArsenalTipo implements IAccion{
    public int jaIdArsenalTipo;
    public String jaNombre_TipoArsenal;
    public ArsenalTipo(String jaNombre_TipoArsenal) {
        this.jaNombre_TipoArsenal = jaNombre_TipoArsenal;
    }
    public int getJaIdArsenalTipo() {
        return jaIdArsenalTipo;
    }
    public void setJaIdArsenalTipo(int jaIdArsenalTipo) {
        this.jaIdArsenalTipo = jaIdArsenalTipo;
    }
    public String getJaNombre_TipoArsenal() {
        return jaNombre_TipoArsenal;
    }
    public void setJaNombre_TipoArsenal(String jaNombre_TipoArsenal) {
        this.jaNombre_TipoArsenal = jaNombre_TipoArsenal;
    }


    public boolean insert() throws AppException {
       String query = " INSERT INTO JAARSENALTIPO(Nombre_TipoArsenal) VALUES (?)";
        try {
            Connection  conn = SQLiteDataHelper.jaOpenConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, getJaNombre_TipoArsenal());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "insert()");
        }
    }


    @Override
    public void getAllDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDatos'");
    }
    
    
    
    

    
    
    
}
