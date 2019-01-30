package victoria.entidad.util;

/**
 *
 * @author andres.silva
 */
public class Cadena {

    public Cadena() {
        super();
    }

    public static boolean booNoEsNull(String inStrCadena) {
        if (inStrCadena == null) {
            return false;
        }
        return true;
    }

    public static boolean booNoEsCadenaNull(String inStrCadena) {
        if (inStrCadena.toUpperCase().equals("NULL")) {
            return false;
        } else {
            if (inStrCadena.toUpperCase().equals("null")) {
                return false;
            }
        }
        return true;
    }

    public static boolean booNoEsCadenaBlanco(String inStrCadena) {
        if ((inStrCadena.replaceAll("\\s", "")).length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean booEsCadena(String inStrCadena) {
        if (booNoEsNull(inStrCadena) && booNoEsCadenaNull(inStrCadena) && booNoEsCadenaBlanco(inStrCadena)) {
            return true;
        }
        return false;
    }

    public static String strQuitaComas(String inStrCadena) {
        return inStrCadena.replaceAll("\"", "").replaceAll("'", "");
    }

    public static String strVerificaString(String inStrCadena) {
        return booEsCadena(inStrCadena) ? strQuitaComas(inStrCadena) : new String();
    }
}
