package dominio;

 public class Habitante
{
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public void setApellido1(String apellido1){
    this.apellido1 = apellido1;
    }
    public void setApellido2(String apellido2){
    this.apellido2 = apellido2;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapellido1(){
        return apellido1;
    }
    public String getapellido2(){
        return apellido2;
    }
    public Habitante(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
}