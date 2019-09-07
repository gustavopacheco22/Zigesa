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
        if (connection!=null){
            System.out.println("Conexi�n a base de datos "+bd+" OK\n");
        }
        
        //devolver datos
        Statement estado = connection.createStatement();
        ResultSet resultado = estado.executeQuery("Select * from empleado");
        
            System.out.println("idEmpleado: \t DNi: \t \t nombre \t apellido");
            while(resultado.next()){
                System.out.println(resultado.getInt("idEmpleado") + "\t\t" + resultado.getInt("DNI") + "\t" + resultado.getString("nombre") + "\t\t"  + resultado.getString("apellido"));
//                System.out.println("\t");
//                System.out.println(resultado.getInt("DNI"));
//                System.out.println("\t");
//                System.out.println(resultado.getString("nombre"));
//                System.out.println("\t");
//                System.out.println(resultado.getString("apellido"));
            }
                
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
