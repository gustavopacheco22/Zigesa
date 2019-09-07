package VO;

public class HspersonalVO {

/*Todo los atributos*/
    private Long idmovimientofilial;
    private int dia;
    private int mes;
    private int anio;
    private long idfilial;
    private int horastrabajadas;
    private int horasextras;
    private String comentarios;
    private long dni;
    private long idempleado;

public HspersonalVO(){}

    public HspersonalVO(Long idmovimientofilial, int dia, int mes, int anio, long idfilial, int horastrabajadas, int horasextras, String comentarios, long dni, long idempleado) {
        this.idmovimientofilial = idmovimientofilial;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.idfilial = idfilial;
        this.horastrabajadas = horastrabajadas;
        this.horasextras = horasextras;
        this.comentarios = comentarios;
        this.dni = dni;
        this.idempleado = idempleado;
    }


/*Todo los codigos get*/
    public Long getIdmovimientofilial(){
        return idmovimientofilial;
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
    public long getIdfilial(){
        return idfilial;
    }
    public int getHorastrabajadas(){
        return horastrabajadas;
    }
    public int getHorasextras(){
        return horasextras;
    }
    public String getComentarios(){
        return comentarios;
    }
    public long getDni(){
        return dni;
    }
    public long getIdempleado(){
        return idempleado;
    }


/*Todo los codigos set*/
    public void setIdmovimientofilial(Long idmovimientofilial){
        this.idmovimientofilial = idmovimientofilial;
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
    public void setIdfilial(long idfilial){
        this.idfilial = idfilial;
    }
    public void setHorastrabajadas(int horastrabajadas){
        this.horastrabajadas = horastrabajadas;
    }
    public void setHorasextras(int horasextras){
        this.horasextras = horasextras;
    }
    public void setComentarios(String comentarios){
        this.comentarios = comentarios;
    }
    public void setDni(long dni){
        this.dni = dni;
    }
    public void setIdempleado(long idempleado){
        this.idempleado = idempleado;
    }

    @Override
    public String toString() {
        return "HspersonalVO{" + "idmovimientofilial=" + idmovimientofilial + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", idfilial=" + idfilial + ", horastrabajadas=" + horastrabajadas + ", horasextras=" + horasextras + ", comentarios=" + comentarios + ", dni=" + dni + ", idempleado=" + idempleado + '}';
    }
}
