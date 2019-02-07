package victoria.modelo;

import javax.naming.NamingException;
import victoria.entidad.util.Sesion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author andres.silva
 */
public class AdmBase extends GenericDAO {

    private Connection conConexion;
    public Sesion sesSesion;
    private boolean booTransaccion = false;

    public AdmBase() {

    }

    public AdmBase(Sesion inSesSesion) {
        sesSesion = inSesSesion;
        if (inSesSesion != null && inSesSesion.getUsuUsuario() != null && inSesSesion.getUsuUsuario().getStrId() != null
                && inSesSesion.getUsuUsuario().getStrId().length() > 0) {
            try {
                conConexion = getConnection();
            } catch (NamingException e) {
                System.out.println(e.getMessage());
                //e.printStackTrace();
                strError = e.getMessage();
                intError = -1;
            }

        } else {
            strError = "Sesion no válida";
            intError = -1;
        }
    }

    public boolean booCreaConexionInicial() {
        boolean loBooRetorno = false;
        try {
            conConexion = getConnection();
            if (intError == 0) {
                loBooRetorno = true;
            }
        } catch (NamingException e) {
            //e.printStackTrace();
            strError = e.getMessage();
            return loBooRetorno;
        }
        return loBooRetorno;
    }

    public Connection getConConexion() {
        return conConexion;
    }

    public void setConConexion(Connection conConexion) {
        this.conConexion = conConexion;
    }

    /**
     * este metodo es para que no se realize el commit hasta que se ejecute
     * totalmente el query y lleguemos al metodo commit()
     */
    public boolean booBeginTran() {
        boolean loBooRetorno = false;
        if (conConexion != null) {
            booTransaccion = true;
            try {
                conConexion.setAutoCommit(false);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            loBooRetorno = true;
        }
        return loBooRetorno;
    }

    /**
     * este metodo sirve para dar la instruccion que se guarde en la base de
     * dato por medio del commit
     */
    public void commit() {
        if (conConexion != null) {
            try {
                conConexion.commit();
                conConexion.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                cierraConeccion();
            }
        }
    }

    /**
     * reversa todas las transacciones que se han ejecutado en la basede datos
     *
     */
    public void rollback() {
        if (conConexion != null) {
            try {
                conConexion.rollback();
                conConexion.setAutoCommit(true);
            } catch (SQLException e) {
                e.getMessage();
            } finally {
                cierraConeccion();
            }
        }
    }

    private void cierraConeccion() {
        try {
            conConexion.close();
            conConexion = null;
            booTransaccion = false;
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
