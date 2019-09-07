package VO;

public class CategoriaVO {

/*Todo los atributos*/
   private Long idcategoria;
   private double montoacobrar;

    public CategoriaVO(){}

    public CategoriaVO(Long idcategoria, double montoacobrar) {
        this.idcategoria = idcategoria;
        this.montoacobrar = montoacobrar;
    }


/*Todo los codigos get*/
    public Long getIdcategoria(){
        return idcategoria;
    }
    public double getMontoacobrar(){
        return montoacobrar;
    }


/*Todo los codigos set*/
    public void setIdcategoria(Long idcategoria){
        this.idcategoria = idcategoria;
    }
    public void setMontoacobrar(double montoacobrar){
        this.montoacobrar = montoacobrar;
    }

    @Override
    public String toString() {
        return "CategoriaVO{" + "idcategoria=" + idcategoria + ", montoacobrar=" + montoacobrar + '}';
    }
    
    

}
