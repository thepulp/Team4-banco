/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Vector;

/**
 * <>
 * @author Luis Eduardo Mata Hernandez 18550752
 */
public class Lista_Usuario {

    private static Vector<Usuario> datos = new Vector<Usuario>();

    public static void agregar(Usuario obj) {
        datos.addElement(obj);
    }


   /* public static void Eliminar(int posicion) {
        datos.removeElementAt(posicion);
    }*/

    public static Vector mostrar() {
        return datos; //Aqui todo se va a almacenar

    }

}
