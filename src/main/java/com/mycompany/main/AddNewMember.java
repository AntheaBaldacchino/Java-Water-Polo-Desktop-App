/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author antheabaldacchino
 */
public class AddNewMember extends javax.swing.JFrame
        
{
    
    
    //Declaring Variables
    String name;
    String surname;
    String gender;
    String phone;
    String email;
    String position;
    String team;
    LocalDate dob;
    
    //Disabled the start Date for extra validation from properties
    String srtDate;
    String endDate;
    String filePathPhoto;
    
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    

    /**
     * Creates new form AddNewMember
     */
    public AddNewMember() {
        initComponents();
        
        //Set up For Radio Buttons
        genderBtnGroup.add(rdnFemale);
        genderBtnGroup.add(rdnMale);
        
        //Set the Female Button to be true on runtime
        rdnFemale.setSelected(true);
        
        //Set Team ComboBox
        
        //Remove any current items
        cmbTeam.removeAllItems();
        cmbPosition.removeAllItems();
        
        //Fill up the combobox(Teams, Positions)
        String[] Teams = {"Development", "U10", "U12", "U14", "U16", "U20", "Senior"};
        String[] Positions = {"Beginner", "Goalkeeper", "Second Goalkeeper", "1", "2", "3", "4", "5", "6"};
        
        //Iteration for comboBoxes(Teams, Position)
        for(int i = 0; i < Teams.length; i++){
            
            cmbTeam.addItem(Teams[i]);
        }
        
        cmbTeam.setSelectedIndex(0);
        
                
        for(int i = 0; i < Positions.length; i++){
            
            cmbPosition.addItem(Positions[i]);
        }
        
        cmbPosition.setSelectedIndex(0);
        
        LocalDate currentDate = LocalDate.now();
        // Get today's date and format it
        String currentDateStr = currentDate.format(format);
        
        //Display current date
        txtCurrentDate.setText(currentDateStr);
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        lblAddNewMember = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnAddPhoto = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdnMale = new javax.swing.JRadioButton();
        rdnFemale = new javax.swing.JRadioButton();
        cmbTeam = new javax.swing.JComboBox<>();
        cmbPosition = new javax.swing.JComboBox<>();
        txtendDate = new javax.swing.JTextField();
        txtCurrentDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sharks WaterPolo Club - Add new Member");
        setBackground(new java.awt.Color(0, 153, 204));

        lblAddNewMember.setFont(new java.awt.Font("Hoefler Text", 1, 36)); // NOI18N
        lblAddNewMember.setForeground(new java.awt.Color(0, 0, 204));
        lblAddNewMember.setText("Add New Member");

        lblName.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblName.setText("Name");

        lblSurname.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblSurname.setText("Surname");

        lblDOB.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblDOB.setText("Date of Birth");

        lblPhone.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblPhone.setText("Phone");

        lblEmail.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblEmail.setText("Email");

        lblGender.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblGender.setText("Gender");

        lblTeam.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblTeam.setText("Team");

        lblPosition.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblPosition.setText("Position");

        lblStartDate.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblStartDate.setText("Start Date");

        lblEndDate.setFont(new java.awt.Font("Heiti SC", 1, 14)); // NOI18N
        lblEndDate.setText("End Date");

        btnClear.setText("Clear All");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAddPhoto.setText("Add Photo");
        btnAddPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhotoActionPerformed(evt);
            }
        });

        txtdob.setText("dd/mm/yyyy");

        rdnMale.setText("Male");

        rdnFemale.setText("Female");

        cmbTeam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCurrentDate.setText("jTextField4");
        txtCurrentDate.setEnabled(false);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblPhoto.setText("Photo");
        lblPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone)
                            .addComponent(lblDOB)
                            .addComponent(lblSurname)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtSurname)
                            .addComponent(txtdob)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStartDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCurrentDate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEndDate)
                                .addGap(18, 18, 18)
                                .addComponent(txtendDate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGender)
                                    .addComponent(lblTeam)
                                    .addComponent(lblPosition))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdnMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdnFemale))
                                    .addComponent(cmbTeam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPhoto)
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(lblAddNewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAddNewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSurname)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDOB)
                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPosition)
                                    .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPhone)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStartDate)
                                    .addComponent(txtCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEndDate)
                                    .addComponent(txtendDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGender)
                                    .addComponent(rdnMale)
                                    .addComponent(rdnFemale))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTeam)
                                    .addComponent(cmbTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnAddPhoto)
                            .addComponent(btnSave))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean letterOnly(String s){
        
        return s.matches("[a-zA-Z]+");
    }
    // Regex Pattern
        public static boolean digitsOnly(String s){
        
            return s.matches(".*\\D.*"); ///Check how to validate when ther is characters other than letters
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        //Validation
        boolean validData = true;
        
                
        if(rdnMale.isSelected()){
            gender = "Male";
            
        }else if (rdnFemale.isSelected()){
            
            gender = "Female";
        }else{
            gender = "";
        }
        
        //Get string text for validation
        String nameStr = txtName.getText();
        String surnameStr = txtSurname.getText();
        String phoneStr = txtPhone.getText();
        
        //Not Required or need validation
        email = txtEmail.getText();
        String endDate = txtendDate.getText();
        
        //Get position validation for combobox
        team = (String)cmbTeam.getSelectedItem();
        position = (String)cmbPosition.getSelectedItem();
        
        String startDate = txtCurrentDate.getText();   
        
        
        
        

        
        if(nameStr.isEmpty() && surnameStr.isEmpty()){
            JOptionPane.showMessageDialog(null, "Name or surname was left empty");
            validData = false;
        }
        
        if(digitsOnly(phoneStr)){
  
            JOptionPane.showMessageDialog(null, "Phone should contain digits only");
            validData = false;
            return;
            
        }//exit method bool
        
        
        //Validate name and surname input fields to contain only letters
        //Call method
        if(letterOnly(nameStr) && letterOnly(surnameStr)){
            
            validData = true;
          
        }else{
            JOptionPane.showMessageDialog(null, "Name or Surname should only contain letters");
            validData = false;
        }
        

        try{
            
            //Get photo which is required
            //Try to get the file path
            String filePath = filePathPhoto;
            if(filePath.isEmpty()){
            
                JOptionPane.showMessageDialog(null, "Photo is required field was left empty");
                validData = false;
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error finding file path");
            validData = false;
        }

                
        try{
 
            //Get the date in string format from the textBox
            //Try to convert this date into localDate type

                   
             String dobStr = txtdob.getText();
             
        
                
                   if(dobStr.isEmpty()){
            
                       JOptionPane.showMessageDialog(null, "Date of birth is required");
                       validData = false;

                
                   }else{
                        dob = LocalDate.parse(dobStr, format);
                        
                        
                        //Validation for future dob input
                        if(dob.isAfter(LocalDate.now())){
                            
                            JOptionPane.showMessageDialog(null, "Date of Birth cannot be in the future.");
                            validData = false;
                        }
                   }
            
        } catch(DateTimeParseException ex){
            
            JOptionPane.showMessageDialog(null, "Enter a valid date in the format: dd/mm/yyyy");
            validData = false;
            
        }
                
         
        if (validData) {
            
            String str = "\nName: " + nameStr + "\nSurname: " + surnameStr + "\nDate of Birth: " + txtdob.getText() + " \nGender: " + gender + "\nPhone: " + phoneStr + "\nEmail " + email + "\nTeam: " + team+ "\nPosition: " + position+ "\nStartDate: " + startDate+ "\nEndDate: " + endDate + "\nFilePath: " + filePathPhoto;
            JOptionPane.showMessageDialog(null, "You have entered : " + str); 

            int saveConfirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this data?" + str );

        
            if (saveConfirmation == JOptionPane.YES_OPTION) {

            // Save to file using .csv format //  // Write to save to file in csv format

               String toCsv = nameStr + ',' + surnameStr + ',' + team + "\n";

        
            try {
            
                BufferedWriter file = new BufferedWriter(new FileWriter("Players.csv", true));

                file.write(toCsv);
                file.close(); 

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File corrupted!");
        }
    }


} else {

    JOptionPane.showMessageDialog(null, "Data cannot be saved.  ");
}

            
                
               
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhotoActionPerformed
        // TODO add your handling code here:
        
        
        
        try {
            
            JFileChooser fileChooserPhoto = new JFileChooser();
            //for windows "C:\\Users\\antheabaldacchino\\Documents\\JavaFolder\\Main\\Photos"
            String photoPath = "/Users/antheabaldacchino/Documents/JavaFolder/Main/Photos";
            fileChooserPhoto.setCurrentDirectory(new File(photoPath));
            
            int returnValue = fileChooserPhoto.showOpenDialog(null);
            
            if(returnValue == fileChooserPhoto.APPROVE_OPTION){
                
                File selectedFile = fileChooserPhoto.getSelectedFile();
                
                //Set the filePathPhoto to the selected file
                filePathPhoto = selectedFile.getPath();
                //show file path
                JOptionPane.showMessageDialog(null, filePathPhoto);
                
               try{ 
                //get image from file
                BufferedImage img   = ImageIO.read(new File(filePathPhoto)); 
                //Scale image
                Image scaledImage = img.getScaledInstance(lblPhoto.getWidth(),lblPhoto.getHeight(), Image.SCALE_SMOOTH); 
                ImageIcon imageIcon   = new ImageIcon(scaledImage); 
                //place the image on the label
                lblPhoto.setIcon(imageIcon);
               
               }catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Error loading photo");
               }  
            }
 
        }  catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error opeing the file");
        }
    }//GEN-LAST:event_btnAddPhotoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        txtName.setText("");
        txtSurname.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtdob.setText("dd/MM/yyyy");
        
    }//GEN-LAST:event_btnClearActionPerformed

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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new AddNewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPhoto;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JComboBox<String> cmbTeam;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel lblAddNewMember;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JRadioButton rdnFemale;
    private javax.swing.JRadioButton rdnMale;
    private javax.swing.JTextField txtCurrentDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtendDate;
    // End of variables declaration//GEN-END:variables
}
