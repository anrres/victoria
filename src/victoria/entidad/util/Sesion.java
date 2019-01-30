package victoria.entidad.util;

import victoria.entidad.Usuario;

/**
 *
 * @author andres.silva
 */
public class Sesion {

    private Mensaje menMensaje;
    private Usuario usuUsuario;

    public Sesion() {
        super();
        usuUsuario = new Usuario();
        menMensaje = new Mensaje();
    }

    public Mensaje getMenMensaje() {
        return menMensaje;
    }

    public void setMenMensaje(Mensaje menMensaje) {
        this.menMensaje = menMensaje;
    }

    public Usuario getUsuUsuario() {
        return usuUsuario;
    }

    public void setUsuUsuario(Usuario usuUsuario) {
        this.usuUsuario = usuUsuario;
    }

}
