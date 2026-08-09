/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdil
 */
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Customer extends User {

    public Customer(String name, String contact,String password,int id) {
        super(name, contact,password,id);
    }

    @Override
    public void Display_Info(JTextArea a1) {
        a1.append("Customer: " + getName() + " Contact: " + getContact());
    }


    public void saveBill(String farmerName, String Product , int qty, double total,double nettotal) {
        try {
            FileWriter fw = new FileWriter("bill.txt", true);
            fw.write("Customer: " + getName() + "\n");
            fw.write("Farmer: " + farmerName + "\n");
            fw.write("Product: " + Product + "\n");
            fw.write("Quantity: " + qty + "\n");
            fw.write("Total Price: " + total + "\n");
            fw.write("Total Price After Discount: "+nettotal+"\n");
            fw.write("--------------------------------------\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing bill file.");
        }
    }
    
    
    public void saveCustomerToDB() {
    String sql = "INSERT INTO customers (id, name, contact, password) VALUES (?, ?, ?, ?)";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, this.getId());
        pst.setString(2, this.getName());
        pst.setString(3, this.getContact());
        pst.setString(4, this.getPassword());

        pst.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    public static Customer loadCustomerFromDB(int id, String password) {

    String sql = "SELECT * FROM customers WHERE id = ? AND password = ?";

    try {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, id);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
           Customer customer = new Customer(
                rs.getString("name"),
                rs.getString("contact"),
                rs.getString("password"),
                rs.getInt("id")
            );

            rs.close();
            pst.close();
            con.close();

            return customer;
        }

        rs.close();
        pst.close();
        con.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null; 
}

}
