
package POO_01LAB;


public class JFUniversidad extends javax.swing.JFrame {

   Universidad universidad;
    public JFUniversidad() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        cboEstudios = new javax.swing.JComboBox<>();
        txtAntiguedad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bandeja = new javax.swing.JTextArea();
        btnProcesar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNIVERSIDAD");
        setBackground(new java.awt.Color(153, 204, 255));
        setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas de clase"));

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Principal", "Asociado", "Auxiliar" }));
        cboCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        cboEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Doctorado", "Maestria", "Ambos", "Ninguno" }));
        cboEstudios.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudios de postgrado"));

        txtAntiguedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Años de antiguedad"));

        bandeja.setColumns(20);
        bandeja.setRows(5);
        jScrollPane1.setViewportView(bandeja);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboEstudios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCerrar)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnProcesar)
                .addGap(105, 105, 105)
                .addComponent(btnMostrar)
                .addGap(73, 73, 73)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtHoras)
                    .addComponent(txtNombre)
                    .addComponent(txtCodigo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAntiguedad)
                    .addComponent(cboEstudios, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar)
                    .addComponent(btnMostrar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
       
    String cod=this.txtCodigo.getText();
    String nom=this.txtNombre.getText();
    String cat=this.cboCategoria.getSelectedItem().toString();
    String est=this.cboEstudios.getSelectedItem().toString();
    Double ant=Double.parseDouble(this.txtAntiguedad.getText());
    Double hor=Double.parseDouble(this.txtHoras.getText()); 
        
    universidad = new Universidad(cod,nom,cat,est,ant,hor);    
      
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
      bandeja.append("codigo: "+universidad.codigo+"\n");
      bandeja.append("Nombre : "+universidad.nombre+"\n");
      bandeja.append("Categoria : "+universidad.categoria+"\n");
      bandeja.append("Estudios : "+universidad.estudios+"\n");
      bandeja.append("Antiguedad: "+universidad.antiguedad+"\n");
      bandeja.append("Horas de clases : "+universidad.horas+"\n");
      bandeja.append("Pago parcial : "+universidad.pagoParcial()+"\n");
      bandeja.append("Sueldo Bruto: "+universidad.sueldoBruto()+"\n");
      bandeja.append("Bonificación por estudios : "+universidad.bonificacionEstudios()+"\n");
      bandeja.append("Bonificación por antiguedad : "+universidad.bonificacionAntiguedad()+"\n");
      bandeja.append("Monto por AFP: "+universidad.montoAFP()+"\n");
      bandeja.append("Monto por seguro: "+universidad.montoSeguro()+"\n");
      bandeja.append("Sueldo Neto: "+universidad.sueldoNeto()+"\n");     
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        bandeja.setText("");
        txtNombre.setText("");
        txtAntiguedad.setText("");
        txtHoras.setText("");
        cboCategoria.setSelectedItem("Seleccionar");
        cboEstudios.setSelectedItem("Seleccione");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(JFUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUniversidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bandeja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboEstudios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAntiguedad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
