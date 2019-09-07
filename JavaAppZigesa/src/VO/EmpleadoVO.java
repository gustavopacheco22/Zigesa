package VO;

public class EmpleadoVO {

/*Todo los atributos*/
    private Long idempleado;
    private Long dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String domicilio;
    private String correoelectronico;
    private String estado;
    private String cargo;
    private String nombresindicato;
    

public EmpleadoVO(){}

    public EmpleadoVO(Long idempleado, Long dni, String nombre, String apellido, int telefono, String domicilio, String correoelectronico, String estado, String cargo, String nombresindicato) {
        this.idempleado = idempleado;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.correoelectronico = correoelectronico;
        this.estado = estado;
        this.cargo = cargo;
        this.nombresindicato = nombresindicato;
    }
/*Todo los codigos get*/

    public Long getIdempleado() {
        return idempleado;
    }

    public Long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public String getEstado() {
        return estado;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombresindicato() {
        return nombresindicato;
    }

  

    public void setIdempleado(Long idempleado) {
        this.idempleado = idempleado;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

/*Todo los codigos set*/
    public void setNombresindicato(String nombresindicato) {  
        this.nombresindicato = nombresindicato;
    }

    @Override
    public String toString() {
        return "EmpleadoVO{" + "idempleado=" + idempleado + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", domicilio=" + domicilio + ", correoelectronico=" + correoelectronico + ", estado=" + estado + ", cargo=" + cargo + ", nombresindicato=" + nombresindicato + '}';
    }
    

}
