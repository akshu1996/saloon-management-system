
package sss;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class loginpagemain extends javax.swing.JFrame {

   
    public loginpagemain() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\PROJECT\\salon\\LOGO\\barber shop image.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(11, 7, 7));
        setUndecorated(true);
        setSize(new java.awt.Dimension(100, 200));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 204));
        jLabel1.setText("ADMIN LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 210, 280, 29);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("USERNAME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 290, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 153));
        jLabel3.setText("PASSWORD:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 350, 120, 30);

        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(580, 290, 290, 30);

        jPasswordField1.setToolTipText("");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(580, 350, 290, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 440, 120, 30);
        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(220, 380, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\PROJECT\\salon\\onlinelogomaker-092517-1949-3242.png")); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 320, 110);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\PROJECT\\salon\\WHDQ-512725583.jpg")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 50));
        jButton3.setOpaque(false);
        jButton3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jButton3ComponentResized(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(-110, 0, 1330, 740);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(820, 450, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                 String uname=jTextField1.getText();
                 String pass=jPasswordField1.getText();
                 if(uname.equals("akshaydinesh")&& pass.equals("1234"))
                 {  
               
                NewJFrame B=new NewJFrame();
                 B.setVisible(true);
                 this.dispose(); 
                 }                           
                    
                 else
                    {
                    JOptionPane.showMessageDialog(rootPane,"Invalid"); 
                 }
                 
                 
            
                       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(this.getExtendedState() |JFrame.MAXIMIZED_BOTH);
       
        
    
    }//GEN-LAST:event_formWindowOpened

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton3ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ComponentResized

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginpagemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpagemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpagemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpagemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpagemain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}


