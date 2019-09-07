package DAO;

import Conexion.Conectar;
import VO.HspersonalVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class HspersonalDAO{

    public ArrayList<HspersonalVO> Listar_HspersonalVO(){
        ArrayList<HspersonalVO> list = new ArrayList<HspersonalVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                HspersonalVO vo = new HspersonalVO();
                vo.setIdmovimientofilial(rs.getInt(1));
                vo.setDia(rs.getInt(2));
                vo.setMes(rs.getInt(3));
                vo.setAnio(rs.getInt(4));
                vo.setIdfilial(rs.getInt(5));
                vo.setHorastrabajadas(rs.getInt(6));
                vo.setHorasextras(rs.getInt(7));
                vo.setComentarios(rs.getString(8));
                vo.setDni(rs.getInt(9));
                vo.setIdempleado(rs.getInt(10));
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
    public void Agregar_HspersonalVO(HspersonalVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdmovimientofilial());
            ps.setInt(2, vo.getDia());
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setInt(5, vo.getIdfilial());
            ps.setInt(6, vo.getHorastrabajadas());
            ps.setInt(7, vo.getHorasextras());
            ps.setString(8, vo.getComentarios());
            ps.setInt(9, vo.getDni());
            ps.setInt(10, vo.getIdempleado());
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
    public void Modificar_HspersonalVO(HspersonalVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdmovimientofilial());
            ps.setInt(2, vo.getDia());
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setInt(5, vo.getIdfilial());
            ps.setInt(6, vo.getHorastrabajadas());
            ps.setInt(7, vo.getHorasextras());
            ps.setString(8, vo.getComentarios());
            ps.setInt(9, vo.getDni());
            ps.setInt(10, vo.getIdempleado());
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
    public void Eliminar_HspersonalVO(HspersonalVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdmovimientofilial());
            ps.setInt(2, vo.getDia());
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setInt(5, vo.getIdfilial());
            ps.setInt(6, vo.getHorastrabajadas());
            ps.setInt(7, vo.getHorasextras());
            ps.setString(8, vo.getComentarios());
            ps.setInt(9, vo.getDni());
            ps.setInt(10, vo.getIdempleado());
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
