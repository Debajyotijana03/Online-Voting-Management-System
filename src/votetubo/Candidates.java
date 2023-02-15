/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package votetubo;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
 
public class Candidates extends javax.swing.JFrame {

    public Candidates() {
        initComponents();
        GetElections();
       DisplayCandidates();
    }

    Connection Con = null;
    // PreparedStatement pst = null ; 
     ResultSet Rs=null;
     Statement St=null;
    private void GetElections(){
        try {
             Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root","");
             St=Con.createStatement();
             
             String Query="select * from  voting_tb ";
              Rs=St.executeQuery(Query);
              while(Rs.next()){
              String ElctID=Rs.getString("Eid");
              Electioncb.addItem(ElctID);
              
              
              
              }
              //JOptionPane.showMessageDialog(this,"Election Deleeted Successfully");
            //  DisplayEle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        
        } 
        }
    
    
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CandidateName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTb = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CandidateAge = new javax.swing.JTextField();
        CandidatePic = new javax.swing.JLabel();
        Electioncb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CandidateGen = new javax.swing.JComboBox<>();
        BrowseBtn = new javax.swing.JButton();

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
        jLabel3.setText("Name ");

        CandidateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel4.setText("Age");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Manage Elections");

        CandidateTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Photo", "Election"
            }
        ));
        CandidateTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTb);

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setText("Delet");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
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

        CandidateAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateAgeActionPerformed(evt);
            }
        });

        CandidatePic.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        CandidatePic.setText("Photo");

        Electioncb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Electioncb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Electioncb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectioncbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel8.setText("Election");

        jLabel9.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        jLabel9.setText("Gender");

        CandidateGen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CandidateGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        CandidateGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateGenActionPerformed(evt);
            }
        });

        BrowseBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BrowseBtn.setText("Browse");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });
        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(CandidateName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CandidatePic, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Electioncb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CandidateAge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CandidateGen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandidateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CandidateAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandidateGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CandidatePic, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BrowseBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Electioncb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CandidateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidateNameActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CandidateAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidateAgeActionPerformed

    private void ElectioncbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectioncbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectioncbActionPerformed

    private void CandidateGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidateGenActionPerformed

    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseBtnActionPerformed
    private  ImageIcon ResizePhoto(String ImagePath,byte[] pic){
        ImageIcon MyImage=null;
        if(ImagePath !=null){
        MyImage=new ImageIcon(ImagePath);  
        }
        else{
         MyImage=new ImageIcon(pic);
        
        }
        Image img= MyImage.getImage();
        Image newImg= img.getScaledInstance(CandidatePic.getWidth(), CandidatePic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image =new ImageIcon(newImg);
        return image;  
        
                
    
    
    
    }
    
    
    
    
    String imgpath=null;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
            JFileChooser chooser= new JFileChooser();
            chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter =new FileNameExtensionFilter("*.Images", "jpg","png");
            chooser.addChoosableFileFilter(filter);
            int result=chooser.showSaveDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                File selectedFile=chooser.getSelectedFile();
                String path=selectedFile.getAbsolutePath();
                CandidatePic.setIcon(ResizePhoto(path,null));
                imgpath=path;
            
            
            }
        

// TODO add your handling code here:
    }//GEN-LAST:event_BrowseBtnMouseClicked

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
    if(CandidateAge.getText().isEmpty() || CandidateName.getText().isEmpty() || Electioncb.getSelectedIndex()==-1 ||CandidateGen.getSelectedIndex()==-1 ){
        
    JOptionPane.showMessageDialog(this,"Missing Info");
    
    
    }else{
        try {
            CandCount();
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root","");
            PreparedStatement Add= Con.prepareStatement("insert into candidate_tb Values(?,?,?,?,?,?)");
            InputStream img1= new FileInputStream(imgpath);
            Add.setInt(1, Cid);
            Add.setString(2,CandidateName.getText());
            Add.setInt(3,Integer.parseInt(CandidateAge.getText()));
            Add.setString(4,CandidateGen.getSelectedItem().toString());
            //Add.setBigDecimal(WIDTH, BigDecimal.ONE);
            Add.setBlob(5,img1);
            Add.setInt(6,Integer.valueOf(Electioncb.getSelectedItem().toString()));
            int row=Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Candidate Registered ");
            
           Con.close();
           DisplayCandidates();
        } catch (Exception e) {
         
        JOptionPane.showMessageDialog(this,e);
        }
    
    
    }
    



