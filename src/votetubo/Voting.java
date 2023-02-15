/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package votetubo;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voting extends javax.swing.JFrame {

    
    public Voting() {
        initComponents();
        DisplayCandidates();
        message.setVisible(false);
    }
    int VotingId;
    public Voting(int VoterId){
         initComponents();
        DisplayCandidates();
        message.setVisible(false);
    VotingId=VoterId;
  //  JOptionPane.showMessageDialog(this,VotingId);
    }
    Connection Con = null;
    // PreparedStatement pst = null ; 
     ResultSet Rs=null;
     Statement St=null; 
     private void DisplayCandidates(){
    
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root",""); 
            St=Con.createStatement();
            Rs =St.executeQuery("Select * from candidate_tb");
            CandidateTble.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTble = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        CandidatePhoto = new javax.swing.JLabel();
        Votebtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CandidateName = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setText("ONLINE VOTING MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel3.setText("YOUR Candidate");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("WELCOME TO THE VOTE");

        CandidateTble.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        CandidateTble.setModel(new javax.swing.table.DefaultTableModel(
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
        CandidateTble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTble);

        jLabel8.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel8.setText("Result  :->");

        CandidatePhoto.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        CandidatePhoto.setText("Photo");

        Votebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Votebtn.setText("VOTE");
        Votebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotebtnMouseClicked(evt);
            }
        });
        Votebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotebtnActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CandidateName.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        CandidateName.setText("Name");

        message.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        message.setText("Vote Successfully added");

        jButton1.setText("Result");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel9.setText("Appearing Candidate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CandidateName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CandidatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(Votebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(177, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(336, 336, 336)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Votebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CandidatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CandidateName)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VotebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VotebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
     private  ImageIcon ResizePhoto(String ImagePath,byte[] pic){
        ImageIcon MyImage=null;
        if(ImagePath !=null){
        MyImage=new ImageIcon(ImagePath);  
        }
        else{
         MyImage=new ImageIcon(pic);
        
        }
        Image img= MyImage.getImage();
        Image newImg= img.getScaledInstance(CandidatePhoto.getWidth(), CandidatePhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image =new ImageIcon(newImg);
        return image;  
        
                
    
    
    
    } 
    private void FetchPhoto(){
        String Query ="select Cphoto from Candidate_tb where Cid="+Key;
        Statement St2;
        ResultSet Rs2;
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root","");
            St2=Con.createStatement();
            Rs2=St2.executeQuery(Query);
            if(Rs2.next()){
            CandidatePhoto.setIcon(ResizePhoto(null, Rs2.getBytes("Cphoto")));
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    int Key=-1;
    int ElecId;
    private void CandidateTbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTbleMouseClicked
      DefaultTableModel model= (DefaultTableModel)CandidateTble.getModel();
        int MyIndex=CandidateTble.getSelectedRow();
     
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        
        CandidateName.setText(model.getValueAt(MyIndex,1 ).toString());
         ElecId=Integer.valueOf(model.getValueAt(MyIndex,5).toString());
// CandidateName.setText(model.getValueAt(MyIndex,1).toString());
        FetchPhoto();
    }//GEN-LAST:event_CandidateTbleMouseClicked
   int Vid;
   Statement st1= null;
   ResultSet rs1=null;
    private void VCount(){
        try {
            st1=Con.createStatement();
           rs1=st1.executeQuery("select MAx(Voteid )from votes_tbl");
           rs1.next();
           Vid=rs1.getInt(1)+1 ;
        } catch (Exception e) {
        }
    
    }
    private int VCheck(){
        try {
            int sum=0;
            
            st1=Con.createStatement();
           rs1=st1.executeQuery("select Count(*) as nm from votes_tbl where VoterId="+VotingId+"");
           while(rs1.next()){
               sum = sum+rs1.getInt("nm");
               
           
           }
            System.out.println("Sum = "+sum);
           if(sum==0){
           return 0;
           }
           else{
           return  1;
           }
           

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            return  0;
        }
    
    }
    private void VotebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotebtnMouseClicked
       int i=VCheck();
       if(i > 0){
        JOptionPane.showMessageDialog(this, "You cant Visited twice");
        }
        else if(Key==-1){
            JOptionPane.showMessageDialog(this,"Select Your Candidate");
        }
        else{
            
            try {
             
                
            VCount();
             Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root",""); 
                PreparedStatement Add= Con.prepareStatement("Insert into votes_tbl Values(?,?,?,?)");
                
                Add.setInt(1, Vid);
                Add.setInt(2, VotingId);
                Add.setInt(3, ElecId);
               Add.setInt(4, Key);
               
                
            
               
                int row= Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Vote Counted");
                    Con.close(); 
                    message.setVisible(true);
                    DisplayCandidates();
                    Votebtn.setVisible(false);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
            
            }
        }
    
    }//GEN-LAST:event_VotebtnMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        new Login().setVisible(true);
        this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new VResult().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CandidateName;
    private javax.swing.JLabel CandidatePhoto;
    private javax.swing.JTable CandidateTble;
    private javax.swing.JButton Votebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
