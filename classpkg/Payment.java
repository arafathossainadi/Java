package classpkg;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Payment extends javax.swing.JFrame {

   
    public Payment() {
        initComponents();
        init();
    }
 public void init() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(true);

    }
                           
    private void initComponents() {
        
        this.setLayout(null);
        this.setSize( 406, 373);
        this.setTitle("AdminView");
        this.setVisible(true);
       

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jLabel1.setText("Receipt No.");
        this.add(jLabel1);
        jLabel1.setBounds(50, 44, 71, 14);

        jLabel2.setText("Amount");
        this.add(jLabel2);
        jLabel2.setBounds(50, 92, 71, 14);

        jLabel3.setText("Card_Number");
        this.add(jLabel3);
        jLabel3.setBounds(50, 143, 71, 14);

        jLabel4.setText("Password");
        this.add(jLabel4);
        jLabel4.setBounds(50, 194, 71, 14);
        this.add(jTextField1);
        jTextField1.setBounds(139, 44, 139, 20);
        this.add(jTextField2);
        jTextField2.setBounds(139, 89, 139, 20);
        this.add(jTextField3);
        jTextField3.setBounds(139, 140, 139, 20);
        this.add(jTextField4);
        jTextField4.setBounds(139, 191, 139, 20);

        submitbtn.setText("submit");
        this.add(submitbtn);
        submitbtn.setBounds(205, 246, 73, 23);
        
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

       
    }                        

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        JOptionPane.showMessageDialog(rootPane, "Successful");
    }                                         

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

                      
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton submitbtn;
                  
}
