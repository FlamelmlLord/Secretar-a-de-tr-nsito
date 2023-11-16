
package Modelo;

import java.time.LocalDate;

public class DtoTesoreria {

    private String registroPago;
    private int nCuotas;
    private int nCuotasPagas;
    private LocalDate fechaPago; 
    private int montoCuota;
    private String estadoPago;
    private String nReferencia;
    private String numComparendo;
    
    public DtoTesoreria(){}
    
    public DtoTesoreria(String registroPago, int nCuotas, int nCuotasPagas, LocalDate fechaPago, int montoCuota, String estadoPago, String nReferencia, String numComparendo) {
        this.registroPago = registroPago;
        this.nCuotas = nCuotas;
        this.nCuotasPagas = nCuotasPagas;
        this.fechaPago = fechaPago;
        this.montoCuota = montoCuota;
        this.estadoPago = estadoPago;
        this.nReferencia = nReferencia;
        this.numComparendo = numComparendo;
    }

    public String getRegistroPago() {
        return registroPago;
    }

    public void setRegistroPago(String registroPago) {
        this.registroPago = registroPago;
    }

    public int getnCuotas() {
        return nCuotas;
    }

    public void setnCuotas(int nCuotas) {
        this.nCuotas = nCuotas;
    }

    public int getnCuotasPagas() {
        return nCuotasPagas;
    }

    public void setnCuotasPagas(int nCuotasPagas) {
        this.nCuotasPagas = nCuotasPagas;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getnReferencia() {
        return nReferencia;
    }

    public void setnReferencia(String nReferencia) {
        this.nReferencia = nReferencia;
    }

    public String getNumComparendo() {
        return numComparendo;
    }

    public void setNumComparendo(String numComparendo) {
        this.numComparendo = numComparendo;
    }

}