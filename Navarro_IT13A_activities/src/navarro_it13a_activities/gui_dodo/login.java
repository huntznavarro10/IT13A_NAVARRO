
package gui_dodo;
import gui_dodo.dash;

import java.io.File;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        email = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        gotoregister = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        Emailfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField1.setText("Quickie Bites");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 20, 219, 49);

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("Email");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(100, 120, 90, 30);

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(email);
        email.setBounds(100, 170, 359, 0);

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.setText("Password");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(100, 220, 90, 30);

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(100, 340, 180, 40);

        gotoregister.setBackground(new java.awt.Color(153, 153, 153));
        gotoregister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gotoregister.setText("REGISTER");
        gotoregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoregisterActionPerformed(evt);
            }
        });
        jPanel1.add(gotoregister);
        gotoregister.setBounds(400, 340, 160, 40);
        jPanel1.add(passwordfield);
        passwordfield.setBounds(100, 260, 360, 40);
        jPanel1.add(Emailfield);
        Emailfield.setBounds(100, 160, 360, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Auguis\\Downloads\\pngtree-table-milk-burger-food-background-picture-image_2445058.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
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
private String decrypt(String text, int shift) {
    return encrypt(text, 26 - shift); 
}

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void gotoregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoregisterActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });dispose();
    }//GEN-LAST:event_gotoregisterActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
           String email = Emailfield.getText().trim();
    String inputPassword = new String(passwordfield.getPassword()).trim();

    if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid email format!");
        return;
    }

    File userFile = new File("C:\\usersaccount\\" + email + "\\" + email + ".txt");
    if (!userFile.exists()) {
        javax.swing.JOptionPane.showMessageDialog(this, "User not found!");
        return;
    }

    try (java.util.Scanner scanner = new java.util.Scanner(userFile)) {
        String storedPassword = null;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("Password: ")) {
                storedPassword = line.substring("Password: ".length()).trim();
                break;
            }
        }

        if (storedPassword == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Corrupted user file!");
            return;
        }

        String encryptedInput = encryptCaesar(inputPassword, 3);

       if (encryptedInput.equals(storedPassword)) {
    javax.swing.JOptionPane.showMessageDialog(this, "Login successful!");
    this.dispose();
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
              new dash(email).setVisible(true);
        }
    });
}

 else {
            javax.swing.JOptionPane.showMessageDialog(this, "Incorrect password!");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Login error: " + e.getMessage());
    }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Emailfield;
    private javax.swing.JPanel email;
    private javax.swing.JButton gotoregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passwordfield;
    // End of variables declaration//GEN-END:variables

    private String encrypt(String text, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
