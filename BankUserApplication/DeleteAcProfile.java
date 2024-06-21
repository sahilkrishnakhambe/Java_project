package BankUserApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DeleteAcProfile extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int cust_id,ac_no,balance,IMPI,i;
    String name,contact,ac_type,open_ac,Feedback,TransactionTable;
    
    java.util.Date date = new java.util.Date();
    java.sql.Date close_ac = new java.sql.Date(date.getTime());
    LocalDate ld = LocalDate.now();
    
    public DeleteAcProfile(Connection con,int cust_id,int IMPI) 
    {
        this.con=con;
        this.cust_id=cust_id;
        this.IMPI=IMPI;
        
        initComponents();
        
        passCust_ID.setText(""+cust_id);
        passCust_ID.setEditable(false);
        TransactionTable ="Transaction"+cust_id ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        passCust_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custFeedback = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        exitBtn2 = new javax.swing.JButton();
        userProfile = new javax.swing.JButton();
        deleteProfile = new javax.swing.JToggleButton();
        errorDeleteAc = new javax.swing.JLabel();
        showbackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Delete AC Profile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        passCust_ID.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Whatever the reason, consider the decision carefully to ensure you’re making the right moves for your financial situation.");

        custFeedback.setColumns(20);
        custFeedback.setRows(5);
        jScrollPane1.setViewportView(custFeedback);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("I/We hereby request you to close my/our account with you as per following details:");

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

        userProfile.setBackground(new java.awt.Color(204, 204, 0));
        userProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userProfile.setForeground(new java.awt.Color(0, 153, 51));
        userProfile.setText("Profile");
        userProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileActionPerformed(evt);
            }
        });

        deleteProfile.setBackground(new java.awt.Color(204, 204, 0));
        deleteProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteProfile.setForeground(new java.awt.Color(0, 153, 153));
        deleteProfile.setText("Submit");
        deleteProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProfileActionPerformed(evt);
            }
        });

        showbackup.setBackground(new java.awt.Color(204, 204, 0));
        showbackup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showbackup.setForeground(new java.awt.Color(255, 102, 0));
        showbackup.setText("backop");
        showbackup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(userProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(deleteProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorDeleteAc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(errorDeleteAc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void exitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn2ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitBtn2ActionPerformed

    private void userProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileActionPerformed
        UserProfile up = new UserProfile(con,cust_id,IMPI);
        up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_userProfileActionPerformed

    private void deleteProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProfileActionPerformed
        if(custFeedback.getText().length()<=0)
        {
            JOptionPane.showMessageDialog(this,"fill the reason...");
        }    
        else
        {
            try
            {
                ps=con.prepareStatement("select * from customer where cust_id='"+cust_id+"'");
                rs=ps.executeQuery();
                if(rs.next())
                {
                    name=rs.getString(2)+" "+ rs.getString(3) +" "+rs.getString(4);
                    contact=rs.getString(8);
                    Feedback=custFeedback.getText();
                    
                    ps=con.prepareStatement("select * from account where cust_id='"+cust_id+"'");
                    rs=ps.executeQuery();
                    if(rs.next())
                    {
                        ac_no=rs.getInt(2);
                        ac_type=rs.getString(4);
                        open_ac=rs.getString(6);
                        balance=rs.getInt(5);
                        cust_id=rs.getInt(3);
                        
                        ps=con.prepareStatement("insert into cust_backup(cust_id,ac_no,name,contact,ac_type,balance,open_ac,close_ac,feedback) values(?,?,?,?,?,?,?,?,?)");
                        ps.setInt(1,cust_id);
                        ps.setInt(2,ac_no);
                        ps.setString(3,name);
                        ps.setString(4,contact);
                        ps.setString(5,ac_type);
                        ps.setInt(6,balance);
                        ps.setString(7,open_ac);
                        ps.setDate(8,close_ac);
                        ps.setString(9,Feedback);
                        
                        i = ps.executeUpdate();
                        if(i!=0)
                        {
                            ps=con.prepareStatement("delete from customer where cust_id='"+cust_id+"'");
                            System.out.println(""+cust_id);
                            i = ps.executeUpdate();
                            if(i!=0)
                            {   
                                ps=con.prepareStatement("drop table '"+TransactionTable+"'");
                                System.out.println(""+cust_id);
                                i = ps.executeUpdate();
                                if(i!=0)
                                {
                                    JOptionPane.showMessageDialog(this,"Account has been Deleted Successfully...");
                                    LoginUserAc lua = new LoginUserAc(con);
                                    lua.setVisible(true);
                                    this.setVisible(false);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this,"Something Happened Wrong..., Please Try Again...");
                                }    
                            }   
                            else
                            {
                                JOptionPane.showMessageDialog(this,"Something Happened Wrong, Please Try Again...");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Backup Failed... Please Try Again...");
                        }
                    }    
                } 
            }
            catch(Exception e)
            {
                errorDeleteAc.setText("2Error = "+e);
            }    
        }    
    }//GEN-LAST:event_deleteProfileActionPerformed
     
    private void showbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbackupActionPerformed
        CustBackupHistory cbh = new CustBackupHistory(con,cust_id,IMPI);
        this.setVisible(false);
        cbh.setVisible(true);
    }//GEN-LAST:event_showbackupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea custFeedback;
    private javax.swing.JToggleButton deleteProfile;
    private javax.swing.JLabel errorDeleteAc;
    private javax.swing.JButton exitBtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passCust_ID;
    private javax.swing.JButton showbackup;
    private javax.swing.JButton userProfile;
    // End of variables declaration//GEN-END:variables
}
