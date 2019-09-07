package DAO;

import Conexion.Conectar;
import VO.ContratoVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class ContratoDAO{

    public ArrayList<ContratoVO> Listar_ContratoVO(){
        ArrayList<ContratoVO> list = new ArrayList<ContratoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ContratoVO vo = new ContratoVO();
                vo.setIdcontrato(rs.getInt(1));
                vo.setFechafirma(rs.getDate(2));
                vo.setFechavencimiento(rs.getDate(3));
                vo.setCategoria(rs.getString(4));
                vo.setMontoxcategoria(rs.getDouble(5));
                vo.setDni(rs.getInt(6));
                vo.setIdempleado(rs.getInt(7));
                vo.setIdcategoria(rs.getInt(8));
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
    public void Agregar_ContratoVO(ContratoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcontrato());
            ps.setObject(2, vo.getFechafirma());
            ps.setObject(3, vo.getFechavencimiento());
            ps.setString(4, vo.getCategoria());
            ps.setDouble(5, vo.getMontoxcategoria());
            ps.setInt(6, vo.getDni());
            ps.setInt(7, vo.getIdempleado());
            ps.setInt(8, vo.getIdcategoria());
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
    public void Modificar_ContratoVO(ContratoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcontrato());
            ps.setObject(2, vo.getFechafirma());
            ps.setObject(3, vo.getFechavencimiento());
            ps.setString(4, vo.getCategoria());
            ps.setDouble(5, vo.getMontoxcategoria());
            ps.setInt(6, vo.getDni());
            ps.setInt(7, vo.getIdempleado());
            ps.setInt(8, vo.getIdcategoria());
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
    public void Eliminar_ContratoVO(ContratoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcontrato());
            ps.setObject(2, vo.getFechafirma());
            ps.setObject(3, vo.getFechavencimiento());
            ps.setString(4, vo.getCategoria());
            ps.setDouble(5, vo.getMontoxcategoria());
            ps.setInt(6, vo.getDni());
            ps.setInt(7, vo.getIdempleado());
            ps.setInt(8, vo.getIdcategoria());
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
