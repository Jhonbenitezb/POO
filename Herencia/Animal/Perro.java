
package Animal;

public class Perro extends Animales  {
public String raza;

    public Perro(String raza, String nombre, int edad, String tipo_Alimentacion) {
        super(nombre, edad, tipo_Alimentacion);
        this.raza = raza;
    }


    @Override
    public void sonidoAnimal() {      
        System.out.println("Onomatopeya: Guau");
    }

    @Override
    public String toString() {
       return "Nombre: "+nombre+"\n"+
               "Edad: "+edad+"\n"+
               "Tipo de alimentacion: "+tipo_Alimentacion+"\n"+
               "Tipo de raza: "+raza;
    }
    
    

}
