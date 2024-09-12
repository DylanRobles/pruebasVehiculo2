
package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.Vista;


public class Moto extends Vehiculo {
    
    private String manijar;

    public Moto(String manijar, String placa, int neumaticos, int puertas) {
        super(placa, neumaticos, puertas);
        this.manijar = manijar;
    }

    public Moto(String manijar) {
        this.manijar = manijar;
    }

    public Moto(String placa, int neumaticos, int puertas) {
        super(placa, neumaticos, puertas);
    }

    public Moto() {
    }

    public String getManijar() {
        return manijar;
    }

    public void setManijar(String manijar) {
        this.manijar = manijar;
    }
     @Override
    public void acelerar() {
       Vista.mostrarMensaje("La moto acelero");
    }

    @Override
    public void frenar() {
        Vista.mostrarMensaje("La moto freno");
    }
    @Override
    public void encender(){
        
      
        Vista.mostrarMensaje("la moto se encendio");
       
        
        
       
        
    }
    @Override
    public void apagar(){
        Vista.mostrarMensaje("La moto se apago");
    }
    
}