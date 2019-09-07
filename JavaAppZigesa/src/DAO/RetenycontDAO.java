package DAO;

import Conexion.Conectar;
import VO.RetenycontVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class RetenycontDAO{

    public ArrayList<RetenycontVO> Listar_RetenycontVO(){
        ArrayList<RetenycontVO> list = new ArrayList<RetenycontVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM retenycont;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                RetenycontVO vo = new RetenycontVO();
                vo.setIdretcon(rs.getLong(1));
                vo.setPorcapjub(rs.getInt(2));
                vo.setPorcobsoc(rs.getInt(3));
                vo.setPorsind(rs.getInt(4));
                vo.setPorapjubpat(rs.getInt(5));
                vo.setPorobsocpat(rs.getInt(6));
                vo.setFechavigente(rs.getDate(7));
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
    public void Agregar_RetenycontVO(RetenycontVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO retenycont (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getIdretcon());
            ps.setDouble(2, vo.getPorcapjub());
            ps.setDouble(3, vo.getPorcobsoc());
            ps.setDouble(4, vo.getPorsind());
            ps.setDouble(5, vo.getPorapjubpat());
            ps.setDouble(6, vo.getPorobsocpat());
            ps.setObject(7, vo.getFechavigente());
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
    public void Modificar_RetenycontVO(RetenycontVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE retenycont SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getIdretcon());
            ps.setDouble(2, vo.getPorcapjub());
            ps.setDouble(3, vo.getPorcobsoc());
            ps.setDouble(4, vo.getPorsind());
            ps.setDouble(5, vo.getPorapjubpat());
            ps.setDouble(6, vo.getPorobsocpat());
            ps.setObject(7, vo.getFechavigente());
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
    public void Eliminar_RetenycontVO(RetenycontVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM retenycont WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setLong(1, vo.getIdretcon());
            ps.setDouble(2, vo.getPorcapjub());
            ps.setDouble(3, vo.getPorcobsoc());
            ps.setDouble(4, vo.getPorsind());
            ps.setDouble(5, vo.getPorapjubpat());
            ps.setDouble(6, vo.getPorobsocpat());
            ps.setObject(7, vo.getFechavigente());
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
