

import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abdil
 */
public class CustomerFrame extends javax.swing.JFrame {

    private Customer[] customer;
    private Farmer[] farmers;
    private Product products;
    private int id;
    private int c_num;
    private int f_num;
    public double total;
    
   
    public String[] comname;
    public CustomerFrame(Customer[] customer,Farmer[] farmers,int id) {
        this.farmers=farmers;
        this.customer=customer;
        this.id=id;
 
        initComponents();
        
        
        
        
          for (int i = 0; i < customer.length; i++) {
          if(id==customer[i].getId()){
            c_num=i;
            
            
          }  
          cname_text.setText("     "+customer[c_num].getName());
        }
    
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        FName_text = new javax.swing.JTextField();
        FContact_text = new javax.swing.JTextField();
        quantity_text = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ennterfarmeid_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Total_text = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        getID_text = new javax.swing.JTextField();
        cname_text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        farmerdetails_text = new javax.swing.JTextArea();
        F_details = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        Buy_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FName_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FName_text.setOpaque(true);
        FName_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FName_textActionPerformed(evt);
            }
        });
        jPanel1.add(FName_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 300, 34));

        FContact_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FContact_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FContact_textActionPerformed(evt);
            }
        });
        jPanel1.add(FContact_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 300, 34));

        quantity_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantity_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_textActionPerformed(evt);
            }
        });
        quantity_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantity_textKeyTyped(evt);
            }
        });
        jPanel1.add(quantity_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 159, 34));

        jTextArea2.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 4536, 493, 117));

        ennterfarmeid_button.setBackground(new java.awt.Color(255, 255, 102));
        ennterfarmeid_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ennterfarmeid_button.setText("Enter Farmer ID");
        ennterfarmeid_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ennterfarmeid_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(ennterfarmeid_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Farmer Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contact Number");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 130, 34));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Product Name");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 130, 34));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Quantity");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 130, 34));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Total Cost(Rs)");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 130, 34));

        Total_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Total_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_textActionPerformed(evt);
            }
        });
        jPanel1.add(Total_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 159, 34));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 300, 40));

        getID_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(getID_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 210, 40));

        cname_text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cname_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cname_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cname_textMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cname_textMouseEntered(evt);
            }
        });
        cname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cname_textActionPerformed(evt);
            }
        });
        jPanel1.add(cname_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cusprofile (1).jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 130, 150));

        farmerdetails_text.setColumns(20);
        farmerdetails_text.setRows(5);
        farmerdetails_text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        farmerdetails_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                farmerdetails_textMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(farmerdetails_text);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 500, 170));

        F_details.setBackground(new java.awt.Color(0, 255, 255));
        F_details.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        F_details.setText(" Farmers Details");
        F_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        F_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_detailsActionPerformed(evt);
            }
        });
        jPanel1.add(F_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 160, 37));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 120, 40));

        close_button.setBackground(new java.awt.Color(153, 0, 0));
        close_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close_button.setForeground(new java.awt.Color(255, 255, 255));
        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 120, 40));

        Buy_button.setBackground(new java.awt.Color(0, 0, 102));
        Buy_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buy_button.setForeground(new java.awt.Color(255, 255, 255));
        Buy_button.setText("Buy");
        Buy_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Buy_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Buy_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Buy_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 120, 40));

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Show All Product");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 160, 37));

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 160, 37));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-808330400-170667a.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -30, 500, 290));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blur.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -370, 1460, 1020));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1140, 490));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void ennterfarmeid_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ennterfarmeid_buttonActionPerformed
      
   
     
     try {
        int id = Integer.parseInt(getID_text.getText());
        for (int i = 0; i < farmers.length; i++) {
            if (id == farmers[i].getId()) {
                 f_num = i;

               farmerdetails_text.setText(" ");
                FName_text.setText(farmers[f_num].getName());
                FContact_text.setText(farmers[f_num].getContact());

                
                Product[] products = farmers[f_num].products;
               
                
                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
                for (int j = 0; j < products.length; j++) {
                     
                    if (products[j] != null) {
                        
                        model.addElement(products[j].getName());
                        farmerdetails_text.append("Product Name :"+farmers[f_num].products[0].getName()+"|  Quantity :"+farmers[f_num].products[j].getQuantity()+"|   Price :"+farmers[f_num].products[j].getPrice()+"\n");
                    }
                }
                jComboBox2.setModel(model);

                break; 
            }
        }
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid ID number.");
    }
    }//GEN-LAST:event_ennterfarmeid_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_close_buttonActionPerformed

    private void FName_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FName_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FName_textActionPerformed

    private void FContact_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FContact_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FContact_textActionPerformed

    private void quantity_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_textActionPerformed

    private void Total_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_textActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void cname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cname_textActionPerformed
     
    }//GEN-LAST:event_cname_textActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=customer[c_num].getName();
        String fname=farmers[f_num].getName();
        
        String product=(String) jComboBox2.getSelectedItem();
        int qtn=Integer.parseInt(quantity_text.getText());

        double nettotal=Double.parseDouble(Total_text.getText());

        customer[c_num].saveBill(fname,product,qtn,total,nettotal);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Buy_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy_buttonActionPerformed
        
        try {
            int quantity = Integer.parseInt(quantity_text.getText());
            int farmerId = Integer.parseInt(getID_text.getText());
            String selectedProductName = (String) jComboBox2.getSelectedItem();

            if (selectedProductName == null) {
                JOptionPane.showMessageDialog(null, "Please select a product.");
                return;
            }

            for (int i = 0; i <farmers.length; i++)
            {
                if (farmers[i].getId() == farmerId) {
                    for (int j=0;j<farmers[i].products.length;j++) {
                        if (farmers[i].products[j]!= null && farmers[i].products[j].getName().equals(selectedProductName)) {
                            if(farmers[i].products[j].getQuantity()>=quantity){
                                total = farmers[i].products[j].getPrice() * quantity;
                                  double netTotal;
                                if(farmers[i].products[j].getDiscount()>=10 ){
                                netTotal = total - (total * farmers[i].products[j].getDiscount() / 100);
                                }else{
                                 netTotal = total;
                                }
                                Total_text.setText(String.valueOf(netTotal));

                                farmers[i].products[j].reduceQuantity(quantity);

                                JOptionPane.showMessageDialog(null, "Purchase successful!");
                                return;}else {
                                JOptionPane.showMessageDialog(null, "Out of Stock");
                                return;
                            }
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Product not found.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity or ID.");
        }

    }//GEN-LAST:event_Buy_buttonActionPerformed

    private void cname_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cname_textMouseEntered
       
    }//GEN-LAST:event_cname_textMouseEntered

    private void cname_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cname_textMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cname_textMouseClicked

    private void F_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_detailsActionPerformed
 farmerdetails_text.setText(" ");        
        for (int i = 0; i < farmers.length; i++) {
            
            farmers[i].Display_Info(farmerdetails_text);
        }

    }//GEN-LAST:event_F_detailsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        farmerdetails_text.setText(" ");
        for (int i = 0; i < farmers.length; i++) {

        farmerdetails_text.append(
            "Farmer ID: " + farmers[i].getId() +
            " | Name: " + farmers[i].getName() + "\n"
        );

        for (int j = 0; j < farmers[i].products.length; j++) {

            Product p = farmers[i].products[j];

            if (p != null) {   
                farmerdetails_text.append(
                    "   Product: " + p.getName() +
                    " | Qty: " + p.getQuantity() +
                    " | Price: " + p.getPrice() +
                    " | Discount: " + p.getDiscount() + "%\n"
                );
            }
        }

        farmerdetails_text.append("---------------------------------\n");
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void farmerdetails_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farmerdetails_textMouseClicked
        farmerdetails_text.setText(" ");
    }//GEN-LAST:event_farmerdetails_textMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void quantity_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_textKeyTyped
       
    }//GEN-LAST:event_quantity_textKeyTyped
public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy_button;
    private javax.swing.JTextField FContact_text;
    private javax.swing.JTextField FName_text;
    private javax.swing.JButton F_details;
    private javax.swing.JTextField Total_text;
    private javax.swing.JButton close_button;
    private javax.swing.JTextField cname_text;
    private javax.swing.JButton ennterfarmeid_button;
    private javax.swing.JTextArea farmerdetails_text;
    private javax.swing.JTextField getID_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField quantity_text;
    // End of variables declaration//GEN-END:variables
}
