package DAO;

import Conexion.Conectar;
import VO.EmpleadoVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class EmpleadoDAO{

    public ArrayList<EmpleadoVO> Listar_EmpleadoVO(){
        ArrayList<EmpleadoVO> list = new ArrayList<EmpleadoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM empleado;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EmpleadoVO vo = new EmpleadoVO();
                vo.setIdempleado(rs.getLong(1));
                vo.setDni(rs.getLong(2));
                vo.setNombre(rs.getString(3));
                vo.setApellido(rs.getString(4));
                vo.setTelefono(rs.getInt(5));
                vo.setDomicilio(rs.getString(6));
                vo.setCorreoelectronico(rs.getString(7));
                vo.setEstado(rs.getString(8));
                vo.setCargo(rs.getString(9));
                vo.setNombresindicato(rs.getString(10));
                
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO empleado (idEmpleado, DNI, nombre, apellido, telefono, domicilio, correoElectronico, estado, cargo, nombreSindicato, categoria) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getIdempleado());
            ps.setLong(2, vo.getDni());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getApellido());
            ps.setInt(5, vo.getTelefono());
            ps.setString(6, vo.getDomicilio());
            ps.setString(7, vo.getCorreoelectronico());
            ps.setString(8, vo.getEstado());
            ps.setString(9, vo.getCargo());
            ps.setString(10, vo.getNombresindicato());
       
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        //tengo de difinir quecampos voy a modificar
        String sql = "UPDATE empleado SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getIdempleado());
            ps.setLong(2, vo.getDni());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getApellido());
            ps.setInt(5, vo.getTelefono());
            ps.setString(6, vo.getDomicilio());
            ps.setString(7, vo.getCorreoelectronico());
            ps.setString(8, vo.getEstado());
            ps.setString(9, vo.getCargo());
            ps.setString(10, vo.getNombresindicato());
 
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_EmpleadoVO(EmpleadoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM empleado WHERE DNI = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getIdempleado());
            ps.setLong(2, vo.getDni());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getApellido());
            ps.setInt(5, vo.getTelefono());
            ps.setString(6, vo.getDomicilio());
            ps.setString(7, vo.getCorreoelectronico());
            ps.setString(8, vo.getEstado());
            ps.setString(9, vo.getCargo());
            ps.setString(10, vo.getNombresindicato());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
