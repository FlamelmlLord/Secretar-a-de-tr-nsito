
package Modelo;

import java.time.LocalDate;

public class DtoRevision{

    private String revisión;
    private LocalDate fechaExp;
    private String cda;
    private String resultado;
    private int valMulta;
    private String placa;
    
    public DtoRevision(){}
    
    public DtoRevision(String revisión, LocalDate fechaExp, String cda, String resultado, int valMulta, String placa) {
        this.revisión = revisión;
        this.fechaExp = fechaExp;
        this.cda = cda;
        this.resultado = resultado;
        this.valMulta = valMulta;
        this.placa = placa;
    }

    public String getRevisión() {
        return revisión;
    }

    public void setRevisión(String revisión) {
        this.revisión = revisión;
    }

    public LocalDate getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(LocalDate fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getCda() {
        return cda;
    }

    public void setCda(String cda) {
        this.cda = cda;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getValMulta() {
        return valMulta;
    }

    public void setValMulta(int valMulta) {
        this.valMulta = valMulta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}