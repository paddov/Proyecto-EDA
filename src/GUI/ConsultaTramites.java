/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import TDA.Cola;
import TDA.Nodo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Dependencia;
import modelo.Expediente;

/**
 *
 * @author PADILLA
 */
public class ConsultaTramites extends javax.swing.JFrame {
    private Cola RExpedientes;
    private String dni;
    private DefaultTableModel modeloTabla;
    
    public ConsultaTramites() {
        initComponents();
    }
    
    public ConsultaTramites(Cola RExpedientes, String dni) {
        initComponents();
        this.RExpedientes=RExpedientes;
        this.dni=dni;
        modeloTabla = new DefaultTableModel();
        this.TablaExpedientes.setModel(modeloTabla);
        modeloTabla.addColumn("Dependencia");
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Prioridad");
        modeloTabla.addColumn("Fecha de inicio");
        modeloTabla.addColumn("Fecha de fin");
        CargarTabla();
    }

    private void CargarTabla(){
        int filas=this.TablaExpedientes.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloTabla.removeRow(0);
        }
        Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
        while (!colaExpedientes.esVacia()) {
            Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
            String[] fila = new String[6];
            if (this.dni.equalsIgnoreCase(objExpediente.getUsuario().getDni())) {
                fila[0] = objExpediente.getnDependencia().getNombre();
                fila[1] = objExpediente.getId();
                fila[2] = objExpediente.getUsuario().getNombres();
                fila[3] = objExpediente.getNprioridad();
                fila[4] = objExpediente.getFyhInicio();
                fila[5] = objExpediente.getFyhFin();
                modeloTabla.addRow(fila);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaExpedientes = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Ordenar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expedientes");
        setResizable(false);

        TablaExpedientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Dependencia", "ID", "Nombre", "Prioridad", "Fecha de inicio", "Fecha de fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaExpedientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaExpedientes);
        if (TablaExpedientes.getColumnModel().getColumnCount() > 0) {
            TablaExpedientes.getColumnModel().getColumn(0).setResizable(false);
            TablaExpedientes.getColumnModel().getColumn(1).setResizable(false);
            TablaExpedientes.getColumnModel().getColumn(2).setResizable(false);
            TablaExpedientes.getColumnModel().getColumn(3).setResizable(false);
            TablaExpedientes.getColumnModel().getColumn(4).setResizable(false);
            TablaExpedientes.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("EXPEDIENTES");

        Ordenar.setText("Ordenar");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        jButton4.setText("Historial");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ordenar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Ordenar)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        // TODO add your handling code here:
        Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
        if (this.RExpedientes.esVacia()) {
            JOptionPane.showMessageDialog(null, "¡La tabla está vacía!");
        }
        else {
        Expediente[] exp = new Expediente[this.modeloTabla.getRowCount()];
        int pos=0;
        while (pos!=exp.length) {
            Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
            if (this.dni.equalsIgnoreCase(objExpediente.getUsuario().getDni())) {
                exp[pos]=objExpediente;
                pos++;
            }
        }
        for (int i = 0; i < exp.length-1; i++) {
            for (int j = i+1; j < exp.length; j++) {
                if (Integer.parseInt(exp[i].getNprioridad())>Integer.parseInt(exp[j].getNprioridad())) {
                    Expediente temp=exp[i];
                    exp[i]=exp[j];
                    exp[j]=temp;
                }
            }
        }
        int filas=this.modeloTabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloTabla.removeRow(0);
        }
        for (int i = 0; i < exp.length; i++) {
            String[] fila = new String[6];
            fila[0] = exp[i].getnDependencia().getNombre();
            fila[1] = exp[i].getId();
            fila[2] = exp[i].getUsuario().getNombres();
            fila[3] = exp[i].getNprioridad();
            fila[4] = exp[i].getFyhInicio();
            fila[5] = exp[i].getFyhFin();
            modeloTabla.addRow(fila);
        }
        JOptionPane.showMessageDialog(null, "¡Se ordenó según prioridad de manera exitosa!");
        }
    }//GEN-LAST:event_OrdenarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int fila = -1;
        fila = TablaExpedientes.getSelectedRow();
        if(fila!=-1){
            Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
            Cola<Expediente> colaExpedientes2 = new Cola<>();
            String cadena="Seguimiento del expediente:\n\n";
            for (int i = 0; i < fila; i++) {
                Expediente objExpediente = colaExpedientes.desencolar();
                colaExpedientes2.encolar(objExpediente);
            }
            Expediente objExpediente = colaExpedientes.desencolar();
            colaExpedientes2.encolar(objExpediente);
            Cola<String> seguim = objExpediente.getSeguimiento();
            if (seguim.esVacia()) {
                JOptionPane.showMessageDialog(null, "¡No hay historial de este expediente!");
            }
            else {
                for (int i = 0; i < seguim.longitud(); i++) {
                    cadena+=seguim.desencolar()+" ➔ ";
                }
                cadena+=seguim.desencolar()+" (actual)";
                JOptionPane.showMessageDialog(null,cadena);
            }
            
            while(!colaExpedientes.esVacia()) {
                colaExpedientes2.encolar(colaExpedientes.desencolar());
            }
            this.RExpedientes=colaExpedientes2;
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaTramites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaTramites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaTramites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaTramites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaTramites().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ordenar;
    private javax.swing.JTable TablaExpedientes;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
