
package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Camion;
import co.edu.konradlorenz.model.Carro;
import co.edu.konradlorenz.model.Moto;
import co.edu.konradlorenz.model.Vehiculo;
import co.edu.konradlorenz.view.Vista;



public class Controlador {
    
    Vista objV = new Vista();
    Vehiculo objCo = (Vehiculo) new Camion();
    Vehiculo objCa = new Carro();
    Vehiculo objMo = new Moto();
    
    
    public void run(){
        Vista.mostrarMensaje("Indique cual vehiculo quiere ejecutar: Moto, Carro o Caimon");
        switch (objV.pedirString()){
            case "Camion":
       
       objCo.encender();
        objCo.acelerar();
        objCo.frenar();
        objCo.apagar();
       
        
       
        break;
            case "Carro":
        objCa.encender();
        objCa.acelerar();
        objCa.frenar();
        objCa.apagar();
       
        
                
                break;
            case "Moto":
        objMo.encender();
        objMo.acelerar();
        objMo.frenar();
        objMo.apagar();
      
        
                
                break;
                
            default:
                Vista.mostrarMensaje("Este no es un mensaje valido");
                
                run();
                break;
            
        }
    }
}