// TODO add your handling code here:
    }//GEN-LAST:event_AddButtonMouseClicked
    private void FetchPhoto(){
        String Query ="select Cphoto from Candidate_tb where Cid="+Key;
        Statement St2;
        ResultSet Rs2;
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root","");
            St2=Con.createStatement();
            Rs2=St2.executeQuery(Query);
            if(Rs2.next()){
            CandidatePic.setIcon(ResizePhoto(null, Rs2.getBytes("Cphoto")));
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    int Key=-1;
    private void CandidateTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTbMouseClicked
        DefaultTableModel model= (DefaultTableModel)CandidateTb.getModel();
        int MyIndex=CandidateTb.getSelectedRow();
     
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
       CandidateName.setText(model.getValueAt(MyIndex,1).toString());
       CandidateAge.setText(model.getValueAt(MyIndex,2).toString());
       CandidateGen.setSelectedItem(model.getValueAt(MyIndex,3).toString());
       Electioncb.setSelectedItem(model.getValueAt(MyIndex,5).toString());
        // CandidateName.setText(model.getValueAt(MyIndex,1).toString());
        FetchPhoto();
// TODO add your handling code here:
    }//GEN-LAST:event_CandidateTbMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key==-1){
            JOptionPane.showMessageDialog(this,"Select The Election to be Deleted");
        }else{
        try {
             Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root","");
             String Query="Delete from  Candidate_tb where Cid="+Key;
              Statement Del= Con.createStatement();
              Del.executeUpdate(Query);
              JOptionPane.showMessageDialog(this,"Candidate Deleeted Successfully");
              DisplayCandidates();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       if(imgpath!= null){
           try {
                 InputStream img= new FileInputStream(imgpath);
           
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root","");
                String Query ="Update candidate_tb set Cname=?,Cage=?,Cgen=?,Cphoto=?,CElect=? where Cid=?";
                 PreparedStatement UpdateQuery =Con.prepareStatement(Query);
                 UpdateQuery.setString(1,CandidateName.getText());
                 UpdateQuery.setInt(2, Integer.parseInt(CandidateAge.getText().toString()));
                 UpdateQuery.setString(3, CandidateGen.getSelectedItem().toString());
                 UpdateQuery.setBlob(4, img);
                 UpdateQuery.setString(5,Electioncb.getSelectedItem().toString());
                 UpdateQuery.setInt(6, Key);
                 if(UpdateQuery.executeUpdate() ==1){
                 
                        JOptionPane.showMessageDialog(this,"Candidate Update");
                         DisplayCandidates();
                 }
                 else{
                 JOptionPane.showMessageDialog(this, "missing info");
                 
                         }
           
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
                
               
           }
       }
       else{
       JOptionPane.showMessageDialog(this, "Selecte Photo");
        CandidatePic.setIcon(null);
        CandidatePic.setText("");
               }
       imgpath=null;
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
      new MainMenu().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked
    int Cid;
    Statement st1=null;
    ResultSet rs1=null;
    
    private void CandCount(){
        try {
            st1=Con.createStatement();
           rs1=st1.executeQuery("select MAx(Cid)from candidate_tb");
           rs1.next();
           Cid=rs1.getInt(1)+1 ;
        } catch (Exception e) {
        }
    }
    
    
     private void DisplayCandidates(){
    
        try {
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_db","root",""); 
            St=Con.createStatement();
            Rs =St.executeQuery("Select * from candidate_tb");
            CandidateTb.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
        }
     }
    
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
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JTextField CandidateAge;
    private javax.swing.JComboBox<String> CandidateGen;
    private javax.swing.JTextField CandidateName;
    private javax.swing.JLabel CandidatePic;
    private javax.swing.JTable CandidateTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> Electioncb;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
