
package gui_dodo;

import java.io.File;

public class REGISTER extends javax.swing.JFrame {

    public REGISTER() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hans1 = new javax.swing.JTextField();
        hans2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        hans3 = new javax.swing.JTextField();
        hans4 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        conformpasswordfield = new javax.swing.JPasswordField();
        Emailfield = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        hans1.setBackground(new java.awt.Color(153, 153, 153));
        hans1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        hans1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hans1.setText("Quickie Bites");
        hans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hans1ActionPerformed(evt);
            }
        });
        jPanel1.add(hans1);
        hans1.setBounds(190, 30, 230, 40);

        hans2.setBackground(new java.awt.Color(153, 153, 153));
        hans2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hans2.setText("Email");
        hans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hans2ActionPerformed(evt);
            }
        });
        jPanel1.add(hans2);
        hans2.setBounds(120, 90, 64, 27);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 130, 0, 0);

        hans3.setBackground(new java.awt.Color(153, 153, 153));
        hans3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hans3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        hans3.setText("Password");
        hans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hans3ActionPerformed(evt);
            }
        });
        jPanel1.add(hans3);
        hans3.setBounds(120, 180, 90, 33);

        hans4.setBackground(new java.awt.Color(153, 153, 153));
        hans4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hans4.setText("Confirm Password");
        hans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hans4ActionPerformed(evt);
            }
        });
        jPanel1.add(hans4);
        hans4.setBounds(120, 280, 162, 27);

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(220, 430, 130, 28);

        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordfield);
        passwordfield.setBounds(120, 230, 340, 40);

        conformpasswordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conformpasswordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(conformpasswordfield);
        conformpasswordfield.setBounds(120, 320, 340, 40);

        Emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Emailfield);
        Emailfield.setBounds(120, 130, 340, 40);

        register.setBackground(new java.awt.Color(153, 153, 153));
        register.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(220, 380, 130, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Auguis\\Downloads\\pngtree-table-milk-burger-food-background-picture-image_2445058.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String encryptCaesar(String input, int shift) {
    StringBuilder encrypted = new StringBuilder();
    for (char ch : input.toCharArray()) {
        if (Character.isLetter(ch)) {
            char base = Character.isUpperCase(ch) ? 'A' : 'a';
            encrypted.append((char) ((ch - base + shift) % 26 + base));
        } else {
            encrypted.append(ch); 
        }
    }
    return encrypted.toString();
}

    private void hans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hans1ActionPerformed

    private void hans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hans2ActionPerformed

    private void hans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hans3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hans3ActionPerformed

    private void hans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hans4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hans4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        }); dispose();
    }//GEN-LAST:event_backActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
  String email = Emailfield.getText().trim();
    String password = new String(passwordfield.getPassword()).trim();
    String confirmPassword = new String(conformpasswordfield.getPassword()).trim();

    if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid email format!");
        return;
    }

    if (password.length() < 6) {
        javax.swing.JOptionPane.showMessageDialog(this, "Password must be at least 6 characters!");
        return;
    }

    if (!password.equals(confirmPassword)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match!");
        return;
    }

    String encryptedPassword = encryptCaesar(password, 3);

    try {
        File baseDir = new File("C:\\usersaccount");
        if (!baseDir.exists()) {
            baseDir.mkdirs();
        }

        File userDir = new File(baseDir, email);
        if (userDir.exists()) {
            javax.swing.JOptionPane.showMessageDialog(this, "User already exists!");
            return;
        }

        userDir.mkdirs();
        File userFile = new File(userDir, email + ".txt");

        try (java.io.FileWriter writer = new java.io.FileWriter(userFile)) {
            writer.write("Email: " + email + "\n");
            writer.write("Password: " + encryptedPassword + "\n");
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Registration successful!");
        this.dispose();
        new login().setVisible(true);
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error during registration: " + e.getMessage());
    }
    }//GEN-LAST:event_registerActionPerformed

    private void EmailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailfieldActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

    private void conformpasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conformpasswordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conformpasswordfieldActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Emailfield;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField conformpasswordfield;
    private javax.swing.JTextField hans1;
    private javax.swing.JTextField hans2;
    private javax.swing.JTextField hans3;
    private javax.swing.JTextField hans4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
