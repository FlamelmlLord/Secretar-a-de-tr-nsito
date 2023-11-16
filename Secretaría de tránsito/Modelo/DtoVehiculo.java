
package Modelo;

public class DtoVehiculo extends DtoPersona{

    private String placa;
    private String marca;
    private String modelo;
    private String tipoVehiculo;
    private String color;
    
    public DtoVehiculo(){}
    
    public DtoVehiculo(String placa, String marca, String modelo, String tipoVehiculo, String color, int identificacion, String nombre, String correo, String direccion, String cod_tipo_persona) {
        super(identificacion, nombre, correo, direccion, cod_tipo_persona);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}