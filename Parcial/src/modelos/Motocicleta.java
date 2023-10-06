
package modelos;

public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int año, String propietario, int cilindrada, String placa) {
        super(marca, modelo, año, propietario,placa);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public String mostrarInformacion(){
        return "Vehiculo{" + "Marca:" + getMarca() + ", Modelo: " + getModelo() + ", Año: " + getAño() + ", Propietario: " + getPropietario() +",Cilindrada: "+getCilindrada()+",Placa: "+getPlaca()+ '}';
    }
     
    @Override
    public int añosCirculacion(){
        int añosCirculados;
        int añoActual=2023;
        
        añosCirculados= añoActual-getAño();      
       return añosCirculados; 
    }
}
