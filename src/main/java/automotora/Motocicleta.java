package automotora;


public class Motocicleta {
    
    private int codigo;
    private String marca;
    private String modelo;
    private int anio;
    private int precio;
    private char estado;
    private Propietario propietario;
    
    public Motocicleta(){
        
        this.codigo = 0;
        this.marca = "";
        this.modelo = "";
        this.anio = 0;
        this.precio = 0;
        this.estado = ' ';
        this.propietario = new Propietario();
    }

    public Motocicleta(int codigo, String marca, String modelo, int anio, int precio, char estado, Propietario propietario) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.estado = estado;
        this.propietario = propietario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + ", estado=" + estado + ", propietario=" + propietario + '}';
    }
    
    
    public void mostrarDatosMoto(){
        
        System.out.println("CODIGO: " + this.codigo);
        System.out.println("MARCA: " + this.marca);
        System.out.println("MODELO: " + this.modelo);
        System.out.println("ANIO: " + this.anio);
        System.out.println("PRECIO: " + this.precio);
        
        if (this.estado=='U'){
            System.out.println("ESTADO: USADA");     
        }
        else if (this.estado=='N'){
            System.out.println("ESTADO: NUEVA");
        }
        System.out.println(this.propietario);
    }  
}
