package BankUserApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

public class TransactionList extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int cust_id,IMPI; 
    String TransactionTable;
    public TransactionList(Connection con,int cust_id,int IMPI) 
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
        passCust_ID = new javax.swing.JTextField();
        showDetailsBtn1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionListTable = new javax.swing.JTable();
        erroeTransactionListL1 = new javax.swing.JLabel();
        exitBtn3 = new javax.swing.JToggleButton();
        menuBtn2 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        passCust_ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        showDetailsBtn1.setBackground(new java.awt.Color(204, 204, 0));
        showDetailsBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showDetailsBtn1.setForeground(new java.awt.Color(0, 153, 153));
        showDetailsBtn1.setText("Show");
        showDetailsBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showDetailsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsBtn1ActionPerformed(evt);
            }
        });

        TransactionListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "trans_id", "ac_no", "trans_type", "receiver_id", "amount", "total_balance", "current_balance", "trans_date"
            }
        ));
        jScrollPane1.setViewportView(TransactionListTable);

        exitBtn3.setBackground(new java.awt.Color(204, 204, 0));
        exitBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBtn3.setForeground(new java.awt.Color(204, 0, 0));
        exitBtn3.setText("Exit");
        exitBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtn3ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(menuBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211)
                .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(erroeTransactionListL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(showDetailsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(388, 388, 388))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(showDetailsBtn1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(erroeTransactionListL1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn3)
                    .addComponent(menuBtn2))
                .addGap(50, 50, 50))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Transaction List");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(291, 291, 291))
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
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showDetailsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsBtn1ActionPerformed
        try
        {
            ps=con.prepareStatement("select * from "+TransactionTable+"");
            rs=ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) TransactionListTable.getModel();
            
            int cols= rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0;i<cols;i++)
            {
                colName[i] = rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String trans_id,ac_no,cust_id,trans_type,receiver_id,amount,total_balance,current_balance,Trans_date;
                
                while(rs.next())
                {
                    trans_id=String.valueOf(rs.getInt(1));
                    ac_no=String.valueOf(rs.getInt(2));
                    cust_id=String.valueOf(rs.getInt(3));
                    trans_type=rs.getString(4);
                    receiver_id=rs.getString(5);
                    amount=String.valueOf(rs.getInt(6));
                    total_balance=String.valueOf(rs.getInt(7));
                    current_balance=String.valueOf(rs.getInt(8));
                    Trans_date=rs.getDate(9).toString();
                   
                    String[] row = {trans_id,ac_no,cust_id,trans_type,receiver_id,amount,total_balance,current_balance,Trans_date};
                    model.addRow(row);
                }    
            }    
        }
        catch(Exception e)
        {
            erroeTransactionListL1.setText(""+e);
        }    
    }//GEN-LAST:event_showDetailsBtn1ActionPerformed

    private void menuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtn2ActionPerformed
        passCust_ID.getText();
        BankMenu m = new BankMenu(con,cust_id,IMPI);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBtn2ActionPerformed

    private void exitBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn3ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
//        System.exit(0);
    }//GEN-LAST:event_exitBtn3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TransactionListTable;
    private javax.swing.JLabel erroeTransactionListL1;
    private javax.swing.JToggleButton exitBtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton menuBtn2;
    private javax.swing.JTextField passCust_ID;
    private javax.swing.JToggleButton showDetailsBtn1;
    // End of variables declaration//GEN-END:variables
}
