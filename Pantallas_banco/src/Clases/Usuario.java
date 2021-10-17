/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Vector;

/**
 *
 * @author Luis Eduardo Mata Hernandez 18550752
 */
public class Usuario {

    private String nombre;
    private String Contraseña;
    private String Email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getEmail() {
        return Email;
    }

    public static int verificarUsuarioNuevo(String usuario) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {//recorre la lista de usuarios

            obj = (Usuario) lista.elementAt(i);

            if (obj.getNombre().equalsIgnoreCase(usuario)) { //verificar
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogin(String usuario, String contraseña) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNombre().equalsIgnoreCase(usuario) && obj.getContraseña().equalsIgnoreCase(contraseña)) {
                return i;
            }
        }//fin for
        return -1;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public static Vector mostrar() {
        return Lista_Usuario.mostrar();
    }
}
