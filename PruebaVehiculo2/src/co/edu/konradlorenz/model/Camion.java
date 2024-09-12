
package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.Vista;


public class Camion extends Vehiculo{
    
    private boolean remolque;
    
    

    public boolean isRemolque() {
        return remolque;
    }

    public void setRemolque(boolean remolque) {
        this.remolque = remolque;
    }

    public Camion(boolean remolque, String placa, int neumaticos, int puertas) {
        super(placa, neumaticos, puertas);
        this.remolque = remolque;
    }
   
    
    
    

    public Camion(String placa, int neumaticos, int puertas) {
        super(placa, neumaticos, puertas);
    }

    public Camion() {
    }
    
    
    
    @Override
    public void acelerar(){
        
        
        Vista.mostrarMensaje("El camion acelero");
    }
    

    @Override
    public void frenar() {
        Vista.mostrarMensaje("El camion freno");
    }
    @Override
    public void encender(){
        
        Vista.mostrarMensaje("El camion se encendio");
    
        
        
    }
    @Override
    public void apagar(){
        Vista.mostrarMensaje("El camion se apago");
    }
}
