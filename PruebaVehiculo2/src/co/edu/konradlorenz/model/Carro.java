
package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.Vista;


public class Carro extends Vehiculo {
    
    private String baul;

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }

    
    public Carro(String placa, int neumaticos, int puertas) {
        super(placa, neumaticos, puertas);
    }

    public Carro() {
    }

    public Carro(String baul, String placa, int neumaticos, int puertas) {
        super(placa, neumaticos, puertas);
        this.baul = baul;
    }

    public Carro(String baul) {
        this.baul = baul;
    }
     @Override
    public void acelerar() {
       Vista.mostrarMensaje("El carro acelero");
    }

    @Override
    public void frenar() {
        Vista.mostrarMensaje("El carro freno");
    }
    @Override
    public void encender(){
       
        Vista.mostrarMensaje("El carro se encendio");
        
        
        
       
        
    }
    @Override
    public void apagar(){
        Vista.mostrarMensaje("El carro se apago");
        
    }
    
}
