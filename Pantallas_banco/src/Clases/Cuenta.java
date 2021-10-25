/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Usuario.mostrar;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class Cuenta {
    // Definición de las propiedades de la clase

    private int numeroCuenta;
    private int Contador = 0;
    private double saldo;

    public Cuenta(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } // Fin del constructor cuenta

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } // Fin del método depositar

    public void historial() {
        Contador++;
    }

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } // Fin del método retirar

    public double saldo() {
        return saldo;
    } // Fin del método saldo   

    public static int verificarTransicion(String beneficiario) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNombre().equals(beneficiario)) {
                return i;
            }
        }
        return -1;
    }
}
