package VO;

import java.sql.Date;

public class ContratoVO {

/*Todo los atributos*/
    private Long idcontrato;
    private Date fechafirma;
    private Date fechavencimiento;
    private String categoria;
    private double montoxcategoria;
    private Long dni;
    private Long idempleado;
    private Long idcategoria;

    public ContratoVO(){}

    public ContratoVO(Long idcontrato, Date fechafirma, Date fechavencimiento, String categoria, double montoxcategoria, Long dni, Long idempleado, Long idcategoria) {
        this.idcontrato = idcontrato;
        this.fechafirma = fechafirma;
        this.fechavencimiento = fechavencimiento;
        this.categoria = categoria;
        this.montoxcategoria = montoxcategoria;
        this.dni = dni;
        this.idempleado = idempleado;
        this.idcategoria = idcategoria;
    }

    /*Todo los codigos get*/
    public Long getIdcontrato(){
        return idcontrato;
    }
    public Object getFechafirma(){
        return fechafirma;
    }
    public Object getFechavencimiento(){
        return fechavencimiento;
    }
    public String getCategoria(){
        return categoria;
    }
    public double getMontoxcategoria(){
        return montoxcategoria;
    }
    public Long getDni(){
        return dni;
    }
    public Long getIdempleado(){
        return idempleado;
    }
    public Long getIdcategoria(){
        return idcategoria;
    }


/*Todo los codigos set*/
    public void setIdcontrato(Long idcontrato){
        this.idcontrato = idcontrato;
    }
    public void setFechafirma(Date fechafirma){
        this.fechafirma = fechafirma;
    }
    public void setFechavencimiento(Date fechavencimiento){
        this.fechavencimiento = fechavencimiento;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setMontoxcategoria(double montoxcategoria){
        this.montoxcategoria = montoxcategoria;
    }
    public void setDni(Long dni){
        this.dni = dni;
    }
    public void setIdempleado(Long idempleado){
        this.idempleado = idempleado;
    }
    public void setIdcategoria(Long idcategoria){
        this.idcategoria = idcategoria;
    }

    @Override
    public String toString() {
        return "ContratoVO{" + "idcontrato=" + idcontrato + ", fechafirma=" + fechafirma + ", fechavencimiento=" + fechavencimiento + ", categoria=" + categoria + ", montoxcategoria=" + montoxcategoria + ", dni=" + dni + ", idempleado=" + idempleado + ", idcategoria=" + idcategoria + '}';
    }
}
