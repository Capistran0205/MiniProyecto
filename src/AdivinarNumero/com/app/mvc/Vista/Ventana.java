/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdivinarNumero.com.app.mvc.Vista;

import AdivinarNumero.com.app.mvc.Controlador.Controlador;
import Librerias.com.app.EncontrarNumeros;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.*;

/**
 *
 * @author capis
 */
public class Ventana extends JFrame {
    // Variables 
    private DefaultListModel<String> modeloLista; // Es un modelo de datos para el JList
    private int[] arregloNumeros; // Para almacenar los números del usuario de forma secuencial 1, 2, ..., 10
    private int[] numerosFaltantes; // Para guardar números faltantes
    private int numeroFaltante; // Para guardar solo un número
    private int cantidadAsignada; // Para el tamaño del arreglo de números
    private int indice = -1; // Un indice de valor para agregar valores al array
    private int cantidadFaltante = 0; // Indicador de cuantos números faltantes hay en el arreglo
    // Uso de variables por referencia (objeto) a las clases Controlador y EncontrarNumeros
    Controlador control;
    EncontrarNumeros numeros;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        // Estableciendo un titulo, acción después de cerrarse, posición y aplicando un diseño de tabla al panel de datos
        this.setResizable(false);
        this.setTitle("Adivina el faltante o faltantes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panelDatos.setLayout(new GridLayout(10, 10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDatosFaltantes = new javax.swing.JList<>();
        txtTamañoArreglo = new javax.swing.JTextField();
        txtAsignarElemento = new javax.swing.JTextField();
        btnAsignarTamaño = new javax.swing.JButton();
        btnEncontrarNumero = new javax.swing.JButton();
        btnEncontrarNumeros = new javax.swing.JButton();
        btnAgregarDato = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Cantidad de Elementos:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Ingresar Dato:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Elementos Faltantes:");
        jLabel3.setToolTipText("");

        jScrollPane1.setViewportView(listDatosFaltantes);

        btnAsignarTamaño.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAsignarTamaño.setText("Guardar Tamaño");
        btnAsignarTamaño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsignarTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTamañoActionPerformed(evt);
            }
        });

        btnEncontrarNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEncontrarNumero.setText("Un Sólo Dato");
        btnEncontrarNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEncontrarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncontrarNumeroActionPerformed(evt);
            }
        });

        btnEncontrarNumeros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEncontrarNumeros.setText("Varios Datos");
        btnEncontrarNumeros.setToolTipText("");
        btnEncontrarNumeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEncontrarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncontrarNumerosActionPerformed(evt);
            }
        });

        btnAgregarDato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarDato.setText("Agregar Dato");
        btnAgregarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Reiniciar");

        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtAsignarElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtTamañoArreglo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsignarTamaño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEncontrarNumeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEncontrarNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarDato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTamañoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarTamaño))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtAsignarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarDato)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEncontrarNumero)
                        .addGap(18, 18, 18)
                        .addComponent(btnEncontrarNumeros)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnReiniciar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -8, 560, 230));

        panelDatos.setBackground(new java.awt.Color(0, 0, 0));
        panelDatos.setLayout(new java.awt.GridLayout(10, 10, 5, 5));
        getContentPane().add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 560, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTamañoActionPerformed
        if (!txtTamañoArreglo.getText().isEmpty()) {
            control = new Controlador(txtTamañoArreglo.getText());
            cantidadAsignada = control.getTamano();
            arregloNumeros = new int[cantidadAsignada];
        }
        cleanCamposTexto();
    }//GEN-LAST:event_btnAsignarTamañoActionPerformed

    private void btnEncontrarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncontrarNumeroActionPerformed
        if (cantidadFaltante == 1) {
            numeros = new EncontrarNumeros();
            numeroFaltante = numeros.encontrarNumero(arregloNumeros, cantidadAsignada);
            System.out.println(numeroFaltante);
            showNumber();
        } else
            JOptionPane.showMessageDialog(this, "No hay numeros o hay más de un número faltante", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEncontrarNumeroActionPerformed

    private void btnAgregarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDatoActionPerformed
        indice++; // Incremento para añadir el número a la posición correspondiente del arreglo
        if (cantidadAsignada != 0 && !txtAsignarElemento.getText().isEmpty()) { // Evitar desborde de arreglo y que el valor del campo de texto contenga algo
            if (indice < cantidadAsignada) {
                int valor = control.setElement(txtAsignarElemento.getText());
                if (valor == 0) {
                    cantidadFaltante++; // Contar la cantidad de faltantes
                }
                // Creación de un Label para mostrar el dato en el panel de datos
                JLabel label = new JLabel();
                label.setForeground(Color.red);
                label.setText(String.valueOf(valor));
                panelDatos.add(label);
                arregloNumeros[indice] = valor;
                // Actualizar el Panel que contien los datos
                panelDatos.revalidate();
                panelDatos.repaint(); // Forzar cambio
            } else {
                JOptionPane.showMessageDialog(this, "No se pueden ingresar más elementos", "Arreglo lleno", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se asignado un valor al arreglo o no hay un dato a ingresar: ", "", JOptionPane.WARNING_MESSAGE);
        }
        cleanCamposTexto();
    }//GEN-LAST:event_btnAgregarDatoActionPerformed

    private void btnEncontrarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncontrarNumerosActionPerformed
        if (cantidadFaltante > 1) { // Validar si es más de un número faltante
            numeros = new EncontrarNumeros(); // Instanciar el objeto de EncontrarNumeros
            numerosFaltantes = numeros.encontrarNumeros(arregloNumeros, cantidadAsignada); // Se usa el método encontrarNumeros pasando el arreglo y el tamaño asignado
            System.out.println(Arrays.toString(numerosFaltantes));
            showNumbers(); // Uso del método para mostrar los datos en el JList
        }
        else
            JOptionPane.showMessageDialog(this, "No hay números faltantes o solo hay uno", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEncontrarNumerosActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        newGame(); // LLamada al método para reiniciar todos los valores de los componentes, excepto el del JList
    }//GEN-LAST:event_btnReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDato;
    private javax.swing.JButton btnAsignarTamaño;
    private javax.swing.JButton btnEncontrarNumero;
    private javax.swing.JButton btnEncontrarNumeros;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listDatosFaltantes;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtAsignarElemento;
    private javax.swing.JTextField txtTamañoArreglo;
    // End of variables declaration//GEN-END:variables
    public void showNumbers() {
        modeloLista = new DefaultListModel<>();
        for (int elemento : numerosFaltantes) {
            modeloLista.addElement(String.valueOf(elemento));
        }
        // Si listDatosFaltantes ya está asociado con modeloLista, no es necesario crear un nuevo JList.
        listDatosFaltantes.setModel(modeloLista); // Asegúrate de que el JList use el modelo actualizado
        listDatosFaltantes.revalidate();  // Asegúrate de que la interfaz se actualice correctamente
        listDatosFaltantes.repaint();  // Fuerza un repintado del JList
    }

    public void showNumber() {
        modeloLista = new DefaultListModel<>();
        modeloLista.addElement(String.valueOf(numeroFaltante));
        listDatosFaltantes.setModel(modeloLista); // Actualizamos el modelo
        listDatosFaltantes.revalidate();  // Aseguramos que la interfaz se actualice
        listDatosFaltantes.repaint();  // Repintamos la lista
    }

    public void cleanCamposTexto() {
        // Vaciando los campos de texto
        txtAsignarElemento.setText(null);
        txtTamañoArreglo.setText(null);
    }

    public void newGame() {
        // Limpiar el JPanel
        panelDatos.removeAll();
        panelDatos.revalidate(); // Validar el cambio aplicado
        panelDatos.repaint(); // Forzar actualización al estado
        // Reiniciar variables
        arregloNumeros = null;
        numerosFaltantes = null;
        numeroFaltante = 0;
        cantidadAsignada = 0;
        indice = -1;
        cantidadFaltante = 0;
    }
}
