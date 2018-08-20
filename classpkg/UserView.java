package classpkg;

import dbpkg.JavaDbConnect;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
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



public class UserView extends javax.swing.JFrame {

    private Connection connection = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private byte[] personImg=null;
    
    
    public UserView() {
        initComponents();
        init();
        connection = JavaDbConnect.dbConnect();
        
        shwDueHoldersTable ();
        shwTaxPayersTable ();
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
        this.setSize(1174, 723);
        this.setTitle("UserView");
        this.setVisible(true);

        jToolBar1 = new javax.swing.JToolBar();
        signOutBtn = new javax.swing.JButton();
        registerbtn = new javax.swing.JButton();
        paymntbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        frstnametxt = new javax.swing.JTextField();
        catagorytxt = new javax.swing.JTextField();
        bloodtxt = new javax.swing.JTextField();
        codetext = new javax.swing.JTextField();
        statustxt = new javax.swing.JTextField();
        searchtxt = new javax.swing.JTextField();
        lstnametxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nidtxt = new javax.swing.JTextField();
        ctgrytxt = new javax.swing.JTextField();
        cdetxt = new javax.swing.JTextField();
        taxststxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        calculatebtn = new javax.swing.JButton();
        incometxt = new javax.swing.JTextField();
        totaltxt = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        receiptbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        receiptarea = new javax.swing.JTextArea();
        printbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        imagelabel = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        duePayerTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taxPayerTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rateLargeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        
        

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 153)));
        jPanel2.setLayout(null);

        jLabel1.setText("Nid");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(16, 37, 67, 14);

        jLabel2.setText("First_Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(16, 83, 67, 14);

        jLabel3.setText("Last_Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(16, 123, 67, 20);

        jLabel4.setText("Gender");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(16, 169, 67, 14);

        jLabel5.setText("Blood");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(16, 215, 67, 14);

        jLabel6.setText("Catagory");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(16, 273, 77, 14);

        jLabel7.setText("Code");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(16, 335, 67, 14);

        jLabel8.setText("Tax_Status");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(16, 391, 67, 14);
        jPanel2.add(frstnametxt);
        frstnametxt.setBounds(101, 80, 184, 20);
        jPanel2.add(catagorytxt);
        catagorytxt.setBounds(101, 270, 184, 20);
        jPanel2.add(bloodtxt);
        bloodtxt.setBounds(101, 212, 184, 20);
        jPanel2.add(codetext);
        codetext.setBounds(101, 332, 184, 20);
        jPanel2.add(statustxt);
        statustxt.setBounds(101, 388, 184, 20);

        jPanel2.add(searchtxt);
        searchtxt.setBounds(101, 34, 184, 20);
        jPanel2.add(lstnametxt);
        lstnametxt.setBounds(101, 123, 184, 20);

        gendertxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(gendertxt);
        gendertxt.setBounds(101, 166, 184, 20);

        this.add(jPanel2);
        jPanel2.setBounds(10, 65, 309, 447);
        
        
        jToolBar1.setRollover(true);
        signOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1491265729_Close_Icon_Dark.png")));
        signOutBtn.setText("Sign Out");
        signOutBtn.setFocusable(false);
        signOutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signOutBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       
        jToolBar1.add(signOutBtn);
        registerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1492132735_pdfs.png"))); 
        registerbtn.setText("Registration");
        registerbtn.setFocusable(false);
        registerbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        jToolBar1.add(registerbtn);
        paymntbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1493564572_Maestro.png")));
        paymntbtn.setText("Payment");
        paymntbtn.setFocusable(false);
        paymntbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        paymntbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        jToolBar1.add(paymntbtn);

        this.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1174, 47);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Put Nid To Calculate Tax", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 204))); 
        jPanel3.setLayout(null);

        jLabel9.setText("Nid_Number");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(16, 42, 74, 14);

        jLabel10.setText("Catagory");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(16, 83, 74, 14);

        jLabel11.setText("Code");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(16, 129, 74, 14);

        jLabel12.setText("Tax_Status");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(16, 182, 74, 14);

        jPanel3.add(nidtxt);
        nidtxt.setBounds(100, 39, 146, 20);
        jPanel3.add(ctgrytxt);
        ctgrytxt.setBounds(100, 80, 146, 20);
        jPanel3.add(cdetxt);
        cdetxt.setBounds(100, 126, 146, 20);
        jPanel3.add(taxststxt);
        taxststxt.setBounds(100, 179, 146, 20);

        this.add(jPanel3);
        jPanel3.setBounds(337, 65, 291, 231);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculate Tax", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 204))); 
        jPanel1.setLayout(null);

        jLabel13.setText("Income");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(16, 63, 74, 14);

        jLabel14.setText("Total Tax");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(16, 101, 74, 14);

        calculatebtn.setText("Calculate");
        
        jPanel1.add(calculatebtn);
        calculatebtn.setBounds(203, 151, 87, 23);
        jPanel1.add(incometxt);
        incometxt.setBounds(100, 60, 150, 20);
        jPanel1.add(totaltxt);
        totaltxt.setBounds(100, 98, 150, 20);

        clearbtn.setText("Clear");
       
        jPanel1.add(clearbtn);
        clearbtn.setBounds(16, 151, 74, 23);

        receiptbtn.setText("Receipt");
        jPanel1.add(receiptbtn);
        receiptbtn.setBounds(108, 151, 77, 23);

        this.add(jPanel1);
        jPanel1.setBounds(337, 302, 298, 210);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prints Receipt", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14), new java.awt.Color(0, 0, 204))); 
        jPanel4.setLayout(null);

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        receiptarea.setColumns(20);
        receiptarea.setRows(5);
        jScrollPane4.setViewportView(receiptarea);

        jPanel10.add(jScrollPane4);
        jScrollPane4.setBounds(10, 19, 242, 281);

        jTabbedPane2.addTab("Receipt", jPanel10);

        jPanel4.add(jTabbedPane2);
        jTabbedPane2.setBounds(16, 39, 267, 350);

        printbtn.setText("Print");
        jPanel4.add(printbtn);
        printbtn.setBounds(199, 395, 84, 23);

        this.add(jPanel4);
        jPanel4.setBounds(645, 65, 299, 447);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);
        jPanel5.add(imagelabel);
        imagelabel.setBounds(12, 13, 186, 184);

        this.add(jPanel5);
        jPanel5.setBounds(954, 135, 210, 221);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(null);

        jPanel6.setLayout(null);

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
        jScrollPane2.setViewportView(duePayerTable);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 13, 531, 126);

        jTabbedPane1.addTab("Due Payers", jPanel6);

        jPanel7.setLayout(null);

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
        jScrollPane3.setViewportView(taxPayerTable);

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(10, 11, 531, 126);

        jTabbedPane1.addTab("Tax Payers", jPanel7);

        jPanel8.setLayout(null);
        jTabbedPane1.addTab("Email", jPanel8);

        jPanel9.setLayout(null);

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
        jScrollPane1.setViewportView(rateLargeTable);

        jPanel9.add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 531, 126);

        jTabbedPane1.addTab("Tax Rate", jPanel9);

        jPanel12.add(jTabbedPane1);
        jTabbedPane1.setBounds(2, 13, 1170, 178);

        this.add(jPanel12);
        jPanel12.setBounds(0, 530, 1174, 193);
        
        
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        
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
         
         paymntbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymntbtnActionPerformed(evt);
            }
        });
         
          nidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nidtxtKeyReleased(evt);
            }
        });

          calculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtnActionPerformed(evt);
            }
        });
          
           clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
           
            receiptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptbtnActionPerformed(evt);
            }
        });
            
            printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

    }   
    
    
    /*-----------SIGNOUTBUTTON------------*/

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {

            close();
            LogIn obj = new LogIn();
            obj.setVisible(true);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
        
    }                                          

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
         try{
           
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Files\\94.pdf");
    } 
     
      catch (Exception ex) {
          JOptionPane.showMessageDialog(rootPane,"Error in showing pdf");
        }
    }                                           

    private void paymntbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
         try {

            //close();
            Payment obj1 = new Payment();
            obj1.setVisible(true);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
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
    
    /*-----------SHOWS MY DETAILS-----------*/
    
    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {                                      
        try {
            String sql = "select * from Tax_Holders_Info where Nid=?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, searchtxt.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
            
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

      /*-----------SHOWS MY DETAILS FOR TAX CALCULATE-----------*/
    
    
    private void nidtxtKeyReleased(java.awt.event.KeyEvent evt) {                                   
        
         try {
            String sql = "select * from Tax_Holders_Info where Nid=?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, nidtxt.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                
            
            String add11 = rs.getString("Tax_catagory");
            ctgrytxt.setText(add11);
            String add12 = rs.getString("Catagory_code");
            cdetxt.setText(add12);
            String add13 = rs.getString("Tax_status");
            taxststxt.setText(add13); 
            }
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } 
        
    }                                  

    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
      
        double inc = Double.parseDouble(incometxt.getText());
        double TAX;
        double var1 = 0.10;
        double var2 = 0.15;
        double var3 = 0.20;
        double var4 = 0.25;
        double var5 = 0.30;
        
         if(taxststxt.getText().equals("ok"))
        {
            JOptionPane.showMessageDialog(null, "You have already given you Income Tax");
        }
        
        
         else if(inc > 0 && inc <= 250000 && ctgrytxt.getText().equals("Individual-Male"))
        {
            TAX = 3000;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        else if(inc > 250000 && inc <= 650000 && ctgrytxt.getText().equals("Individual-Male"))
        {
            TAX = inc * var1;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
       
        
        else if(inc > 650000 && inc <= 1150000 && ctgrytxt.getText().equals("Individual-Male"))
        {
            TAX = inc * var2;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 1150000 && inc <= 1750000 && ctgrytxt.getText().equals("Individual-Male"))
        {
            TAX = inc * var3;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 1750000 && inc <= 4750000 && ctgrytxt.getText().equals("Individual-Male"))
        {
            TAX = inc * var4;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
       
        else if(inc > 4750000  && ctgrytxt.getText().equals("Individual-Male"))
        {
            TAX = inc * var5;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
       else if(inc > 0 && inc <= 300000 && ctgrytxt.getText().equals("Individual-Female"))
        {
            TAX = 3000;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 300000 && inc <= 700000 && ctgrytxt.getText().equals("Individual-Female"))
        {
            TAX = inc * var1;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 700000 && inc <= 1200000 && ctgrytxt.getText().equals("Individual-Female"))
        {
            TAX = inc * var2;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 1200000 && inc <= 1800000 && ctgrytxt.getText().equals("Individual-Female"))
        {
            TAX = inc * var3;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 1800000 && inc <= 4800000 && ctgrytxt.getText().equals("Individual-Female"))
        {
            TAX = inc * var4;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 4800000  && ctgrytxt.getText().equals("Individual-Female"))
        {
            TAX = inc * var5;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        
       else if(inc > 0 && inc <= 300000 && ctgrytxt.getText().equals("Senior"))
        {
            TAX = 3000;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 300000 && inc <= 700000 && ctgrytxt.getText().equals("Senior"))
        {
            TAX = inc * var1;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 700000 && inc <= 1200000 && ctgrytxt.getText().equals("Senior"))
        {
            TAX = inc * var2;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 1200000 && inc <= 1800000 && ctgrytxt.getText().equals("Senior"))
        {
            TAX = inc * var3;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 1800000 && inc <= 4800000 && ctgrytxt.getText().equals("Senior"))
        {
            TAX = inc * var4;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 4800000  && ctgrytxt.getText().equals("Senior"))
        {
            TAX = inc * var5;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        else if(inc > 0 && inc <= 375000 && ctgrytxt.getText().equals("Retard"))
        {
            TAX = 3000;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
          else if(inc > 375000 && inc <= 775000 && ctgrytxt.getText().equals("Retard"))
        {
            TAX = inc * var1;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
          
            else if(inc > 775000 && inc <= 1275000 && ctgrytxt.getText().equals("Retard"))
        {
            TAX = inc * var2;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
            
              else if(inc > 1275000 && inc <= 1875000 && ctgrytxt.getText().equals("Retard"))
        {
            TAX = inc * var3;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
              
                else if(inc > 1875000 && inc <= 4875000 && ctgrytxt.getText().equals("Retard"))
        {
            TAX = inc * var4;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
                
                  else if(inc > 4875000  && ctgrytxt.getText().equals("Retard"))
        {
            TAX = inc * var5;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
         else if(inc > 0 && inc <= 425000 && ctgrytxt.getText().equals("Freedom-Fighter"))
        {
            TAX = 3000;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
    
          else if(inc > 425000 && inc <= 825000 && ctgrytxt.getText().equals("Freedom-Fighter"))
        {
            TAX = inc * var1;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
          
           else if(inc > 825000 && inc <= 1325000 && ctgrytxt.getText().equals("Freedom-Fighter"))
        {
            TAX = inc * var2;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
           
            else if(inc >1325000 && inc <= 1925000 && ctgrytxt.getText().equals("Freedom-Fighter"))
        {
            TAX = inc * var3;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
            
             else if(inc > 1925000 && inc <= 4925000 && ctgrytxt.getText().equals("Freedom-Fighter"))
        {
            TAX = inc * var4;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
             
              else if(inc > 4925000 && ctgrytxt.getText().equals("Freedom-Fighter"))
        {
            TAX = inc * var5;
            String s = Double.toString(TAX);
            totaltxt.setText(s);
        }
        
        
        else{
            JOptionPane.showMessageDialog(null, "Please provide correct infromation");
        }
        
    }                                            

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        nidtxt.setText("");
        ctgrytxt.setText("");
        cdetxt.setText("");
        taxststxt.setText("");
        incometxt.setText("");
        totaltxt.setText("");
        
    }                                        

    /*------------PRINTS RECEIPT-----------*/
    
    private void receiptbtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        receiptarea.append("         Income Tax Payment Receipt \n\n" + "\n    Nid Number:\t" + nidtxt.getText() + "\n\n    Receipt No.\t:" + nidtxt.getText() + "\n\n    Tax-Caagory:\t" +  ctgrytxt.getText() +
                "\n\n    Code:\t" + cdetxt.getText() + "\n\n    Total Tax:\t" + totaltxt.getText() + "\n\n\n    Thank You For Paying Your Income Tax");
        
    }                                          

    
    
    
    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        try{
        
        boolean prnt = receiptarea.print();
        if(prnt){
        
             JOptionPane.showMessageDialog(null, "Printing in Progress");
        }
        
        else{
        
         JOptionPane.showMessageDialog(null, "Printing Failed");
        }
        
        }
        
        catch(PrinterException e)
        {
        JOptionPane.showMessageDialog(null, e);
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
    
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

                        
    private javax.swing.JTextField bloodtxt;
    private javax.swing.JButton calculatebtn;
    private javax.swing.JTextField catagorytxt;
    private javax.swing.JTextField cdetxt;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField codetext;
    private javax.swing.JTextField ctgrytxt;
    private javax.swing.JTable duePayerTable;
    private javax.swing.JTextField frstnametxt;
    private javax.swing.JComboBox<String> gendertxt;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JTextField incometxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField lstnametxt;
    private javax.swing.JTextField nidtxt;
    private javax.swing.JButton paymntbtn;
    private javax.swing.JButton printbtn;
    private javax.swing.JTable rateLargeTable;
    private javax.swing.JTextArea receiptarea;
    private javax.swing.JButton receiptbtn;
    private javax.swing.JButton registerbtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JTextField statustxt;
    private javax.swing.JTable taxPayerTable;
    private javax.swing.JTextField taxststxt;
    private javax.swing.JTextField totaltxt;
                    
}
