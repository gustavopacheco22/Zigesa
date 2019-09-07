package VO;

import java.sql.Date;

public class RetenycontVO {

/*Todo los atributos*/
    int idretcon;
    double porcapjub;
    double porcobsoc;
    double porsind;
    double porapjubpat;
    double porobsocpat;
    Date fechavigente;

public RetenycontVO(){}

/*Todo los codigos get*/
    public int getIdretcon(){
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
    public void setIdretcon(int idretcon){
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

}
