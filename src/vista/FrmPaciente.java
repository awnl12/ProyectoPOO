
package vista;

import dao.PacienteDAO;
import javax.swing.JOptionPane;
import modelo.Paciente;
import vista.FrmPrincipal;


public class FrmPaciente extends javax.swing.JFrame {

    public FrmPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TxtDniBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnElimnar = new javax.swing.JButton();
        btnActulzr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("DNI");

        jLabel4.setText("Sexo");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "M", "F" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni)
                    .addComponent(txtApellido)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addComponent(txtEdad)
                    .addComponent(txtNombre))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Registro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Buscar Dni");

        TxtDniBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtDniBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDniBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnElimnar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnElimnar.setText("Eliminar");
        btnElimnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimnarActionPerformed(evt);
            }
        });

        btnActulzr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnActulzr.setText("Actualizar");
        btnActulzr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulzrActionPerformed(evt);
            }
        });

        txaArea.setColumns(20);
        txaArea.setRows(5);
        txaArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txaAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txaArea);

        jButton2.setText("Limpiar Campo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(56, 56, 56)
                .addComponent(TxtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnElimnar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActulzr)))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActulzr)
                    .addComponent(btnElimnar))
                .addGap(14, 14, 14)
                .addComponent(jButton2))
        );

        jTabbedPane1.addTab("Ajustes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jButton3.setText("Actulizar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Todos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
      FrmPrincipal frm = new FrmPrincipal();
      frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String dni = txtDni.getText();
            char sexo = cmbSexo.getSelectedItem().toString().charAt(0);
            int edad = Integer.parseInt(txtEdad.getText());
            
             if (dni.length() != 8 || !dni.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos numéricos.", "DNI Inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
             
            Paciente paciente = new Paciente(nombre, apellido, dni, sexo);
            paciente.setEdad(edad);

            PacienteDAO dao = new PacienteDAO();
            if (dao.insertar(paciente)) {
                JOptionPane.showMessageDialog(this, "Paciente registrado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar paciente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos inválidos o campos vacíos");
        }
        
        
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDni.setText(null);
        txtEdad.setText(null);
        cmbSexo.setSelectedItem(null);
        
         txtNombre.requestFocus();
        txtApellido.requestFocus();
        txtDni.requestFocus();
        txtEdad.requestFocus();
        cmbSexo.setSelectedItem(null);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void TxtDniBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDniBuscarActionPerformed
    
    }//GEN-LAST:event_TxtDniBuscarActionPerformed
   
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
           
        String dni = TxtDniBuscar.getText().trim();

        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa un DNI para buscar.");
            return;
        }

        PacienteDAO dao = new PacienteDAO();
        Paciente paciente = dao.buscarPorDni(dni);

        if (paciente != null) {
            txtId.setText(String.valueOf(paciente.getId()));
            txtNombre.setText(paciente.getNombre());
            txtApellido.setText(paciente.getApellido());
            txtDni.setText(paciente.getDni());
            cmbSexo.setSelectedItem(String.valueOf(paciente.getSexo()));
            txtEdad.setText(String.valueOf(paciente.getEdad()));
            JOptionPane.showMessageDialog(null, "Paciente encontrado");
  

 txaArea.append("-------PACIENTE REGISTRADO--------\n" );
  txaArea.append("ID: " + txtId.getText()+"\n");
  txaArea.append("APELLIDO: " + txtApellido.getText()+"\n");
  txaArea.append("DNI: " + txtDni.getText()+"\n");
  txaArea.append("APELLIDO " + txtApellido.getText()+"\n");
  txaArea.append("SEXO: " + String.valueOf(cmbSexo.getSelectedItem())+"\n");
  txaArea.append("EDAD: " + txtEdad.getText());

            txaArea.append("ID: " + txtId.getText()+"\n");
            txaArea.append("APELLIDO: " + txtApellido.getText()+"\n");
            txaArea.append("DNI: " + txtDni.getText()+"\n");
            txaArea.append("APELLIDO " + txtApellido.getText()+"\n");
            txaArea.append("SEXO: " + String.valueOf(cmbSexo.getSelectedItem())+"\n");
            txaArea.append("EDAD: " + txtEdad.getText());

  
        } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
        }
    
  
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActulzrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulzrActionPerformed
     try {
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String dni = txtDni.getText();
            char sexo = cmbSexo.getSelectedItem().toString().charAt(0);
            int edad = Integer.parseInt(txtEdad.getText());

            Paciente paciente = new Paciente(nombre, apellido, dni, sexo);
            paciente.setId(id);
            paciente.setEdad(edad);

            PacienteDAO dao = new PacienteDAO();
            if (dao.actualizar(paciente)) {
                JOptionPane.showMessageDialog(this, "Paciente actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar paciente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar. Verifique los datos.");
        } 
    }//GEN-LAST:event_btnActulzrActionPerformed

    private void btnElimnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimnarActionPerformed
         try {
            int id = Integer.parseInt(txtId.getText());
            int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                PacienteDAO dao = new PacienteDAO();
                if (dao.eliminar(id)) {
                    JOptionPane.showMessageDialog(this, "Paciente eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar paciente");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido para eliminar");
        }
    }//GEN-LAST:event_btnElimnarActionPerformed

    private void txaAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txaAreaAncestorAdded
        
    }//GEN-LAST:event_txaAreaAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      txaArea.setText(null);
        TxtDniBuscar.setText(null);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDniBuscar;
    private javax.swing.JButton btnActulzr;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElimnar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea txaArea;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}