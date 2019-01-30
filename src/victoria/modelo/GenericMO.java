package victoria.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;

/**
 *
 * @author andres.silva
 */
public class GenericMO {

    public int intError = 0;
    public String strError = "";

    public Connection getConnection() throws NamingException {
        Connection cnn = null;
        strError = "";
        intError = 0;
        try {
            //File temp = new File("/db/victoria.db");
            //String url = "jdbc:sqlite:" + temp.getAbsolutePath().replace("\\", "\\\\");
            String url = "jdbc:sqlite:data\\victoria.db";
            //conn = DriverManager.getConnection("jdbc:sqlite:data\\bank_database.db");            
            // create a connection to the database
            cnn = DriverManager.getConnection(url);

            if (cnn.isClosed()) {
                System.out.println("conexion cerrada");
            }
        } catch (SQLException sqle) {
            System.out.println("Error obteniendo la conexión en GenericMO: " + sqle.getMessage());
            strError = sqle.getMessage();
            intError = -1;
        }
        return cnn;
    }
}
