
package Modelo;

import java.time.LocalDate;

public class DtoComparendo extends DtoPersona {

    private String numComparendo;
    private LocalDate fechaInfraccion; 
    private String infraccion;
    
    public DtoComparendo(){}
    
    public DtoComparendo(String numComparendo, LocalDate fechaInfraccion, String infraccion, int identificacion, String nombre, String correo, String direccion, String cod_tipo_persona) {
        super(identificacion, nombre, correo, direccion, cod_tipo_persona);
        this.numComparendo = numComparendo;
        this.fechaInfraccion = fechaInfraccion;
        this.infraccion = infraccion;
    }

    public String getNumComparendo() {
        return numComparendo;
    }

    public void setNumComparendo(String numComparendo) {
        this.numComparendo = numComparendo;
    }

    public LocalDate getFechaInfraccion() {
        return fechaInfraccion;
    }

    public void setFechaInfraccion(LocalDate fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }

}
