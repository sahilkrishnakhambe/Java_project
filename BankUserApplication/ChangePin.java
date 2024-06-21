package BankUserApplication;

import static java.awt.Color.green;
import static java.awt.Color.red;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class ChangePin extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int cust_id,IMPI;
    String oldPin,newPin,reNewPin,tOldPin;
    
    public ChangePin(Connection con,int cust_id,int IMPI) 
    {
        this.con=con;
        this.cust_id=cust_id;
        this.IMPI=IMPI;
        initComponents();
        
        passCust_ID.setText(""+cust_id);
        passCust_ID.setEditable(false);
//        changePinB1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cust_idT1 = new javax.swing.JTextField();
        oldPinP2 = new javax.swing.JPasswordField();
        newPinP2 = new javax.swing.JPasswordField();
        re_EnterNewPinP3 = new javax.swing.JPasswordField();
        errorChangePinL1 = new javax.swing.JLabel();
        ExitBtn3 = new javax.swing.JButton();
        changePinB1 = new javax.swing.JToggleButton();
        menuBtn2 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passCust_ID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        cust_idT1.setBackground(new java.awt.Color(153, 204, 255));
        cust_idT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cust_idT1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cust_idT1FocusLost(evt);
            }
        });
        cust_idT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cust_idT1KeyPressed(evt);
            }
        });

        oldPinP2.setBackground(new java.awt.Color(153, 204, 255));
        oldPinP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                oldPinP2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                oldPinP2FocusLost(evt);
            }
        });
        oldPinP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oldPinP2KeyPressed(evt);
            }
        });

        newPinP2.setBackground(new java.awt.Color(153, 204, 255));
        newPinP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPinP2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPinP2FocusLost(evt);
            }
        });
        newPinP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPinP2KeyPressed(evt);
            }
        });

        re_EnterNewPinP3.setBackground(new java.awt.Color(153, 204, 255));
        re_EnterNewPinP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                re_EnterNewPinP3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                re_EnterNewPinP3FocusLost(evt);
            }
        });
        re_EnterNewPinP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                re_EnterNewPinP3KeyPressed(evt);
            }
        });

        ExitBtn3.setBackground(new java.awt.Color(204, 204, 0));
        ExitBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitBtn3.setForeground(new java.awt.Color(204, 0, 0));
        ExitBtn3.setText("Exit");
        ExitBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtn3ActionPerformed(evt);
            }
        });

        changePinB1.setBackground(new java.awt.Color(204, 204, 0));
        changePinB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changePinB1.setForeground(new java.awt.Color(0, 153, 153));
        changePinB1.setText("Change");
        changePinB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changePinB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePinB1ActionPerformed(evt);
            }
        });

        menuBtn2.setBackground(new java.awt.Color(204, 204, 0));
        menuBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuBtn2.setForeground(new java.awt.Color(0, 153, 51));
        menuBtn2.setText("Menu");
        menuBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtn2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Re-Enter New Pin             :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Enter New Pin                    :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enter Old Pin                      :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Enter Customer ID           :");

        passCust_ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(menuBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(changePinB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ExitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(re_EnterNewPinP3))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(87, 87, 87)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cust_idT1)
                                .addComponent(oldPinP2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(newPinP2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(errorChangePinL1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cust_idT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oldPinP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newPinP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(re_EnterNewPinP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(errorChangePinL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuBtn2)
                    .addComponent(changePinB1)
                    .addComponent(ExitBtn3))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change Pin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtn2ActionPerformed
        BankMenu m = new BankMenu(con,cust_id,IMPI);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBtn2ActionPerformed

    private void changePinB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePinB1ActionPerformed
        
        cust_id=Integer.parseInt(cust_idT1.getText());
        oldPin=oldPinP2.getText();
        newPin=newPinP2.getText();
        reNewPin=re_EnterNewPinP3.getText();
        
        try
        {
            ps=con.prepareStatement("select * from account where cust_id='"+cust_id+"'");
            rs=ps.executeQuery();
            if(rs.next())
            {   tOldPin=rs.getString(7);
                if(!oldPin.equals(tOldPin))
                {
                    JOptionPane.showMessageDialog(this,"Old Pin doesn't match with existing Pin...");
//                    cust_idT1.setText(null);
                    oldPinP2.setText(null);
                    newPinP2.setText(null);
                    re_EnterNewPinP3.setText(null);
//                    changePinB1.setEnabled(false);
                }
                else if(oldPin.equals("newPin"))
                {
                    JOptionPane.showMessageDialog(this,"New Pin Match with Old Pin...");
                    oldPinP2.setText(null);
                    newPinP2.setText(null);
                    re_EnterNewPinP3.setText(null);
//                    changePinB1.setEnabled(false);
                }
                else
                {
                    if(newPin.equals(reNewPin))
                    { 
                        JOptionPane.showMessageDialog(this," Press Ok for Change Pin...");
                        changePin();
//                        changePinB1.setEnabled(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"New Pin Doesn't Match with current Re-Entered Oin...");
                    }
                }    
            }   
            else
            {
                JOptionPane.showMessageDialog(this,"This User are not Exist...");
            }    
        }   
        catch(Exception e)
        {
            errorChangePinL1.setText(""+e);
        } 
    }//GEN-LAST:event_changePinB1ActionPerformed

    public void changePin()
    {
        try
        {
            ps=con.prepareStatement("update account set user_password=?,re_user_password=? where cust_id='"+cust_id+"'");
            ps.setString(1, newPin);
            ps.setString(2, reNewPin);
            int i=ps.executeUpdate();
            
            if(i!=0)
            {
                JOptionPane.showMessageDialog(this,"Pin Changed Successfully...");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Somthing Wrong...");
            } 
        }   
        catch(Exception e)
        {
            errorChangePinL1.setText(""+e);
        } 
    }        
    
    public void checkValidPin()
    {
        cust_id=Integer.parseInt(cust_idT1.getText());
        oldPin=oldPinP2.getText();
        newPin=newPinP2.getText();
        reNewPin=re_EnterNewPinP3.getText();
        
        
    }        
    
    private void ExitBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtn3ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitBtn3ActionPerformed

    private void cust_idT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cust_idT1FocusGained
        cust_idT1.setEditable(true);
        cust_idT1.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_cust_idT1FocusGained

    private void oldPinP2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPinP2FocusGained
        oldPinP2.setEditable(true);
        oldPinP2.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_oldPinP2FocusGained

    private void newPinP2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPinP2FocusGained
        newPinP2.setEditable(true);
        newPinP2.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_newPinP2FocusGained

    private void re_EnterNewPinP3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_re_EnterNewPinP3FocusGained
        re_EnterNewPinP3.setEditable(true);
        re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_re_EnterNewPinP3FocusGained

    private void cust_idT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cust_idT1FocusLost
        cust_idT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_cust_idT1FocusLost

    private void oldPinP2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPinP2FocusLost
        oldPinP2.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_oldPinP2FocusLost

    private void newPinP2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPinP2FocusLost
        newPinP2.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_newPinP2FocusLost

    private void re_EnterNewPinP3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_re_EnterNewPinP3FocusLost
        re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_re_EnterNewPinP3FocusLost

    private void cust_idT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cust_idT1KeyPressed
        if(Character.isLetter(evt.getKeyChar()))
        {
            cust_idT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Only numbers are allowed");
            cust_idT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
        } 
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            cust_idT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            cust_idT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
           
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
            
        }
        else if(Character.isDigit(evt.getKeyChar()))
        {
            cust_idT1.setEditable(true);
            cust_idT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
        }
    }//GEN-LAST:event_cust_idT1KeyPressed

    private void oldPinP2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldPinP2KeyPressed
        if(Character.isWhitespace(evt.getKeyChar())  )
        {
            oldPinP2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            oldPinP2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));

            cust_idT1.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
        }   
        else if( Character.isLetterOrDigit(evt.getKeyChar()))
        {
            oldPinP2.setEditable(true);
            oldPinP2.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            cust_idT1.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
        } 
    }//GEN-LAST:event_oldPinP2KeyPressed

    private void newPinP2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPinP2KeyPressed
        if(Character.isWhitespace(evt.getKeyChar())  )
        {
            newPinP2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            newPinP2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));

            cust_idT1.setBorder(BorderFactory.createLineBorder(null));
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
        }   
        else if( Character.isLetterOrDigit(evt.getKeyChar()))
        {
            newPinP2.setEditable(true);
            newPinP2.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            cust_idT1.setBorder(BorderFactory.createLineBorder(null));
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(null));
        }
    }//GEN-LAST:event_newPinP2KeyPressed

    private void re_EnterNewPinP3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_re_EnterNewPinP3KeyPressed
        if(Character.isWhitespace(evt.getKeyChar())  )
        {
            re_EnterNewPinP3.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));

            cust_idT1.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
        }   
        else if( Character.isLetterOrDigit(evt.getKeyChar()))
        {
            re_EnterNewPinP3.setEditable(true);
            re_EnterNewPinP3.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            cust_idT1.setBorder(BorderFactory.createLineBorder(null));
            newPinP2.setBorder(BorderFactory.createLineBorder(null));
            oldPinP2.setBorder(BorderFactory.createLineBorder(null));
        }
    }//GEN-LAST:event_re_EnterNewPinP3KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn3;
    private javax.swing.JToggleButton changePinB1;
    private javax.swing.JTextField cust_idT1;
    private javax.swing.JLabel errorChangePinL1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton menuBtn2;
    private javax.swing.JPasswordField newPinP2;
    private javax.swing.JPasswordField oldPinP2;
    private javax.swing.JTextField passCust_ID;
    private javax.swing.JPasswordField re_EnterNewPinP3;
    // End of variables declaration//GEN-END:variables
}
