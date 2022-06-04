/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import connection.SQLConnection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.file.check;
import main.file.MAIN;
import signup.SignUp;
/**
 *
 * @author DyXz
 */
public class Login extends javax.swing.JFrame {

    int loginCount = 2;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginHeader = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        CloseText = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        UsernameText = new javax.swing.JLabel();
        PasswordText = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);

        LoginHeader.setBackground(new java.awt.Color(244, 180, 26));
        LoginHeader.setForeground(new java.awt.Color(244, 180, 26));
        LoginHeader.setToolTipText("");

        LoginText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginText.setForeground(new java.awt.Color(255, 255, 255));
        LoginText.setText("Login");

        CloseText.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        CloseText.setForeground(new java.awt.Color(242, 242, 242));
        CloseText.setText("X");
        CloseText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginHeaderLayout = new javax.swing.GroupLayout(LoginHeader);
        LoginHeader.setLayout(LoginHeaderLayout);
        LoginHeaderLayout.setHorizontalGroup(
            LoginHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginHeaderLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(LoginText)
                .addGap(193, 193, 193)
                .addComponent(CloseText)
                .addContainerGap())
        );
        LoginHeaderLayout.setVerticalGroup(
            LoginHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginHeaderLayout.createSequentialGroup()
                .addComponent(CloseText)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LoginHeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LoginText)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Main.setBackground(new java.awt.Color(20, 61, 89));

        UsernameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UsernameText.setForeground(new java.awt.Color(242, 242, 242));
        UsernameText.setText("Username");

        PasswordText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(242, 242, 242));
        PasswordText.setText("Password");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUsername.setToolTipText("");

        btnLogin.setBackground(new java.awt.Color(0, 153, 0));
        btnLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setForeground(new java.awt.Color(242, 242, 242));
        btnClose.setText("Close");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPassword.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("No Bank Account? Create New Account");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordText)
                            .addComponent(UsernameText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClose))
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(UsernameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordText)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseTextMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String username = txtUsername.getText().toLowerCase(); //Get name from textbox and store in Variable
        String password = new String(txtPassword.getPassword());//Get password from pass-box and store in Variable
        
        if(username.equals("") && password.equals("") || username.equals("") || password.equals("")){ // " || "​ => or
            JOptionPane.showMessageDialog(null, "Username Or Password Cannot Be Empty!");//null is use to make message-box at the middle of the screen
        }else
        {
            String query = "Select username, password from Account Where username=? and password=?";
            try {
              PreparedStatement pst = SQLConnection.getConnection().prepareStatement(query);
              pst.setString(1, username);
              pst.setString(2, password);
              ResultSet rs = pst.executeQuery();
        	//JOptionPane.showMessageDialog(null, "Login Success!"); //if we want user login success with random name and pass.
            if(rs.next()){
                
                if(rs.getString("password").equals(password)){
                    this.setVisible(false);
                    check main = new check();
                    main.pack();
                    main.setLocationRelativeTo(null);
                    main.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed, Wrong Username or Password");
                }     
            }else{
                if(loginCount == 0){  //3 == 0 is false
                    JOptionPane.showMessageDialog(null, "Login Failed, Try Again Later!"); 
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed, Wrong Username or Password");
                    loginCount--; //logincount --  MEAN when input wrong 1 time it's - 1 time/3
                }
            }
              
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        SignUp signup = new SignUp();
        signup.pack();
        signup.setLocationRelativeTo(null);
        signup.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseText;
    private javax.swing.JPanel LoginHeader;
    private javax.swing.JLabel LoginText;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
