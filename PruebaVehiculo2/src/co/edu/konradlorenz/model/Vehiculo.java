
package co.edu.konradlorenz.model;


public class Vehiculo implements Acciones{
    
    private String placa;
    private int neumaticos;
    private int puertas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(int neumaticos) {
        this.neumaticos = neumaticos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public Vehiculo(String placa, int neumaticos, int puertas) {
        this.placa = placa;
        this.neumaticos = neumaticos;
        this.puertas = puertas;
    }

    public Vehiculo() {
    }

    @Override
    public void acelerar() {
       
    }

    @Override
    public void frenar() {
        
    }

    @Override
    public void encender() {
        
    }

    @Override
    public void apagar() {
        
    }
    
    
    
}