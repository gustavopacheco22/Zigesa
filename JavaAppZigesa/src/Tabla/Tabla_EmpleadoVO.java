package Tabla;

import DAO.EmpleadoDAO;
import VO.EmpleadoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_EmpleadoVO{

   EmpleadoDAO dao = null;


    public void visualizar_EmpleadoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idempleado");
        dt.addColumn("dni");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("telefono");
        dt.addColumn("domicilio");
        dt.addColumn("correoelectronico");
        dt.addColumn("estado");
        dt.addColumn("cargo");
        dt.addColumn("nombresindicato");
 

        dao = new EmpleadoDAO();
        EmpleadoVO vo = new EmpleadoVO();
        ArrayList<EmpleadoVO> list = dao.Listar_EmpleadoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[11];
                vo = list.get(i);
                fila[0] = vo.getIdempleado();
                fila[1] = vo.getDni();
                fila[2] = vo.getNombre();
                fila[3] = vo.getApellido();
                fila[4] = vo.getTelefono();
                fila[5] = vo.getDomicilio();
                fila[6] = vo.getCorreoelectronico();
                fila[7] = vo.getEstado();
                fila[8] = vo.getCargo();
                fila[9] = vo.getNombresindicato();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


