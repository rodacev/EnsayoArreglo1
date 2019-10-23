package automotora;

import java.util.Arrays;


public class Automotora {
    
    private Motocicleta[] listaMotos;
    
    public Automotora(){
        
        this.listaMotos = new Motocicleta[5];
    }

    public Automotora(Motocicleta[] listaMotos) {
        this.listaMotos = listaMotos;
    }

    public Motocicleta[] getListaMotos() {
        return listaMotos;
    }

    public void setListaMotos(Motocicleta[] listaMotos) {
        this.listaMotos = listaMotos;
    }

    @Override
    public String toString() {
        return "Automotora{" + "listaMotos=" + Arrays.toString(listaMotos) + '}';
    }
    
    
    public void iniciarArreglo(){
        
        for (int i=0;i<this.listaMotos.length;i++){
            
            this.listaMotos[i] = new Motocicleta();
        }
    }

    
    public void almacenarMoto(Motocicleta motocicleta){
        
        for (int i=0;i<this.listaMotos.length;i++){
            
            if (listaMotos[i].getCodigo()==motocicleta.getCodigo()){
                System.out.println("LA MOTO YA EXISTE");
                break;
            }else{
                listaMotos[i] =  motocicleta;
                System.out.println("MOTO AGREGADA CORRECTAMENTE");
                break;
            }
        }      
    }
    

    
    
    
}
