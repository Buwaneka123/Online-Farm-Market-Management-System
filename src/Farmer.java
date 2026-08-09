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
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Farmer extends User implements Manageable {

    Product[] products = new Product[50];
    public int count ;

    public Farmer(String name, String contact,String password,int id) {
        super(name, contact,password,id);
    }

    @Override
    public void Display_Info(JTextArea a1) {
        a1.append(" Farmer ID: " + getId()+" | | Farmer: " + getName() + "\n");
    }

    public void addProduct(String name, double price, int qty, double dis) {
        if (count < products.length) {
            products[count] = new Product(name, price, qty, dis);
            System.out.println("Product added successfully.");
            count++;
        } else {
            System.out.println("No space to add more products.");
        }
    }
    
  

    @Override
    public void viewReports(JTextArea a1) {
       a1.append("\n\nProducts by " + getName() + ":\n");
        for (int i = 0; i < count; i++) {
            a1.append("\n\n"+(i+1) + ").Product Name: " + products[i].getName() +
                    "\n    Price: " + products[i].getPrice() +
                    "\n    Qty: " + products[i].getQuantity() +
                    "\n    Discount: " + products[i].getDiscount());
        }
    }
 
    public void saveReportToFile() {
        try {
            FileWriter fw = new FileWriter(getName()+"farmer_report.txt", true);
            fw.write("Farmer: " + getName() + "\n");
            for (int i = 0; i < count; i++) {
                fw.write(products[i].getName() + " | Price: " + products[i].getPrice() +
                        " | Quantity: " + products[i].getQuantity() + "\n");
            }
            fw.write("--------------------------------------\n");
            fw.close();
            System.out.println("Report saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing farmer report.");
        }
    }
    

    public void saveProductToDB(Product p) {
    String sql = "INSERT INTO products(farmer_id, name, price, quantity, discount) VALUES (?, ?, ?, ?, ?)";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, this.getId());
        pst.setString(2, p.getName());
        pst.setDouble(3, p.getPrice());
        pst.setInt(4, p.getQuantity());
        pst.setDouble(5, p.getDiscount());

        pst.executeUpdate();
        System.out.println("Product saved to database successfully.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


public void loadProductsFromDB() {

    String sql = "SELECT * FROM products WHERE farmer_id = ?";

    try {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, this.getId());
        ResultSet rs = pst.executeQuery();

        count = 0; 

        while (rs.next()) {
            products[count] = new Product(
                rs.getString("name"),
                rs.getDouble("price"),
                rs.getInt("quantity"),
                rs.getDouble("discount")
            );
            count++;
        }

        rs.close();
        pst.close();
        con.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void saveFarmerToDB() {
    String sql = "INSERT INTO farmers (id, name, contact, password) VALUES (?, ?, ?, ?)";

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


public static Farmer loadFarmerFromDB(int id, String password) {

    String sql = "SELECT * FROM farmers WHERE id = ? AND password = ?";

    try {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, id);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            Farmer farmer = new Farmer(
                rs.getString("name"),
                rs.getString("contact"),
                rs.getString("password"),
                rs.getInt("id")
            );

            rs.close();
            pst.close();
            con.close();

            return farmer;
        }

        rs.close();
        pst.close();
        con.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null; 
}
 public static Farmer[] loadAllFarmersFromDB() {
    List<Farmer> list = new ArrayList<>();

    try {
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM farmers";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            list.add(new Farmer(
                rs.getString("name"),
                rs.getString("contact"),
                rs.getString("password"),
                rs.getInt("id")
            ));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return list.toArray(new Farmer[0]);
}


}

