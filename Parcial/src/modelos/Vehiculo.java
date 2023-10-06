
package modelos;

public abstract class Vehiculo {
 private String marca;
 private String modelo;
 private int año;
 private String propietario;
 private String placa;

    public Vehiculo(String marca, String modelo, int año, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
        this.placa=placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
 public abstract String mostrarInformacion();
 
 public abstract int añosCirculacion();

}
