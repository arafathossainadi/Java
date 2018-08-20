package classpkg;
import dbpkg.JavaDbConnect;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {
    
    
    private Connection connection =null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    public SignUp() {
        initComponents();
        init();
        connection=JavaDbConnect.dbConnect();
    }

    public void init(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
    

    }
                        
    private void initComponents() {
        
          
        this.setLayout(null);
        this.setSize(350,350);
        this.setTitle("SignUp");
        this.setVisible(true);

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nidtxt = new javax.swing.JTextField();
        frsttxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lasttxt = new javax.swing.JTextField();
        usertxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        submitbtn = new javax.swing.JButton();


        jLabel1.setText("Nid");
        this.add(jLabel1);
        jLabel1.setBounds(50, 70, 60, 14);

        jLabel2.setText("First_name");
        this.add(jLabel2);
        jLabel2.setBounds(50, 110, 70, 14);
        this.add(nidtxt);
        nidtxt.setBounds(130, 70, 150, 20);
        this.add(frsttxt);
        frsttxt.setBounds(130, 110, 150, 20);

        jLabel3.setText("Last_name");
        this.add(jLabel3);
        jLabel3.setBounds(50, 150, 70, 14);

        jLabel4.setText("Username");
        this.add(jLabel4);
        jLabel4.setBounds(50, 190, 60, 14);

        jLabel5.setText("Password");
        this.add(jLabel5);
        jLabel5.setBounds(50, 230, 70, 14);
        this.add(lasttxt);
        lasttxt.setBounds(130, 150, 150, 20);
        this.add(usertxt);
        usertxt.setBounds(130, 190, 150, 20);
        this.add(passtxt);
        passtxt.setBounds(130, 230, 150, 20);

        submitbtn.setText("Submit");
        this.add(submitbtn);
        submitbtn.setBounds(205, 272, 75, 23);
        
        
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        

    
    }                    

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
          try {
            String sql = "insert into log_in(id,firstname,lastname,"
                    + "username,password)"
                    + "values(?,?,?,?,?) ";
            pst = connection.prepareStatement(sql);
            pst.setString(1, nidtxt.getText());
            pst.setString(2, frsttxt.getText());
            pst.setString(3, lasttxt.getText());
            pst.setString(4, usertxt.getText());
            pst.setString(5, passtxt.getText());

            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Successful");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }                                         

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

           
    private javax.swing.JTextField frsttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lasttxt;
    private javax.swing.JTextField nidtxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField usertxt;
                 
}
