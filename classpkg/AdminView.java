package classpkg;
import dbpkg.JavaDbConnect;

import dbpkg.JavaDbConnect;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;
import net.proteanit.sql.DbUtils;
import static java.lang.String.format;


public class AdminView extends javax.swing.JFrame {

    private Connection connection = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private byte[] personImg=null;

    public AdminView() {
        initComponents();
        init();
        connection = JavaDbConnect.dbConnect();
        shwAllHoldersTable ();
        shwAllHoldersShortTable ();
        shwDueHoldersTable ();
        shwTaxPayersTable ();
        shwTaxRateShortTable ();
        shwTaxRateLongTable ();
       
 
    }

    public void init() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

    }

    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

                            
    private void initComponents() {
        
         
        this.setLayout(null);
        this.setSize(1132, 688);
        this.setTitle("AdminView");
        this.setVisible(true);

        
        jToolBar1 = new javax.swing.JToolBar();
        signOutBtn = new javax.swing.JButton();
        registerbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        showDuePayersTable = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showAllHoldersTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        duePayerTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taxPayerTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        rateLargeTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        searchtxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nidtxt = new javax.swing.JTextField();
        frstnametxt = new javax.swing.JTextField();
        lstnametxt = new javax.swing.JTextField();
        bloodtxt = new javax.swing.JTextField();
        catagorytxt = new javax.swing.JTextField();
        statustxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        codetext = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taxPayersShortTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        imagelabel = new javax.swing.JLabel();
        imagetxt = new javax.swing.JTextField();
        uploadbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ctgrytxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        codetxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ratetxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rangetxt = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        btmaddbtn = new javax.swing.JButton();
        btmeditbtn = new javax.swing.JButton();
        btmclearbtn = new javax.swing.JButton();
        btmdeletebtn = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taxratetable = new javax.swing.JTable();
        
        
  
 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tax_Payers_Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 153)));
        jPanel7.setLayout(null);

        searchtxt.setText("Search...");
        jPanel7.add(searchtxt);
        searchtxt.setBounds(12, 23, 118, 20);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222467_search.png")));
        jPanel7.add(jButton2);
        jButton2.setBounds(148, 23, 47, 20);

        addbtn.setBackground(new java.awt.Color(204, 204, 255));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222523_icon-person-add.png")));
        addbtn.setText("ADD");
        jPanel7.add(addbtn);
        addbtn.setBounds(42, 54, 135, 25);

        editbtn.setBackground(new java.awt.Color(204, 204, 255));
        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222606_edit-clear.png")));
        editbtn.setText("UPDATE");
        jPanel7.add(editbtn);
        editbtn.setBounds(42, 90, 135, 25);

        clearbtn.setBackground(new java.awt.Color(204, 204, 255));
        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222656_create.png")));
        clearbtn.setText("CLEAR");
        jPanel7.add(clearbtn);
        clearbtn.setBounds(42, 126, 135, 25);

        deletebtn.setBackground(new java.awt.Color(204, 204, 255));
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222571_delete.png")));
        deletebtn.setText("DELETE");
        jPanel7.add(deletebtn);
        deletebtn.setBounds(42, 162, 135, 25);

        this.add(jPanel7);
        jPanel7.setBounds(10, 54, 219, 209);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tax_Payers_Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 153)));
        jPanel8.setLayout(null);

        jLabel1.setText("Nid_Number");
        jPanel8.add(jLabel1);
        jLabel1.setBounds(16, 39, 78, 14);

        jLabel2.setText("First_name");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(16, 78, 78, 14);

        jLabel3.setText("Last_name");
        jPanel8.add(jLabel3);
        jLabel3.setBounds(16, 126, 78, 14);

        jLabel4.setText("Gender");
        jPanel8.add(jLabel4);
        jLabel4.setBounds(16, 166, 78, 14);

        jLabel5.setText("Blood");
        jPanel8.add(jLabel5);
        jLabel5.setBounds(244, 39, 78, 14);

        jLabel6.setText("Tax_Catagory");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(229, 78, 88, 14);

        jLabel7.setText("Tax_Status");
        jPanel8.add(jLabel7);
        jLabel7.setBounds(229, 126, 78, 14);
        jPanel8.add(nidtxt);
        nidtxt.setBounds(92, 36, 111, 20);
        jPanel8.add(frstnametxt);
        frstnametxt.setBounds(92, 75, 111, 20);
        jPanel8.add(lstnametxt);
        lstnametxt.setBounds(92, 123, 111, 20);
        jPanel8.add(bloodtxt);
        bloodtxt.setBounds(321, 36, 105, 20);
        jPanel8.add(catagorytxt);
        catagorytxt.setBounds(321, 75, 105, 20);
        jPanel8.add(statustxt);
        statustxt.setBounds(321, 123, 105, 20);

        gendertxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel8.add(gendertxt);
        gendertxt.setBounds(92, 163, 111, 20);

        jLabel8.setText("Catagory_code");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(229, 166, 88, 14);
        jPanel8.add(codetext);
        codetext.setBounds(321, 163, 105, 20);

        this.add(jPanel8);
        jPanel8.setBounds(235, 54, 453, 209);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(null);

        taxPayersShortTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
       
        jScrollPane2.setViewportView(taxPayersShortTable);

        jPanel9.add(jScrollPane2);
        jScrollPane2.setBounds(12, 13, 193, 183);

        this.add(jPanel9);
        jPanel9.setBounds(694, 54, 217, 209);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(null);

        jPanel14.setLayout(null);
        jPanel14.add(imagelabel);
        imagelabel.setBounds(24, 28,150, 173);

        jPanel10.add(jPanel14);
        jPanel14.setBounds(2, 2, 198, 238);
        jPanel10.add(imagetxt);
        imagetxt.setBounds(12, 251, 166, 20);

        uploadbtn.setBackground(new java.awt.Color(204, 204, 255));
        uploadbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492304064_misc-_paper_clip.png"))); // NOI18N
        uploadbtn.setText("Upload");
        jPanel10.add(uploadbtn);
        uploadbtn.setBounds(72, 282, 106, 25);

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492304144_save_floppy_disk.png"))); // NOI18N
        savebtn.setText("Save");
        jPanel10.add(savebtn);
        savebtn.setBounds(12, 325, 166, 25);

        this.add(jPanel10);
        jPanel10.setBounds(917, 54, 202, 437);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tax_Rate_Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 51, 153)));
        jPanel11.setLayout(null);

        jLabel9.setText("Tax_Catagory");
        jPanel11.add(jLabel9);
        jLabel9.setBounds(26, 44, 89, 14);
        jPanel11.add(ctgrytxt);
        ctgrytxt.setBounds(143, 41, 260, 20);

        jLabel10.setText("Catagory_Code");
        jPanel11.add(jLabel10);
        jLabel10.setBounds(26, 79, 89, 14);
        jPanel11.add(codetxt);
        codetxt.setBounds(143, 79, 260, 20);

        jLabel11.setText("Tax_Rate");
        jPanel11.add(jLabel11);
        jLabel11.setBounds(26, 154, 89, 14);
        jPanel11.add(ratetxt);
        ratetxt.setBounds(143, 151, 260, 20);

        jLabel12.setText("Salary_Range");
        jPanel11.add(jLabel12);
        jLabel12.setBounds(26, 119, 89, 14);
        jPanel11.add(rangetxt);
        rangetxt.setBounds(143, 117, 260, 20);

        this.add(jPanel11);
        jPanel11.setBounds(235, 274, 453, 205);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tax_Rate_Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 153)));
        jPanel12.setLayout(null);

        jTextField2.setText("Search...");
        jPanel12.add(jTextField2);
        jTextField2.setBounds(12, 33, 112, 25);

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222471_search.png")));
        jPanel12.add(jButton7);
        jButton7.setBounds(144, 33, 45, 25);

        btmaddbtn.setBackground(new java.awt.Color(204, 204, 255));
        btmaddbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222513_add.png")));
        btmaddbtn.setText("ADD");
        jPanel12.add(btmaddbtn);
        btmaddbtn.setBounds(43, 63, 126, 25);

        btmeditbtn.setBackground(new java.awt.Color(204, 204, 255));
        btmeditbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222608_edit-clear.png")));
        btmeditbtn.setText("UPDATE");
        jPanel12.add(btmeditbtn);
        btmeditbtn.setBounds(43, 104, 126, 25);

        btmclearbtn.setBackground(new java.awt.Color(204, 204, 255));
        btmclearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222664_ic_mode_edit_48px.png")));
        btmclearbtn.setText("CLEAR");
        jPanel12.add(btmclearbtn);
        btmclearbtn.setBounds(43, 140, 126, 25);

        btmdeletebtn.setBackground(new java.awt.Color(204, 204, 255));
        btmdeletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492222571_delete.png")));
        btmdeletebtn.setText("DELETE");
        jPanel12.add(btmdeletebtn);
        btmdeletebtn.setBounds(43, 176, 126, 23);

        this.add(jPanel12);
        jPanel12.setBounds(10, 274, 219, 217);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(null);

        taxratetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(taxratetable);

        jPanel13.add(jScrollPane5);
        jScrollPane5.setBounds(12, 13, 193, 191);

        this.add(jPanel13);
        jPanel13.setBounds(694, 274, 217, 217);
        
        
        jToolBar1.setRollover(true);
        this.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1129, 43);

        signOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1491267871_Cross.png"))); 
        signOutBtn.setText("Sign Out");
        signOutBtn.setFocusable(false);
        signOutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signOutBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(signOutBtn);

        registerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492132735_pdfs.png")));
        registerbtn.setText("Register");
        registerbtn.setFocusable(false);
        registerbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(registerbtn);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        showDuePayersTable.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(null);

        showAllHoldersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
       
        jScrollPane1.setViewportView(showAllHoldersTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(29, 11, 782, 112);

        showDuePayersTable.addTab("Tax Holders", jPanel2);

        jPanel3.setLayout(null);

        duePayerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(duePayerTable);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(35, 11, 644, 122);

        showDuePayersTable.addTab("Due Payers", jPanel3);

        jPanel4.setLayout(null);

        taxPayerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(taxPayerTable);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(35, 11, 644, 122);

        showDuePayersTable.addTab("Tax Payers", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);
        showDuePayersTable.addTab("Email", jPanel6);

        jPanel5.setLayout(null);

        rateLargeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
      
        jScrollPane6.setViewportView(rateLargeTable);

        jPanel5.add(jScrollPane6);
        jScrollPane6.setBounds(10, 11, 644, 122);

        showDuePayersTable.addTab("Tax-Rate", jPanel5);

        jPanel1.add(showDuePayersTable);
        showDuePayersTable.setBounds(0, 3, 1129, 180);

        this.add(jPanel1);
        jPanel1.setBounds(0, 497, 1129, 170);
        
        
        
            signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });
        
       

         registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
       
         
          showAllHoldersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAllHoldersTableMouseClicked(evt);
            }
        });
          
          
            rateLargeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rateLargeTableMouseClicked(evt);
            }
        });
            
            
            searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
            
            addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
            
             taxPayersShortTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taxPayersShortTableMouseClicked(evt);
            }
        });
             
             
             editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
             
             uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });
             
             deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
             
             clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
             
             savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
             
             
             jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
             
             btmaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmaddbtnActionPerformed(evt);
            }
        });
             
              btmeditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmeditbtnActionPerformed(evt);
            }
        });
              
              btmclearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmclearbtnActionPerformed(evt);
            }
        });
              
               btmdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmdeletebtnActionPerformed(evt);
            }
        });
             
               
               taxratetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taxratetableMouseClicked(evt);
            }
        });
               
          
    }
        
                       
    /* -----------SIGNOUT BUTTON-------------*/

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {

            close();
            LogIn obj = new LogIn();
            obj.setVisible(true);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        finally{
            
             try{
            rs.close();
            pst.close();
            connection.close();
            
            } catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }                                          

    
      /* ------------SHOWS SHORT TABLE VALUE IN THE TEXT FIELDS------------------- */
    
    
    private void taxPayersShortTableMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        
        try {
            int row=taxPayersShortTable.getSelectedRow();
            String tableClick=(taxPayersShortTable.getModel().getValueAt(row, 0).toString());
            String sql="Select * from Tax_Holders_info where Nid='"+tableClick+"' ";
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            
            if(rs.next()){
            
            nidtxt.setText(rs.getString("Nid"));
            frstnametxt.setText(rs.getString("First_name"));
            lstnametxt.setText(rs.getString("Last_name"));
            gendertxt.setSelectedItem(rs.getString("Gender"));
            bloodtxt.setText(rs.getString("Blood"));
            catagorytxt.setText(rs.getString("Tax_catagory"));
            statustxt.setText(rs.getString("Tax_status"));
            codetext.setText(rs.getString("Catagory_code"));
            
            byte[] imageData = rs.getBytes("Photo");
            ImageIcon format = new ImageIcon(ScaledImage(imageData, imagelabel.getWidth(), imagelabel.getHeight()));
            imagelabel.setIcon(format);
            
            }
          
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,ex);
        }
    }                                                

          /* ------------RESIZE THE IMAGE------------------- */
    
    

    private Image ScaledImage(byte[] img, int w, int h) {
        BufferedImage resizedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        try {
            Graphics2D g2 = resizedImage.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

            // convert byte array back to BufferedImage
            ByteArrayInputStream in = new ByteArrayInputStream(img);
            BufferedImage bImageFromConvert = ImageIO.read(in);

            g2.drawImage(bImageFromConvert, 0, 0, w, h, null);
            g2.dispose();
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(rootPane,ex);
        }
        return resizedImage;
    }
    
    /* ------------UPLOAD THE IMAGE------------------- */
    
    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileName = f.getAbsolutePath();
        imagetxt.setText(fileName);
        try {
            File fImg = new File(fileName);
            FileInputStream fIS = new FileInputStream(fImg);
            ByteArrayOutputStream bAOS = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fIS.read(buf)) != -1;) {
                bAOS.write(buf, 0, readNum);
            }
             personImg = bAOS.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }  
    
    
     private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
         try {
            String value1 = nidtxt.getText();
            String value2 = imagetxt.getText();
            String sql = "update Tax_Holders_info set Photo=? where Nid='" + value1 + "'  ";
            pst = connection.prepareStatement(sql);
            pst.setBytes(1, personImg);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Image Saved.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
         
    }        
    
    
    
    
    
    /* ------------SHOWS LONG TABLE VALUE IN THE TEXT FIELDS------------------- */
    
    private void showAllHoldersTableMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        
         try {
            int row=showAllHoldersTable.getSelectedRow();
            String tableClick=(showAllHoldersTable.getModel().getValueAt(row, 0).toString());
            String sql="Select * from Tax_Holders_info where Nid='"+tableClick+"' ";
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            
            if(rs.next()){
            
            nidtxt.setText(rs.getString("Nid"));
            frstnametxt.setText(rs.getString("First_name"));
            lstnametxt.setText(rs.getString("Last_name"));
            gendertxt.setSelectedItem(rs.getString("Gender"));
            bloodtxt.setText(rs.getString("Blood"));
            catagorytxt.setText(rs.getString("Tax_catagory"));
            statustxt.setText(rs.getString("Tax_status"));
            codetext.setText(rs.getString("Catagory_code"));
            
             byte[] imageData = rs.getBytes("Photo");
            ImageIcon format = new ImageIcon(ScaledImage(imageData, imagelabel.getWidth(), imagelabel.getHeight()));
            imagelabel.setIcon(format);
            
            }
          
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,ex);
        }
         
    }                                                

    /* ------------SHOWS TAX RATE SHORT TABLE IN THE TEXT FIELDS------------------- */
    
    
    private void taxratetableMouseClicked(java.awt.event.MouseEvent evt) {                                          
         try {
            int row=taxratetable.getSelectedRow();
            String tableClick=(taxratetable.getModel().getValueAt(row, 0).toString());
            String sql="Select * from Tax_rate where Catagory_Code='"+tableClick+"' ";
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            
            if(rs.next()){
            
            ctgrytxt.setText(rs.getString("Tax_Catagory"));           
            codetxt.setText(rs.getString("Catagory_Code"));       
            rangetxt.setText(rs.getString("Income_Range"));
            ratetxt.setText(rs.getString("Tax_Rate"));
            
            
            }
          
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,ex);
        }
         
    }                                         

       /* ------------SHOWS TAX RATE LONG TABLE IN THE TEXT FIELDS------------------- */
    
    private void rateLargeTableMouseClicked(java.awt.event.MouseEvent evt) {                                            
       try {
            int row=rateLargeTable.getSelectedRow();
            String tableClick=(rateLargeTable.getModel().getValueAt(row, 0).toString());
            String sql="Select * from Tax_rate where Catagory_Code='"+tableClick+"' ";
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            
            if(rs.next()){
            
            ctgrytxt.setText(rs.getString("Tax_Catagory"));           
            codetxt.setText(rs.getString("Catagory_Code"));       
            rangetxt.setText(rs.getString("Income_Range"));
            ratetxt.setText(rs.getString("Tax_Rate"));
            
            
            }
          
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,ex);
        }
    }                                           

   

     /*--------SHOWS PDF FILE IN REGISTER BUTTON-------- */
    
