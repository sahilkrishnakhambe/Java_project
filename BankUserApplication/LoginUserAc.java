package BankUserApplication;

import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class LoginUserAc extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    String user_password;
    int cust_id,IMPI,LoginBy,status;
    private Object BorderFactoey;
    
    
    public LoginUserAc(Connection con) 
    {
        this.con=con;
        
        initComponents();
        cust_idULT1.setEnabled(false);
        userPasswordULP1.setEnabled(false);
        impi_codeULT3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        userLoginTitleL1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userPasswordULP1 = new javax.swing.JPasswordField();
        LoginByCustID = new javax.swing.JRadioButton();
        LoginByIMPI = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cust_idULT1 = new javax.swing.JTextField();
        userLoginB1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        impi_codeULT3 = new javax.swing.JTextField();
        userLoginErrorL1 = new javax.swing.JLabel();
        registrationULB2 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        userLoginTitleL1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        userLoginTitleL1.setForeground(new java.awt.Color(255, 255, 255));
        userLoginTitleL1.setText("User Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(userLoginTitleL1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(userLoginTitleL1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        userPasswordULP1.setBackground(new java.awt.Color(153, 204, 255));
        userPasswordULP1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userPasswordULP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPasswordULP1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPasswordULP1FocusLost(evt);
            }
        });
        userPasswordULP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userPasswordULP1KeyPressed(evt);
            }
        });

        LoginByCustID.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(LoginByCustID);
        LoginByCustID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginByCustID.setForeground(new java.awt.Color(0, 153, 51));
        LoginByCustID.setText("Login By Cust_ID");
        LoginByCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginByCustIDActionPerformed(evt);
            }
        });

        LoginByIMPI.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(LoginByIMPI);
        LoginByIMPI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginByIMPI.setForeground(new java.awt.Color(0, 153, 51));
        LoginByIMPI.setText("Login By IMPI Code");
        LoginByIMPI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoginByIMPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginByIMPIActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cust_ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        cust_idULT1.setBackground(new java.awt.Color(153, 204, 255));
        cust_idULT1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cust_idULT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cust_idULT1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cust_idULT1FocusLost(evt);
            }
        });
        cust_idULT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cust_idULT1KeyPressed(evt);
            }
        });

        userLoginB1.setBackground(new java.awt.Color(204, 204, 0));
        userLoginB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userLoginB1.setForeground(new java.awt.Color(0, 153, 153));
        userLoginB1.setText("User Login");
        userLoginB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userLoginB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginB1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("IMPI Code");

        impi_codeULT3.setBackground(new java.awt.Color(153, 204, 255));
        impi_codeULT3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        impi_codeULT3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                impi_codeULT3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                impi_codeULT3FocusLost(evt);
            }
        });
        impi_codeULT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                impi_codeULT3KeyPressed(evt);
            }
        });

        registrationULB2.setBackground(new java.awt.Color(204, 204, 0));
        registrationULB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrationULB2.setForeground(new java.awt.Color(0, 153, 51));
        registrationULB2.setText("Registration");
        registrationULB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationULB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationULB2ActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(204, 204, 0));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(204, 0, 0));
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userPasswordULP1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cust_idULT1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoginByCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(impi_codeULT3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoginByIMPI)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(userLoginB1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(registrationULB2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(userLoginErrorL1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cust_idULT1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPasswordULP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginByIMPI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginByCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(impi_codeULT3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGap(18, 18, 18)
                .addComponent(userLoginErrorL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLoginB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrationULB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userLoginB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginB1ActionPerformed
  
        if(LoginByCustID.isSelected())
        {
            loginByCust_ID();
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
            impi_codeULT3.setText(null);
        }
        else if(LoginByIMPI.isSelected())
        {
            loginByIMPI();
        }
         
    }//GEN-LAST:event_userLoginB1ActionPerformed

    private void registrationULB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationULB2ActionPerformed
        Registration r = new Registration(con);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrationULB2ActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void LoginByCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginByCustIDActionPerformed
        cust_idULT1.setEnabled(true);
        userPasswordULP1.setEnabled(true);
        impi_codeULT3.setEnabled(false);
        
    }//GEN-LAST:event_LoginByCustIDActionPerformed

    private void LoginByIMPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginByIMPIActionPerformed
        impi_codeULT3.setEnabled(true);
        cust_idULT1.setEnabled(false);
        userPasswordULP1.setEnabled(false);
        
    }//GEN-LAST:event_LoginByIMPIActionPerformed

    private void impi_codeULT3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_impi_codeULT3KeyPressed
        if(Character.isLetter(evt.getKeyChar()))
        {
            impi_codeULT3.setEditable(false);
            JOptionPane.showMessageDialog(this,"Only numbers are allowed");
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            
            
            cust_idULT1.setBorder(BorderFactory.createLineBorder(null));
            cust_idULT1.setText(null);
            userPasswordULP1.setText(null);
            userPasswordULP1.setBorder(BorderFactory.createLineBorder(null));
            
        } 
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            impi_codeULT3.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            
            
            cust_idULT1.setBorder(BorderFactory.createLineBorder(null));
            cust_idULT1.setText(null);
            userPasswordULP1.setText(null);
            userPasswordULP1.setBorder(BorderFactory.createLineBorder(null));
            
        }
        else if(Character.isDigit(evt.getKeyChar()))
        {
            impi_codeULT3.setEditable(true);
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            cust_idULT1.setBorder(BorderFactory.createLineBorder(null));
            cust_idULT1.setText(null);
            userPasswordULP1.setText(null);
            userPasswordULP1.setBorder(BorderFactory.createLineBorder(null));
        } 
          
    }//GEN-LAST:event_impi_codeULT3KeyPressed

    private void cust_idULT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cust_idULT1KeyPressed
        if(Character.isLetter(evt.getKeyChar()))
        {
            cust_idULT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Only numbers are allowed");
            cust_idULT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            
            
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
            impi_codeULT3.setText(null);
            
        }   
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            cust_idULT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            cust_idULT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
           
            
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
            impi_codeULT3.setText(null);
            
        }
        else
        {
            cust_idULT1.setEditable(true);
            cust_idULT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
            impi_codeULT3.setText(null);
        } 
    }//GEN-LAST:event_cust_idULT1KeyPressed

    private void cust_idULT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cust_idULT1FocusLost
        cust_idULT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_cust_idULT1FocusLost

    private void impi_codeULT3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_impi_codeULT3FocusLost
        impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_impi_codeULT3FocusLost

    private void userPasswordULP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPasswordULP1KeyPressed
        if(Character.isWhitespace(evt.getKeyChar())  )
        {
            userPasswordULP1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            userPasswordULP1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            
            
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
            impi_codeULT3.setText(null);
            
        }   
        else if( Character.isLetterOrDigit(evt.getKeyChar()))
        {
            userPasswordULP1.setEditable(true);
            userPasswordULP1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            impi_codeULT3.setBorder(BorderFactory.createLineBorder(null));
            impi_codeULT3.setText(null);
        } 
    }//GEN-LAST:event_userPasswordULP1KeyPressed

    private void userPasswordULP1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordULP1FocusLost
        userPasswordULP1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_userPasswordULP1FocusLost

    private void cust_idULT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cust_idULT1FocusGained
        cust_idULT1.setBorder(BorderFactory.createLineBorder(null, 2));
    }//GEN-LAST:event_cust_idULT1FocusGained

    private void userPasswordULP1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordULP1FocusGained
        userPasswordULP1.setBorder(BorderFactory.createLineBorder(null, 2));
    }//GEN-LAST:event_userPasswordULP1FocusGained

    private void impi_codeULT3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_impi_codeULT3FocusGained
        impi_codeULT3.setBorder(BorderFactory.createLineBorder(null, 2));
    }//GEN-LAST:event_impi_codeULT3FocusGained
    
    public void loginByCust_ID()
    {
        cust_id=Integer.parseInt(cust_idULT1.getText());
        user_password=userPasswordULP1.getText();
        LoginBy=cust_id;
        
        try
        {
            ps=con.prepareStatement("select * from account where cust_id='"+LoginBy+"'");
            rs=ps.executeQuery();

            if(rs.next())
            {
                if(LoginBy==rs.getInt(3))
                {  
                    if(user_password.equals(rs.getString(7)))
                    {
                        JOptionPane.showMessageDialog(this,"Welcome to Bank of India");
                        cust_id=rs.getInt(3);
                        System.out.println(cust_id);
                        IMPI=rs.getInt(1);
                        BankMenu m = new BankMenu(con,cust_id,IMPI);
                        m.setVisible(true);
                        this.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Password Invalid...");
                    }       
                } 
                else
                {
                    userLoginErrorL1.setText("User not Exist...");
                    JOptionPane.showMessageDialog(this," Cust_ID/IMPI Code Invalid");
                }    
            }
            else
            {
                userLoginErrorL1.setText("invalid input...");
                JOptionPane.showMessageDialog(this," invalid Password/IMPI Code...");
            }    
        }
        catch(Exception e)
        {
            userLoginErrorL1.setText(""+e);
        } 
    }    

    public void loginByIMPI()
    {
        IMPI=Integer.parseInt(impi_codeULT3.getText());
        LoginBy=IMPI;
        
        try
        {
            ps=con.prepareStatement("select * from account where impi_No='"+LoginBy+"'");//and user_password='"+user_password+"' or impi_no='"+IMPI+"'
            rs=ps.executeQuery();

            if(rs.next())
            {
                if(LoginBy==rs.getInt(1))
                {
                    JOptionPane.showMessageDialog(this,"Welcome to Bank of India");
                    cust_id=rs.getInt(3);
                    System.out.println(cust_id);
                    IMPI=rs.getInt(1);
                    BankMenu m = new BankMenu(con,cust_id,IMPI);
                    m.setVisible(true);
                    this.setVisible(false); 
                }
                else
                {
                    userLoginErrorL1.setText("User not Exist...");
                    JOptionPane.showMessageDialog(this," Cust_ID/IMPI Code Invalid");
                }    
            }
            else
            {
                userLoginErrorL1.setText("invalid input...");
                JOptionPane.showMessageDialog(this," invalid Password/IMPI Code...");
            }    
        }
        catch(Exception e)
        {
            userLoginErrorL1.setText(""+e);
        }  
    }        
    
//    public void validLogin()
//    {
//        cust_id=Integer.parseInt(cust_idULT1.getText());
//        user_password=userPasswordULP1.getText();
//        IMPI=Integer.parseInt(impi_codeULT3.getText());
//        
//        if(impi_codeULT3.getText().length()<=0)
//        {
//            impi_codeULT3.setBackground(red);
//            status = 1;
//            JOptionPane.showMessageDialog(this,"Field not Should be Empty...");
//            
//            if(impi_codeULT3.getText().matches("^[0-9]*$") && impi_codeULT3.getText().length()==6)
//            {
//                status = 0;
//            } 
//            else 
//            {
//                impi_codeULT3.setBackground(red);
//                JOptionPane.showMessageDialog(this," invalid Password/IMPI Code...");
//                status = 1;
//            }
//        }
//        
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LoginByCustID;
    private javax.swing.JRadioButton LoginByIMPI;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cust_idULT1;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField impi_codeULT3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton registrationULB2;
    private javax.swing.JToggleButton userLoginB1;
    private javax.swing.JLabel userLoginErrorL1;
    private javax.swing.JLabel userLoginTitleL1;
    private javax.swing.JPasswordField userPasswordULP1;
    // End of variables declaration//GEN-END:variables
}
