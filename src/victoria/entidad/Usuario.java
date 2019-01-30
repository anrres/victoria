package victoria.entidad;

import victoria.entidad.util.General;

/**
 *
 * @author andres.silva
 */
public class Usuario extends General {

    private String strIdUsuario;
    private Persona perPersona = new Persona();
    private String strClave;
    private Estado  estEstado = new Estado();

    public Usuario() {
        super();
        strIdUsuario = "";
        strClave = "";
    }

    public Persona getPerPersona() {
        return perPersona;
    }

    public void setPerPersona(Persona perPersona) {
        this.perPersona = perPersona;
    }

    public String getStrClave() {
        return strClave;
    }

    public void setStrClave(String strClave) {
        this.strClave = strClave;
    } 

    public String getStrIdUsuario() {
        return strIdUsuario;
    }

    public void setStrIdUsuario(String strIdUsuario) {
        this.strIdUsuario = strIdUsuario;
    }

    public Estado getEstEstado() {
        return estEstado;
    }

    public void setEstEstado(Estado estEstado) {
        this.estEstado = estEstado;
    }

}
