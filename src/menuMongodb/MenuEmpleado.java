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
      System.out.println("********");
      System.out.println("* MENÚ *");
      System.out.println("********");
      System.out.println("1. Actualizar documentos en la colección empleado");
      System.out.println("2. Ver documentos de la colección empleado");
      System.out.println("0. Terminar");

      int opcion = FuncionesMenu.entradaInteger("\nElija opción? ");

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
    System.out.println("1. Colección actualizada");
    System.out.println("************************");

    List<Empleado> empleados_al = Datos.getListaEmpleado();
    coleccion.drop();
    for (Empleado empleado : empleados_al) {
      Document docEmpleado = empleado.getDocumentFromEmpleado();
      coleccion.insertOne(docEmpleado);
    }
  }

  public static void opcion2() {
    System.out.println("2. Documentos de la coleccion");
    System.out.println("*****************************");

    MongoCursor<Document> cursor = coleccion.find().iterator();
    while (cursor.hasNext()) {
      Document docEmpleado = cursor.next();
      System.out.println(docEmpleado.toJson());
      //System.out.println(docEmpleado);
    }
  }
}
