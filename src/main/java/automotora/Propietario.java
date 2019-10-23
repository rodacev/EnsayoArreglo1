
package automotora;


public class Propietario {
    
    private String rut;
    private String nombre;
    private int edad;
    private String domicilio;
    
    public Propietario(){
        
        this.rut = "";
        this.nombre = "";
        this.edad = 0;
        this.domicilio = "";
    }

    public Propietario(String rut, String nombre, int edad, String domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Propietario{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + '}';
    }
    
    
    
    
    
}
