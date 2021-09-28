
package POO_01LAB;


public class JFArquitecto extends javax.swing.JFrame {

   Arquitecto arquitecto;
    public JFArquitecto() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtObras = new javax.swing.JTextField();
        cboCondicion = new javax.swing.JComboBox<>();
        cboEspecialidad = new javax.swing.JComboBox<>();
        cboSupervision = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bandeja = new javax.swing.JTextArea();
        btnProcesar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cboSeguro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtObras.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de obras asignadas"));

        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Estable", "Contratado" }));
        cboCondicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Condición de contrato"));

        cboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Estructuras", "Recursos hídricos", "Ingeniería vial" }));
        cboEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Especialidad"));

        cboSupervision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Obras", "Vias" }));
        cboSupervision.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de supervisión"));

        bandeja.setColumns(20);
        bandeja.setRows(5);
        jScrollPane1.setViewportView(bandeja);

        btnProcesar.setText("CREAR OBJETO");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnMostrar.setText("MOSTRAR INFORMACIÓN");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "AFP", "SNP" }));
        cboSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de pension"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnProcesar)
                .addGap(94, 94, 94)
                .addComponent(btnMostrar)
                .addGap(121, 121, 121)
                .addComponent(btnLimpiar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtObras, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboCondicion, 0, 141, Short.MAX_VALUE)
                            .addComponent(cboSeguro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(cboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSupervision, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboEspecialidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboCondicion))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtObras, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jComboBox1)
                    .addComponent(cboSeguro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar)
                    .addComponent(btnMostrar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
            
         String cod=this.txtCodigo.getText();
         String nom=this.txtNombre.getText();
         String con=this.cboCondicion.getSelectedItem().toString();
         String esp=this.cboEspecialidad.getSelectedItem().toString();
         String sup=this.cboSupervision.getSelectedItem().toString();
         Double obr=Double.parseDouble(this.txtObras.getText());
         String seg=cboSeguro.getSelectedItem().toString();
        arquitecto= new Arquitecto(cod, nom, con, esp, sup, obr, seg);
        
        
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        bandeja.append("codigo : "+arquitecto.codigo+"\n");
        bandeja.append("Nombre : "+arquitecto.nombre+"\n");
        bandeja.append("Condición de contrato : "+arquitecto.condicion+"\n");
        bandeja.append("Especialidad : "+arquitecto.especialidad+"\n");
        bandeja.append("Supervision : "+arquitecto.supervision+"\n");
        bandeja.append("Obras : "+arquitecto.obras+"\n");
        bandeja.append("Sueldo Base : "+arquitecto.sueldoBase()+"\n");
        bandeja.append("Descuento por seguro : "+arquitecto.descuento()+"\n");
        bandeja.append("Bonificación : "+arquitecto.bonificacion()+"\n");
        bandeja.append("Monto de Movilidad : "+arquitecto.montoMovilidad()+"\n");
        bandeja.append("Sueldo Neto : "+arquitecto.sueldoNeto()+"\n");
        bandeja.append("Sueldo Bruto : "+arquitecto.sueldoBruto()+"\n");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        bandeja.setText("");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtObras.setText("");
        jComboBox1.setSelectedItem("");
        cboCondicion.setSelectedItem("Seleccione");
        cboEspecialidad.setSelectedItem("Seleccione");
        cboSeguro.setSelectedItem("Seleccione");
        cboSupervision.setSelectedItem("Seleccione");
      
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(JFArquitecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFArquitecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFArquitecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFArquitecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFArquitecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bandeja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboCondicion;
    private javax.swing.JComboBox<String> cboEspecialidad;
    private javax.swing.JComboBox<String> cboSeguro;
    private javax.swing.JComboBox<String> cboSupervision;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObras;
    // End of variables declaration//GEN-END:variables
}
