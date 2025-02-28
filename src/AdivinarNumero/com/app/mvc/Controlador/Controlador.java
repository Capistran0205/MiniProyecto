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

    // Declaración de la variable 'cantidadAsignada', que almacenará el tamaño asignado del arreglo de números
    private int cantidadAsignada;

// Creación de instancias de las clases 'EntradaDatos' y 'EncontrarNumeros' 
// 'EntradaDatos' probablemente valida los datos de entrada, y 'EncontrarNumeros' se usa para manipular números
    EntradaDatos datos = new EntradaDatos();
    EncontrarNumeros numeros = new EncontrarNumeros();

    // Constructor de la clase 'Controlador' que recibe una cadena como parámetro
    public Controlador(String cadena) {
        // Se asigna el tamaño de acuerdo con la cadena proporcionada, llamando al método 'setTamano'
        cantidadAsignada = setTamano(cadena);

        // Se muestra un cuadro de mensaje con el tamaño asignado para el arreglo de números
        JOptionPane.showMessageDialog(null, "Tamaño: " + cantidadAsignada + " para el arreglo de números", "Asignación de Tamaño", JOptionPane.INFORMATION_MESSAGE);
    }

// Método que toma una cadena y devuelve un número entero positivo o 0 si la cadena no es válida
    public int setTamano(String valor) {
        // Verifica si la cadena es un número entero
        boolean esNumero = datos.esEntero(valor);

        // Si es un número, se devuelve su valor absoluto (si el número es negativo, se convierte en positivo)
        if (esNumero) {
            return Math.abs(Integer.parseInt(valor)); // Retorna el valor entero positivo
        } else {
            // Si no es un número válido, se retorna 0
            return 0;
        }
    }

// Método que también recibe una cadena y devuelve un número entero positivo, 
// después de confirmar que el usuario desea registrar el número
    public int setElement(String valor) {
        // Verifica si la cadena es un número entero
        boolean esNumero = datos.esEntero(valor);

        // Si es un número válido y el usuario confirma la acción, se devuelve el valor entero positivo
        if (esNumero && confirNumero()) {
            return Math.abs(Integer.parseInt(valor)); // Retorna el valor entero positivo
        } else {
            // Si no es un número válido o el usuario no confirma, se retorna 0
            return 0;
        }
    }

// Método que muestra un cuadro de diálogo para confirmar si el usuario desea registrar el número
    public boolean confirNumero() {
        boolean respuesta = false;

        // Muestra un cuadro de confirmación con las opciones "Sí" y "No"
        int numeroAceptacion = JOptionPane.showConfirmDialog(null, "¿Deseas registrar este número?", "Confirmar número", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Si el usuario selecciona "Sí", se establece 'respuesta' en true
        if (numeroAceptacion == JOptionPane.YES_OPTION) {
            respuesta = true;
        }

        // Devuelve true si el usuario seleccionó "Sí", de lo contrario false
        return respuesta;
    }

// Método que devuelve el tamaño asignado, almacenado en la variable 'cantidadAsignada'
    public int getTamano() {
        return cantidadAsignada; // Retorna el tamaño asignado del arreglo o estructura de datos
    }

}
