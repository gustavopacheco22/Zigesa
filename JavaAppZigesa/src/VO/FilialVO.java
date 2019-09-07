package VO;

public class FilialVO {

    /*Todo los atributos*/
    private Long idfilial;
    private String nombrefilial;
    private String ubicacionfilial;

    public FilialVO(){}

    public FilialVO(Long idfilial, String nombrefilial, String ubicacionfilial) {
        this.idfilial = idfilial;
        this.nombrefilial = nombrefilial;
        this.ubicacionfilial = ubicacionfilial;
    }



    /*Todo los codigos get*/
    public Long getIdfilial(){
        return idfilial;
    }
    public String getNombrefilial(){
        return nombrefilial;
    }
    public String getUbicacionfilial(){
        return ubicacionfilial;
    }


    /*Todo los codigos set*/
    public void setIdfilial(Long idfilial){
        this.idfilial = idfilial;
    }
    public void setNombrefilial(String nombrefilial){
        this.nombrefilial = nombrefilial;
    }
    public void setUbicacionfilial(String ubicacionfilial){
        this.ubicacionfilial = ubicacionfilial;
    }

    @Override
    public String toString() {
        return "FilialVO{" + "idfilial=" + idfilial + ", nombrefilial=" + nombrefilial + ", ubicacionfilial=" + ubicacionfilial + '}';
    }
}
