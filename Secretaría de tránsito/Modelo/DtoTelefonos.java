
package Modelo;


public class DtoTelefonos {

    private long telefono1;
    private long telefono2;

    public DtoTelefonos(long telefono1, long telefono2) {
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public long getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(long telefono1) {
        this.telefono1 = telefono1;
    }

    public long getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(long telefono2) {
        this.telefono2 = telefono2;
    }
}


