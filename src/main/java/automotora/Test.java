package automotora;


public class Test {


    public static void main(String[] args) {
        
        Automotora automotora1 = new Automotora();
        
        Motocicleta moto1 = new Motocicleta();
        moto1.setCodigo(1);
        
        automotora1.iniciarArreglo();
        
        automotora1.almacenarMoto(moto1);
        automotora1.almacenarMoto(moto1);

        
        

    }
    
}
