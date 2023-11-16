
package Modelo;

import java.util.Date;

public class DtoSoat {

    private String nPoliza;
    private String estado;
    private Date fechaVigencia;

    public DtoSoat(String nPoliza, String estado, Date fechaVigencia) {
        this.nPoliza = nPoliza;
        this.estado = estado;
        this.fechaVigencia = fechaVigencia;
    }

    public String getNPoliza() {
        return nPoliza;
    }

    public void setNPoliza(String nPoliza) {
        this.nPoliza = nPoliza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
}

