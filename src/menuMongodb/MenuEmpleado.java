package menuMongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.*;
import java.util.*;
import java.util.logging.*;

import org.bson.Document;



public class MenuEmpleado {

  static MongoClient cliente = new MongoClient("localhost", 27017);
  static MongoDatabase conexion = cliente.getDatabase("tienda");
  static MongoCollection<Document> coleccion = conexion.getCollection("empleado");

  public static void main(String[] args) {
    Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
    mongoLogger.setLevel(Level.SEVERE);

    do {

      System.out.println("MENU");
      System.out.println("----");
      System.out.println("1. Insertar documentos en la colección");
      System.out.println("2. Mostrar todos los documentos de la coleccion");
      System.out.println("0. Salir");

      int opcion = FuncionesMenu.entradaInteger("\nIngrese opción? ");

      switch (opcion) {
        case 1:
          FuncionesMenu.clear();
          opcion1();
          FuncionesMenu.pause();
          break;
        case 2:
          FuncionesMenu.clear();
          opcion2();
          FuncionesMenu.pause();
          break;
        case 0:
          System.exit(0);
      }
    } while (true);

  }

  public static void opcion1() {
    System.out.println("1. Insertar documentos en la colección");
    System.out.println("--------------------------------------");

    List<Empleado> empleados_al = Datos.getListaEmpleado();
    coleccion.drop();
    for (Empleado empleado : empleados_al) {
      Document docEmpleado = empleado.getDocumentFromEmpleado();
      coleccion.insertOne(docEmpleado);
    }
  }

  public static void opcion2() {
    System.out.println("2. Mostrar todos los documentos de la coleccion");
    System.out.println("-----------------------------------------------");

    MongoCursor<Document> cursor = coleccion.find().iterator();
    while (cursor.hasNext()) {
      Document docEmpleado = cursor.next();
      System.out.println(docEmpleado.toJson());
      //System.out.println(docEmpleado);
    }
  }
}
