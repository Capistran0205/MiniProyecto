/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdivinarNumero.com.app.mvc.Controlador;

import Librerias.com.app.EntradaDatos;
import Librerias.com.app.EncontrarNumeros;
import javax.swing.JOptionPane;

/**
 *
 * @author capis
 */
public class Controlador {

    private int cantidadAsignada;
    //private int[] arreglo;  // El arreglo para guardar los números      
    EntradaDatos datos = new EntradaDatos();
    EncontrarNumeros numeros = new EncontrarNumeros();

    public Controlador(String cadena) {
        cantidadAsignada = setTamano(cadena);
        JOptionPane.showMessageDialog(null, "Tamaño: " + cantidadAsignada + " para el arreglo de números", "Asignación de Tamaño", JOptionPane.INFORMATION_MESSAGE);
    }

    public int setTamano(String valor) {
        boolean esNumero = datos.esEntero(valor);
        if (esNumero) {
            return Math.abs(Integer.parseInt(valor)); // Retornar el valor entero positivo
        } else {
            return 0;
        }
    }

    public int setElement(String valor) {
        boolean esNumero = datos.esEntero(valor);
        if (esNumero && confirNumero()) {
            return Math.abs(Integer.parseInt(valor)); // Retornar el valor entero positivo
        } else {
            return 0;
        }
    }

    public boolean confirNumero() {
        boolean respuesta = false;
        int numeroAceptacion = JOptionPane.showConfirmDialog(null, "¿Deseas registrar este número?", "Confirmar número", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (numeroAceptacion == JOptionPane.YES_OPTION) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public int getTamano(){
        return cantidadAsignada;
    }
    
}
