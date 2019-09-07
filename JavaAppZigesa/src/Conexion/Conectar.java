package Conexion;

import java.sql.*;

public class Conectar{

    static String bd = "sistema";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;

    public Conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,login,password);
        connection.setAutoCommit(false);
        if (connection!=null){
            System.out.println("Conexi�n a base de datos "+bd+" OK\n");
        }
        
        //devolver datos
        //STATEMENT ACCEDER A LA BASE DE DATOS Y EJECUTAR CODIGO SQL 
        Statement estado = connection.createStatement();
        //EJECUTAR CONSULTA SQL CON EXECUTEQUERY
        ResultSet set = estado.executeQuery("Select * from empleado");
        
            
            while(set.next()){
                int idEmpleado = set.getInt("idEmpleado");
                int Dni = set.getInt("DNI");
                String nombre = set.getString("nombre");
                String apellido = set.getString("apellido");
                System.out.println("Empleado " + idEmpleado + "."+ "DNI: " + Dni +"  "+ "Nombre: "  + nombre + " " +apellido);
            }
            set.close();
            estado.close();
                
        }catch(SQLException ex){
            System.out.println("Eror sql" + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }


}
