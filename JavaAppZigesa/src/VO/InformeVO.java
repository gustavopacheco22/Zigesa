package VO;

public class InformeVO {

/*Todo los atributos*/
    int nroinforme;
    int dia;
    int mes;
    int anio;
    String descripcioninforme;
    String comentarioinforme;
    int dni;
    int idempleado;

public InformeVO(){}

/*Todo los codigos get*/
    public int getNroinforme(){
        return nroinforme;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public String getDescripcioninforme(){
        return descripcioninforme;
    }
    public String getComentarioinforme(){
        return comentarioinforme;
    }
    public int getDni(){
        return dni;
    }
    public int getIdempleado(){
        return idempleado;
    }


/*Todo los codigos set*/
    public void setNroinforme(int nroinforme){
        this.nroinforme = nroinforme;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setDescripcioninforme(String descripcioninforme){
        this.descripcioninforme = descripcioninforme;
    }
    public void setComentarioinforme(String comentarioinforme){
        this.comentarioinforme = comentarioinforme;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setIdempleado(int idempleado){
        this.idempleado = idempleado;
    }

}
