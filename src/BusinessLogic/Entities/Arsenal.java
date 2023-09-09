package BusinessLogic.Entities;

public class Arsenal implements IAccion{

    public int       jaIdArsenal;  
    public String    jaNombreArsenal;
    public Arsenal(String jaNombreArsenal) {
        this.jaNombreArsenal = jaNombreArsenal;
    }
    public int getJaIdArsenal() {
        return jaIdArsenal;
    }
    public void setJaIdArsenal(int jaIdArsenal) {
        this.jaIdArsenal = jaIdArsenal;
    }
    public String getJaNombreArsenal() {
        return jaNombreArsenal;
    }
    public void setJaNombreArsenal(String jaNombreArsenal) {
        this.jaNombreArsenal = jaNombreArsenal;
    }
    @Override
    public void getAllDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDatos'");
    }

    
   
    
    

    
}
