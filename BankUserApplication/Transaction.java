package BankUserApplication;

import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Transaction extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int cust_id,IMPI,userAc_no,balance,total_balance,receiver_Id,current_balance,transfer_Amount,trans_id;
    String transfer_Method,trans_type,transaction_Id,TransactionTable;
    
    java.util.Date date = new java.util.Date();
    java.sql.Date Trans_Date = new java.sql.Date(date.getTime());
    LocalDate ld = LocalDate.now();
    
    public Transaction(Connection con,int cust_id,int IMPI) 
    {
        this.con=con;
        this.cust_id=cust_id;
        this.IMPI=IMPI;
        
        initComponents();
        passCust_ID.setText(""+cust_id);
        passCust_ID.setEditable(false);
        TransactionTable ="Transaction"+cust_id ;
        setUserAC_NO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ExitBtn2 = new javax.swing.JButton();
        sendB1 = new javax.swing.JToggleButton();
        errorTransactionL1 = new javax.swing.JLabel();
        menuBtn2 = new javax.swing.JToggleButton();
        TransMethodL2 = new javax.swing.JLabel();
        transferAmountT2 = new javax.swing.JTextField();
        transferIdT1 = new javax.swing.JTextField();
        TransMethodL1 = new javax.swing.JLabel();
        transaction_MethodCB1 = new javax.swing.JComboBox<>();
        userAc_noT3 = new javax.swing.JTextField();
        TransMethodL3 = new javax.swing.JLabel();
        passCust_ID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

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

        sendB1.setBackground(new java.awt.Color(204, 204, 0));
        sendB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sendB1.setForeground(new java.awt.Color(0, 153, 153));
        sendB1.setText("Send");
        sendB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendB1ActionPerformed(evt);
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

        TransMethodL2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TransMethodL2.setText("Amount  :");

        transferAmountT2.setBackground(new java.awt.Color(153, 204, 255));

        transferIdT1.setBackground(new java.awt.Color(153, 204, 255));
        transferIdT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transferIdT1KeyPressed(evt);
            }
        });

        TransMethodL1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        transaction_MethodCB1.setBackground(new java.awt.Color(255, 153, 153));
        transaction_MethodCB1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        transaction_MethodCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Method", "Bank Transfer", "Online", "Card", "UPI" }));
        transaction_MethodCB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transaction_MethodCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaction_MethodCB1CB1ActionPerformed(evt);
            }
        });

        userAc_noT3.setBackground(new java.awt.Color(153, 204, 255));

        TransMethodL3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TransMethodL3.setText("User Ac_no. :");

        passCust_ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(transaction_MethodCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TransMethodL3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userAc_noT3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(TransMethodL1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(transferIdT1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(TransMethodL2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(transferAmountT2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorTransactionL1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menuBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(sendB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(ExitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAc_noT3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransMethodL3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(transaction_MethodCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transferIdT1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransMethodL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransMethodL2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferAmountT2))
                .addGap(18, 18, 18)
                .addComponent(errorTransactionL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuBtn2)
                    .addComponent(sendB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn2))
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Transaction");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(279, 279, 279)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
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
    
    public void setUserAC_NO()
    {
        cust_id=Integer.parseInt(passCust_ID.getText());
        try
        {
            ps=con.prepareStatement("select * from customerNewAc where cust_id='"+cust_id+"' ");
            rs=ps.executeQuery();
            if(rs.next())
            {
                userAc_noT3.setText(""+rs.getInt(1));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "cust_id not match...");
            }
        }
        catch(Exception e)
        {
            errorTransactionL1.setText(""+e);
        }
    }        
    
    private void transaction_MethodCB1CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaction_MethodCB1CB1ActionPerformed
        transfer_Method=transaction_MethodCB1.getSelectedItem().toString();
        if(transfer_Method.equals("Bank Transfer"))
        {
            TransMethodL1.setText("Account No. :");
        }
        else if(transfer_Method.equals("Online"))
        {
            TransMethodL1.setText("Transaction id  :");
        }
        else if(transfer_Method.equals("Card"))
        {
            TransMethodL1.setText("Debit Card No. :");
        }
        else if(transfer_Method.equals("UPI"))
        {
            TransMethodL1.setText("UPI ID :");
        }
        else if(transfer_Method.equals("UPI"))
        {
            TransMethodL1.setText("Invalid Field");
        }
    }//GEN-LAST:event_transaction_MethodCB1CB1ActionPerformed

    private void sendB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendB1ActionPerformed
           
        userAc_no=Integer.parseInt(userAc_noT3.getText());
        transfer_Method=transaction_MethodCB1.getSelectedItem().toString();
        try
        {
//            ps=con.prepareStatement("show create table "+TransactionTable+"");
            ps=con.prepareStatement("select * from transaction where ac_no="+userAc_no+"");
//            ps=con.prepareStatement("select * from "+TransactionTable+"");
            rs=ps.executeQuery();
            if(rs.next())
            {
                insertionUpdate();
            }   
            else
            {
                System.out.println("newTransactionTable()");
                newTransactionTable();
            }    
        }   
        catch(Exception e)
        {
            errorTransactionL1.setText("Check Table :"+e);
        }    
    }//GEN-LAST:event_sendB1ActionPerformed

    public void insertionUpdate()
    {   
        userAc_no=Integer.parseInt(userAc_noT3.getText());
        try
        {    
            ps=con.prepareStatement("select * from account where ac_no="+userAc_no+"");
            rs=ps.executeQuery();
            if(rs.next())
            {
                cust_id=rs.getInt(3);
                balance=rs.getInt(5);
                trans_type=transfer_Method;
                receiver_Id=Integer.parseInt(transferIdT1.getText());
                transfer_Amount=Integer.parseInt(transferAmountT2.getText());
                total_balance=balance-transfer_Amount;
                current_balance=total_balance;
              
                System.out.println("In Btn "+TransactionTable);
                insertIntoTransaction();
//                insertIntoTransactionTable();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"This Account No not Available in Account Table...");
            }
        }
        catch(Exception e)
        {
            errorTransactionL1.setText("Check  : "+e);
        }    
    }    

    public void newTransactionTable()
    {
        try
        {   
            System.out.println("table : "+TransactionTable);
            ps=con.prepareStatement("create table "+TransactionTable+""
                + "("
                + "Trans_ID int,"
                + "ac_no int,"
                + "cust_id int,"
                + "trans_type varchar(20),"
                + "receiver_id varchar(20),"
                + "amount int,"
                + "total_balance int,"
                + "current_balance int,"
                + "trans_date date,"
                + "primary key(Trans_ID),"
                + "FOREIGN KEY (ac_no) REFERENCES customernewac(ac_no) on delete cascade on update cascade,"
                + "FOREIGN KEY (cust_id) REFERENCES customer(cust_id) on delete cascade on update cascade"
                + ")");
            int i=ps.executeUpdate();
            ps=con.prepareStatement("show create table "+TransactionTable+"");
            rs=ps.executeQuery();
            if(rs.next())
            {    
                insertionUpdate(); 
            }
            
        }
        catch(Exception e)
        {
            errorTransactionL1.setText("Check Transaction Table : "+e);
        }    
    }       
    
    public void insertIntoTransactionTable()
    {
        try
        {    
            ps=con.prepareStatement("SELECT * FROM transaction WHERE Trans_ID=(SELECT MAX(Trans_ID) FROM transaction)");
            rs=ps.executeQuery();
            if(rs.next())
            {   
                trans_id=rs.getInt(1);
                
                ps=con.prepareStatement("insert into "+TransactionTable+"(trans_id,ac_no,cust_id,trans_type,receiver_Id,amount,total_balance,current_balance,trans_date) values(?,?,?,?,?,?,?,?,?) ");
                ps.setInt(1, trans_id);
                ps.setInt(2, userAc_no);
                ps.setInt(3, cust_id);
                ps.setString(4, transfer_Method);
                ps.setInt(5, receiver_Id);
                ps.setInt(6, transfer_Amount);
                ps.setInt(7, total_balance);
                ps.setInt(8, current_balance);
                ps.setDate(9, Trans_Date);
                int i=ps.executeUpdate();
                if(i!=0)
                {
                    JOptionPane.showMessageDialog(this,"Successfully Transferred...");
                    ps=con.prepareStatement("update account set balance=? where ac_no='"+userAc_no+"' ");
                    ps.setInt(1, current_balance);
                    i=ps.executeUpdate();
                    if(i!=0)
                    {
                        JOptionPane.showMessageDialog(this,"Current Balance is '"+current_balance+"' Updated in Your Account");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Fail to Updates data... ");
                    }    
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Transaction Failed...");
                    userAc_noT3.setText(null);
                    transferIdT1.setText(null);
                    transferAmountT2.setText(null);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Transaction Failed,Last Entry not Found...");
            }    
        }
        catch(Exception e)
        {
            errorTransactionL1.setText("Error in insertion into the Table : "+e);
        }    
    } 
    
    public void insertIntoTransaction()
    {
        
        try
        {    
            ps=con.prepareStatement("insert into transaction (ac_no,cust_id,trans_type,receiver_id,amount,total_balance,current_balance,trans_date) values(?,?,?,?,?,?,?,?) ");
//            ps.setInt(1, trans_id);
            ps.setInt(1, userAc_no);
            ps.setInt(2, cust_id);
            ps.setString(3, transfer_Method);
            ps.setInt(4, receiver_Id);
            ps.setInt(5, transfer_Amount);
            ps.setInt(6, total_balance);
            ps.setInt(7, current_balance);
            ps.setDate(8, Trans_Date);
            int i=ps.executeUpdate();
            if(i!=0)
            {
                JOptionPane.showMessageDialog(this,"Successfully Transferred...");
                ps=con.prepareStatement("update account set balance=? where ac_no='"+userAc_no+"' ");
                ps.setInt(1, current_balance);
                i=ps.executeUpdate();
                if(i!=0)
                {
                    JOptionPane.showMessageDialog(this,"Current Balance is '"+current_balance+"' Updated in Your Account");
                    insertIntoTransactionTable();
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Fail to Updates data... ");
                }    
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Transaction Failed...");
                userAc_noT3.setText(null);
                transferIdT1.setText(null);
                transferAmountT2.setText(null);
            }
        }
        catch(Exception e)
        {
            errorTransactionL1.setText(":"+e);
            System.out.println(""+e);
//            errorTransactionL1.setText("Error in insertion into the Transaction Table : "+e);
        }    
    }        
            
    private void menuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtn2ActionPerformed
        passCust_ID.getText();
        BankMenu m = new BankMenu(con,cust_id,IMPI);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBtn2ActionPerformed

    private void ExitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtn2ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
//        System.exit(0);
    }//GEN-LAST:event_ExitBtn2ActionPerformed

    private void transferIdT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transferIdT1KeyPressed
    
        if(transaction_MethodCB1.equals("Bank Transfer"))
        {
            if(Character.isLetter(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar()))
            {
                transferIdT1.setEditable(false);
                JOptionPane.showMessageDialog(this,"Letters not allowed");
                transferIdT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            }   
            else if(Character.isWhitespace(evt.getKeyChar()))
            {
                transferIdT1.setEditable(false);
                JOptionPane.showMessageDialog(this,"Space not allowed");
                transferIdT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            }   
            else if(Character.isDigit(evt.getKeyChar()))        
            {
                transferIdT1.setEditable(true);
                transferIdT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            }
        }
        else if(transfer_Method.equals("Online"))
        {
            if( Character.isWhitespace(evt.getKeyChar()))
            {
                transferIdT1.setEditable(false);
                JOptionPane.showMessageDialog(this,"Space not allowed");
                transferIdT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            }    
            else if(Character.isLetterOrDigit(evt.getKeyChar()))
            {
                transferIdT1.setEditable(true);
                transferIdT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            } 
        }
        else if(transfer_Method.equals("Card"))
        {
            if(Character.isLetter(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar()))
            {
                transferIdT1.setEditable(false);
                JOptionPane.showMessageDialog(this,"Letters not allowed");
                transferIdT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            }   
            else if(Character.isWhitespace(evt.getKeyChar()))
            {
                transferIdT1.setEditable(false);
                JOptionPane.showMessageDialog(this,"Space not allowed");
                transferIdT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            }   
            else if(Character.isDigit(evt.getKeyChar()))        
            {
                transferIdT1.setEditable(true);
                transferIdT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            }
        }
        else if(transfer_Method.equals("UPI"))
        {
            if( Character.isWhitespace(evt.getKeyChar()))
            {
                transferIdT1.setEditable(false);
                JOptionPane.showMessageDialog(this,"Space not allowed");
                transferIdT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            }    
            else if(Character.isLetterOrDigit(evt.getKeyChar()))
            {
                transferIdT1.setEditable(true);
                transferIdT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
            } 
        }
        else if(transfer_Method.equals(""))
        {
            TransMethodL1.setText("Invalid Field");
        }
    }//GEN-LAST:event_transferIdT1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn2;
    private javax.swing.JLabel TransMethodL1;
    private javax.swing.JLabel TransMethodL2;
    private javax.swing.JLabel TransMethodL3;
    private javax.swing.JLabel errorTransactionL1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton menuBtn2;
    private javax.swing.JTextField passCust_ID;
    private javax.swing.JToggleButton sendB1;
    private javax.swing.JComboBox<String> transaction_MethodCB1;
    private javax.swing.JTextField transferAmountT2;
    private javax.swing.JTextField transferIdT1;
    private javax.swing.JTextField userAc_noT3;
    // End of variables declaration//GEN-END:variables

}
