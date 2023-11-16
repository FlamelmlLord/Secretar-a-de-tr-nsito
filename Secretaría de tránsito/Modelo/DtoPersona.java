
package Modelo;


public class DtoPersona {

    private int identificacion;
    private String nombre;
    private String correo;
    private String direccion;
    private String cod_tipo_persona;

    public DtoPersona(){}
    
    public DtoPersona(int identificacion, String nombre, String correo, String direccion, String cod_tipo_persona) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.cod_tipo_persona = cod_tipo_persona;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCod_tipo_persona() {
        return cod_tipo_persona;
    }

    public void setCod_tipo_persona(String cod_tipo_persona) {
        this.cod_tipo_persona = cod_tipo_persona;
    }
    
}





    
