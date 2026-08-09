
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abdil
 */
public class MainFrame extends javax.swing.JFrame {
int id;

String password;

Farmer[] farmers;
   /*Farmer[] farmers = {
                new Farmer("Janaka", "0773456789","12345",101),
                new Farmer("Saman", "0778978678","1234",102),
                new Farmer("Nimal", "078788788","1234",103)
        };*/
   
   /*Customer[] customers = {
                new Customer("Pawan", "077565656","1234",201),
                new Customer("Nawan", "119","1234",202)
        };*/
   
    public MainFrame() {
        initComponents();
        
       
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_text = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        login_button = new javax.swing.JButton();
        password_text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(965, 459));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Enter Your ID Number");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Enter Your Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 189, 40));

        id_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(id_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 321, 38));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmer", "Customer" }));
        jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 330, 38));

        login_button.setBackground(new java.awt.Color(51, 255, 51));
        login_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_button.setText("Login");
        login_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 32));

        password_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(password_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 321, 38));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, 31));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Create Acount");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ro.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 360, 290));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcome.jpg"))); // NOI18N
        jLabel3.setText(" Sign In");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 371, 465));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ro.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        String selected= (String) jComboBox2.getSelectedItem();
        if(selected.equals("Farmer")){
            
   
    String textid = id_text.getText();
    String password = password_text.getText();
    int id = Integer.parseInt(textid);

    try {
        

        
            Farmer farmer = Farmer.loadFarmerFromDB(id, password); 
            if (farmer != null) {
                farmer.loadProductsFromDB(); 
                new FarmerFrame(new Farmer[]{farmer}, id).setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect ID or Password");
            }
    
           
           
        

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid ID number.");
    }
}

        else {
    String textid = id_text.getText();
    String password = password_text.getText();
    int id = Integer.parseInt(textid);

    try {
        

       
            Customer customer = Customer.loadCustomerFromDB(id, password); 
            if (customer!= null ) {
                
                Farmer[] farmers = Farmer.loadAllFarmersFromDB();
                for (int i = 0; i < farmers.length; i++) {
                    farmers[i].loadProductsFromDB();
                }
                new CustomerFrame(new Customer[]{customer},farmers,id).setVisible(true);
                
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect ID or Password");
            }
    
           
           
        

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter a valid ID number.");
    }
            
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       new UserAddFrame().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_text;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField password_text;
    // End of variables declaration//GEN-END:variables
}
