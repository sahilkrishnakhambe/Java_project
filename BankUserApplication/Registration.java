package BankUserApplication;

import java.awt.Color;
import static java.awt.Color.*;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Registration extends javax.swing.JFrame 
{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    String firstName,middleName,lastName,email,contact,gender,country,state,city,pan,aadhar,ac_type,branch,checkPan,checkAadhar,profile="Image",panPath,aadharPath;
    String fNameE,mNameE,lNameE,ageE,emailE,contactE,annualSalaryE,dobE,genderE,countryE,stateE,cityE,panE,aadharE,ac_typeE,branchE,checkPanE,checkAadharE,profileE,panPathE,aadharPathE;   
    int cust_id,IMPI,ac_no,age,status,cust_id_status1,annualSalary,i,resultYear,CountError=0; 
    
    java.util.Date date = new java.util.Date();
    java.sql.Date RegDate = new java.sql.Date(date.getTime());
    java.sql.Date newAcDate = new java.sql.Date(date.getTime());
    LocalDate ld = LocalDate.now();
            
    public Registration(Connection con) 
    {
        this.con = con;
        
        initComponents();
        
        panPathT2.setEnabled(false);
        panUploadB1.setEnabled(false);
        
        aadhaarPathT2.setEnabled(false);
        aadharUploadB2.setEnabled(false);
        
        submitResgistrationB3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        registrationTitleL1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        profileCNAL1 = new javax.swing.JLabel();
        annualSalaryT6 = new javax.swing.JTextField();
        lnameL5 = new javax.swing.JLabel();
        contactL7 = new javax.swing.JLabel();
        DOB_D1 = new com.toedter.calendar.JDateChooser();
        checkAge = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        AgeT1 = new javax.swing.JTextField();
        emailT4 = new javax.swing.JTextField();
        contactT5 = new javax.swing.JTextField();
        fnameL2 = new javax.swing.JLabel();
        mnameL3 = new javax.swing.JLabel();
        lnameL4 = new javax.swing.JLabel();
        dobL5 = new javax.swing.JLabel();
        fnameT1 = new javax.swing.JTextField();
        mnameT2 = new javax.swing.JTextField();
        lnameT3 = new javax.swing.JTextField();
        GenderL13 = new javax.swing.JLabel();
        MaleRadioButton1 = new javax.swing.JRadioButton();
        FemaleRadioButton2 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        emailL6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cityT3 = new javax.swing.JComboBox<>();
        cityL12 = new javax.swing.JLabel();
        stateT2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        stateL11 = new javax.swing.JLabel();
        countryT1 = new javax.swing.JComboBox<>();
        countryL10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panPathT2 = new javax.swing.JTextField();
        aadhaarPathT2 = new javax.swing.JTextField();
        aadhaarT2 = new javax.swing.JTextField();
        panL8 = new javax.swing.JLabel();
        aadhaarL9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panT1 = new javax.swing.JTextField();
        aadharCheckBox2 = new javax.swing.JCheckBox();
        panCheckBox1 = new javax.swing.JCheckBox();
        panUploadB1 = new javax.swing.JButton();
        aadharUploadB2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        savingAC1 = new javax.swing.JRadioButton();
        currentAC2 = new javax.swing.JRadioButton();
        branchT1 = new javax.swing.JTextField();
        aadhaarL10 = new javax.swing.JLabel();
        newAcNoT4 = new javax.swing.JTextField();
        backToLoginB1 = new javax.swing.JButton();
        resetRegistrationB2 = new javax.swing.JButton();
        submitResgistrationB3 = new javax.swing.JButton();
        RegistrationErrorL4 = new javax.swing.JLabel();
        generateCustIDB2 = new javax.swing.JButton();
        cust_idT5 = new javax.swing.JTextField();
        conformjCheckBox = new javax.swing.JCheckBox();
        generateAcNoB2 = new javax.swing.JToggleButton();
        ExitBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        registrationTitleL1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        registrationTitleL1.setForeground(new java.awt.Color(255, 255, 255));
        registrationTitleL1.setText("REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(registrationTitleL1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(registrationTitleL1)
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        profileCNAL1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        profileCNAL1.setText("          Profile");
        profileCNAL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        annualSalaryT6.setBackground(new java.awt.Color(153, 204, 255));
        annualSalaryT6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                annualSalaryT6FocusLost(evt);
            }
        });
        annualSalaryT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                annualSalaryT6KeyPressed(evt);
            }
        });

        lnameL5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnameL5.setText("Annual Salary");

        contactL7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contactL7.setText("Contact");

        DOB_D1.setBackground(new java.awt.Color(153, 204, 255));
        DOB_D1.setDateFormatString("dd/MM/yyyy");

        checkAge.setBackground(new java.awt.Color(255, 153, 0));
        checkAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkAge.setText("Check Age");
        checkAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAgeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Self Details");

        AgeT1.setBackground(new java.awt.Color(153, 204, 255));
        AgeT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AgeT1FocusLost(evt);
            }
        });

        emailT4.setBackground(new java.awt.Color(153, 204, 255));
        emailT4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailT4FocusLost(evt);
            }
        });

        contactT5.setBackground(new java.awt.Color(153, 204, 255));
        contactT5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactT5FocusLost(evt);
            }
        });
        contactT5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactT5KeyPressed(evt);
            }
        });

        fnameL2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnameL2.setText("First Name");

        mnameL3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnameL3.setText("Middle Name");

        lnameL4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnameL4.setText("Last  Name");

        dobL5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dobL5.setText("Date of Birth");

        fnameT1.setBackground(new java.awt.Color(153, 204, 255));
        fnameT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameT1FocusLost(evt);
            }
        });
        fnameT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameT1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameT1KeyReleased(evt);
            }
        });

        mnameT2.setBackground(new java.awt.Color(153, 204, 255));
        mnameT2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mnameT2FocusLost(evt);
            }
        });
        mnameT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnameT2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mnameT2KeyReleased(evt);
            }
        });

        lnameT3.setBackground(new java.awt.Color(153, 204, 255));
        lnameT3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameT3FocusLost(evt);
            }
        });
        lnameT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameT3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameT3KeyReleased(evt);
            }
        });

        GenderL13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GenderL13.setText("Gender");

        MaleRadioButton1.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(MaleRadioButton1);
        MaleRadioButton1.setText("Male");
        MaleRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButton1ActionPerformed(evt);
            }
        });

        FemaleRadioButton2.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(FemaleRadioButton2);
        FemaleRadioButton2.setText("Female");
        FemaleRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButton2ActionPerformed(evt);
            }
        });

        emailL6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailL6.setText("Email");

        cityT3.setBackground(new java.awt.Color(255, 153, 153));
        cityT3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City", "Thane", "Mumbai", "Pune", "Kalyan", "Vashi", "Ahmedabad", "Surat", "Vadodara", "Kochi", "Kollam", "Thrissur" }));
        cityT3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cityL12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cityL12.setText("City");

        stateT2.setBackground(new java.awt.Color(255, 153, 153));
        stateT2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State", "Maharashtra", "Gujarat", "Kerala" }));
        stateT2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateT2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Address Details");

        stateL11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stateL11.setText("State");

        countryT1.setBackground(new java.awt.Color(255, 153, 153));
        countryT1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country", "India", " " }));
        countryT1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countryT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryT1ActionPerformed(evt);
            }
        });

        countryL10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        countryL10.setText("Country");

        panPathT2.setBackground(new java.awt.Color(153, 204, 255));

        aadhaarPathT2.setBackground(new java.awt.Color(153, 204, 255));

        aadhaarT2.setBackground(new java.awt.Color(153, 204, 255));
        aadhaarT2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aadhaarT2FocusLost(evt);
            }
        });
        aadhaarT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aadhaarT2KeyPressed(evt);
            }
        });

        panL8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panL8.setText("PAN No.");

        aadhaarL9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aadhaarL9.setText("Aadhaar No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Proof Details");

        panT1.setBackground(new java.awt.Color(153, 204, 255));
        panT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panT1FocusLost(evt);
            }
        });
        panT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panT1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panT1KeyReleased(evt);
            }
        });

        aadharCheckBox2.setBackground(new java.awt.Color(255, 153, 153));
        aadharCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aadharCheckBox2.setText("       Aadhar Card");
        aadharCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharCheckBox2ActionPerformed(evt);
            }
        });

        panCheckBox1.setBackground(new java.awt.Color(255, 153, 153));
        panCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panCheckBox1.setText("     PAN Card");
        panCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panCheckBox1ActionPerformed(evt);
            }
        });

        panUploadB1.setBackground(new java.awt.Color(255, 153, 0));
        panUploadB1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panUploadB1.setText("Upload PAN Card");
        panUploadB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panUploadB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panUploadB1ActionPerformed(evt);
            }
        });

        aadharUploadB2.setBackground(new java.awt.Color(255, 153, 0));
        aadharUploadB2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aadharUploadB2.setText("Upload Aadhar Card");
        aadharUploadB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aadharUploadB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharUploadB2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Account Type");

        savingAC1.setBackground(new java.awt.Color(255, 153, 153));
        savingAC1.setText("Saving Ac");
        savingAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingAC1ActionPerformed(evt);
            }
        });

        currentAC2.setBackground(new java.awt.Color(255, 153, 153));
        currentAC2.setText("Current Ac");
        currentAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentAC2ActionPerformed(evt);
            }
        });

        branchT1.setBackground(new java.awt.Color(153, 204, 255));
        branchT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                branchT1FocusLost(evt);
            }
        });
        branchT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                branchT1KeyPressed(evt);
            }
        });

        aadhaarL10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aadhaarL10.setText("Branch");

        newAcNoT4.setBackground(new java.awt.Color(153, 204, 255));

        backToLoginB1.setBackground(new java.awt.Color(204, 204, 0));
        backToLoginB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backToLoginB1.setForeground(new java.awt.Color(0, 153, 51));
        backToLoginB1.setText("Login");
        backToLoginB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backToLoginB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginB1ActionPerformed(evt);
            }
        });

        resetRegistrationB2.setBackground(new java.awt.Color(204, 204, 0));
        resetRegistrationB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetRegistrationB2.setForeground(new java.awt.Color(255, 102, 0));
        resetRegistrationB2.setText("Reset");
        resetRegistrationB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetRegistrationB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetRegistrationB2ActionPerformed(evt);
            }
        });

        submitResgistrationB3.setBackground(new java.awt.Color(204, 204, 0));
        submitResgistrationB3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitResgistrationB3.setForeground(new java.awt.Color(0, 153, 153));
        submitResgistrationB3.setText("Submit");
        submitResgistrationB3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitResgistrationB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitResgistrationB3ActionPerformed(evt);
            }
        });

        generateCustIDB2.setBackground(new java.awt.Color(255, 153, 0));
        generateCustIDB2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        generateCustIDB2.setText("Click to Generate Cust ID");
        generateCustIDB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generateCustIDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCustIDB2ActionPerformed(evt);
            }
        });

        cust_idT5.setBackground(new java.awt.Color(153, 204, 255));

        conformjCheckBox.setBackground(new java.awt.Color(255, 51, 51));
        conformjCheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conformjCheckBox.setText("Conform");
        conformjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conformjCheckBoxActionPerformed(evt);
            }
        });

        generateAcNoB2.setBackground(new java.awt.Color(255, 153, 0));
        generateAcNoB2.setText("Click to Generate AC No.");
        generateAcNoB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generateAcNoB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAcNoB2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addComponent(jLabel1)
                .addGap(0, 507, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(backToLoginB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(resetRegistrationB2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(submitResgistrationB3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(ExitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobL5)
                            .addComponent(fnameL2)
                            .addComponent(emailL6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnameT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailT4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB_D1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(checkAge, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgeT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mnameL3)
                                    .addComponent(contactL7))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactT5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mnameT2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lnameL5)
                                    .addGap(31, 31, 31)
                                    .addComponent(annualSalaryT6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lnameL4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lnameT3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(GenderL13)
                                .addGap(72, 72, 72)
                                .addComponent(MaleRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FemaleRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(profileCNAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(aadhaarL9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aadhaarT2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(panL8)
                                    .addGap(54, 54, 54)
                                    .addComponent(panT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aadharCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panPathT2)
                                .addComponent(aadhaarPathT2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panUploadB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aadharUploadB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel4)
                                    .addGap(35, 35, 35)
                                    .addComponent(savingAC1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(currentAC2)
                                    .addGap(91, 91, 91)
                                    .addComponent(aadhaarL10)
                                    .addGap(59, 59, 59)
                                    .addComponent(branchT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RegistrationErrorL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(83, 83, 83)
                                                        .addComponent(countryT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(countryL10))
                                                .addGap(102, 102, 102)
                                                .addComponent(stateL11)
                                                .addGap(36, 36, 36)
                                                .addComponent(stateT2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(109, 109, 109)
                                        .addComponent(cityL12)
                                        .addGap(46, 46, 46)
                                        .addComponent(cityT3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(49, 49, 49)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(494, 494, 494))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(conformjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(476, 476, 476))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(generateCustIDB2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cust_idT5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateAcNoB2)
                .addGap(18, 18, 18)
                .addComponent(newAcNoT4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileCNAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fnameL2)
                        .addGap(61, 61, 61)
                        .addComponent(dobL5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lnameT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(annualSalaryT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameL5)))
                            .addComponent(lnameL4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaleRadioButton1)
                            .addComponent(FemaleRadioButton2)
                            .addComponent(GenderL13)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkAge)
                            .addComponent(AgeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fnameT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailL6))
                                .addGap(18, 18, 18)
                                .addComponent(DOB_D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(contactT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mnameT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mnameL3))
                                .addGap(18, 18, 18)
                                .addComponent(contactL7)))))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(countryL10)
                        .addComponent(countryT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stateL11)
                        .addComponent(cityL12)
                        .addComponent(stateT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cityT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panPathT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(aadhaarPathT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(4, 4, 4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(panCheckBox1)
                                    .addGap(16, 16, 16)
                                    .addComponent(aadharCheckBox2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(panT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panL8))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aadhaarT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aadhaarL9))))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panUploadB1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(aadharUploadB2)))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savingAC1)
                    .addComponent(currentAC2)
                    .addComponent(aadhaarL10)
                    .addComponent(branchT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conformjCheckBox)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateAcNoB2)
                    .addComponent(cust_idT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateCustIDB2)
                    .addComponent(newAcNoT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(RegistrationErrorL4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToLoginB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitResgistrationB3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetRegistrationB2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToLoginB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginB1ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backToLoginB1ActionPerformed

    private void resetRegistrationB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetRegistrationB2ActionPerformed
        fnameT1.setText(null); fnameT1.setBackground(white);
        mnameT2.setText(null); mnameT2.setBackground(white);
        lnameT3.setText(null); lnameT3.setBackground(white);
        emailT4.setText(null); emailT4.setBackground(white);
        contactT5.setText(null); contactT5.setBackground(white);
        countryT1.setSelectedItem(null); countryT1.setBackground(white);
        stateT2.setSelectedItem(null); stateT2.setBackground(white);
        cityT3.setSelectedItem(null); cityT3.setBackground(white);
        panT1.setText(null); panT1.setBackground(white);
        aadhaarT2.setText(null); aadhaarT2.setBackground(white);
        branchT1.setText(null);
    }//GEN-LAST:event_resetRegistrationB2ActionPerformed

    private void MaleRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButton1ActionPerformed
        gender=MaleRadioButton1.getText();
    }//GEN-LAST:event_MaleRadioButton1ActionPerformed

    private void FemaleRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButton2ActionPerformed
        gender=FemaleRadioButton2.getText();
    }//GEN-LAST:event_FemaleRadioButton2ActionPerformed

    private void savingAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingAC1ActionPerformed
        ac_type="Saving";
    }//GEN-LAST:event_savingAC1ActionPerformed

    private void currentAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentAC2ActionPerformed
        ac_type="Current";
    }//GEN-LAST:event_currentAC2ActionPerformed

    private void generateCustIDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCustIDB2ActionPerformed
        firstName=fnameT1.getText();
        middleName=mnameT2.getText();
        lastName=lnameT3.getText();

        try
        {
            ps=con.prepareStatement("select * from customer where cust_id=(select cust_id from customer where fname='"+firstName+"' and mname='"+middleName+"' and lname='"+lastName+"')");
            rs=ps.executeQuery();
            if(rs.next())
            {
                cust_id=rs.getInt(1); cust_id_status1=cust_id;

                cust_idT5.setText(""+cust_id);
            }
        }
        catch(Exception e)
        {
            RegistrationErrorL4.setText(""+e);
        }
    }//GEN-LAST:event_generateCustIDB2ActionPerformed
      
    private void generateAcNoB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateAcNoB2ActionPerformed

        try
        {
            ps=con.prepareStatement("select ac_no from CustomerNewAc where cust_id=(select cust_id from customer where fname='"+firstName+"' and mname='"+middleName+"' and lname='"+lastName+"')");
            rs=ps.executeQuery();

            if(rs.next())
            {
                newAcNoT4.setText(rs.getString(1));
                JOptionPane.showMessageDialog(this,"Account No. Generated Successfully...");   
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Request Faild... Try Again...");
            }
        }
        catch(Exception e)
        {
            RegistrationErrorL4.setText(""+e);
        }
    }//GEN-LAST:event_generateAcNoB2ActionPerformed

    private void countryT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryT1ActionPerformed
        try
        {
            if(countryT1.getSelectedItem().equals("Country"))
            {
                stateT2.removeAllItems();
                stateT2.addItem("State");
                stateT2.setSelectedItem(null);
            }
            else if(countryT1.getSelectedItem().equals("India"))
            {
                stateT2.removeAllItems();
                stateT2.addItem("Maharashtra");
                stateT2.addItem("Gujarat");
                stateT2.addItem("Kerala");
                stateT2.setSelectedItem(null);
            }
        }   
        catch(Exception e)
        {
            RegistrationErrorL4.setText(""+e);
        }    
    }//GEN-LAST:event_countryT1ActionPerformed

    private void stateT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateT2ActionPerformed
        try
        {
            if(stateT2.getSelectedItem().equals("State"))
            {
                cityT3.removeAllItems();
                cityT3.addItem("City");
                cityT3.setSelectedItem(null);
            }
            else if(stateT2.getSelectedItem().equals("Maharashtra"))
            {
                cityT3.removeAllItems();
                cityT3.addItem("Thane");
                cityT3.addItem("Mumbai");
                cityT3.addItem("Pune");
                cityT3.addItem("Kalyan");
                cityT3.addItem("Vashi");
                cityT3.setSelectedItem(null);
            }
            else if(stateT2.getSelectedItem().equals("Gujarat"))
            {
                cityT3.removeAllItems();
                cityT3.addItem("Ahmedabad");
                cityT3.addItem("Surat");
                cityT3.addItem("Vadodara");
                cityT3.setSelectedItem(null);
            }
            else if(stateT2.getSelectedItem().equals("Kerala"))
            {
                cityT3.removeAllItems();
                cityT3.addItem("Kochi");
                cityT3.addItem("Kollam");
                cityT3.addItem("Thrissur");
                cityT3.setSelectedItem(null);
            }
        }   
        catch(Exception e)
        {
            RegistrationErrorL4.setText(""+e);
        }
    }//GEN-LAST:event_stateT2ActionPerformed
    
    private void fnameT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameT1KeyReleased
        firstName=fnameT1.getText();
        firstName=firstName.toUpperCase();
        fnameT1.setText(firstName);
    }//GEN-LAST:event_fnameT1KeyReleased

    private void mnameT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnameT2KeyReleased
        middleName=mnameT2.getText();
        middleName=middleName.toUpperCase();
        mnameT2.setText(middleName);
    }//GEN-LAST:event_mnameT2KeyReleased

    private void lnameT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameT3KeyReleased
        lastName=lnameT3.getText();
        lastName=lastName.toUpperCase();
        lnameT3.setText(lastName);
    }//GEN-LAST:event_lnameT3KeyReleased

    private void panT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panT1KeyReleased
        pan=panT1.getText();
        pan=pan.toUpperCase();
        panT1.setText(pan);
    }//GEN-LAST:event_panT1KeyReleased

    private void fnameT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameT1KeyPressed
        if( Character.isWhitespace(evt.getKeyChar()))
        {
            fnameT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            fnameT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        } 
        else if(Character.isDigit(evt.getKeyChar()))
        {
            fnameT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Numbers not allowed");
            fnameT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }    
        else if(Character.isAlphabetic(evt.getKeyChar()))
        {
            fnameT1.setEditable(true);
            fnameT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        }  
    }//GEN-LAST:event_fnameT1KeyPressed

    private void mnameT2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnameT2KeyPressed
        if( Character.isWhitespace(evt.getKeyChar()))
        {
            mnameT2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            mnameT2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        } 
        else if(Character.isDigit(evt.getKeyChar()))
        {
            mnameT2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Numbers not allowed");
            mnameT2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }    
        else if(Character.isAlphabetic(evt.getKeyChar()))
        {
            mnameT2.setEditable(true);
            mnameT2.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        } 
    }//GEN-LAST:event_mnameT2KeyPressed

    private void lnameT3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameT3KeyPressed
        if( Character.isWhitespace(evt.getKeyChar()))
        {
            lnameT3.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            lnameT3.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        } 
        else if(Character.isDigit(evt.getKeyChar()))
        {
            lnameT3.setEditable(false);
            JOptionPane.showMessageDialog(this,"Numbers not allowed");
            lnameT3.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }    
        else if(Character.isAlphabetic(evt.getKeyChar()))
        {
            lnameT3.setEditable(true);
            lnameT3.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        } 
    }//GEN-LAST:event_lnameT3KeyPressed

    private void fnameT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameT1FocusLost
        fnameT1.setEditable(true);
        fnameT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_fnameT1FocusLost

    private void mnameT2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mnameT2FocusLost
        mnameT2.setEditable(true);
        mnameT2.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_mnameT2FocusLost

    private void lnameT3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameT3FocusLost
        lnameT3.setEditable(true);
        lnameT3.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_lnameT3FocusLost

    private void branchT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchT1KeyPressed
        if(Character.isAlphabetic(evt.getKeyChar()))
        {
            branchT1.setEditable(true);
            branchT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        }   
        else if( Character.isWhitespace(evt.getKeyChar()))
        {
            branchT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            branchT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }
        else if(Character.isDigit(evt.getKeyChar()))
        {
            branchT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Numbers not allowed");
            branchT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }
    }//GEN-LAST:event_branchT1KeyPressed

    private void contactT5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactT5KeyPressed
        if(Character.isLetter(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar()))
        {
            contactT5.setEditable(false);
            JOptionPane.showMessageDialog(this,"Letters not allowed");
            contactT5.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }   
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            contactT5.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            contactT5.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }   
        else if(Character.isDigit(evt.getKeyChar()))        
        {
            contactT5.setEditable(true);
            contactT5.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        }  
    }//GEN-LAST:event_contactT5KeyPressed

    private void contactT5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactT5FocusLost
        contactT5.setEditable(true);
        contactT5.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_contactT5FocusLost

    private void annualSalaryT6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_annualSalaryT6KeyPressed
        if(Character.isLetter(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar()))
        {
            annualSalaryT6.setEditable(false);
            JOptionPane.showMessageDialog(this,"Letters not allowed");
            annualSalaryT6.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }   
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            annualSalaryT6.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            annualSalaryT6.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }   
        else if(Character.isDigit(evt.getKeyChar()))        
        {
            annualSalaryT6.setEditable(true);
            annualSalaryT6.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        } 
    }//GEN-LAST:event_annualSalaryT6KeyPressed

    private void annualSalaryT6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_annualSalaryT6FocusLost
        annualSalaryT6.setEditable(true);
        annualSalaryT6.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_annualSalaryT6FocusLost

    private void panT1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panT1KeyPressed
        if( Character.isWhitespace(evt.getKeyChar()))
        {
            panT1.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            panT1.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }    
        else if(Character.isLetterOrDigit(evt.getKeyChar()))
        {
            panT1.setEditable(true);
            panT1.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        } 
    }//GEN-LAST:event_panT1KeyPressed

    private void panT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panT1FocusLost
        panT1.setEditable(true);
        panT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_panT1FocusLost

    private void aadhaarT2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhaarT2KeyPressed
        if(Character.isLetter(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar()))
        {
            aadhaarT2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Letters not allowed");
            aadhaarT2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }   
        else if(Character.isWhitespace(evt.getKeyChar()))
        {
            aadhaarT2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Space not allowed");
            aadhaarT2.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
        }   
        else if(Character.isDigit(evt.getKeyChar()))        
        {
            aadhaarT2.setEditable(true);
            aadhaarT2.setBorder(BorderFactory.createLineBorder(green, 2, rootPaneCheckingEnabled));
        }
    }//GEN-LAST:event_aadhaarT2KeyPressed

    private void aadhaarT2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhaarT2FocusLost
        aadhaarT2.setEditable(true);
        aadhaarT2.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_aadhaarT2FocusLost

    private void branchT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchT1FocusLost
        branchT1.setEditable(true);
        branchT1.setBorder(BorderFactory.createLineBorder(null));
    }//GEN-LAST:event_branchT1FocusLost

    private void emailT4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailT4FocusLost
            String PATTERN="^[a-zA-Z0-9]{0,20}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,10}$";
            Pattern ptn=Pattern.compile(PATTERN);
            Matcher match=ptn.matcher(emailT4.getText());
            if(!match.matches())
            {
                emailT4.setEditable(true);
                JOptionPane.showMessageDialog(this,"Not Valid...");
                emailT4.setBorder(BorderFactory.createLineBorder(red, 2, rootPaneCheckingEnabled));
            } 
            else
            {
                emailT4.setEditable(true);
                emailT4.setBorder(BorderFactory.createLineBorder(null));
            }    
    }//GEN-LAST:event_emailT4FocusLost

    private void checkAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAgeActionPerformed
        String dateofbirth = ((JTextField)DOB_D1.getDateEditor().getUiComponent()).getText();
        String dob[] = dateofbirth.split("/");
        int day = Integer.parseInt(dob[0]);
        int month = Integer.parseInt(dob[1]);
        int year = Integer.parseInt(dob[2]);
        LocalDate selectedDate = LocalDate.of(year,month,day);
        LocalDate currentDate = LocalDate.now();
        resultYear = Period.between(selectedDate, currentDate).getYears();
        AgeT1.setText(""+resultYear);
        
