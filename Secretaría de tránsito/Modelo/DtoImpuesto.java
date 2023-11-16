
package Modelo;

import java.time.LocalDate;


public class DtoImpuesto extends DtoVehiculo{

    private String nReferencia;
    private LocalDate fechaLimPago; // Utiliza la clase Date para representar fechas.
    private LocalDate vigencia; // Utiliza la clase Date para representar fechas.
    
    public DtoImpuesto(){}
    
    public DtoImpuesto(String nReferencia, LocalDate fechaLimPago, LocalDate vigencia, String placa, String marca, String modelo, String tipoVehiculo, String color, int identificacion, String nombre, String correo, String direccion, String cod_tipo_persona) {
        super(placa, marca, modelo, tipoVehiculo, color, identificacion, nombre, correo, direccion, cod_tipo_persona);
        this.nReferencia = nReferencia;
        this.fechaLimPago = fechaLimPago;
        this.vigencia = vigencia;
    }

    public String getnReferencia() {
        return nReferencia;
    }

    public void setnReferencia(String nReferencia) {
        this.nReferencia = nReferencia;
    }

    public LocalDate getFechaLimPago() {
        return fechaLimPago;
    }

    public void setFechaLimPago(LocalDate fechaLimPago) {
        this.fechaLimPago = fechaLimPago;
    }

    public LocalDate getVigencia() {
        return vigencia;
    }

    public void setVigencia(LocalDate vigencia) {
        this.vigencia = vigencia;
    }
    
}

