/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.app.Menu;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.Modelos.Cliente;
import net.dao.ClienteDaoImpl;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */
public class ClienteApp extends javax.swing.JDialog {

    /**
     * Creates new form Libros
     */
    public ClienteApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        arranque();
        setLocationRelativeTo(null);
    }
    
    int xmouse, ymouse;
    Session st = HibernateUtil.getSessionFactory().openSession();
    private final ClienteDaoImpl edao = new ClienteDaoImpl(st);
    private DefaultTableModel model;

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        informe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setModal(true);
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mantener Registro de Clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 20, 340, 40);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 20, 13);

        txtid.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel2.add(txtid);
        txtid.setBounds(60, 20, 40, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setText("RUC");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(120, 20, 50, 13);

        txtruc.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jPanel2.add(txtruc);
        txtruc.setBounds(170, 20, 270, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setText("DIRECCION");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 80, 120, 30);

        txtdireccion.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jPanel2.add(txtdireccion);
        txtdireccion.setBounds(140, 80, 380, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel9.setText("Razon Social");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(450, 20, 100, 20);

        txtnombre.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jPanel2.add(txtnombre);
        txtnombre.setBounds(540, 20, 290, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel10.setText("TELEFONO");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(530, 80, 100, 30);

        txttelefono.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jPanel2.add(txttelefono);
        txttelefono.setBounds(630, 80, 150, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 870, 140);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        nuevo.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMouseClicked(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        editar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        editar.setText("EDITAR");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        salir.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        salir.setText("SALIR");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 240, 870, 70);

        tab.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "RUC", "RAZON SOCIAL", "DIRECCION", "TELEFONO"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 870, 150);

        informe.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        informe.setText("Informe");
        informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeActionPerformed(evt);
            }
        });
        jPanel1.add(informe);
        informe.setBounds(10, 480, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseClicked
        nuevo();
    }//GEN-LAST:event_nuevoMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        arranque();
    }//GEN-LAST:event_cancelarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        guardar();
    }//GEN-LAST:event_guardarMouseClicked

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        selecTable();
    }//GEN-LAST:event_tabMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        editar();
    }//GEN-LAST:event_editarMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_eliminarMouseClicked

    private void informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeActionPerformed
        try {
            imprimir();// TODO add your handling code here:
        } catch (JRException ex) {
            Logger.getLogger(ClienteApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_informeActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse,y - ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(ClienteApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteApp dialog = new ClienteApp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private void arranque(){
    //campos
    txtid.setEnabled(false);
    txtid.setText(null);
    txtruc.setEnabled(false);
    txtruc.setText(null);
    tab.setEnabled(true);
    txtdireccion.setText(null);
    txtnombre.setText(null);
    txtdireccion.setEnabled(false);
    txtnombre.setEnabled(false);
    txttelefono.setText(null);
    txttelefono.setEnabled(false);
    
    //botones
    nuevo.setEnabled(true);
    guardar.setEnabled(false);
    guardar.setText("Guardar");
    editar.setEnabled(false);
    eliminar.setEnabled(false);
    tableModel();
    tab.setEnabled(true);
    }
    
    private void tableModel(){
        tab.getColumnModel().getColumn(0).setPreferredWidth(80);
        tab.getColumnModel().getColumn(1).setPreferredWidth(180);
        tab.getColumnModel().getColumn(2).setPreferredWidth(180);
        tab.getColumnModel().getColumn(3).setPreferredWidth(180);
        tab.getColumnModel().getColumn(4).setPreferredWidth(180);
        model = (DefaultTableModel)tab.getModel();
        model.setNumRows(0);
        List<Cliente> list = edao.list();
        for (Cliente l : list){
            model.addRow(new Object[]{
                l.getId_clie(),l.getRuc(),l.getRazon_social(),l.getDireccion(),l.getTelefono()
            });
        }
    }
    
    
    private void nuevo(){
     //campos
    txtruc.setEnabled(true);
    txtruc.setText(null);
    tab.setEnabled(false);
    txtdireccion.setText(null);
    txtnombre.setText(null);
    txtdireccion.setEnabled(true);
    txtnombre.setEnabled(true);
    txttelefono.setText(null);
    txttelefono.setEnabled(true);
    //botones
    nuevo.setEnabled(false);
    guardar.setEnabled(true);
    guardar.setText("Guardar");
    editar.setEnabled(false);
    eliminar.setEnabled(false);
    }
    
    private void guardar(){
        Cliente cli = edao.buscarPorNom(txtruc.getText());
        if(!txtruc.getText().isEmpty() && !txtdireccion.getText().isEmpty() 
                && !txtnombre.getText().isEmpty() && !txttelefono.getText().isEmpty()){
            
            if(guardar.getText().equals("Guardar")){
                if(cli == null){
                    Cliente l = new Cliente(txtruc.getText(), 
                        txtnombre.getText(), txtdireccion.getText(), 
                        txttelefono.getText());
                        edao.guardar(l);
                        JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                        arranque();  
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe cliente registrdo con este RUC");
                } 
                }else{
                Cliente l = edao.buscarPorId(Integer.parseInt(txtid.getText()));
                l.setRuc(txtruc.getText());
                l.setDireccion(txtdireccion.getText());
                l.setRazon_social(txtnombre.getText());
                l.setTelefono(txttelefono.getText());
                edao.actualizar(l);
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                arranque();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo vacio");
        }
    }
    
    private void selecTable(){
        if(tab.getRowCount()> 0){
            if(tab.isEnabled()){
                if(tab.getSelectedRow()> -1){
                   Cliente l = edao.buscarPorId(Integer.parseInt(model.getValueAt(tab.getSelectedRow(),0).toString()));
                   txtid.setText(String.valueOf(l.getId_clie()));
                   txtruc.setText(l.getRuc());
                   txtdireccion.setText(l.getDireccion());
                   txtnombre.setText(l.getRazon_social());
                   txttelefono.setText(l.getTelefono());
                   editar.setEnabled(true);
                   eliminar.setEnabled(true);
                   nuevo.setEnabled(false);
                }
            }
        }
    }
    
    private void editar(){
         txtruc.setEnabled(true);
         txtdireccion.setEnabled(true);
         txtnombre.setEnabled(true);
         txttelefono.setEnabled(true);
         
         nuevo.setEnabled(false);    
         guardar.setText("Actualizar");
         guardar.setEnabled(true);
         editar.setEnabled(false);
         eliminar.setEnabled(false);
    }
     
    private void eliminar(){
        if(JOptionPane.showConfirmDialog(null, "Desea Eliminar el registro","Mensaje del Sistema..",JOptionPane.YES_NO_OPTION )==0){
            edao.eliminar(Integer.parseInt(txtid.getText().toString()));
            JOptionPane.showMessageDialog(null, "Registo Eliminado");
            arranque();
        }else{
            JOptionPane.showMessageDialog(null, "Eliminacion cancelada");
        }
    }
    
    private void imprimir() throws JRException{
        LinkedList<Cliente> info = new LinkedList();
        List<Cliente> list = edao.list();
        for (Cliente l : list){
            
            info.add(l);
            
        }
         try {
            JasperReport reportes = (JasperReport) JRLoader.loadObject(new File ("src/Reportes/Clientes.jasper"));

            JasperPrint jasperPrint = JasperFillManager.fillReport(reportes, null, new JRBeanCollectionDataSource(info));
            
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
                    jviewer.setVisible(true);
                    

//            Exporter exporter = new JRPdfExporter();
//
//            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//
//            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("ListaPorductos.pdf"));
//
//            exporter.exportReport(); 
         }
         catch(JRException e)
         {
             JOptionPane.showMessageDialog(null, "Error cargando reporte."+e);
         }
        
    }
}
