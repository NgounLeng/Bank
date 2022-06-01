/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;
import login.Login;

/**
 *
 * @author DyXz
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login = new Login();
        login.pack();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
