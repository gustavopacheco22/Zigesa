package VO;

public class HspersonalVO {

/*Todo los atributos*/
    int idmovimientofilial;
    int dia;
    int mes;
    int anio;
    int idfilial;
    int horastrabajadas;
    int horasextras;
    String comentarios;
    int dni;
    int idempleado;

public HspersonalVO(){}

/*Todo los codigos get*/
    public int getIdmovimientofilial(){
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
    public int getIdfilial(){
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
    public int getDni(){
        return dni;
    }
    public int getIdempleado(){
        return idempleado;
    }


/*Todo los codigos set*/
    public void setIdmovimientofilial(int idmovimientofilial){
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
    public void setIdfilial(int idfilial){
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
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setIdempleado(int idempleado){
        this.idempleado = idempleado;
    }

}
