package BankUserApplication;

import static java.awt.Color.green;
import static java.awt.Color.red;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class GeneratePin extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int cust_id,ac_no,balance=3000,IMPI=369000;
    String user_password,reUserPassword,ac_type,tbUserPin;
    
    java.util.Date date = new java.util.Date();
    java.sql.Date openAc_Date = new java.sql.Date(date.getTime());
    LocalDate ld = LocalDate.now();
    
    public GeneratePin(Connection con,int cust_id,int IMPI) 
    {
        this.con=con;
        this.cust_id=cust_id;
        this.IMPI=IMPI;
        
        initComponents();
        
        passCust_ID.setText(""+cust_id);
        passCust_ID.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn2 = new javax.swing.JButton();
        submitGPB1 = new javax.swing.JToggleButton();
        resetPinGPB2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        generatePinErrorL1 = new javax.swing.JLabel();
        reUserPinP2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        userPinP1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        custID_AcNoT1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passCust_ID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        exitBtn2.setBackground(new java.awt.Color(204, 204, 0));
        exitBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBtn2.setForeground(new java.awt.Color(204, 0, 0));
        exitBtn2.setText("Exit");
        exitBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtn2ActionPerformed(evt);
            }
        });

        submitGPB1.setBackground(new java.awt.Color(204, 204, 0));
        submitGPB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitGPB1.setForeground(new java.awt.Color(0, 153, 153));
        submitGPB1.setText("Submit");
        submitGPB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitGPB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitGPB1ActionPerformed(evt);
            }
        });

        resetPinGPB2.setBackground(new java.awt.Color(204, 204, 0));
        resetPinGPB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetPinGPB2.setForeground(new java.awt.Color(255, 102, 0));
        resetPinGPB2.setText("Reset");
        resetPinGPB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetPinGPB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPinGPB2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Menu");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reUserPinP2.setBackground(new java.awt.Color(153, 204, 255));
        reUserPinP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reUserPinP2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reUserPinP2FocusLost(evt);
            }
        });
        reUserPinP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reUserPinP2KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Re-Enter User Pin");

        userPinP1.setBackground(new java.awt.Color(153, 204, 255));
        userPinP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPinP1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPinP1FocusLost(evt);
            }
        });
        userPinP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userPinP1KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User Pin");

        custID_AcNoT1.setBackground(new java.awt.Color(153, 204, 255));
        custID_AcNoT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                custID_AcNoT1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                custID_AcNoT1FocusLost(evt);
            }
        });
        custID_AcNoT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custID_AcNoT1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cust ID / Account No. ");

        passCust_ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetPinGPB2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(submitGPB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custID_AcNoT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(userPinP1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(reUserPinP2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(generatePinErrorL1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(custID_AcNoT1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPinP1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reUserPinP2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generatePinErrorL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitGPB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetPinGPB2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generate Pin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void submitGPB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitGPB1ActionPerformed
        
        cust_id=Integer.parseInt(custID_AcNoT1.getText());
        ac_no=Integer.parseInt(custID_AcNoT1.getText());
        user_password=userPinP1.getText();
        reUserPassword=reUserPinP2.getText();
        
        try
        {
            ps=con.prepareStatement("select user_password from account where cust_id='"+cust_id+"' ");//OR ac_no='"+ac_no+"'
            rs=ps.executeQuery();

            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"This user Already Exist...");
                custID_AcNoT1.setText(null);
                userPinP1.setText(null);
                reUserPinP2.setText(null);
            }
            else
            {
                if(user_password.equals(reUserPassword))
                {  
                    ps=con.prepareStatement("select * from CustomerNewAc where cust_id=(select cust_id from customer where cust_id='"+cust_id+"')"); //or ac_no='"+ac_no+"'
                    rs=ps.executeQuery();
                    
                    if(rs.next())
                    {
                        ac_no=rs.getInt(1);
                        cust_id=rs.getInt(2);
                        ac_type=rs.getString(15);


                        ps=con.prepareStatement("insert into account(ac_no,cust_id,ac_type,balance,open_date,user_password,re_user_password) values(?,?,?,?,?,?,?)");
                       
                        ps.setInt(1, ac_no);
                        ps.setInt(2, cust_id);
                        ps.setString(3, ac_type);
                        ps.setInt(4, balance);
                        ps.setDate(5, openAc_Date);
                        ps.setString(6, user_password);
                        ps.setString(7, reUserPassword);

                        int i=ps.executeUpdate();
                        if(i!=0)
                        {
                            JOptionPane.showMessageDialog(this,"Pin Successfully Generated...");
                            LoginUserAc lua = new LoginUserAc(con);
                            lua.setVisible(true);
                            this.setVisible(false);
                        } 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"User Not Exist...");
                    }     
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"User Pin doesn't Match with Current Pin...");
                    userPinP1.setText(null);
                    reUserPinP2.setText(null);
                }    
            }       
        }
        catch(Exception e)
        {
            generatePinErrorL1.setText(""+e);
        }    
    }//GEN-LAST:event_submitGPB1ActionPerformed

    private void resetPinGPB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPinGPB2ActionPerformed
        custID_AcNoT1.setText(null);
        userPinP1.setText(null);
        reUserPinP2.setText(null);
    }//GEN-LAST:event_resetPinGPB2ActionPerformed

    private void exitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn2ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitBtn2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BankMenu bm = new BankMenu(con,cust_id,IMPI);
        bm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void custID_AcNoT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custID_AcNoT1FocusGained
        custID_AcNoT1.setEditable(true);
        custID_AcNoT1.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_custID_AcNoT1FocusGained

    private void userPinP1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPinP1FocusGained
        userPinP1.setEditable(true);
        userPinP1.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_userPinP1FocusGained

    private void reUserPinP2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reUserPinP2FocusGained
        reUserPinP2.setEditable(true);
        reUserPinP2.setBorder(BorderFactory.createLineBorder(null,2));
    }//GEN-LAST:event_reUserPinP2FocusGained

    private void custID_AcNoT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custID_AcNoT1FocusLost
        custID_AcNoT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_custID_AcNoT1FocusLost

    private void userPinP1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPinP1FocusLost
        userPinP1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_userPinP1FocusLost

    private void reUserPinP2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reUserPinP2FocusLost
        reUserPinP2.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_reUserPinP2FocusLost

    private void custID_AcNoT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custID_AcNoT1KeyPressed
        if(Character.isLetter(evt.getKeyChar()))
        {
            custID_AcNoT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Only numbers are allowed");
            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            
            userPinP1.setBorder(BorderFactory.createLineBorder(null));
            reUserPinP2.setBorder(BorderFactory.createLineBorder(null));
            
        } 
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            custID_AcNoT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
           
            userPinP1.setBorder(BorderFactory.createLineBorder(null));
            reUserPinP2.setBorder(BorderFactory.createLineBorder(null));
            
        }
        else if(Character.isDigit(evt.getKeyChar()))
        {
            custID_AcNoT1.setEditable(true);
            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            userPinP1.setBorder(BorderFactory.createLineBorder(null));
            reUserPinP2.setBorder(BorderFactory.createLineBorder(null));
        } 
    }//GEN-LAST:event_custID_AcNoT1KeyPressed

    private void userPinP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPinP1KeyPressed
        if(Character.isWhitespace(evt.getKeyChar())  )
        {
            userPinP1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            userPinP1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));

            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(null));
            reUserPinP2.setBorder(BorderFactory.createLineBorder(null));
        }   
        else if( Character.isLetterOrDigit(evt.getKeyChar()))
        {
            userPinP1.setEditable(true);
            userPinP1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(null));
            reUserPinP2.setBorder(BorderFactory.createLineBorder(null));
        } 
    }//GEN-LAST:event_userPinP1KeyPressed

    private void reUserPinP2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reUserPinP2KeyPressed
        if(Character.isWhitespace(evt.getKeyChar())  )
        {
            reUserPinP2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            reUserPinP2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));

            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(null));
            userPinP1.setBorder(BorderFactory.createLineBorder(null));
        }   
        else if( Character.isLetterOrDigit(evt.getKeyChar()))
        {
            reUserPinP2.setEditable(true);
            reUserPinP2.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            
            custID_AcNoT1.setBorder(BorderFactory.createLineBorder(null));
            userPinP1.setBorder(BorderFactory.createLineBorder(null));
        } 
    }//GEN-LAST:event_reUserPinP2KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custID_AcNoT1;
    private javax.swing.JButton exitBtn2;
    private javax.swing.JLabel generatePinErrorL1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField passCust_ID;
    private javax.swing.JPasswordField reUserPinP2;
    private javax.swing.JToggleButton resetPinGPB2;
    private javax.swing.JToggleButton submitGPB1;
    private javax.swing.JPasswordField userPinP1;
    // End of variables declaration//GEN-END:variables
}
