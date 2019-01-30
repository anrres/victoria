package victoria.entidad.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author andres.silva
 */
public class Parametro {

    public static final int intRegistroValido = 1;
    public static final int intRegistroInvalido = -1;
    public static final int intMensajeAlerta = 10;
    public static final long lonRegistroInvalido = -1;
    public static final double douRegistroInvalido = -1.0;
    /**
     * MENSAJES*****************************************************************************************************
     */
    public static final String MENSAJE_BLOQUEOTRAMITE = "No es posible rutear este trámite debido a que no está autorizado. Para más información comuníquese con el Contador General Sr. Napoleón Hernández";
    public static final String MENSAJE_EXITO = "Transacción exitosa.";
    public static final String MENSAJE_GUARDAR = "El registro fue guardado con éxito.";
    public static final String MENSAJE_TRANSACCION_EXITOSA = "Transacción exitosa.";
    public static final String MENSAJE_ERRRORGUARDAR = "Error al guardar: ";
    public static final String MENSAJE_MODIFICAR = "El registro fue modificado con éxito.";
    public static final String MENSAJE_ERRRORMODIFICAR = "Error al modificar: ";
    public static final String MENSAJE_CONFIRMARELIMINAR = "¿Desea eliminar el registro?";
    public static final String MENSAJE_ELIMINAR = "El registro ha sido eliminado.";
    public static final String MENSAJE_ERRRORELIMINAR = "Error al eliminar: ";
    public static final String MENSAJE_NOHAREALIZADOCAMBIOS = "No ha realizado ningún cambio en el registro.";
    public static final String MENSAJE_NOHACARGADO = "No ha cargado un registro para poderlo eliminar.";
    public static final String MENSAJE_CAMPOSOBLIGATORIOS = "Campos obligatorios no establecidos: ";
    public static final String MENSAJE_FECHAFINMENOR = "El campo Fecha Fin es menor a la Fecha Inicio ingresada.";
    public static final String MENSAJE_ERRORREGISTRO = "Error en registro: ";
    public static final String MENSAJE_REGISTROUTILIZADO = "El registro no puede ser eliminado. Posee relación con otros registros.";
    public static final String MENSAJE_REGISTROEXISTE = "Ya existe un registro con el mismo nombre con el código: ";
    public static final String MENSAJE_REGISTROEXISTEDATOS = "Ya existe un registro con los mismos datos, con el código: ";
    public static final String MENSAJE_REGISTROEXISTEXHTML = "Ya existe un registro con los mismos datos. ";
    public static final String MENSAJE_CODIGOPARTIDAEXISTE = "Ya existe un registro con el mismo Código  : ";
    public static final String MENSAJE_IDENTIFICACIÓNEXISTE = "Ya existe un registro con la misma identificación para la persona: ";
    public static final String MENSAJE_NOEXISTENREGISTROS = "No exite(n) registro(s) con el criterio de búsqueda.";
    public static final String MENSAJE_OBJETOVACIO = "El objeto está vacio o no posee código.";
    public static final String MENSAJE_CONSULTARXCODIGO = "Ingrese el código que desea consultar y presione enter.";
    public static final String MENSAJE_CONSULTARXNOMBRE = "Ingrese el nombre o parte del mismo y presione enter para consultar coincidencias.";
    public static final String MENSAJE_BUSCAR = "Ingrese en la caja de texto de Código o Nombre los caracteres necesarios para realizar la búsqueda y presione Enter.";
    public static final String MENSAJE_BUSCARXCRITERIOS = "Seleccione los criterios por los que desea realizar la búsqueda.";
    public static final String MENSAJE_COBLIGATORIOS = "*Campos obligatorios.";
    public static final String MENSAJE_USUARIOINCORRECTO = "Usuario o contraseña incorrecto.";
    public static final String TEXTO_CONSULTA = "C O N S U L T A";
    public static final String MENSAJE_REGISTRONOENCONTRADO = "Registro no encontrado.";
    public static final String MENSAJE_REGISTRONOVIGENTE = "Registro no vigente.";
    public static final String MENSAJE_MODIFICADOENELAREA = "MODIFICADO EN EL AREA";
    public static final int CODIGO_ERROR = -1;

