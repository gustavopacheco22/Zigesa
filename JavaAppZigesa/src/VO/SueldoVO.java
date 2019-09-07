package VO;

public class SueldoVO {

/*Todo los atributos*/
    private Long idsueldo;
    private long dni;
    private long idempleado;
    private int mes;
    private int anio;
    private long idretcon;
    private String categoria;
    private double sueldobase;
    private double montosindicato;
    private double montohsex;
    private double montojubilacion;
    private double montoobrasocial;
    private double montodeaporteju;
    private double montodeaporteobsoc;
    private double netocobrar;

public SueldoVO(){}

    public SueldoVO(Long idsueldo, long dni, long idempleado, int mes, int anio, long idretcon, String categoria, double sueldobase, double montosindicato, double montohsex, double montojubilacion, double montoobrasocial, double montodeaporteju, double montodeaporteobsoc, double netocobrar) {
        this.idsueldo = idsueldo;
        this.dni = dni;
        this.idempleado = idempleado;
        this.mes = mes;
        this.anio = anio;
        this.idretcon = idretcon;
        this.categoria = categoria;
        this.sueldobase = sueldobase;
        this.montosindicato = montosindicato;
        this.montohsex = montohsex;
        this.montojubilacion = montojubilacion;
        this.montoobrasocial = montoobrasocial;
        this.montodeaporteju = montodeaporteju;
        this.montodeaporteobsoc = montodeaporteobsoc;
        this.netocobrar = netocobrar;
    }

    

/*Todo los codigos get*/
    public Long getIdsueldo(){
        return idsueldo;
    }
    public long getDni(){
        return dni;
    }
    public long getIdempleado(){
        return idempleado;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public long getIdretcon(){
        return idretcon;
    }
    public String getCategoria(){
        return categoria;
    }
    public double getSueldobase(){
        return sueldobase;
    }
    public double getMontosindicato(){
        return montosindicato;
    }
    public double getMontohsex(){
        return montohsex;
    }
    public double getMontojubilacion(){
        return montojubilacion;
    }
    public double getMontoobrasocial(){
        return montoobrasocial;
    }
    public double getMontodeaporteju(){
        return montodeaporteju;
    }
    public double getMontodeaporteobsoc(){
        return montodeaporteobsoc;
    }
    public double getNetocobrar(){
        return netocobrar;
    }


/*Todo los codigos set*/
    public void setIdsueldo(Long idsueldo){
        this.idsueldo = idsueldo;
    }
    public void setDni(long dni){
        this.dni = dni;
    }
    public void setIdempleado(long idempleado){
        this.idempleado = idempleado;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setIdretcon(long idretcon){
        this.idretcon = idretcon;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setSueldobase(double sueldobase){
        this.sueldobase = sueldobase;
    }
    public void setMontosindicato(double montosindicato){
        this.montosindicato = montosindicato;
    }
    public void setMontohsex(double montohsex){
        this.montohsex = montohsex;
    }
    public void setMontojubilacion(double montojubilacion){
        this.montojubilacion = montojubilacion;
    }
    public void setMontoobrasocial(double montoobrasocial){
        this.montoobrasocial = montoobrasocial;
    }
    public void setMontodeaporteju(double montodeaporteju){
        this.montodeaporteju = montodeaporteju;
    }
    public void setMontodeaporteobsoc(double montodeaporteobsoc){
        this.montodeaporteobsoc = montodeaporteobsoc;
    }
    public void setNetocobrar(double netocobrar){
        this.netocobrar = netocobrar;
    }

    @Override
    public String toString() {
        return "SueldoVO{" + "idsueldo=" + idsueldo + ", dni=" + dni + ", idempleado=" + idempleado + ", mes=" + mes + ", anio=" + anio + ", idretcon=" + idretcon + ", categoria=" + categoria + ", sueldobase=" + sueldobase + ", montosindicato=" + montosindicato + ", montohsex=" + montohsex + ", montojubilacion=" + montojubilacion + ", montoobrasocial=" + montoobrasocial + ", montodeaporteju=" + montodeaporteju + ", montodeaporteobsoc=" + montodeaporteobsoc + ", netocobrar=" + netocobrar + '}';
    }
}
