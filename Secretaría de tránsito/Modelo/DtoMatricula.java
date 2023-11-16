
package Modelo;

import java.util.Date;

public class DtoMatricula {

    private String idTraspaso;
    private String propNuevo;
    private String propAnterior;
    private String lugarTraspaso;
    private Date fechaTraspaso; 
    private String tipoMatricula;
    
    public DtoMatricula(){}
    
    public DtoMatricula(String idTraspaso, String propNuevo, String propAnterior, String lugarTraspaso, Date fechaTraspaso, String tipoMatricula) {
        this.idTraspaso = idTraspaso;
        this.propNuevo = propNuevo;
        this.propAnterior = propAnterior;
        this.lugarTraspaso = lugarTraspaso;
        this.fechaTraspaso = fechaTraspaso;
        this.tipoMatricula = tipoMatricula;
    }

    public String getIdTraspaso() {
        return idTraspaso;
    }

    public void setIdTraspaso(String idTraspaso) {
        this.idTraspaso = idTraspaso;
    }

    public String getPropNuevo() {
        return propNuevo;
    }

    public void setPropNuevo(String propNuevo) {
        this.propNuevo = propNuevo;
    }

    public String getPropAnterior() {
        return propAnterior;
    }

    public void setPropAnterior(String propAnterior) {
        this.propAnterior = propAnterior;
    }

    public String getLugarTraspaso() {
        return lugarTraspaso;
    }

    public void setLugarTraspaso(String lugarTraspaso) {
        this.lugarTraspaso = lugarTraspaso;
    }

    public Date getFechaTraspaso() {
        return fechaTraspaso;
    }

    public void setFechaTraspaso(Date fechaTraspaso) {
        this.fechaTraspaso = fechaTraspaso;
    }

    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }
}