    /**
     * IMAGEN
     * *****************************************************************************************************
     */
    public static final String IMA_LOGO = "../images/cabecera/cablogo.jpg";
    public static final String IMA_SELECCIONAR = "<img src='../images/botones/botseleccionar.png' border='0' align=middle>";
    public static final String IMA_GUARDARSUB = "<img src='../../images/pie/pieguardar2.png' border='0' align=middle>";
    public static final String IMA_AGREGAR = "<img src='../images/botones/botagregar.png' border='0' align=middle>";
    public static final String IMA_REMOVER = "<img src='../images/botones/botremover.png' border='0' align=middle>";
    public static final String IMA_MENSAJE = "<img src='../images/piemensaje.png' border='0' align=middle>";
    public static final String IMA_MENSAJEERROR = "<img height=15 width=15 src='../images/mensaje/menerror.jpg' border='0' align=middle>";
    public static final String IMA_MENSAJEALERTA = "<img height=15 width=15 src='../images/mensaje/menalerta.jpg' border='0' align=middle>";
    public static final String IMA_MENSAJEOK = "<img height=15 width=15 src='../images/mensaje/menok.jpg' border='0' align=middle>";

    public static final String IMA_SELECCIONARSUB = "<img src='../../images/botones/botseleccionar.png' border='0' align=middle>";
    public static final String IMA_AGREGARSUB = "<img height=15 width=15 src='../../images/botones/botagregar.png' border='0' align=middle>";
    public static final String IMA_REMOVERSUB = "<img height=15 width=15 src='../../images/botones/botremover.png' border='0' align=middle>";
    public static final String IMA_APROBARSUB = "<img height=15 width=15 src='../../images/botones/botaprobar.gif' border='0' align=middle>";
    public static final String IMA_ANULARSUB = "<img height=15 width=15 src='../../images/botones/botanular.png' border='0' align=middle>";
    public static final String IMA_ACTUALIZARSUB = "<img height=15 width=15 src='../../images/botones/botactualizar.png' border='0' align=middle>";
    public static final String IMA_VERIFICARSUB = "<img height=15 width=15 src='../../images/icons/verify.gif' border='0' align=middle>";
    public static final String IMA_EDITDETALLESUB = "<img height=15 width=15 src='../../images/botones/boteditar.png' border='0' align=middle>";
    public static final String IMA_LINKDETALLESUB = "<img height=15 width=15 src='../../images/botones/botlink.png' border='0' align=middle>";
    public static final String IMA_MENSAJEERRORSUB = "<img height=15 width=15 src='../../images/mensaje/menerror.jpg' border='0' align=left>";
    public static final String IMA_MENSAJEALERTASUB = "<img height=15 width=15 src='../../images/mensaje/menalerta.jpg' border='0' align=left>";
    public static final String IMA_MENSAJEOKSUB = "<img height=15 width=15 src='../../images/mensaje/menok.jpg' border='0' align=left>";
    public static final String IMA_IMPRIMIRSUB = "<img  height=15 width=15 src='../../images/botones/botimprimir.png' border='0'  align=middle>";
    public static final String IMA_ACEPTARSUB = "<img  height=15 width=15 src='../../images/botones/botaceptar.png' border='0'  align=middle>";
    public static final String IMA_CANCELARSUB = "<img  height=15 width=15 src='../../images/botones/botcancelar.png' border='0'  align=middle>";
    public static final String IMA_GENERARSUB = "<img  height=15 width=15 src='../../images/botones/botgenerar.png' border='0'  align=middle>";
    public static final String IMA_BUSCARSUB = "<img  height=15 width=15 src='../../images/botones/botbuscar.png' border='0'  align=middle>";
    public static final String IMA_VERCTASSUB = "<img  height=15 width=15 src='../../images/botones/botctas.png' border='0'  align=middle>";
    public static final String IMA_LEDAMARILLO = "<img src='../../images/icons/led_amarillo.png' border='0' align=middle>";
    public static final String IMA_VERIFICAR = "<img src='../../images/icons/atencion.png' border='0' align=middle>";

    public static final Calendar getCalFechaActual() {
        Calendar loCalRetorno = Calendar.getInstance();
        loCalRetorno.setTime(new Date());
        return loCalRetorno;
    }
    public static final String VI_ESTADO_INGRESADO = "IN";
}
