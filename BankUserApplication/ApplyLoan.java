package BankUserApplication;

import static java.awt.Color.green;
import static java.awt.Color.red;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class ApplyLoan extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    String year,loanType,loanDetails;
    int cust_id,IMPI,loanAmount,perMonth,monthInterestRate,loanEMI,eligibility,salaryStatus,salaryOfMonth,annualSalary;
    
    java.util.Date date = new java.util.Date();
    java.sql.Date loanRegDate = new java.sql.Date(date.getTime());
    
    public ApplyLoan(Connection con,int cust_id,int IMPI) 
    {
        this.con=con;
        this.cust_id=cust_id;
        this.IMPI=IMPI;
        
        initComponents();
        
        passCust_ID.setText(""+cust_id);
        passCust_ID.setEditable(false);
        loanApplyBtn3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        passCust_ID = new javax.swing.JTextField();
        LoanDetailsList = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loanTypeCB1 = new javax.swing.JComboBox<>();
        loanAmountT1 = new javax.swing.JTextField();
        loanDurationCB1 = new javax.swing.JComboBox<>();
        loanEMI_L1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loanAmountL1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanDetailsTXT1 = new javax.swing.JTextArea();
        errorHomeLoanL2 = new javax.swing.JLabel();
        loanCheckBtn1 = new javax.swing.JButton();
        loanApplyBtn3 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        menuBtn2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        passCust_ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        LoanDetailsList.setBackground(new java.awt.Color(204, 204, 0));
        LoanDetailsList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoanDetailsList.setForeground(new java.awt.Color(255, 102, 0));
        LoanDetailsList.setText("Details");
        LoanDetailsList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoanDetailsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanDetailsListActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Loan Type     :");

        loanTypeCB1.setBackground(new java.awt.Color(255, 153, 153));
        loanTypeCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home Loan", "Education Loan", "Personal Loan", " " }));

        loanAmountT1.setBackground(new java.awt.Color(153, 204, 255));
        loanAmountT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loanAmountT1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loanAmountT1FocusLost(evt);
            }
        });
        loanAmountT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loanAmountT1KeyPressed(evt);
            }
        });

        loanDurationCB1.setBackground(new java.awt.Color(255, 153, 153));
        loanDurationCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One Year", "Two Year", "Three Year", " " }));

        loanEMI_L1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("EMI                :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Duration        :");

        loanAmountL1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loanAmountL1.setText("Amount         :");

        loanDetailsTXT1.setBackground(new java.awt.Color(153, 204, 255));
        loanDetailsTXT1.setColumns(20);
        loanDetailsTXT1.setRows(5);
        loanDetailsTXT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loanDetailsTXT1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(loanDetailsTXT1);

        loanCheckBtn1.setBackground(new java.awt.Color(204, 204, 0));
        loanCheckBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loanCheckBtn1.setForeground(new java.awt.Color(255, 102, 0));
        loanCheckBtn1.setText("Check");
        loanCheckBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loanCheckBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanCheckBtn1ActionPerformed(evt);
            }
        });

        loanApplyBtn3.setBackground(new java.awt.Color(204, 204, 0));
        loanApplyBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loanApplyBtn3.setForeground(new java.awt.Color(0, 153, 153));
        loanApplyBtn3.setText("Apply");
        loanApplyBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loanApplyBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanApplyBtn3ActionPerformed(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoanDetailsList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(loanTypeCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loanAmountL1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loanDurationCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loanAmountT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loanEMI_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(menuBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(loanApplyBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(loanCheckBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(errorHomeLoanL2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoanDetailsList)
                    .addComponent(passCust_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(loanTypeCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanAmountL1)
                    .addComponent(loanAmountT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loanDurationCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loanEMI_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(loanCheckBtn1)
                .addGap(18, 18, 18)
                .addComponent(errorHomeLoanL2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuBtn2)
                    .addComponent(loanApplyBtn3))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apply Loan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(260, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void menuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtn2ActionPerformed
        passCust_ID.getText();
        BankMenu bm = new BankMenu(con,cust_id,IMPI);
        bm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBtn2ActionPerformed

    private void loanCheckBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanCheckBtn1ActionPerformed
        
        loanAmount=Integer.parseInt(loanAmountT1.getText());
        year=(String) loanDurationCB1.getSelectedItem();
        loanType=(String) loanTypeCB1.getSelectedItem();
        
        if(year.equals("One Year"))
        {
            monthInterestRate= (int) (loanAmount*(0.01));
            perMonth=loanAmount/12;
            loanEMI=perMonth+monthInterestRate;
            loanEMI_L1.setText(""+loanEMI);
        }
        else if(year.equals("Two Year"))
        {
            monthInterestRate= (int) (loanAmount*(0.02));
            perMonth=loanAmount/24;
            loanEMI=perMonth+monthInterestRate;
            loanEMI_L1.setText(""+loanEMI);
        }
        else if(year.equals("Three Year"))
        {
            monthInterestRate= (int) (loanAmount*(0.03));
            perMonth=loanAmount/36;
            loanEMI=perMonth+monthInterestRate;
            loanEMI_L1.setText(""+loanEMI);
        }
//        errorHomeLoanL2.setText(""+cust_id);
    }//GEN-LAST:event_loanCheckBtn1ActionPerformed

    private void loanApplyBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanApplyBtn3ActionPerformed
        
        loanAmount=Integer.parseInt(loanAmountT1.getText());
        year=(String) loanDurationCB1.getSelectedItem();
        loanType=(String) loanTypeCB1.getSelectedItem();
        loanDetails=loanDetailsTXT1.getText();
           
        cust_id=Integer.parseInt(passCust_ID.getText());
        loanEMI=Integer.parseInt(loanEMI_L1.getText());
        
        try
        {
            ps=con.prepareStatement("select * from customer where cust_id='"+cust_id+"'");
            rs=ps.executeQuery();
            if(rs.next())
            {
//                annualSalary=rs.getInt(16);
//                salaryOfMonth=annualSalary/12;
//                salaryStatus=(int)(0.75*salaryOfMonth);
//                if(loanEMI>=salaryStatus)
//                salaryStatus=loanAmount/12;
                if(rs.getInt(16)>=loanEMI)
                {
                    ps=con.prepareStatement("insert into loan(cust_id,LoanType,loanAmount,durationYear,LoanRegDate,EMI,loanDetails) values(?,?,?,?,?,?,?)");
                    ps.setInt(1, cust_id);
                    ps.setString(2, loanType);
                    ps.setInt(3, loanAmount);
                    ps.setString(4, year);
                    ps.setDate(5,loanRegDate);
                    ps.setInt(6, loanEMI);
                    ps.setString(7, loanDetails);
                    
                    int i=ps.executeUpdate();
                    if(i!=0)
                    {
                        ps=con.prepareStatement("update account set balance='"+loanEMI_L1.getText()+"' where cust_id='"+cust_id+"'");
                        
                        rs=ps.executeQuery();
                        if(rs.next())
                        {
                            JOptionPane.showMessageDialog(this,"Successful");
                        }    
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"try again....");
                    }    
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"not eligible for loan ....");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"....");
            }    
        }
        catch(Exception e)
        {
            errorHomeLoanL2.setText("Loan Insert :"+e);
        }
    }//GEN-LAST:event_loanApplyBtn3ActionPerformed

    private void loanAmountT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loanAmountT1FocusGained
        loanAmountT1.setBorder(BorderFactory.createLineBorder(null, 2));
    }//GEN-LAST:event_loanAmountT1FocusGained

    private void loanAmountT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loanAmountT1KeyPressed
        if(Character.isLetter(evt.getKeyChar()))
        {
            loanAmountT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Only numbers are allowed");
            loanAmountT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        } 
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            loanAmountT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            loanAmountT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }
        else if(Character.isDigit(evt.getKeyChar()))
        {
            loanAmountT1.setEditable(true);
            loanAmountT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        }
    }//GEN-LAST:event_loanAmountT1KeyPressed

    private void loanAmountT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loanAmountT1FocusLost
        loanAmountT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_loanAmountT1FocusLost

    private void loanDetailsTXT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loanDetailsTXT1FocusLost
        if(loanDetailsTXT1.getText().equals(null))
        {
            loanApplyBtn3.setEnabled(false);
        }   
        else
        {
            loanApplyBtn3.setEnabled(true);
        }
    }//GEN-LAST:event_loanDetailsTXT1FocusLost

    private void LoanDetailsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanDetailsListActionPerformed
        LoanDetails ld = new LoanDetails(con,cust_id,IMPI);
        ld.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoanDetailsListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoanDetailsList;
    private javax.swing.JLabel errorHomeLoanL2;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loanAmountL1;
    private javax.swing.JTextField loanAmountT1;
    private javax.swing.JButton loanApplyBtn3;
    private javax.swing.JButton loanCheckBtn1;
    private javax.swing.JTextArea loanDetailsTXT1;
    private javax.swing.JComboBox<String> loanDurationCB1;
    private javax.swing.JLabel loanEMI_L1;
    private javax.swing.JComboBox<String> loanTypeCB1;
    private javax.swing.JButton menuBtn2;
    private javax.swing.JTextField passCust_ID;
    // End of variables declaration//GEN-END:variables
}
