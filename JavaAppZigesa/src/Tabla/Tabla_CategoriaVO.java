package Tabla;

import DAO.CategoriaDAO;
import VO.CategoriaVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_CategoriaVO{

   CategoriaDAO dao = null;


    public void visualizar_CategoriaVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idcategoria");
        dt.addColumn("montoacobrar");

        dao = new CategoriaDAO();
        CategoriaVO vo = new CategoriaVO();
        ArrayList<CategoriaVO> list = dao.Listar_CategoriaVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getIdcategoria();
                fila[1] = vo.getMontoacobrar();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


