
package com.mycompany.parcial2;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;

/**
 *
 * @author JMINOTA
 */
public class main {

    public static void main(String[] args) {
        
        /*
        * Esto nos sirve para generar un formato json para retornar la data del array
        * sin tener que acomodarla bonita de manera manual
        */
        Gson gson = new Gson();
        
        LinkedList <Vehiculo> automoviles = new LinkedList<>();
        LinkedList <Motocicleta> motocicleta = new LinkedList<>();
        
        // Automovil creado por defecto
        Automovil auto = new Automovil(4, "Mazda", "3", "ZYX987","1:00 Pm","5:00 Pm" );
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta(600, "Honda", "CBR600", "XYZ789", "3:20 Pm","5:20 Pm");
        motocicleta.add(moto);
        
        // Definir endpoints
        
        // Por defecto 
        get("/moto", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motocicleta);
        });
        
        // Listado de automovile
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });

        get("/agregarMoto/:cilindraje/:marca/:modelo/:placa/:horaIngreso/:horaSalida", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params(":horaIngreso");
            String horaSalida = req.params(":horaSalida");
            
            // No olvidar convertir en integer los string numericos que llegan por url
            int cilindraje = Integer.parseInt(req.params(":cilindraje"));

            // Crear un nuevo automóvil y agregarlo al parqueadero
            Motocicleta nuevaMotocicleta = new Motocicleta(cilindraje, marca, modelo, placa,horaIngreso,horaSalida);
            motocicleta.add(nuevaMotocicleta );

            return gson.toJson(nuevaMotocicleta );
        });

        
        
        // Guardar automovil
        // endpoint GET para agregar un automóvil
        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas/:horaIngreso/:horaSalida", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params(":horaIngreso");
            String horaSalida = req.params(":horaSalida");
            
            // No olvidar convertir en integer los string numericos que llegan por url
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));

            // Crear un nuevo automóvil y agregarlo al parqueadero
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo,placa,horaIngreso,horaSalida);
            automoviles.add(nuevoAuto);

            return gson.toJson(nuevoAuto);
        });
        
        get("/horaSalidaMotos", (req, res) -> {
        res.type("application/json");
        for (int i = 0; i < motocicleta.size(); i++) {
            System.out.println(motocicleta.get(i).getHoraSalida());
        }
            return gson.toJson(moto);
        });
        get("/horaSalidaAutomoviles", (req, res) -> {
            res.type("application/json");
            for (int i = 0; i < automoviles.size(); i++) {
            System.out.println(automoviles.get(i).getHoraSalida());
        }
            return gson.toJson(automoviles);
        });
        
    }
}