package victoria.entidad.util;
import java.util.Calendar;
import victoria.entidad.Estado;

/**
 *
 * @author andres.silva
 */
public class General {

    private long lonId;
    private String strId;
    private String strNombre = "";
    private String strDescripcion = "";
    private String strNombreTxt = "";
    private String strDescripcionTxt = "";
    private String strIdUsuarioLog = "";
    //private Estado estEstado;
    private Calendar calFechaRegistro;
    private String strMotivoEstado = "";
    private Calendar calFechaEstado;

    private boolean booVisible;
    private boolean booProcesado;
    private Mensaje menMensaje;

    public General() {
        strId = "";
        strNombre = "";
        strDescripcion = "";
        strNombreTxt = "";
        strDescripcionTxt = "";
        strMotivoEstado = "";
        calFechaRegistro = Parametro.getCalFechaActual();
        calFechaEstado = Parametro.getCalFechaActual();
        menMensaje = new Mensaje();
        //estEstado = new Estado();
        booProcesado = false;
        booVisible = false;
    }

    public long getLonId() {
        return lonId;
    }

    public void setLonId(long lonId) {
        this.lonId = lonId;
    }

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    public String getStrNombreTxt() {
        return strNombreTxt;
    }

    public void setStrNombreTxt(String strNombreTxt) {
        this.strNombreTxt = strNombreTxt;
    }

    public String getStrDescripcionTxt() {
        return strDescripcionTxt;
    }

    public void setStrDescripcionTxt(String strDescripcionTxt) {
        this.strDescripcionTxt = strDescripcionTxt;
    }

    public String getStrIdUsuarioLog() {
        return strIdUsuarioLog;
    }

    public void setStrIdUsuarioLog(String strIdUsuarioLog) {
        this.strIdUsuarioLog = strIdUsuarioLog;
    }

    public Calendar getCalFechaRegistro() {
        return calFechaRegistro;
    }

    public void setCalFechaRegistro(Calendar calFechaRegistro) {
        this.calFechaRegistro = calFechaRegistro;
    }

    public String getStrMotivoEstado() {
        return strMotivoEstado;
    }

    public void setStrMotivoEstado(String strMotivoEstado) {
        this.strMotivoEstado = strMotivoEstado;
    }

    public Calendar getCalFechaEstado() {
        return calFechaEstado;
    }

    public void setCalFechaEstado(Calendar calFechaEstado) {
        this.calFechaEstado = calFechaEstado;
    }

    public boolean isBooVisible() {
        return booVisible;
    }

    public void setBooVisible(boolean booVisible) {
        this.booVisible = booVisible;
    }

    public boolean isBooProcesado() {
        return booProcesado;
    }

    public void setBooProcesado(boolean booProcesado) {
        this.booProcesado = booProcesado;
    }

    public Mensaje getMenMensaje() {
        return menMensaje;
    }

    public void setMenMensaje(Mensaje menMensaje) {
        this.menMensaje = menMensaje;
    }

    /*public Estado getEstEstado() {
        return estEstado;
    }

    public void setEstEstado(Estado estEstado) {
        this.estEstado = estEstado;
    }*/

}
