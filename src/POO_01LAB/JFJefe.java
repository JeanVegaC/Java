
package POO_01LAB;


public class JFJefe extends javax.swing.JFrame {

   Jefe jefe;
    public JFJefe() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bandeja = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox<>();
        txtAntiguedad = new javax.swing.JTextField();
        cboCargo = new javax.swing.JComboBox<>();
        cboArea = new javax.swing.JComboBox<>();
        btnProcesar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        cboSeguro = new javax.swing.JComboBox<>();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bandeja.setColumns(20);
        bandeja.setRows(5);
        jScrollPane1.setViewportView(bandeja);

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));

        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        cboSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });

        txtAntiguedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Años de antiguedad"));

        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Gerente", "Subgerente" }));
        cboCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargo"));

        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Contabilidad", "Tecnologias de información", "Planificación" }));
        cboArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Area"));

        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnMostrar.setText("MOSTRAR");
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

        cboSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "AFP", "SNP" }));
        cboSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de pension"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(btnProcesar)
                .addGap(60, 60, 60)
                .addComponent(btnMostrar)
                .addGap(67, 67, 67)
                .addComponent(btnLimpiar)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboSeguro, 0, 135, Short.MAX_VALUE)
                            .addComponent(txtAntiguedad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboCargo, 0, 144, Short.MAX_VALUE)
                            .addComponent(cboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtAntiguedad))
                    .addComponent(txtDni)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSeguro))
                .addGap(18, 18, 18)
                .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar)
                    .addComponent(btnMostrar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
      
    }//GEN-LAST:event_cboSexoActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
    String nom=this.txtNombre.getText();
    String sex=this.cboSexo.getSelectedItem().toString();
    int dni=Integer.parseInt(this.txtDni.getText());
    String car=this.cboCargo.getSelectedItem().toString();
    String are=this.cboArea.getSelectedItem().toString();
    Double ant=Double.parseDouble(this.txtAntiguedad.getText());
    String seg=cboSeguro.getSelectedItem().toString();
    jefe= new Jefe(nom,sex,dni,car,are,ant,seg);     
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        bandeja.append("Nombre : "+jefe.nombre+"\n");
        bandeja.append("Sexo : "+jefe.sexo+"\n");
        bandeja.append("DNI : "+jefe.dni+"\n");
        bandeja.append("Cargo : "+jefe.cargo+"\n");
        bandeja.append("Area : "+jefe.area+"\n");
        bandeja.append("Años de antiguedad : "+jefe.antiguedad+"\n");
        bandeja.append("Sueldo Base : "+jefe.sueldoBase()+"\n");
        bandeja.append("Monto de movilidad : "+jefe.montoMovilidad()+"\n");
        bandeja.append("Sueldo Bruto : "+jefe.sueldoBruto()+"\n");
        bandeja.append("Sueldo Neto : "+jefe.sueldoNeto()+"\n");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.bandeja.setText("");
         bandeja.setText("");
        txtNombre.setText("");
       txtDni.setText("");
        cboSexo.setSelectedItem("Seleccionar");
        cboCargo.setSelectedItem("Seleccione");
       cboSeguro.setSelectedItem("Seleccione");
       cboArea.setSelectedItem("Seleccione");
        
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
            java.util.logging.Logger.getLogger(JFJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFJefe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bandeja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JComboBox<String> cboSeguro;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAntiguedad;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
