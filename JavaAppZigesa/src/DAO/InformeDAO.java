package DAO;

import Conexion.Conectar;
import VO.InformeVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class InformeDAO{

    public ArrayList<InformeVO> Listar_InformeVO(){
        ArrayList<InformeVO> list = new ArrayList<InformeVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                InformeVO vo = new InformeVO();
                vo.setNroinforme(rs.getLong(1));
                vo.setDia(rs.getInt(2));
                vo.setMes(rs.getInt(3));
                vo.setAnio(rs.getInt(4));
                vo.setDescripcioninforme(rs.getString(5));
                vo.setComentarioinforme(rs.getString(6));
                vo.setDni(rs.getLong(7));
                vo.setIdempleado(rs.getLong(8));
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
    public void Agregar_InformeVO(InformeVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getNroinforme());
            ps.setInt(2, vo.getDia());
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setString(5, vo.getDescripcioninforme());
            ps.setString(6, vo.getComentarioinforme());
            ps.setLong(7, vo.getDni());
            ps.setLong(8, vo.getIdempleado());
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
    public void Modificar_InformeVO(InformeVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getNroinforme());
            ps.setInt(2, vo.getDia());
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setString(5, vo.getDescripcioninforme());
            ps.setString(6, vo.getComentarioinforme());
            ps.setLong(7, vo.getDni());
            ps.setLong(8, vo.getIdempleado());
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
    public void Eliminar_InformeVO(InformeVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getNroinforme());
            ps.setInt(2, vo.getDia());
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setString(5, vo.getDescripcioninforme());
            ps.setString(6, vo.getComentarioinforme());
            ps.setLong(7, vo.getDni());
            ps.setLong(8, vo.getIdempleado());
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
