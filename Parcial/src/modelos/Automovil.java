
package modelos;

public class Automovil extends Vehiculo {
    private int nroPuertas;
    

    public Automovil(String marca, String modelo, int año, String propietario,int nroPuertas, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.nroPuertas=nroPuertas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    
    
    @Override
    public String mostrarInformacion() {
        return "Vehiculo{" + "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Año: " + getAño() + ", Propietario: " + getPropietario() +",Numero de puertas: "+getNroPuertas()+",Placa: "+getPlaca()+ '}';
    }
    
    @Override
    public int añosCirculacion(){
        int añosCirculados;
        int añoActual=2023;
        
        añosCirculados= añoActual-getAño();
        
        
        
       return añosCirculados; 
    }
}
