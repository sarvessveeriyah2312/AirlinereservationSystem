/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineReservationSystem2021;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelClass.UserFactory;

/**
 *
 * @author Sarvess S/O Veeriyah
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        etName = new javax.swing.JTextField();
        etPassword = new javax.swing.JPasswordField();
        btnSignup = new javax.swing.JButton();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        etUsername = new javax.swing.JTextField();
        etGender = new javax.swing.JTextField();
        etIC = new javax.swing.JTextField();
        etPhonenumber = new javax.swing.JTextField();
        etAge = new javax.swing.JTextField();
        etPassport = new javax.swing.JTextField();
        etEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        label1.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        label1.setText("SIGN UP");

        etName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNameActionPerformed(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(0, 102, 255));
        btnSignup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("SIGNUP");
        btnSignup.setMaximumSize(new java.awt.Dimension(141, 25));
        btnSignup.setMinimumSize(new java.awt.Dimension(141, 25));
        btnSignup.setPreferredSize(new java.awt.Dimension(141, 25));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        label4.setBackground(new java.awt.Color(0, 102, 255));
        label4.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("      Its more than just a trip");

        label5.setBackground(new java.awt.Color(0, 102, 255));
        label5.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText(" ARS");

        etUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etUsernameActionPerformed(evt);
            }
        });

        etGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etGenderActionPerformed(evt);
            }
        });

        etIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etICActionPerformed(evt);
            }
        });

        etPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPhonenumberActionPerformed(evt);
            }
        });

        etAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etAgeActionPerformed(evt);
            }
        });

        etPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPassportActionPerformed(evt);
            }
        });

        etEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmailActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME:");

        jLabel3.setText("USERNAME:");

        jLabel4.setText("GENDER:");

        jLabel5.setText("IC NUMBER:");

        jLabel6.setText("PHONE NUMBER:");

        jLabel7.setText("AGE:");

        jLabel8.setText("EMAIL:");

        jLabel9.setText("PASSWORD:");

        jLabel10.setText("PASSPORT NUMBER:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.setText("jLabel1");
        btnBack.setMaximumSize(new java.awt.Dimension(60, 60));
        btnBack.setMinimumSize(new java.awt.Dimension(60, 60));
        btnBack.setPreferredSize(new java.awt.Dimension(60, 60));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/airplane.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etName)
                                        .addComponent(etPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addComponent(etUsername)
                                        .addComponent(etGender)
                                        .addComponent(etIC)
                                        .addComponent(etPhonenumber)
                                        .addComponent(etAge)
                                        .addComponent(etPassport, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addComponent(etEmail))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(etUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(etGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(etIC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(etPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(etAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(etEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addComponent(etPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void etNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etNameActionPerformed

    private boolean checkUsername(String uname) {
        PreparedStatement ps;
        ResultSet rs;
        boolean isExist = false;
        String query = "SELECT * FROM `users` WHERE `username` = ?";

        try {
            ps = InitDb.getConnection().prepareStatement(query);
            ps.setString(1, uname);

            rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isExist;

    }

    private void etUsernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etUsernameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etUsernameActionPerformed

    private void etGenderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etGenderActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etGenderActionPerformed

    private void etICActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etICActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etICActionPerformed

    private void etPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etPhonenumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etPhonenumberActionPerformed

    private void etAgeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etAgeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etAgeActionPerformed

    private void etPassportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etPassportActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etPassportActionPerformed

    private void etEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_etEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_etEmailActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSignupActionPerformed
        String name = etName.getText();
        String uname = etUsername.getText();
        String gender = etGender.getText();
        String icnum = etIC.getText();
        String phonenumber = etPhonenumber.getText();
        String age = etAge.getText();
        String email = etEmail.getText();
        String pass = String.valueOf(etPassword.getPassword());
        String passport = etPassport.getText();

        if (uname.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Password field is required");
        } else if (checkUsername(uname)) {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        } else {

            PreparedStatement ps;
            String query = "INSERT INTO `users`(`id`,`name`, `username`, `email`, `password`, `ic_number`, `phone_number`, `age`, `gender`, `passport`) VALUES (?,?,?,?,?,?,?,?,?,?)";

            try {
                ps = InitDb.getConnection().prepareStatement(query);

                // User Factory Design Pattern
                UserFactory userFactory = new UserFactory();
                // Auto generate user id based on the user factory object return
                ps.setString(1, userFactory.getUser("Passenger").generateId());
                ps.setString(2, name);
                ps.setString(3, uname);
                ps.setString(4, email);
                ps.setString(5, pass);
                ps.setString(6, icnum);
                ps.setString(7, phonenumber);
                ps.setString(8, age);
                ps.setString(9, gender);
                ps.setString(10, passport);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Registered Succesfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// GEN-LAST:event_btnSignupActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBackMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnSignup;
    private javax.swing.JTextField etAge;
    private javax.swing.JTextField etEmail;
    private javax.swing.JTextField etGender;
    private javax.swing.JTextField etIC;
    private javax.swing.JTextField etName;
    private javax.swing.JTextField etPassport;
    private javax.swing.JPasswordField etPassword;
    private javax.swing.JTextField etPhonenumber;
    private javax.swing.JTextField etUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables
}