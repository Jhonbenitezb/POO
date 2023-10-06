
package parcial; 
import java.util.ArrayList;
import java.util.Scanner;
import modelos.Automovil;
import modelos.Motocicleta;
import modelos.Vehiculo;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int limitObjet = 10;
        Vehiculo[] vehiculos = new Vehiculo[limitObjet];
        int opcion;
        String nroPlaca;

        vehiculos[0] = new Automovil("Mazda","Cx-30",2019,"Mauricio",4,"SDW342");
        vehiculos[1] = new Automovil("Chevrolet","Tracker",2022,"Maria",5,"QWE232");
        vehiculos[2] = new Automovil("Subaru","Eco",2010,"Sandra",2,"WER234");
        vehiculos[3] = new Automovil("Susuki","Vitara",2012,"Fabian",5,"ASD256");
        vehiculos[4] = new Automovil("Chevrolet","Eco sport",2018,"Gonzalo",5,"XCV654");
        
        vehiculos[5] = new Motocicleta("Kawasaki","Z900",2022,"Fabricio",900,"ÑLK33Q");
        vehiculos[6] = new Motocicleta("Kawazaki","Z1000",2019,"Esteban",1000,"NMS23N");
        vehiculos[7] = new Motocicleta("Honda","cbr150",2013,"Estefania",150,"MNS45S");
        vehiculos[8] = new Motocicleta("Auteco","Apache",2023,"Carolina",150,"MNS23B");
        vehiculos[9] = new Motocicleta("Auteco","Apache v2",2015,"Gustavo",300,"POI89E");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("------------------"
                    + "-------------------");
            System.out.println("Vehiculo numero: "+i+ " "+vehiculos[i].mostrarInformacion());

            
        }
        
        for (int i = 5; i < 10; i++) {
            System.out.println("------------------"
            + "-------------------");
            System.out.println("Vehiculo numero: "+i+ " "+vehiculos[i].mostrarInformacion());
        }
            System.out.println("-----------------------------------------------------------");
            System.out.println("Ingrese el numero del vehiculo para cambiar su propietario: ");
            opcion=scan.nextInt();
            
            System.out.println("Ingrese el nombre del nuevo propietario: ");
            String nuevoPropietario = scan1.nextLine();
            vehiculos[opcion].setPropietario(nuevoPropietario);
            
            
                    for (int i = 0; i < 5; i++) {
            System.out.println("------------------"
                    + "-------------------");
            System.out.println("Marca:"+vehiculos[i].mostrarInformacion());

            
        }
        
        for (int i = 5; i < 10; i++) {
            System.out.println("------------------"
            + "-------------------");
            System.out.println("Marca: "+vehiculos[i].mostrarInformacion());
        }
        
            
       
    }
    
}
