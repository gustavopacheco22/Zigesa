package VO;

public class CategoriaVO {

/*Todo los atributos*/
    int idcategoria;
    double montoacobrar;

public CategoriaVO(){}

/*Todo los codigos get*/
    public int getIdcategoria(){
        return idcategoria;
    }
    public double getMontoacobrar(){
        return montoacobrar;
    }


/*Todo los codigos set*/
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }
    public void setMontoacobrar(double montoacobrar){
        this.montoacobrar = montoacobrar;
    }

}
