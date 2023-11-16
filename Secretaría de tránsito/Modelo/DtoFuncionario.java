
package Modelo;

public class DtoFuncionario {

    private String idFuncionario;
    private String nombre;
    private int documento;
    private String correo;
    private String contrasenia;

    public DtoFuncionario(String idFuncionario, String nombre, int documento, String correo, String contrasenia) {
        this.idFuncionario = idFuncionario;
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}


