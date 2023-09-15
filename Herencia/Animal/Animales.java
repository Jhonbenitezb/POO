
package  Animal;

public abstract class Animales {
    public String nombre;
    public int edad;
    public String tipo_Alimentacion;

    public Animales(String nombre, int edad, String tipo_Alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_Alimentacion = tipo_Alimentacion;
    }
    
    public abstract String toString();
    
    public abstract void sonidoAnimal();
}
