/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victoria.entidad.util;

/**
 *
 * @author andres.silva
 */
import java.io.Serializable;

public class Mensaje implements Serializable {

    private static final long serialVersionUID = -8060787117357548646L;
    private int intCodigo;
    private String strImagen;
    private String strDescripcion;
    private String strDescripcionA;
    private boolean booView;

    public Mensaje() {
        super();
        strDescripcion = "";
        strDescripcionA = "";
        strImagen = "";
    }

    public Mensaje(int inIntCodigo, String inStrDescripcion) {
        super();
        strDescripcion = inStrDescripcion;
        intCodigo = inIntCodigo;
        strImagen = "";
        booView = false;
    }

    public int getIntCodigo() {
        return intCodigo;
    }

    public void setIntCodigo(int intCodigo) {
        this.intCodigo = intCodigo;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    public String getStrDescripcionA() {
        return strDescripcionA;
    }

    public void setStrDescripcionA(String strDescripcionA) {
        this.strDescripcionA = strDescripcionA;
    }

    public void setMenMensaje(int inIntCodigo, String inStrDescripcion) {
        this.intCodigo = inIntCodigo;
        this.strDescripcion = inStrDescripcion;
    }

    public void setMenMensaje(int inIntCodigo, String inStrDescripcion, String inStrImagen) {
        this.intCodigo = inIntCodigo;
        this.strDescripcion = inStrDescripcion;
        this.strImagen = inStrImagen;
    }

    public void setMenMensaje(int inIntCodigo, String inStrDescripcion, String inStrDescripcionA, String inStrImagen) {
        this.intCodigo = inIntCodigo;
        this.strDescripcion = inStrDescripcion;
        this.strDescripcionA = inStrDescripcionA;
        this.strImagen = inStrImagen;
    }

    public String getStrImagen() {
        return strImagen;
    }

    public void setStrImagen(String strImagen) {
        this.strImagen = strImagen;
    }

    public boolean isBooView() {
        return booView;
    }

    public void setBooView(boolean booView) {
        this.booView = booView;
    }

}
