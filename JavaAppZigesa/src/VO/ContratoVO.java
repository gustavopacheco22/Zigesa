package VO;

import java.sql.Date;

public class ContratoVO {

/*Todo los atributos*/
    int idcontrato;
    Date fechafirma;
    Date fechavencimiento;
    String categoria;
    double montoxcategoria;
    int dni;
    int idempleado;
    int idcategoria;

public ContratoVO(){}

/*Todo los codigos get*/
    public int getIdcontrato(){
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
    public int getDni(){
        return dni;
    }
    public int getIdempleado(){
        return idempleado;
    }
    public int getIdcategoria(){
        return idcategoria;
    }


/*Todo los codigos set*/
    public void setIdcontrato(int idcontrato){
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
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setIdempleado(int idempleado){
        this.idempleado = idempleado;
    }
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }

}
