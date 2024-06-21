package BankUserApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

public class CustBackupHistory extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int cust_id,IMPI,contact;
    String name,open_ac,feedback;
    
    java.util.Date date = new java.util.Date();
    java.sql.Date close_ac = new java.sql.Date(date.getTime());
    LocalDate ld = LocalDate.now();
    
    public CustBackupHistory(Connection con,int cust_id,int IMPI) 
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BackupCustTable = new javax.swing.JTable();
        showDetailsBtn1 = new javax.swing.JToggleButton();
        menuBtn2 = new javax.swing.JToggleButton();
        exitBtn3 = new javax.swing.JToggleButton();
        passCust_ID = new javax.swing.JTextField();
        errorDeleteAc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Backup History");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(464, 464, 464)
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

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        BackupCustTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cust_ID", "AC NO.", "Name", "Contact", "AC Type", "Balance", "Opened Ac", "Closed Ac", "Feedback"
            }
        ));
        jScrollPane1.setViewportView(BackupCustTable);
        if (BackupCustTable.getColumnModel().getColumnCount() > 0) {
            BackupCustTable.getColumnModel().getColumn(0).setHeaderValue("Cust_ID");
            BackupCustTable.getColumnModel().getColumn(1).setHeaderValue("AC NO.");
            BackupCustTable.getColumnModel().getColumn(2).setHeaderValue("Name");
            BackupCustTable.getColumnModel().getColumn(3).setHeaderValue("Contact");
            BackupCustTable.getColumnModel().getColumn(4).setHeaderValue("AC Type");
            BackupCustTable.getColumnModel().getColumn(5).setHeaderValue("Balance");
            BackupCustTable.getColumnModel().getColumn(6).setHeaderValue("Opened Ac");
            BackupCustTable.getColumnModel().getColumn(7).setHeaderValue("Closed Ac");
            BackupCustTable.getColumnModel().getColumn(8).setHeaderValue("Feedback");
        }

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

        passCust_ID.setBorder(null);

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
                        .addGap(415, 415, 415)
                        .addComponent(menuBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(exitBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorDeleteAc, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(showDetailsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showDetailsBtn1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorDeleteAc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuBtn2)
                    .addComponent(exitBtn3))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void showDetailsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsBtn1ActionPerformed
        try
        {  
            ps=con.prepareStatement("select * from cust_backup");
            rs=ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) BackupCustTable.getModel();

            int cols= rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0;i<cols;i++)
            {
                colName[i] = rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);

                String cust_id,ac_no,name,contact,ac_type,balance,open_ac,close_ac,feedback;

                while(rs.next())
                {
                    cust_id=String.valueOf(rs.getInt(1));
                    ac_no=String.valueOf(rs.getInt(2));
                    name=rs.getString(3);
                    contact=rs.getString(4);
                    ac_type=rs.getString(5);
                    balance=String.valueOf(rs.getInt(6));
                    open_ac=rs.getDate(7).toString();
                    close_ac=rs.getDate(8).toString();
                    feedback=rs.getString(9);

                    String[] row = {cust_id,ac_no,name,contact,ac_type,balance,open_ac,close_ac,feedback};
                    model.addRow(row);
                }      
            }    
        }
        catch(Exception e)
        {
            errorDeleteAc.setText(""+e);
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
    private javax.swing.JTable BackupCustTable;
    private javax.swing.JLabel errorDeleteAc;
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
