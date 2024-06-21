package BankUserApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankMenu extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int cust_id;
    int IMPI;
    
    public BankMenu(Connection con,int cout_id,int IMPI) 
    {
        this.con=con;
        this.cust_id=cust_id;
        this.IMPI=IMPI;

        initComponents();
        showCust_ID();
        passCust_ID.setText(""+cust_id);
        passCust_ID.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ExitBtn2 = new javax.swing.JButton();
        LoginBtn1 = new javax.swing.JButton();
        applyLoanBtn5 = new javax.swing.JButton();
        userProfile = new javax.swing.JButton();
        showBalance = new javax.swing.JButton();
        transactionDetailsB2 = new javax.swing.JButton();
        moneyTransferB1 = new javax.swing.JButton();
        passCust_ID = new javax.swing.JTextField();
        ErrorBankMenuL1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        ExitBtn2.setBackground(new java.awt.Color(204, 204, 0));
        ExitBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitBtn2.setForeground(new java.awt.Color(204, 0, 0));
        ExitBtn2.setText("Exit");
        ExitBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtn2ActionPerformed(evt);
            }
        });

        LoginBtn1.setBackground(new java.awt.Color(204, 204, 0));
        LoginBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginBtn1.setForeground(new java.awt.Color(0, 153, 51));
        LoginBtn1.setText("Login");
        LoginBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtn1ActionPerformed(evt);
            }
        });

        applyLoanBtn5.setBackground(new java.awt.Color(255, 102, 102));
        applyLoanBtn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        applyLoanBtn5.setForeground(new java.awt.Color(255, 255, 255));
        applyLoanBtn5.setText("Apply Loan");
        applyLoanBtn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        applyLoanBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyLoanBtn5ActionPerformed(evt);
            }
        });

        userProfile.setBackground(new java.awt.Color(255, 102, 102));
        userProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userProfile.setForeground(new java.awt.Color(255, 255, 255));
        userProfile.setText("User Profile");
        userProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileActionPerformed(evt);
            }
        });

        showBalance.setBackground(new java.awt.Color(255, 102, 102));
        showBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showBalance.setForeground(new java.awt.Color(255, 255, 255));
        showBalance.setText("Show Balance");
        showBalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBalanceActionPerformed(evt);
            }
        });

        transactionDetailsB2.setBackground(new java.awt.Color(255, 102, 102));
        transactionDetailsB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transactionDetailsB2.setForeground(new java.awt.Color(255, 255, 255));
        transactionDetailsB2.setText("Transaction Details");
        transactionDetailsB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transactionDetailsB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionDetailsB2ActionPerformed(evt);
            }
        });

        moneyTransferB1.setBackground(new java.awt.Color(255, 102, 102));
        moneyTransferB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        moneyTransferB1.setForeground(new java.awt.Color(255, 255, 255));
        moneyTransferB1.setText("Money Transfer");
        moneyTransferB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moneyTransferB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyTransferB1ActionPerformed(evt);
            }
        });

        passCust_ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionDetailsB2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moneyTransferB1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(applyLoanBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LoginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(ExitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ErrorBankMenuL1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(moneyTransferB1)
                .addGap(18, 18, 18)
                .addComponent(transactionDetailsB2)
                .addGap(18, 18, 18)
                .addComponent(showBalance)
                .addGap(18, 18, 18)
                .addComponent(userProfile)
                .addGap(18, 18, 18)
                .addComponent(applyLoanBtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErrorBankMenuL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBtn1)
                    .addComponent(ExitBtn2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Bank Menu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showCust_ID()
    {
        try
        {
            ps=con.prepareStatement("select * from CustomerNewAC where cust_id=(select cust_id from account where impi_No='"+IMPI+"') ");
            rs=ps.executeQuery();
            if(rs.next())
            {
                cust_id=rs.getInt(2);
    
                passCust_ID.setText(""+cust_id);
            }    
        }
        catch(Exception e)
        {
            ErrorBankMenuL1.setText(""+e);
        } 
    }
    
    private void moneyTransferB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyTransferB1ActionPerformed
        passCust_ID.getText();
        Transaction t = new Transaction(con,cust_id,IMPI);
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_moneyTransferB1ActionPerformed

    private void transactionDetailsB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionDetailsB2ActionPerformed
        passCust_ID.getText();
        TransactionList tl = new TransactionList(con,cust_id,IMPI);
        tl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_transactionDetailsB2ActionPerformed

    private void showBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBalanceActionPerformed
        passCust_ID.getText();
        ViewBalance vb = new ViewBalance(con,cust_id,IMPI);
        vb.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_showBalanceActionPerformed

    private void ExitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtn2ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
//        System.exit(0);
    }//GEN-LAST:event_ExitBtn2ActionPerformed

    private void LoginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtn1ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginBtn1ActionPerformed

    private void applyLoanBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyLoanBtn5ActionPerformed
        passCust_ID.getText();
        ApplyLoan al = new ApplyLoan(con,cust_id,IMPI);
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_applyLoanBtn5ActionPerformed

    private void userProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileActionPerformed
        passCust_ID.getText();
        UserProfile up = new UserProfile(con,cust_id,IMPI);
        up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_userProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorBankMenuL1;
    private javax.swing.JButton ExitBtn2;
    private javax.swing.JButton LoginBtn1;
    private javax.swing.JButton applyLoanBtn5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton moneyTransferB1;
    private javax.swing.JTextField passCust_ID;
    private javax.swing.JButton showBalance;
    private javax.swing.JButton transactionDetailsB2;
    private javax.swing.JButton userProfile;
    // End of variables declaration//GEN-END:variables
}
