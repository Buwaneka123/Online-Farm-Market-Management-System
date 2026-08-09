/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdil
 */
import javax.swing.JTextArea;
public abstract class User {
    String name;
    String contact;
    String password;
    int id;

    public User(String name, String contact,String password,int id) {
        this.name = name;
        this.contact = contact;
        this.password=password;
        this.id=id;
    }

    public String getName() {
        return name;
    }

  

    public String getContact() {
        return contact;
    }

   
    public int getId(){
    return id;
    }
    
    public String getPassword(){
    return password;
    }
    
    
    
    public void Display_Info(JTextArea a1){
        
    }
}
