/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procedimiento_almacenados;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class llamado_PROALMA {
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int id = -1;
        Connection cn = null;
 
        try {
            
            // Carga el driver de oracle
            DriverManager.registerDriver(new potgress.jdbc.driver.OracleDriver());
            
            // Conecta con la base de datos XE con el usuario system y la contraseña password
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
            
            // Llamada al procedimiento almacenado
            CallableStatement cst = cn.prepareCall("{call ObtenerDatosAlumno (?,?,?,?)}");
 
            do {
                System.out.println("\nIntroduce el ID del alumno:");
                try {
                    id = Integer.parseInt(entrada.readLine());
                } catch (IOException ex) {
                    System.out.println("Error...");
                }
                
                // Parametro 1 del procedimiento almacenado
                cst.setInt(1, id);
                
                // Definimos los tipos de los parametros de salida del procedimiento almacenado
                cst.registerOutParameter(2, java.sql.Types.VARCHAR);
                cst.registerOutParameter(3, java.sql.Types.VARCHAR);
                cst.registerOutParameter(4, java.sql.Types.VARCHAR);
                
                // Ejecuta el procedimiento almacenado
                cst.execute();
                
                // Se obtienen la salida del procedimineto almacenado
                String nombre = cst.getString(2);
                String sexo = cst.getString(3);
                String curso = cst.getString(4);
                System.out.println("Nombre: " + nombre);
                System.out.println("Sexo: " + sexo);
                System.out.println("Curso: " + curso);
            } while (id > 0);
 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
 
}
