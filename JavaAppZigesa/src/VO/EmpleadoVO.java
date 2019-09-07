package VO;

public class EmpleadoVO {

/*Todo los atributos*/
    int idempleado;
    int dni;
    String nombre;
    String apellido;
    int telefono;
    String domicilio;
    String correoelectronico;
    String estado;
    String cargo;
    String nombresindicato;
    

public EmpleadoVO(){}

/*Todo los codigos get*/
    public int getIdempleado(){
        return idempleado;
    }
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getCorreoelectronico(){
        return correoelectronico;
    }
    public String getEstado(){
        return estado;
    }
    public String getCargo(){
        return cargo;
    }
    public String getNombresindicato(){
        return nombresindicato;
    }
    


/*Todo los codigos set*/
    public void setIdempleado(int idempleado){
        this.idempleado = idempleado;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public void setCorreoelectronico(String correoelectronico){
        this.correoelectronico = correoelectronico;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setNombresindicato(String nombresindicato){
        this.nombresindicato = nombresindicato;
    }
    

}
