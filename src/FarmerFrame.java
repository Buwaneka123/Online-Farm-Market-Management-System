
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abdil
 */
public class FarmerFrame extends javax.swing.JFrame {

   private Farmer[] farmers;
   private int id;
   private int f_num;
   
   
   
    public FarmerFrame(Farmer[] farmers,int id) {
        this.id=id;
        this.farmers=farmers;
        
       
        for (int i = 0; i < farmers.length; i++) {
          if(id==farmers[i].getId()){
            f_num=i;
          }  
        }
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        details_button = new javax.swing.JButton();
        productDetail_button = new javax.swing.JButton();
        print_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        product_text = new javax.swing.JTextField();
        price_text = new javax.swing.JTextField();
        quantity_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        discount_text = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("     Products List");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 120, 240, 46));

        details_button.setBackground(new java.awt.Color(255, 255, 102));
        details_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        details_button.setText("Your Details");
        details_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        details_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(details_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 110, 40));

        productDetail_button.setBackground(new java.awt.Color(0, 0, 0));
        productDetail_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productDetail_button.setForeground(new java.awt.Color(255, 255, 255));
        productDetail_button.setText("Show Product ");
        productDetail_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productDetail_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(productDetail_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 140, 30));

        print_button.setBackground(new java.awt.Color(51, 51, 0));
        print_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        print_button.setForeground(new java.awt.Color(255, 255, 102));
        print_button.setText("Print");
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(print_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 110, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("  Discount Value(%)");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 116, 31));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextArea2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextArea2MouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 240, 270));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmers-monitor-their-crops-using-260nw-2660791299 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 120, 100));

        product_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_textActionPerformed(evt);
            }
        });
        getContentPane().add(product_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 250, 38));

        price_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        price_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_textActionPerformed(evt);
            }
        });
        getContentPane().add(price_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 250, 38));

        quantity_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantity_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        quantity_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_textActionPerformed(evt);
            }
        });
        getContentPane().add(quantity_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 250, 38));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("  Product Name");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 116, 31));

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("  Price");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 116, 31));

        discount_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        discount_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        discount_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_textActionPerformed(evt);
            }
        });
        getContentPane().add(discount_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 250, 40));

        add_button.setBackground(new java.awt.Color(255, 255, 0));
        add_button.setText("Add Button");
        add_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 230, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 110, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("  Quantity");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 116, 40));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 90, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/789b0ac9fac08dc435429de872301b79.jpg"))); // NOI18N
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void discount_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_textActionPerformed

    }//GEN-LAST:event_discount_textActionPerformed

    private void quantity_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_textActionPerformed
        
    }//GEN-LAST:event_quantity_textActionPerformed

    private void price_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_textActionPerformed
        
    }//GEN-LAST:event_price_textActionPerformed

    private void details_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details_buttonActionPerformed
        JOptionPane.showMessageDialog(null,"Your Name            :"+farmers[f_num].getName()+"\n"+
            "Contact  Number :"+farmers[f_num].getContact()+"\n"+
            "ID Number            :"+farmers[f_num].getId());
      

    }//GEN-LAST:event_details_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
       try{
        String name=product_text.getText();
       double price=Double.parseDouble(price_text.getText());
      int quantity=Integer.parseInt(quantity_text.getText());
       double dis=Double.parseDouble(discount_text.getText());
       
       farmers[f_num].addProduct(name, price, quantity, dis);
       Product p=new Product(name, price, quantity, dis);
       farmers[f_num].saveProductToDB(p);
      
       JOptionPane.showMessageDialog(null,"Success");
    }//GEN-LAST:event_add_buttonActionPerformed
catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null,"Please Enter a Valid Value");
        }
    }
    private void productDetail_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDetail_buttonActionPerformed
        //jTextArea2.setText(String.valueOf(farmers[0].check()));
        farmers[f_num].viewReports(jTextArea2);
        
        
    }//GEN-LAST:event_productDetail_buttonActionPerformed

    private void product_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_textActionPerformed

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
        farmers[f_num].saveReportToFile();
    }//GEN-LAST:event_print_buttonActionPerformed

    private void jTextArea2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseExited

    }//GEN-LAST:event_jTextArea2MouseExited

    private void jTextArea2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseEntered
        jTextArea2.setText(" ");
        farmers[f_num].viewReports(jTextArea2);
    }//GEN-LAST:event_jTextArea2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jTextArea2.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

   public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton details_button;
    private javax.swing.JTextField discount_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField price_text;
    private javax.swing.JButton print_button;
    private javax.swing.JButton productDetail_button;
    private javax.swing.JTextField product_text;
    private javax.swing.JTextField quantity_text;
    // End of variables declaration//GEN-END:variables
}
