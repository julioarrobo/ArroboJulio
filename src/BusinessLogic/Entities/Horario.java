package BusinessLogic.Entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DataAccess.SQLiteDataHelper;
import Framework.AppException;

public class Horario implements IAccion{
    public int jaIdHorario; 
    public String jaHoraLunes;
    public String jaHoraMartes;
    public String jaHoraMiercoles;
    public String jaHoraJueves;
    public String jaHoraViernes;
   

    
    public Horario(String jaHoraLunes, String jaHoraMartes, String jaHoraMiercoles, String jaHoraJueves,
            String jaHoraViernes) {
        this.jaHoraLunes = jaHoraLunes;
        this.jaHoraMartes = jaHoraMartes;
        this.jaHoraMiercoles = jaHoraMiercoles;
        this.jaHoraJueves = jaHoraJueves;
        this.jaHoraViernes = jaHoraViernes;
    }



    public void insert() {
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



        System.out.println(getJaHoraLunes());
        System.out.println(getJaHoraMartes());
        System.out.println(getJaHoraMiercoles());
        System.out.println(getJaHoraJueves());
        System.out.println(getJaHoraViernes());
    }



    public int getJaIdHorario() {
        return jaIdHorario;
    }



    public void setJaIdHorario(int jaIdHorario) {
        this.jaIdHorario = jaIdHorario;
    }



    public String getJaHoraLunes() {
        return jaHoraLunes;
    }



    public void setJaHoraLunes(String jaHoraLunes) {
        this.jaHoraLunes = jaHoraLunes;
    }



    public String getJaHoraMartes() {
        return jaHoraMartes;
    }



    public void setJaHoraMartes(String jaHoraMartes) {
        this.jaHoraMartes = jaHoraMartes;
    }



    public String getJaHoraMiercoles() {
        return jaHoraMiercoles;
    }



    public void setJaHoraMiercoles(String jaHoraMiercoles) {
        this.jaHoraMiercoles = jaHoraMiercoles;
    }



    public String getJaHoraJueves() {
        return jaHoraJueves;
    }



    public void setJaHoraJueves(String jaHoraJueves) {
        this.jaHoraJueves = jaHoraJueves;
    }



    public String getJaHoraViernes() {
        return jaHoraViernes;
    }



    public void setJaHoraViernes(String jaHoraViernes) {
        this.jaHoraViernes = jaHoraViernes;
    }



    @Override
    public void getAllDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDatos'");
    }

    


    





   
}        
