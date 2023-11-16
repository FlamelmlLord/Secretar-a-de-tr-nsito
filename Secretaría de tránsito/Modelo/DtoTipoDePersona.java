
package Modelo;


public class DtoTipoDePersona {
    private int Identificación;
    private int tipo_de_persona;

    public DtoTipoDePersona(int Identificación, int tipo_de_persona) {
        this.Identificación = Identificación;
        this.tipo_de_persona = tipo_de_persona;
    }

    public int getIdentificación() {
        return Identificación;
    }

    public void setIdentificación(int Identificación) {
        this.Identificación = Identificación;
    }

    public int getTipo_de_persona() {
        return tipo_de_persona;
    }

    public void setTipo_de_persona(int tipo_de_persona) {
        this.tipo_de_persona = tipo_de_persona;
    }
    
    
}
