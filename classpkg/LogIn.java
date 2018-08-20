package classpkg;
import dbpkg.JavaDbConnect;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LogIn extends javax.swing.JFrame {

    private Connection connection =null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    public LogIn() {
        initComponents();
        init();
        connection=JavaDbConnect.dbConnect();
    }

    public void init(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
    
    }
    
    public void close(){
    
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
     
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        
         
        this.setLayout(null);
        
        this.setSize(617, 250);
        this.setTitle("Login");
        this.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    
        jPanel1.setLayout(null);
        this.add(jPanel1);
        jPanel1.setBounds(370, 0, 240, 230);
        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14))); // NOI18N
        

        jLabel1.setText("username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 60, 14);

        jLabel2.setText("password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 60, 14);
        jPanel1.add(txtuser);
        txtuser.setBounds(90, 50, 130, 20);
        jPanel1.add(txtpass);
        txtpass.setBounds(90, 90, 130, 20);

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1490316317_log-in.png"))); 
        btnlogin.setText("Login");
        jPanel1.add(btnlogin);
        btnlogin.setBounds(120, 120, 100, 28);
        btnlogin.setBackground(new java.awt.Color(204, 204, 255));
        
        signupbtn.setText("Sign Up");
        jPanel1.add(signupbtn);
        signupbtn.setBounds(20, 170, 200, 23);
        signupbtn.setBackground(new java.awt.Color(204, 204, 255));

        this.add(jPanel1);
        jPanel1.setBounds(360, 0, 260, 230);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/income-tax.jpe"))); 
        this.add(jLabel4);
        jLabel4.setBounds(40,0, 250, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/17453354_746997292144545_241611118_o.png")));
        this.add(jLabel3);
        jLabel3.setBounds(110, 160, 180, 80);

      
       

      
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

       
    }

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {
        
        String sql = "select * from log_in where username= ? and password = ?";
        try{
           pst=connection.prepareStatement(sql);
           pst.setString(1, txtuser.getText());
           pst.setString(2, txtpass.getText());
           rs=pst.executeQuery();
           String user = txtuser.getText();
           String pwd = new String (txtpass.getPassword());
           if(rs.next()){
           String uname = rs.getString("username");
           String pass = rs.getString("password");
           
            if ((user.equals("admin")) && (pwd.equals("adminpass"))) { 
                close();
                AdminView obj=new AdminView();
                obj.setVisible(true);
            }
            else{
                 close();
                UserView obj1=new UserView();
                obj1.setVisible(true);
            }
           
            try{
            rs.close();
            pst.close();
            connection.close();
            
            } catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
            
           }
           else{
               JOptionPane.showMessageDialog(rootPane,"username and password incorrect");
           }
    }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
     private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
                close();
               SignUp obj1=new SignUp();
               obj1.setVisible(true);
         
         
    } 
     
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    private javax.swing.JButton signupbtn;

    void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
