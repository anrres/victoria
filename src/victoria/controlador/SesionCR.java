package victoria.controlador;

import victoria.entidad.util.Mensaje;
import victoria.entidad.util.Sesion;
import victoria.modelo.SesionDAO;

/**
 *
 * @author andres.silva
 */
public class SesionCR {

    private String strLogin;
    private String strClave;
    private Sesion sesSesion;
    private Mensaje menMensaje;

    public SesionCR() {
        strLogin = "";
        strClave = "";
        sesSesion = new Sesion();
        menMensaje = new Mensaje();
    }

    public String getStrLogin() {
        return strLogin;
    }

    public void setStrLogin(String strLogin) {
        this.strLogin = strLogin;
    }

    public String getStrClave() {
        return strClave;
    }

    public void setStrClave(String strClave) {
        this.strClave = strClave;
    }

    public Mensaje getMenMensaje() {
        return menMensaje;
    }

    public void setMenMensaje(Mensaje menMensaje) {
        this.menMensaje = menMensaje;
    }

    public Sesion getSesSesion() {
        return sesSesion;
    }

    public void setSesSesion(Sesion sesSesion) {
        this.sesSesion = sesSesion;
    }

    public boolean booIniciaSesion() {
        boolean booUsuarioValido = false;
        this.setMenMensaje(new Mensaje());
        SesionDAO loSesSesionMO = new SesionDAO();
        try {
            if (!(booUsuarioValido = loSesSesionMO.booIniciaSesion(this.getSesSesion(), this.strLogin, this.strClave))) {
                this.setMenMensaje(loSesSesionMO.getMenMensaje());
            } else {
                //Verifica usuario segun area
                /*	if(!(booUsuarioValido = loSesSesionBO.booVerificarUsuario(this.getSesSesion(), this.strNomNavegador)))
						this.setMenMensaje(loSesSesionBO.getMenMensaje());*/
            }
        } catch (Exception e) {
            this.getMenMensaje().setMenMensaje(-1, e.getMessage(), null);
        }

        return booUsuarioValido;
    }

}
