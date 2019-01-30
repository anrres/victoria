package victoria.entidad;

import victoria.entidad.util.General;

/**
 *
 * @author andres.silva
 */
public class Estado extends General {

    private String strIdEstado = "";

    public Estado() {
        super();
        strIdEstado = "";
    }

    public String getStrIdEstado() {
        return strIdEstado;
    }

    public void setStrIdEstado(String strIdEstado) {
        this.strIdEstado = strIdEstado;
    }

}