private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
     try{
           
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Files\\94.pdf");
    } 
     
      catch (Exception ex) {
          JOptionPane.showMessageDialog(rootPane,"Error in showing pdf");
        }
    
    }  

    
   /* ------------SHOWS ALL THE TAX HOLDERS LONG TABLE------------------- */
    
    public void shwAllHoldersTable (){
     
        try {
            String sql = "Select Nid,First_name,Last_name,Gender,Blood,Tax_catagory,Tax_status,Catagory_code from Tax_Holders_info";
            
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            showAllHoldersTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }
    
    /* ------------SHOWS ALL THE DUE HOLDERS LONG TABLE------------------- */
    
    public void shwDueHoldersTable (){
     
        try {
            String sql = "Select Nid,First_name,Last_name,Gender,Blood,Tax_catagory,Tax_status from Tax_Holders_info where Tax_status='Due'";
            
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            duePayerTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }
    
    
     /* ------------SHOWS ALL THE TAX PAYERS TABLE------------------- */
    
    public void shwTaxPayersTable (){
     
        try {
            String sql = "Select Nid,First_name,Last_name,Gender,Blood,Tax_catagory,Tax_status from Tax_Holders_info where Tax_status='ok'";
            
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            taxPayerTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }
    
  
    
    
    /* ------------SHOWS ALL THE TAX HOLDERS SHORT TABLE------------------- */
    
    public void shwAllHoldersShortTable (){
     
        try {
            String sql = "Select Nid,Last_name,Tax_status from Tax_Holders_info";
            
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
           taxPayersShortTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }
    
    
     /* ------------SHOWS THE TAX RATE SHORT TABLE------------------- */
    
    public void shwTaxRateShortTable (){
     
        try {
            String sql = "Select Catagory_Code as Code,Income_Range as Range, Tax_Rate as Rate from Tax_rate";
            
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
           taxratetable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }
    
    
    /* ------------SHOWS THE TAX RATE Long TABLE------------------- */
    
    public void shwTaxRateLongTable (){
     
        try {
            String sql = "Select Catagory_Code, Tax_Catagory,Income_Range,Tax_Rate from Tax_rate";
            
            pst=connection.prepareStatement(sql);
            rs =pst.executeQuery();
            rateLargeTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }
    
    /*-----------TOP BOX BUTTON ACTIONS--------- */
    
    
    /*-----------TOP BOX SEARCH BUTTON ACTION--------- */
    
      private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {                                      
       
        try {
            String sql = "select * from Tax_Holders_Info where Nid=?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, searchtxt.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
            String add1 = rs.getString("Nid");
            nidtxt.setText(add1);
            String add2 = rs.getString("First_name");
            frstnametxt.setText(add2);
            String add3 = rs.getString("Last_name");
            lstnametxt.setText(add3);
            String add4 = rs.getString("Blood");
            bloodtxt.setText(add4);
            String add5 = rs.getString("Tax_catagory");
            catagorytxt.setText(add5);
            String add6 = rs.getString("Tax_status");
            statustxt.setText(add6);
            String add7 = rs.getString("Catagory_code");
            codetext.setText(add7);            
            String add9 = rs.getString("Gender");
            gendertxt.setSelectedItem(add9);
            
             byte[] imageData = rs.getBytes("Photo");
            ImageIcon format = new ImageIcon(ScaledImage(imageData, imagelabel.getWidth(), imagelabel.getHeight()));
            imagelabel.setIcon(format);
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }   
          
          
    }
      
      
      /*-----------TOP BOX ADD BUTTON ACTION--------- */
   
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
           //String txtStGender = (String) gendertxt.getSelectedItem();
        try {
            String sql = "insert into Tax_Holders_Info(Nid,First_name,Last_name,"
                    + "Blood,Tax_catagory,Tax_status,Catagory_code,Gender)"
                    + "values(?,?,?,?,?,?,?,?) ";
            pst = connection.prepareStatement(sql);
            pst.setString(1, nidtxt.getText());
            pst.setString(2, frstnametxt.getText());
            pst.setString(3, lstnametxt.getText());
            pst.setString(4, bloodtxt.getText());
            pst.setString(5, catagorytxt.getText());
            pst.setString(6, statustxt.getText());
            pst.setString(7, codetext.getText());
            pst.setString(8, (String)gendertxt.getSelectedItem());
            

            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

        shwAllHoldersTable ();
        shwAllHoldersShortTable ();
        shwDueHoldersTable ();
        shwTaxPayersTable ();
        
        
    }
    
    /*-----------TOP BOX EDIT BUTTON ACTION--------- */
    
     private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            String value1 = nidtxt.getText();
            String value2 = frstnametxt.getText();
            String value3 = lstnametxt.getText();
            String value4 = bloodtxt.getText();
            String value5 = catagorytxt.getText();
            String value6 = statustxt.getText();
            String value7 = codetext.getText();
           
            String value8 = (String) gendertxt.getSelectedItem();
            
            String sql = "update Tax_Holders_Info set Nid='" + value1 + "',First_name='" + value2 + "'"
                    + ",Last_name='" + value3 + "',Blood='" + value4 + "',Tax_catagory='" + value5 + "',"
                    + "Tax_status='" + value6 + "',Catagory_code='" + value7 + "',"
                    + "Gender='" + value8 + "' where Nid='" + value1 + "'  ";
            pst = connection.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

        shwAllHoldersTable ();
        shwAllHoldersShortTable ();
        shwDueHoldersTable ();
        shwTaxPayersTable ();
    }   
    
     /*-----------TOP BOX CLEAR BUTTON ACTION--------- */
     
     
    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        nidtxt.setText("");
        frstnametxt.setText("");
        lstnametxt.setText("");
        bloodtxt.setText("");
        catagorytxt.setText("");
        statustxt.setText("");
        codetext.setText("");
        imagetxt.setText("");
        
        gendertxt.setSelectedItem("Male");
       
        imagelabel.setIcon(null);
    }  
    
      /*-----------TOP BOX DELETE BUTTON ACTION--------- */
    
    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) { 
        
        int p = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            String sql = "delete from Tax_Holders_Info where Nid = ?";
            try {
                pst = connection.prepareStatement(sql);
                pst.setString(1, nidtxt.getText());
                pst.execute();

                JOptionPane.showMessageDialog(rootPane, "Deleted");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
       
        shwAllHoldersTable ();
        shwAllHoldersShortTable ();
        shwDueHoldersTable ();
        shwTaxPayersTable ();
        
    }
    
    
    
     /*-----------BOTTOM BOX SEARCH BUTTON ACTION--------- */
    
    
    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {   
        
        try {
            String sql = "select * from Tax_rate where Catagory_Code=?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, jTextField2.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
            String add1 = rs.getString("Tax_Catagory");
            ctgrytxt.setText(add1);
            String add2 = rs.getString("Catagory_Code");
            codetxt.setText(add2);
            String add3 = rs.getString("Income_Range");
            rangetxt.setText(add3);
            String add4 = rs.getString("Tax_Rate");
            ratetxt.setText(add4);
           
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        
    } 
    }
    
     /*-----------BOTTOM BOX ADD BUTTON ACTION--------- */
    
     private void btmaddbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
         try {
            String sql = "insert into Tax_rate(Tax_Catagory,Catagory_Code,Income_Range,"
                    + "Tax_Rate)"
                    + "values(?,?,?,?) ";
            pst = connection.prepareStatement(sql);
            pst.setString(1, ctgrytxt.getText());
            pst.setString(2, codetxt.getText());
            pst.setString(3, rangetxt.getText());
            pst.setString(4, ratetxt.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

        
        shwTaxRateShortTable ();
        shwTaxRateLongTable ();
        
         
         
    } 
    
    
     /*-----------BOTTOM BOX CLEAR BUTTON ACTION--------- */
     
     
     private void btmclearbtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        ctgrytxt.setText("");
        codetxt.setText("");
        rangetxt.setText("");
        ratetxt.setText("");
         
    }   
     
     
    /*-----------BOTTOM BOX DELETE BUTTON ACTION--------- */ 
     
     private void btmdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
          int i = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            String sql = "delete from Tax_rate where Catagory_Code = ?";
            try {
                pst = connection.prepareStatement(sql);
                pst.setString(1, codetxt.getText());
                pst.execute();

                JOptionPane.showMessageDialog(rootPane, "Deleted");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
       
         shwTaxRateShortTable ();
        shwTaxRateLongTable ();
        
         
         
    } 
     
      /*-----------BOTTOM BOX EDIT BUTTON ACTION--------- */
     
     
     private void btmeditbtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
          try {
            String value2 =  ctgrytxt.getText();
            String value1 = codetxt.getText();
            String value3 = rangetxt.getText();
            String value4 = ratetxt.getText();
            
           
            
            String sql = "update Tax_rate set Catagory_Code='" + value1 + "',Tax_Catagory='" + value2 + "'"
                    + ",Income_Range='" + value3 + "',Tax_Rate='" + value4 + "' where Catagory_Code='" + value1 + "' ";
            pst = connection.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

       
          shwTaxRateShortTable ();
        shwTaxRateLongTable ();
    }
     
     
     
     
     
     
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

                       
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField bloodtxt;
    private javax.swing.JButton btmaddbtn;
    private javax.swing.JButton btmclearbtn;
    private javax.swing.JButton btmdeletebtn;
    private javax.swing.JButton btmeditbtn;
    private javax.swing.JTextField catagorytxt;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField codetext;
    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField ctgrytxt;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable duePayerTable;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField frstnametxt;
    private javax.swing.JComboBox<String> gendertxt;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JTextField imagetxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField lstnametxt;
    private javax.swing.JTextField nidtxt;
    private javax.swing.JTextField rangetxt;
    private javax.swing.JTable rateLargeTable;
    private javax.swing.JTextField ratetxt;
    private javax.swing.JButton registerbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable showAllHoldersTable;
    private javax.swing.JTabbedPane showDuePayersTable;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JTextField statustxt;
    private javax.swing.JTable taxPayerTable;
    private javax.swing.JTable taxPayersShortTable;
    private javax.swing.JTable taxratetable;
    private javax.swing.JButton uploadbtn;
    
    
}

