import java.util.Scanner;

import BusinessLogic.Entities.Coordenada;
import BusinessLogic.Entities.Horario;
import CargaHoraria.LeerArchivos;
import DataAccess.SQLiteDataHelper;
import Utilitario.Utility;

public class App {
    private final static String   jaHorarioRuta = "utilities\\doc\\Nuevo Documento de texto.txt";
    private final static Scanner  jaSc        = new Scanner(System.in);
    static LeerArchivos jaLA = new LeerArchivos();

        public static void main(String[] args) throws Exception {
        
        Utility.clear();
        //Utility.jaImpresionDatos();
        //Utility.jaLogeo();
        //SQLiteDataHelper.jaOpenConnection();   
        jaLA.jaLeerHorario(jaHorarioRuta);

        //Coordenadas co = new Coordenadas();
        //Horario ho = new Horario();
//
        //for (Horario hod : jaHoraLunes) {
        //    
        //}

    }
}
