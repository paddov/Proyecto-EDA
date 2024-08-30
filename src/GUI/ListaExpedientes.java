/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import TDA.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author PC
 */
public class ListaExpedientes extends javax.swing.JFrame {
    private Cola RExpedientes;
    private DefaultTableModel modeloTabla;
    private Lista RDependencias;
    
    public ListaExpedientes() {
        initComponents(); 
    }
    
    public ListaExpedientes(Cola RExpedientes){
        initComponents();
        this.RExpedientes=RExpedientes;
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
    
    public ListaExpedientes(Cola RExpedientes, Lista RDependencias){
        initComponents();
        this.RExpedientes=RExpedientes;
        this.RDependencias=RDependencias;
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
            fila[0] = objExpediente.getnDependencia().getNombre();
            fila[1] = objExpediente.getId();
            fila[2] = objExpediente.getUsuario().getNombres();
            fila[3] = objExpediente.getNprioridad();
            fila[4] = objExpediente.getFyhInicio();
            fila[5] = objExpediente.getFyhFin();
            modeloTabla.addRow(fila);
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
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Finalizar = new javax.swing.JButton();
        Ordenar = new javax.swing.JButton();
        Mover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expedientes registrados");
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        TablaExpedientes.setFocusable(false);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("EXPEDIENTES REGISTRADOS");

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        Ordenar.setText("Ordenar");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        Mover.setText("Mover");
        Mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Finalizar)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(Mover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ordenar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
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
                    .addComponent(Eliminar)
                    .addComponent(Finalizar)
                    .addComponent(Ordenar)
                    .addComponent(Mover))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila = -1;
        fila = TablaExpedientes.getSelectedRow();
        if (fila!=-1) {
            Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
            Cola<Expediente> colaExpedientes2 = new Cola<>();
            for (int i = 0; i < fila; i++) {
                Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
                colaExpedientes2.encolar(objExpediente);
            }
            Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
            while (!colaExpedientes.esVacia()) {
                colaExpedientes2.encolar((Expediente) colaExpedientes.desencolar());
            }
            this.RExpedientes=colaExpedientes2;
            CargarTabla();
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        // TODO add your handling code here:
        int fila = -1;
        fila = TablaExpedientes.getSelectedRow();
        if(fila!=-1){
            Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
            Cola<Expediente> colaExpedientes2 = new Cola<>();
            for (int i = 0; i < fila; i++) {
                Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
                colaExpedientes2.encolar(objExpediente);
            }
            Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            String horaActual = dateFormat.format(new Date());
            objExpediente.setFyhFin(horaActual);
            colaExpedientes2.encolar(objExpediente);
            while (!colaExpedientes.esVacia()) {
                colaExpedientes2.encolar((Expediente) colaExpedientes.desencolar());
            }
            this.RExpedientes=colaExpedientes2;
            CargarTabla();
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");
        }
    }//GEN-LAST:event_FinalizarActionPerformed

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        // TODO add your handling code here:
        Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
        if (this.RExpedientes.esVacia()) {
            JOptionPane.showMessageDialog(null, "¡La tabla está vacía!");
        }
        else {
        Expediente[] exp = new Expediente[colaExpedientes.longitud()];
        int pos=0;
        while (!colaExpedientes.esVacia()) {
            Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
            exp[pos]=objExpediente;
            pos++;
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
        for (int i = 0; i < exp.length; i++) {
            colaExpedientes.encolar(exp[i]);
        }
        this.RExpedientes=colaExpedientes;
        CargarTabla();
        JOptionPane.showMessageDialog(null, "¡Se ordenó según prioridad de manera exitosa!");
        }
    }//GEN-LAST:event_OrdenarActionPerformed

    private void MoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverActionPerformed
        // TODO add your handling code here:  
        int fila = -1;
        fila = TablaExpedientes.getSelectedRow();
        if(fila!=-1){
            String nombreDependencia=JOptionPane.showInputDialog(null, "Ingrese el nombre de la Dependencia donde se moverá:");
            String dependenciaActual;
            
            
            Cola<Expediente> expeds = this.RExpedientes.getColaExpediente();
            Cola<Expediente> expeds2 = new Cola<>();
            for (int i = 0; i < fila; i++) {
                Expediente objExped = (Expediente) expeds.desencolar();
                expeds2.encolar(objExped);
            }
            Expediente objExped = (Expediente) expeds.desencolar();
            dependenciaActual=objExped.getnDependencia().getNombre();
            expeds2.encolar(objExped);
            while (!expeds.esVacia()) {
                expeds2.encolar((Expediente) expeds.desencolar());
            }
            this.RExpedientes=expeds2;
            
            
            Lista<Dependencia> listaDependencias = this.RDependencias.obtenerListaDependencias();
            Nodo<Dependencia> aux = listaDependencias.getCabeza();
            boolean noencontro=true;
            while (aux != null) {
                Dependencia ObjDependencia = aux.getElemento();
                if (nombreDependencia.equalsIgnoreCase(ObjDependencia.getNombre())) {
                    noencontro=false;
                    break;
                }
                aux = aux.getSgteNodo();
            }
            
            
            if (noencontro) {
                JOptionPane.showMessageDialog(null, "¡No existe la Dependencia ingresada!");
            }
            else if (nombreDependencia.equalsIgnoreCase(dependenciaActual)) {
                JOptionPane.showMessageDialog(null, "¡Este expediente ya se encontraba en la Dependencia asignada!");
            }
            else {
                Cola<Expediente> colaExpedientes = this.RExpedientes.getColaExpediente();
                Cola<Expediente> colaExpedientes2 = new Cola<>();
                for (int i = 0; i < fila; i++) {
                    Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
                    colaExpedientes2.encolar(objExpediente);
                }
                Expediente objExpediente = (Expediente) colaExpedientes.desencolar();
                Dependencia dep = new Dependencia(nombreDependencia);
                
                if (objExpediente.getSeguimiento().esVacia()) {
                    objExpediente.insertarSeguimiento(objExpediente.getnDependencia().getNombre());
                }
                objExpediente.insertarSeguimiento(dep.getNombre());
                
                objExpediente.setNdependencia(dep);
                colaExpedientes2.encolar(objExpediente);
                while (!colaExpedientes.esVacia()) {
                    colaExpedientes2.encolar((Expediente) colaExpedientes.desencolar());
                }
                this.RExpedientes=colaExpedientes2;
                CargarTabla();
                JOptionPane.showMessageDialog(null,"¡Se movió el expediente a la Dependencia asignada!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Seleccione una fila!");
        }
    }//GEN-LAST:event_MoverActionPerformed

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
            java.util.logging.Logger.getLogger(ListaExpedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaExpedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaExpedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaExpedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaExpedientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Mover;
    private javax.swing.JButton Ordenar;
    private javax.swing.JTable TablaExpedientes;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
