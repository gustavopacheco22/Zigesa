package Tabla;

import DAO.SueldoDAO;
import VO.SueldoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_SueldoVO{

   SueldoDAO dao = null;


    public void visualizar_SueldoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idsueldo");
        dt.addColumn("dni");
        dt.addColumn("idempleado");
        dt.addColumn("mes");
        dt.addColumn("anio");
        dt.addColumn("idretcon");
        dt.addColumn("categoria");
        dt.addColumn("sueldobase");
        dt.addColumn("montosindicato");
        dt.addColumn("montohsex");
        dt.addColumn("montojubilacion");
        dt.addColumn("montoobrasocial");
        dt.addColumn("montodeaporteju");
        dt.addColumn("montodeaporteobsoc");
        dt.addColumn("netocobrar");

        dao = new SueldoDAO();
        SueldoVO vo = new SueldoVO();
        ArrayList<SueldoVO> list = dao.Listar_SueldoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[15];
                vo = list.get(i);
                fila[0] = vo.getIdsueldo();
                fila[1] = vo.getDni();
                fila[2] = vo.getIdempleado();
                fila[3] = vo.getMes();
                fila[4] = vo.getAnio();
                fila[5] = vo.getIdretcon();
                fila[6] = vo.getCategoria();
                fila[7] = vo.getSueldobase();
                fila[8] = vo.getMontosindicato();
                fila[9] = vo.getMontohsex();
                fila[10] = vo.getMontojubilacion();
                fila[11] = vo.getMontoobrasocial();
                fila[12] = vo.getMontodeaporteju();
                fila[13] = vo.getMontodeaporteobsoc();
                fila[14] = vo.getNetocobrar();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


