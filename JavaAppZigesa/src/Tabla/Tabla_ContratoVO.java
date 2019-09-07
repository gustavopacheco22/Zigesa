package Tabla;

import DAO.ContratoDAO;
import VO.ContratoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ContratoVO{

   ContratoDAO dao = null;


    public void visualizar_ContratoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idcontrato");
        dt.addColumn("fechafirma");
        dt.addColumn("fechavencimiento");
        dt.addColumn("categoria");
        dt.addColumn("montoxcategoria");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("dni");
        dt.addColumn("idempleado");
        dt.addColumn("idcategoria");

        dao = new ContratoDAO();
        ContratoVO vo = new ContratoVO();
        ArrayList<ContratoVO> list = dao.Listar_ContratoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getIdcontrato();
                fila[1] = vo.getFechafirma();
                fila[2] = vo.getFechavencimiento();
                fila[3] = vo.getCategoria();
                fila[4] = vo.getMontoxcategoria();
                fila[5] = vo.getNombre();
                fila[6] = vo.getApellido();
                fila[7] = vo.getDni();
                fila[8] = vo.getIdempleado();
                fila[9] = vo.getIdcategoria();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


