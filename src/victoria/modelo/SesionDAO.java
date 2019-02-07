package victoria.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import victoria.entidad.Usuario;

import victoria.entidad.util.Mensaje;
import victoria.entidad.util.Parametro;
import victoria.entidad.util.Sesion;

/**
 *
 * @author andres.silva
 */
public class SesionDAO {

    Mensaje menMensaje = new Mensaje();

    public SesionDAO() {
        this.setMenMensaje(new Mensaje());
    }

    public Mensaje getMenMensaje() {
        return menMensaje;
    }

    public void setMenMensaje(Mensaje menMensaje) {
        this.menMensaje = menMensaje;
    }

    public boolean booIniciaSesion(Sesion inSesSesion, String inStrLogin, String inStrClave) throws Exception {
        boolean loBooRetorno = false;
        AdmBase loAdmDatabase = new AdmBase();
        if (loAdmDatabase.booCreaConexionInicial()) {
            if (loAdmDatabase.booBeginTran()) {
                loBooRetorno = this.booIniciaSesion(loAdmDatabase, inSesSesion, inStrLogin, inStrClave);
                if (!loBooRetorno) {
                    this.setMenMensaje(this.getMenMensaje());
                } else {
                    this.getMenMensaje().setStrDescripcion("Usuario o clave incorrecta");
                }
            }
        } else {
            this.getMenMensaje().setMenMensaje(-1, loAdmDatabase.strError);
        }
        return loBooRetorno;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/db/victoria.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error obteniendo la conexión a la DB: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public boolean booIniciaSesion(AdmBase inAdmAdmBase, Sesion inSesSesion, String inStrLogin, String inStrClave) throws Exception {
        boolean loBooRetorno = false;
        String loStrSql = "SELECT * FROM VITUSUARIO WHERE upper(IDUSUARIO) = ? ";
        loStrSql += " AND CLAVE = ? ";
        loStrSql += " AND IDESTADO = '" + Parametro.VI_ESTADO_INGRESADO + "'";

        ResultSet loRSQuery = null;
        PreparedStatement loPrepStatement = null;
        loPrepStatement = inAdmAdmBase.getConConexion().prepareStatement(loStrSql);
        // Cifrador objObjeto=new Cifrador();
        // inStrClave=objObjeto.encriptar(Cifrador.strLlaveCifrado,inStrClave);
        if (inStrClave.equals("")) {
            this.getMenMensaje().setMenMensaje(Parametro.CODIGO_ERROR, "Error al obtener la clave");
            return loBooRetorno;
        }
        loPrepStatement.setString(1, inStrLogin.toUpperCase());
        loPrepStatement.setString(2, inStrClave);
        loRSQuery = loPrepStatement.executeQuery();
        if (loRSQuery != null && loRSQuery.next()) {
            loBooRetorno = true;
            if (loRSQuery.getString("IDESTADO").equals(Parametro.VI_ESTADO_INGRESADO)) {
                //inSesSesion.setStrFechaAcceso(Parametro.getStrFechaActual());
                inSesSesion.setUsuUsuario(new Usuario());
                inSesSesion.getUsuUsuario().setStrId(inStrLogin);
                inSesSesion.getUsuUsuario().setStrId(loRSQuery.getString("IDUSUARIO"));
                inSesSesion.getUsuUsuario().setStrIdUsuario(loRSQuery.getString("IDUSUARIO"));
                inSesSesion.getUsuUsuario().setLonId(loRSQuery.getLong("IDPERSONA"));
                inSesSesion.getUsuUsuario().setStrClave(loRSQuery.getString("CLAVE"));
                inSesSesion.getUsuUsuario().getEstEstado().setStrIdEstado(loRSQuery.getString("IDESTADO"));
            } else {
                this.getMenMensaje().setMenMensaje(Parametro.CODIGO_ERROR, "Usuario se encuentra inactivo");
            }
        } else {
            this.getMenMensaje().setMenMensaje(Parametro.CODIGO_ERROR, "Usuario o Clave incorrecta");
        }

        try {
            loPrepStatement.close();
        } catch (SQLException e) {
            this.getMenMensaje().setMenMensaje(Parametro.intRegistroInvalido, e.getMessage(), Parametro.IMA_MENSAJEERRORSUB);
        }
        if (loRSQuery != null) {
            try {
                loRSQuery.close();
                loPrepStatement.close();
            } catch (Exception e) {
                this.getMenMensaje().setMenMensaje(Parametro.intRegistroInvalido, e.getMessage(), Parametro.IMA_MENSAJEERRORSUB);
            }
        }
        return loBooRetorno;
    }
}
