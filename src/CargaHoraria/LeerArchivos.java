package CargaHoraria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import BusinessLogic.Entities.Arsenal;
import BusinessLogic.Entities.ArsenalTipo;
import BusinessLogic.Entities.Coordenada;
import BusinessLogic.Entities.Horario;
import Framework.AppException;

public class LeerArchivos {
    ArrayList<Horario> lstAllHorario = new ArrayList<>();
    ArrayList<Coordenada> lstAllCordenadas = new ArrayList<>();
    ArrayList<ArsenalTipo> lstAllArsenal = new ArrayList<>();
    public ArrayList<String> jaHoraLunes         = new ArrayList<>();
    public ArrayList<String> jaHoraMartes        = new ArrayList<>();
    public ArrayList<String> jaHoraMiercoles     = new ArrayList<>();
    public ArrayList<String> jaHoraJueves        = new ArrayList<>();
    public ArrayList<String> jaHoraViernes       = new ArrayList<>();



    public void jaLeerHorario(String  jaHorarioRuta ) throws AppException {
        String[] rutasArchivo = { "utilities\\doc\\Nuevo Documento de texto.txt" };;
        String linea;
        String[] datos;
        //Coordenada jaCo = new Coordenada();
        // Leer el contenido de cada archivo
        
        int nroLine = 0;
        for (String rutaArchivo : rutasArchivo) {
            try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                while ((linea = br.readLine()) != null) {
                    if(nroLine++ ==0)
                        continue;
                    datos = linea.split(";");
                    System.out.println(datos[0]);
                    System.out.println(datos[1]);
                    System.out.println(datos[2]);
                    System.out.println(datos[3]);
                    System.out.println(datos[4]);
                    System.out.println(datos[5]);
                    System.out.println(datos[6]);
                    System.out.println(datos[7]);
                     //Geopsicion 	; Lunes; Martes; Miercoles; Jueves; Viernes; Tipo Arsenal
                     
                    //idUsario    =   datos[0];
                    //jaCo.jaNombreCoordenada    =   datos[1];
                    //jaHorario.jaHoraLunes      = datos[2];
                    //jaHorario.jaHoraMartes     = datos[3];
                    //jaHorario.jaHoraMiercoles  = datos[4];
                    //jaHorario.jaHoraJueves     = datos[5];
                    //jaHorario.jaHoraViernes    = datos[6];
                    //jaAt.jaNombre_TipoArsenal   =   datos[7];

                    // lstAllCordenadas.add(jaCo);
                    lstAllCordenadas.add(new Coordenada(datos[1].trim()));
                    lstAllHorario.add(new Horario(datos[2].trim(), datos[3].trim(), datos[4].trim(), datos[5].trim(), datos[6].trim()));
                    lstAllArsenal.add(new ArsenalTipo(datos[7].trim()));
                    
                     
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + rutaArchivo + ": " + e.getMessage());
            }

            System.out.println("Guardar");
            jaInsertarDatosCoordenada();
            jaInsertarDatosArsenal();
            jaInsertarDatosHorario();
          
        }

    }


    private void jaInsertarDatosCoordenada() throws AppException {
        for (Coordenada c : lstAllCordenadas)  c.insert();

    }

     private void jaInsertarDatosArsenal() throws AppException {
        for (ArsenalTipo at : lstAllArsenal)  at.insert();
    }

    private void jaInsertarDatosHorario() {
        for (Horario h : lstAllHorario)  
        h.insert();
    }

    



   



    

   


    
}
