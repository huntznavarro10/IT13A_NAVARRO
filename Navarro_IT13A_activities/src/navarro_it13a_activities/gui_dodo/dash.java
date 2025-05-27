
package gui_dodo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dash extends javax.swing.JFrame {
   private String userEmail;   // logged-in user email
    private DefaultTableModel tableModel;
    private DefaultTableModel historyModel;
    public dash(String email) {
        this.userEmail = email;
        initComponents();
        initCustom();
         loadPurchaseHistory();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        product1nameFriedchicken = new javax.swing.JLabel();
        product1price45 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        product1qty = new javax.swing.JSpinner();
        product1button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        product2nameBurger = new javax.swing.JLabel();
        product2price50 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        product2qty = new javax.swing.JSpinner();
        product2button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Product4namemilktea = new javax.swing.JLabel();
        Product4price70 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        product4qty = new javax.swing.JSpinner();
        product4button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        product3namefrenchfries = new javax.swing.JLabel();
        product3price100 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        product3qty = new javax.swing.JSpinner();
        Product3button = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Paymentbutton = new javax.swing.JButton();
        Paying = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Change = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        product1nameFriedchicken.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product1nameFriedchicken.setText("FRIED CHICKEN");

        product1price45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        product1price45.setText("PRICE:  ₱ 45:00");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY");

        product1button.setText("Buy");
        product1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(product1nameFriedchicken)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(product1price45))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(product1button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(product1qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(product1nameFriedchicken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product1price45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product1qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product1button)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 320));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images (1)G.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        product2nameBurger.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product2nameBurger.setText("BURGER");

        product2price50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        product2price50.setText("PRICE: ₱ 50:00 ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("QUANTITY");

        product2button.setText("Buy");
        product2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product2buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(product2nameBurger)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(product2price50)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product2button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(product2qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(67, 67, 67))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product2nameBurger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product2price50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(product2qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(product2button)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 250, 320));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        Product4namemilktea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Product4namemilktea.setText("MILKTEA");

        Product4price70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Product4price70.setText("PRICE: ₱ 70:00 ");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("QUANTITY");

        product4button.setText("Buy");
        product4button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product4buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Product4namemilktea)
                    .addComponent(Product4price70)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product4button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(product4qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Product4namemilktea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Product4price70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product4qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product4button)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 220, 320));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/savory-french-fries-cuisine-freshly-prepared-to-perfection-generative-ai-photo.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 270, 170));

        product3namefrenchfries.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        product3namefrenchfries.setText("FRENCH FRIES");
        jPanel5.add(product3namefrenchfries, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 182, -1, -1));

        product3price100.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        product3price100.setText("PRICE: ₱ 100:00");
        jPanel5.add(product3price100, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 209, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("QUANTITY");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 238, -1, -1));
        jPanel5.add(product3qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 261, -1, -1));

        Product3button.setText("Buy");
        Product3button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product3buttonActionPerformed(evt);
            }
        });
        jPanel5.add(Product3button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 84, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 250, 320));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setText("Quickie Bites");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(183, 183, 183))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 680, 90));

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 90, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Payment");

        Subtotal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Subtotal.setText("00.00");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Subtotal : ₱");

        Paymentbutton.setText("Pay");
        Paymentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentbuttonActionPerformed(evt);
            }
        });

        Paying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayingActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Change : ₱");

        Change.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Change.setText("00.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Paymentbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Paying, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(Paymentbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Paying, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Change))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 450, 120));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("Chart");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product_Name", "Qty", "Total_Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 270, 130));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Time_date", "Paymented", "Subtotal", "Change"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 420, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-table-milk-burger-food-background-picture-image_2445058.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void initCustom() {
        // Setup purchase table
        tableModel = new DefaultTableModel(new Object[]{"Product", "Qty", "Price", "Total"}, 0);
        jTable1.setModel(tableModel);

        // Setup history table
        historyModel = new DefaultTableModel(new Object[]{"Date/Time", "Subtotal", "Payment", "Change"}, 0);
        jTable2.setModel(historyModel);

        updateSubtotal();

        this.setTitle("Dashboard - Logged in as: " + userEmail);
    }

    // Load history from purchase.txt and populate historyModel
    private void loadPurchaseHistory() {
        String userDir = "C:\\usersaccount\\" + userEmail;
        File purchaseFile = new File(userDir, "purchase.txt");
        if (!purchaseFile.exists()) return; // no history yet

        try (BufferedReader br = new BufferedReader(new FileReader(purchaseFile))) {
            String line;
            String dateTime = "";
            int subtotal = 0, paid = 0, change = 0;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("Purchase Date: ")) {
                    dateTime = line.substring("Purchase Date: ".length());
                } else if (line.startsWith("Subtotal: ")) {
                    subtotal = Integer.parseInt(line.substring("Subtotal: ".length()).trim());
                } else if (line.startsWith("Paid: ")) {
                    paid = Integer.parseInt(line.substring("Paid: ".length()).trim());
                } else if (line.startsWith("Change: ")) {
                    change = Integer.parseInt(line.substring("Change: ".length()).trim());
                } else if (line.equals("-----")) {
                    // End of one purchase record, add to history table
                    historyModel.addRow(new Object[]{dateTime, subtotal, paid, change});
                    // reset for next record
                    dateTime = "";
                    subtotal = 0;
                    paid = 0;
                    change = 0;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to load purchase history: " + e.getMessage());
        }
    }

    // Add product to current purchase table
    private void addProductToTable(String productName, int qty, int unitPrice) {
        if (qty <= 0) {
            JOptionPane.showMessageDialog(this, "Quantity must be greater than zero.");
            return;
        }

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).equals(productName)) {
                int existingQty = (int) tableModel.getValueAt(i, 1);
                int newQty = existingQty + qty;
                tableModel.setValueAt(newQty, i, 1);
                tableModel.setValueAt(newQty * unitPrice, i, 3);
                updateSubtotal();
                return;
            }
        }

        tableModel.addRow(new Object[]{productName, qty, unitPrice, qty * unitPrice});
        updateSubtotal();
    }

    private void updateSubtotal() {
        int subtotal = 0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            subtotal += (int) tableModel.getValueAt(i, 3);
        }
        Subtotal.setText(String.valueOf(subtotal));
        Change.setText("0");
    }

    private void savePurchaseData() {
       if (tableModel.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No items in your cart.");
        return;
    }

    int subtotal = Integer.parseInt(Subtotal.getText());
    int paying;
    try {
        paying = Integer.parseInt(Paying.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Enter a valid payment amount.");
        return;
    }

    if (paying < subtotal) {
        JOptionPane.showMessageDialog(this, "Payment is less than subtotal.");
        return;
    }

    int change = paying - subtotal;
    Change.setText(String.valueOf(change));

    String userDir = "C:\\usersaccount\\" + userEmail;
    File folder = new File(userDir);
    if (!folder.exists()) folder.mkdirs();

    File purchaseFile = new File(userDir, "purchase.txt");

    try (PrintWriter pw = new PrintWriter(new FileWriter(purchaseFile, true))) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String now = dtf.format(LocalDateTime.now());

        pw.println("Purchase Date: " + now);
        pw.println("Products:");
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            pw.printf(" - %s | Qty: %d | Unit Price: %d | Total: %d%n",
                    tableModel.getValueAt(i, 0),
                    tableModel.getValueAt(i, 1),
                    tableModel.getValueAt(i, 2),
                    tableModel.getValueAt(i, 3));
        }
        pw.println("Subtotal: " + subtotal);
        pw.println("Paid: " + paying);
        pw.println("Change: " + change);
        pw.println("-----");

        // Show success message
        JOptionPane.showMessageDialog(this, "Purchase saved!");

        // Add to history table
        historyModel.addRow(new Object[]{now, subtotal, paying, change});

        // Clear cart
        tableModel.setRowCount(0);
        updateSubtotal();
        Paying.setText("");
        Change.setText("0");

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving purchase: " + e.getMessage());
    }
    }

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
           java.awt.EventQueue.invokeLater(() -> {
            new gui_dodo.login().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void product1buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1buttonActionPerformed
         int qty = (int) product1qty.getValue();
        addProductToTable("Fried Chicken", qty, 45);
    }//GEN-LAST:event_product1buttonActionPerformed

    private void product2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product2buttonActionPerformed
       int qty = (int) product2qty.getValue();
        addProductToTable("Burger", qty, 50);
    }//GEN-LAST:event_product2buttonActionPerformed

    private void Product3buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product3buttonActionPerformed
       int qty = (int) product3qty.getValue();
        addProductToTable("French Fries", qty, 100);
    }//GEN-LAST:event_Product3buttonActionPerformed

    private void product4buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product4buttonActionPerformed
       int qty = (int) product4qty.getValue();
        addProductToTable("Milk Tea", qty, 70);
    }//GEN-LAST:event_product4buttonActionPerformed

    private void PaymentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentbuttonActionPerformed
         savePurchaseData();
    }//GEN-LAST:event_PaymentbuttonActionPerformed
 
    private void PayingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayingActionPerformed
         // Optional: auto-calc change live while typing payment
        String payText = Paying.getText().trim();
        if (payText.isEmpty()) {
            Change.setText("0");
            return;
        }
        try {
            int paying = Integer.parseInt(payText);
            int subtotal = Integer.parseInt(Subtotal.getText());
            if (paying >= subtotal) {
                Change.setText(String.valueOf(paying - subtotal));
            } else {
                Change.setText("0");
            }
        } catch (NumberFormatException e) {
            Change.setText("0");
        }
    }//GEN-LAST:event_PayingActionPerformed

  
  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new dash("testuser@example.com").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Change;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Paying;
    private javax.swing.JButton Paymentbutton;
    private javax.swing.JButton Product3button;
    private javax.swing.JLabel Product4namemilktea;
    private javax.swing.JLabel Product4price70;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton product1button;
    private javax.swing.JLabel product1nameFriedchicken;
    private javax.swing.JLabel product1price45;
    private javax.swing.JSpinner product1qty;
    private javax.swing.JButton product2button;
    private javax.swing.JLabel product2nameBurger;
    private javax.swing.JLabel product2price50;
    private javax.swing.JSpinner product2qty;
    private javax.swing.JLabel product3namefrenchfries;
    private javax.swing.JLabel product3price100;
    private javax.swing.JSpinner product3qty;
    private javax.swing.JButton product4button;
    private javax.swing.JSpinner product4qty;
    // End of variables declaration//GEN-END:variables
}
