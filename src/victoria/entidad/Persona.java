package victoria.entidad;

import victoria.entidad.util.Cadena;
import victoria.entidad.util.General;

/**
 *
 * @author andres.silva
 */
public class Persona extends General {

    private String strApellido1;
    private String strApellido2;
    private String strNombre1;
    private String strNombre2;
    private String strNumDocumento;
    private String strTelefono;
    private String strEmail;
    private String strDireccion;

    public Persona() {
        super();
        strApellido1 = "";
        strApellido2 = "";
        strNombre1 = "";
        strNombre2 = "";
        strNumDocumento = "";
        strTelefono = "";
        strEmail = "";
        strDireccion = "";
    }

    public String getStrApellido1() {
        return strApellido1;
    }

    public void setStrApellido1(String strApellido1) {
        this.strApellido1 = strApellido1;
    }

    public String getStrApellido2() {
        return strApellido2;
    }

    public void setStrApellido2(String strApellido2) {
        this.strApellido2 = strApellido2;
    }

    public String getStrNombre1() {
        return strNombre1;
    }

    public void setStrNombre1(String strNombre1) {
        this.strNombre1 = strNombre1;
    }

    public String getStrNombre2() {
        return strNombre2;
    }

    public void setStrNombre2(String strNombre2) {
        this.strNombre2 = strNombre2;
    }

    public String getStrNumDocumento() {
        return strNumDocumento;
    }

    public void setStrNumDocumento(String strNumDocumento) {
        this.strNumDocumento = strNumDocumento;
    }

    public String getStrTelefono() {
        return strTelefono;
    }

    public void setStrTelefono(String strTelefono) {
        this.strTelefono = strTelefono;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrDireccion() {
        return strDireccion;
    }

    public void setStrDireccion(String strDireccion) {
        this.strDireccion = strDireccion;
    }

    @Override
    public String getStrNombre() {
        String loStrTemp = "";
        loStrTemp = (Cadena.strVerificaString(strApellido1).trim().length() > 0 ? strApellido1
                .toUpperCase().trim()
                + " "
                : "")
                + (Cadena.strVerificaString(strApellido2).trim().length() > 0 ? strApellido2
                .toUpperCase().trim()
                + " "
                : "")
                + (Cadena.strVerificaString(strNombre1).trim().length() > 0 ? strNombre1
                .toUpperCase().trim()
                + " "
                : "")
                + (Cadena.strVerificaString(strNombre2).trim().length() > 0 ? strNombre2
                .toUpperCase().trim()
                : "");
        return loStrTemp;
    }
}
