package VO;

import java.sql.Date;

public class RetenycontVO {

/*Todo los atributos*/
    private Long idretcon;
    private double porcapjub;
    private double porcobsoc;
    private double porsind;
    private double porapjubpat;
    private double porobsocpat;
    private Date fechavigente;

    public RetenycontVO(){}

    public RetenycontVO(Long idretcon, double porcapjub, double porcobsoc, double porsind, double porapjubpat, double porobsocpat, Date fechavigente) {
        this.idretcon = idretcon;
        this.porcapjub = porcapjub;
        this.porcobsoc = porcobsoc;
        this.porsind = porsind;
        this.porapjubpat = porapjubpat;
        this.porobsocpat = porobsocpat;
        this.fechavigente = fechavigente;
    }

/*Todo los codigos get*/
    public Long getIdretcon(){
        return idretcon;
    }
    public double getPorcapjub(){
        return porcapjub;
    }
    public double getPorcobsoc(){
        return porcobsoc;
    }
    public double getPorsind(){
        return porsind;
    }
    public double getPorapjubpat(){
        return porapjubpat;
    }
    public double getPorobsocpat(){
        return porobsocpat;
    }
    public Date getFechavigente(){
        return fechavigente;
    }


/*Todo los codigos set*/
    public void setIdretcon(Long idretcon){
        this.idretcon = idretcon;
    }
    public void setPorcapjub(int porcapjub){
        this.porcapjub = porcapjub;
    }
    public void setPorcobsoc(int porcobsoc){
        this.porcobsoc = porcobsoc;
    }
    public void setPorsind(int porsind){
        this.porsind = porsind;
    }
    public void setPorapjubpat(int porapjubpat){
        this.porapjubpat = porapjubpat;
    }
    public void setPorobsocpat(int porobsocpat){
        this.porobsocpat = porobsocpat;
    }
    public void setFechavigente(Date fechavigente){
        this.fechavigente = fechavigente;
    }

    @Override
    public String toString() {
        return "RetenycontVO{" + "idretcon=" + idretcon + ", porcapjub=" + porcapjub + ", porcobsoc=" + porcobsoc + ", porsind=" + porsind + ", porapjubpat=" + porapjubpat + ", porobsocpat=" + porobsocpat + ", fechavigente=" + fechavigente + '}';
    }
}
