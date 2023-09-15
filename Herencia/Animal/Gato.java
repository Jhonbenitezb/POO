
package Animal;

public class Gato extends Animales {
    public String raza;

    public Gato(String raza, String nombre, int edad, String tipo_Alimentacion) {
        super(nombre, edad, tipo_Alimentacion);
        this.raza = raza;
    }
    @Override
    public String toString() {
       return  "Nombre: "+nombre+"\n"+
               "Edad: "+edad+"\n"+
               "Tipo de alimentacion: "+tipo_Alimentacion+"\n"+
               "Tipo de raza: "+raza;
    }
    
    @Override
    public void sonidoAnimal() {
      System.out.println("Onomatopeya: Miau");
    }
}
