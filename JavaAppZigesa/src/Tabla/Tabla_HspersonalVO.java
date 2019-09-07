package Tabla;

import DAO.HspersonalDAO;
import VO.HspersonalVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_HspersonalVO{

   HspersonalDAO dao = null;


    public void visualizar_HspersonalVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idmovimientofilial");
        dt.addColumn("dia");
        dt.addColumn("mes");
        dt.addColumn("anio");
        dt.addColumn("idfilial");
        dt.addColumn("horastrabajadas");
        dt.addColumn("horasextras");
        dt.addColumn("comentarios");
        dt.addColumn("dni");
        dt.addColumn("idempleado");

        dao = new HspersonalDAO();
        HspersonalVO vo = new HspersonalVO();
        ArrayList<HspersonalVO> list = dao.Listar_HspersonalVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getIdmovimientofilial();
                fila[1] = vo.getDia();
                fila[2] = vo.getMes();
                fila[3] = vo.getAnio();
                fila[4] = vo.getIdfilial();
                fila[5] = vo.getHorastrabajadas();
                fila[6] = vo.getHorasextras();
                fila[7] = vo.getComentarios();
                fila[8] = vo.getDni();
                fila[9] = vo.getIdempleado();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


