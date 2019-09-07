package VO;

public class InformeVO {

/*Todo los atributos*/
    private Long nroinforme;
    private int dia;
    private int mes;
    private int anio;
    private String descripcioninforme;
    private String comentarioinforme;
    private long dni;
    private long idempleado;

public InformeVO(){}

    public InformeVO(Long nroinforme, int dia, int mes, int anio, String descripcioninforme, String comentarioinforme, long dni, long idempleado) {
        this.nroinforme = nroinforme;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.descripcioninforme = descripcioninforme;
        this.comentarioinforme = comentarioinforme;
        this.dni = dni;
        this.idempleado = idempleado;
    }

/*Todo los codigos get*/
    public Long getNroinforme(){
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
    public long getDni(){
        return dni;
    }
    public long getIdempleado(){
        return idempleado;
    }


/*Todo los codigos set*/
    public void setNroinforme(Long nroinforme){
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
    public void setDni(long dni){
        this.dni = dni;
    }
    public void setIdempleado(long idempleado){
        this.idempleado = idempleado;
    }

    @Override
    public String toString() {
        return "InformeVO{" + "nroinforme=" + nroinforme + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", descripcioninforme=" + descripcioninforme + ", comentarioinforme=" + comentarioinforme + ", dni=" + dni + ", idempleado=" + idempleado + '}';
    }
}