//        int resultMonth = Period.between(selectedDate, currentDate).getMonths();
//        int resultDay = Period.between(selectedDate, currentDate).getDays();
    }//GEN-LAST:event_checkAgeActionPerformed

    private void panUploadB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panUploadB1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File f = jfc.getSelectedFile();
        String path = f.getAbsolutePath();
        panPathT2.setText(path);
    }//GEN-LAST:event_panUploadB1ActionPerformed

    private void aadharUploadB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharUploadB2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File f = jfc.getSelectedFile();
        String path = f.getAbsolutePath();
        aadhaarPathT2.setText(path);
    }//GEN-LAST:event_aadharUploadB2ActionPerformed

    private void panCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panCheckBox1ActionPerformed
        if(panCheckBox1.isSelected())
        {
            panPathT2.setEnabled(true);
            panUploadB1.setEnabled(true);
        }
        else
        {
            panPathT2.setEnabled(false);
            panUploadB1.setEnabled(false);
        }    
    }//GEN-LAST:event_panCheckBox1ActionPerformed

    private void aadharCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharCheckBox2ActionPerformed
        
        if(aadharCheckBox2.isSelected())
        {
            aadhaarPathT2.setEnabled(true);
            aadharUploadB2.setEnabled(true);
        }
        else
        {
            aadhaarPathT2.setEnabled(false);
            aadharUploadB2.setEnabled(false);
        }
    }//GEN-LAST:event_aadharCheckBox2ActionPerformed

    private void AgeT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AgeT1FocusLost
        System.out.println(resultYear+"out");
        if(Integer.parseInt(AgeT1.getText()) != resultYear)
        {
            System.out.println(resultYear+"in");
            JOptionPane.showMessageDialog(this, "Your Age Not Valid, Check Your Age By Selecting 'Check Age' Option ");
        }   
        else if(Integer.parseInt(AgeT1.getText()) < 18)
        {
            JOptionPane.showMessageDialog(this, "Your Age not Should be Less than 18");
        }    
    }//GEN-LAST:event_AgeT1FocusLost

    
    ////////////////////////////////////| INSERT DATA INTO CUSTOMER TABLE |//////////////////////////////////////////////
    public void insertIntoCustomer()
    {
        try
        {   
            ps=con.prepareStatement("insert into customer (cust_id,fname,mname,lname,age,dob,email,contact,gender,country,state,city,pan,aadhar,reg_date,annualSalary) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, cust_id);
            ps.setString(2, firstName);
            ps.setString(3, middleName);
            ps.setString(4, lastName);
            ps.setInt(5, age);
            ps.setDate(6, new java.sql.Date(date.getTime()));
            ps.setString(7, email);
            ps.setString(8, contact);
            ps.setString(9, gender);
            ps.setString(10, country);
            ps.setString(11, state);
            ps.setString(12, city);
            ps.setString(13, pan);
            ps.setString(14, aadhar);
            ps.setDate(15, RegDate);
            ps.setInt(16, annualSalary);
            
            int i=ps.executeUpdate();
            if(i!=0)
            { 
                createNewAccount();
            }  
            else
            {
                RegistrationErrorL4.setText("Error in Customer Details...");
                JOptionPane.showMessageDialog(this,"...");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error = "+e);
        }
    } 
    
    ///////////////////////////////////////////| CREATE NEW ACCOUNT |//////////////////////////////////////////////////
    public void createNewAccount()
    {
        firstName=fnameT1.getText();
        middleName=mnameT2.getText();
        lastName=lnameT3.getText();

        try
        {
            ps=con.prepareStatement("select * from customer where cust_id=(select cust_id from customer where fname='"+firstName+"' and mname='"+middleName+"' and lname='"+lastName+"')");
            rs=ps.executeQuery();
            if(rs.next())
            {
                cust_id=rs.getInt(1); cust_id_status1=cust_id;
                email=emailT4.getText();
                contact=contactT5.getText();
                pan=panT1.getText();
                aadhar=aadhaarT2.getText();
                branch=branchT1.getText();
                checkPan=panCheckBox1.getText();
                checkAadhar=aadharCheckBox2.getText();
                if(panCheckBox1.isSelected())
                {
                    checkPan="Yes";
                }
                else
                {
                    checkPan="No";
                }

                if(aadharCheckBox2.isSelected())
                {
                    checkAadhar="Yes";
                }
                else
                {
                    checkAadhar="No";
                }

                if(savingAC1.isSelected())
                {
                    ac_type= "Saving";
                }
                else if(currentAC2.isSelected())
                {
                    ac_type="Current";
                }

                if(panCheckBox1.isSelected())
                {
                    panPath=panPathT2.getText();
                }
               
                if(aadharCheckBox2.isSelected())
                {
                    aadharPath=aadhaarPathT2.getText();
                }
                
                try
                {
                    ps=con.prepareStatement("insert into CustomerNewAc(ac_no,cust_id,fname,mname,lname,profile,email,contact,pan,aadhar,newAcDate,branch,check_pan,check_aadhar,ac_type,panPath,aadharPath) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    ps.setInt(1, ac_no);
                    ps.setInt(2, cust_id);
                    ps.setString(3, firstName);
                    ps.setString(4, middleName);
                    ps.setString(5, lastName);
                    ps.setString(6, profile);
                    ps.setString(7, email);
                    ps.setString(8, contact);
                    ps.setString(9, pan);
                    ps.setString(10, aadhar);
                    ps.setDate(11, newAcDate);
                    ps.setString(12, branch);
                    ps.setString(13, checkPan);
                    ps.setString(14, checkAadhar);
                    ps.setString(15, ac_type);
                    ps.setString(16, panPath);
                    ps.setString(17, aadharPath);

                    i=ps.executeUpdate();

                    if(i!=0)
                    {
                        submitResgistrationB3.setEnabled(true);
                        JOptionPane.showMessageDialog(this,"User Verified...Generate ('Cust ID','Ac No')");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Request Faild...");
                    }
                }
                catch(Exception e)
                {
                    RegistrationErrorL4.setText(""+e);
                }
            }
        }
        catch(Exception e)
        {
            RegistrationErrorL4.setText(""+e);
        }
    }
    
    ///////////////////////////////////////////| VALIDATION FIELDS |//////////////////////////////////////////////////
    public void validFields()
    {
        if(fnameT1.getText().length()<=0)
        {
            fnameT1.setBorder(BorderFactory.createLineBorder(orange,2));
            fNameE="'First Name'";
            status = 1;
            CountError++;
        }
        else
        {
            fNameE="";
            status = 0;
        }
        
        if(mnameT2.getText().length()<=0)
        {
            mnameT2.setBorder(BorderFactory.createLineBorder(orange,2));
            mNameE="'Middle Name'";
            status = 1;
            CountError++;
        }
        else
        {
            mNameE="";
            status = 0;
        }
        
        if(lnameT3.getText().length()<=0)
        {
            lnameT3.setBorder(BorderFactory.createLineBorder(orange,2));
            lNameE="'Last Name'";
            status = 1;
            CountError++;
        }
        else
        {
            lNameE="";
            status = 0;
        }
        
        if(emailT4.getText().length()<=0)
        {
            emailT4.setBorder(BorderFactory.createLineBorder(orange,2));
            emailE = "'Email'";
            status = 1;
            CountError++;
        }
        else
        {
            emailE = "";
            status = 0;
        }
        
        if(contactT5.getText().length()<=0)
        {
            contactT5.setBorder(BorderFactory.createLineBorder(orange,2));
            contactE="'Contact'";
            status = 1;
            CountError++;
        } 
        else
        {
            contactE="";
            status = 0;
        }
        
        if(annualSalaryT6.getText().length()<=0)
        {
            annualSalaryT6.setBorder(BorderFactory.createLineBorder(orange,2));
            annualSalaryE="'Annual Salary'";
            status = 1;
            CountError++;
        }
        else
        {
            annualSalaryE="";
            status = 0;
        }  
        
        if(DOB_D1.getDate().equals(null))
        {
            DOB_D1.setBorder(BorderFactory.createLineBorder(orange,2));
            dobE="'DOB'";
            status = 1;
            CountError++;
        }
        else
        {
            dobE="";
            status = 0;
        }
        
        if(AgeT1.getText().length()<=0)
        {
            AgeT1.setBorder(BorderFactory.createLineBorder(orange,2));
            ageE="'Age'";
            status = 1;  
            CountError++;
        }
        else
        {
            ageE="";
            status = 0;
        }
        
        if(MaleRadioButton1.isSelected())
        {
            genderE="";
            status = 0;
        }    
        else if(FemaleRadioButton2.isSelected())
        {
            genderE="";
            status = 0;
        }    
        else
        {
            MaleRadioButton1.setBorder(BorderFactory.createLineBorder(orange,2));
            FemaleRadioButton2.setBorder(BorderFactory.createLineBorder(orange,2));
            genderE="'Gender'";
            status = 1;
            CountError++;
        }
        
        if(countryT1.getSelectedItem().equals(null) || countryT1.getSelectedItem().equals("Country"))
        {
            countryT1.setBorder(BorderFactory.createLineBorder(orange,2));
            countryE="'Country'";
            status = 1;
            CountError++;
        }
        else
        {
            countryE="";
            status = 0;
        }
        
        if(stateT2.getSelectedItem().equals(null) || stateT2.getSelectedItem().equals("State"))
        {
            stateT2.setBorder(BorderFactory.createLineBorder(orange,2));
            stateE="'State'";
            status = 1;
            CountError++;
        }
        else
        {
            stateE="";
            status = 0;
        }
        
        if(cityT3.getSelectedItem().equals(null) || cityT3.getSelectedItem().equals("City"))
        {
            cityT3.setBorder(BorderFactory.createLineBorder(orange,2));
            cityE="'City'";
            status = 1;
            CountError++;
        }
        else
        {
            cityE="";
            status = 0;
        }
        
        if(panT1.getText().length()<=0)
        {
            panT1.setBorder(BorderFactory.createLineBorder(orange,2));
            panE="'Pan'";
            status = 1;
            CountError++;
        }
        else
        {
            panE="";
            status = 0;
        }
        
        if(aadhaarT2.getText().length()<=0)
        {
            aadhaarT2.setBorder(BorderFactory.createLineBorder(orange,2));
            aadharE="'Aadhar'";
            status = 1;
            CountError++;
        }
        else
        {
            aadharE="";
            status = 0;
        }
        
        if(panCheckBox1.isSelected() || !aadharCheckBox2.isSelected())
        {
            status = 0;
            if(panPathT2.getText().length()<=0)
            {
                panPathT2.setBorder(BorderFactory.createLineBorder(orange,2));
                panPathE="'PAN Upload'";
                status = 1;
                CountError++;
            }    
            else
            {
                panPathE="";
                status = 0;
            }    
        }    
        else if(!panCheckBox1.isSelected() || aadharCheckBox2.isSelected())
        {
            status = 0;
            if(aadhaarPathT2.getText().length()<=0)
            {
                aadhaarPathT2.setBorder(BorderFactory.createLineBorder(orange,2));
                aadharPathE="'Aadhar Upload'";
                status = 1;
                CountError++;
            }    
            else
            {
                aadharPathE="";
                status = 0;
            }
        }    
        else if(panCheckBox1.isSelected() || aadharCheckBox2.isSelected())
        {
            checkPanE="";
            checkAadharE="";
            status = 0;
        }
        else if(!panCheckBox1.isSelected() && !aadharCheckBox2.isSelected())
        {
            panCheckBox1.setBorder(BorderFactory.createLineBorder(orange,2));
            aadharCheckBox2.setBorder(BorderFactory.createLineBorder(orange,2));
            checkPanE="'PAN Check'";
            checkAadharE="'Aadhar Check'";
            status = 1;
            CountError++;
        }    
            
        if(savingAC1.isSelected())
        {
            ac_typeE="";
            status = 0;
        }    
        else if(currentAC2.isSelected())
        {
            ac_typeE="";
            status = 0;
        }    
        else
        {
            savingAC1.setBorder(BorderFactory.createLineBorder(orange,2));
            currentAC2.setBorder(BorderFactory.createLineBorder(orange,2));
            ac_typeE="'Ac Type'";
            status = 1;
            CountError++;
        }
        
        if(branchT1.getText().length()<=0)
        {
            branchT1.setBorder(BorderFactory.createLineBorder(orange,2));
            branchE="'Branch'";
            status = 1;
            CountError++;
        }   
        else
        {
            branchE="";
            status = 0;
        }   
        
        System.out.println("Start Validation");
        if(status > 0 )
        {
            System.out.println("Validation Error");
            JOptionPane.showMessageDialog(this,"Something happens wrong... "+CountError+"Places Invalid");
            JOptionPane.showMessageDialog(this, "Field not should be Empty...\n["+fNameE+","+mNameE+","+lNameE+","+emailE+","+contactE+","+annualSalaryE+","+dobE+","+ageE+","+genderE+","+countryE+","+stateE+","+cityE+","+panE+","+aadharE+","+checkPanE+","+panPathE+","+checkAadharE+","+aadharPathE+","+ac_typeE+","+branchE+"]");
        }    
        else if(status == 0)
        {
            insertIntoCustomer();
        } 
    }
    
    
    
    ///////////////////////////////////////////| CHECK VALIDATION |//////////////////////////////////////////////////
    private void conformjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conformjCheckBoxActionPerformed
        firstName=fnameT1.getText();    
        middleName=mnameT2.getText();
        lastName=lnameT3.getText();
        age=Integer.parseInt(AgeT1.getText());
        date=DOB_D1.getDate();
        email=emailT4.getText();
        contact=contactT5.getText();
        if(MaleRadioButton1.isSelected())
        {
            gender= "Male";
        }   
        else if(FemaleRadioButton2.isSelected())
        {    
            gender="Female";
        }  
         
        country=(String) countryT1.getSelectedItem();
        state=(String) stateT2.getSelectedItem();
        city=(String) cityT3.getSelectedItem();
        pan=panT1.getText();
        aadhar=aadhaarT2.getText();
        annualSalary=Integer.parseInt(annualSalaryT6.getText());
        
        validFields();
        
    }//GEN-LAST:event_conformjCheckBoxActionPerformed

    ///////////////////////////////////////////SUBMIT REGISTRATION//////////////////////////////////////////////////
    private void submitResgistrationB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitResgistrationB3ActionPerformed
          
        cust_idT5.getText();
        newAcNoT4.getText();

        try
        {
            ps=con.prepareStatement("select * from CustomerNewAc where cust_id='"+cust_idT5.getText()+"' and ac_no='"+newAcNoT4.getText()+"'");
            rs=ps.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"Registration Successful ....");
                GeneratePin gp= new GeneratePin(con,cust_id,IMPI);
                gp.setVisible(true);
                this.setVisible(false);
//                UserProfile up = new UserProfile(con,cust_id,IMPI);
//                up.setVisible(true);
//                this.setVisible(false);
            }    
        }
        catch(Exception e)
        {
            RegistrationErrorL4.setText(""+e);
        }

    }//GEN-LAST:event_submitResgistrationB3ActionPerformed

    private void ExitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtn2ActionPerformed
        LoginUserAc lua = new LoginUserAc(con);
        lua.setVisible(true);
        this.setVisible(false);
        //        System.exit(0);
    }//GEN-LAST:event_ExitBtn2ActionPerformed
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeT1;
    private com.toedter.calendar.JDateChooser DOB_D1;
    private javax.swing.JButton ExitBtn2;
    private javax.swing.JRadioButton FemaleRadioButton2;
    private javax.swing.JLabel GenderL13;
    private javax.swing.JRadioButton MaleRadioButton1;
    private javax.swing.JLabel RegistrationErrorL4;
    private javax.swing.JLabel aadhaarL10;
    private javax.swing.JLabel aadhaarL9;
    private javax.swing.JTextField aadhaarPathT2;
    private javax.swing.JTextField aadhaarT2;
    private javax.swing.JCheckBox aadharCheckBox2;
    private javax.swing.JButton aadharUploadB2;
    private javax.swing.JTextField annualSalaryT6;
    private javax.swing.JButton backToLoginB1;
    private javax.swing.JTextField branchT1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JToggleButton checkAge;
    private javax.swing.JLabel cityL12;
    private javax.swing.JComboBox<String> cityT3;
    private javax.swing.JCheckBox conformjCheckBox;
    private javax.swing.JLabel contactL7;
    private javax.swing.JTextField contactT5;
    private javax.swing.JLabel countryL10;
    private javax.swing.JComboBox<String> countryT1;
    private javax.swing.JRadioButton currentAC2;
    private javax.swing.JTextField cust_idT5;
    private javax.swing.JLabel dobL5;
    private javax.swing.JLabel emailL6;
    private javax.swing.JTextField emailT4;
    private javax.swing.JLabel fnameL2;
    private javax.swing.JTextField fnameT1;
    private javax.swing.JToggleButton generateAcNoB2;
    private javax.swing.JButton generateCustIDB2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lnameL4;
    private javax.swing.JLabel lnameL5;
    private javax.swing.JTextField lnameT3;
    private javax.swing.JLabel mnameL3;
    private javax.swing.JTextField mnameT2;
    private javax.swing.JTextField newAcNoT4;
    private javax.swing.JCheckBox panCheckBox1;
    private javax.swing.JLabel panL8;
    private javax.swing.JTextField panPathT2;
    private javax.swing.JTextField panT1;
    private javax.swing.JButton panUploadB1;
    private javax.swing.JLabel profileCNAL1;
    private javax.swing.JLabel registrationTitleL1;
    private javax.swing.JButton resetRegistrationB2;
    private javax.swing.JRadioButton savingAC1;
    private javax.swing.JLabel stateL11;
    private javax.swing.JComboBox<String> stateT2;
    private javax.swing.JButton submitResgistrationB3;
    // End of variables declaration//GEN-END:variables
}
