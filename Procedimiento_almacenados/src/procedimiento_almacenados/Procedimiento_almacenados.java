/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

package procedimiento_almacenados;

/**
 *
 * @author windows 8
 */
public class Procedimiento_almacenados {

      /* DATOS PARA LA CONEXION */
  /** Nombre de la base de datos */
  private String db = "dbTemp";
  /** Usuario postgreSQL */
  private String user = "postgres";
  /** Contraseña postgreSQL */
  private String password = "";
  /** Cadena de conexión */
  private String url = "jdbc:postgresql://localhost:5432/"+db;
  /** Conexion a base de datos */
  private Connection conn = null;
  /** Para obtener los resultados de las consultas SQL de la base de datos */
  private ResultSet resultSet = null;
  /** Para enviar comandos SQL a la base de datos */
  private Statement statement = null;
  /** Constructor de la clase
 * Realiza una conexión a la base de datos de PostgreSQL
 * @exception SQLException Los datos son incorrectos
 * @exception ClassNotFoundException No existe libreria JDBC:Postgresql
 */
  public Procedimientos_almacenados(){
   this.url = "jdbc:postgresql://localhost:5432/"+db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("org.postgresql.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(this.url, this.user , this.password );
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
  }

/**
 * Ejecuta la instruccion SQL para llamar a la función en postgreSQL
 * @param Cedula_Identidad String que es el identificador de la persona
 * @return String el resultado de la función
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
