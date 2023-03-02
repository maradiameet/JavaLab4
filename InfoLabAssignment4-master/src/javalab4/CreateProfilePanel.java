/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javalab4;

import java.awt.Image;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Employee;
import model.EmployeeDirectory;

public class CreateProfilePanel extends javax.swing.JPanel {

    Employee inputEmployee;
    JPanel bottomPanel;
    EmployeeDirectory allEmployees;
    String selectedPhotoPath;
    
    public CreateProfilePanel(JPanel bottomPanel, EmployeeDirectory allEmployees) {
        initComponents();
        this.bottomPanel = bottomPanel;
        inputEmployee = new Employee();
        this.allEmployees = allEmployees;
        employeeIDField.setText(Integer.toString(getEmployeeID()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        startDateField = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        browsePhotoButton = new javax.swing.JButton();
        photoDisplayLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 255, 153));

        nameLabel.setText("Name:");

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Add Employee Data");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        ageLabel.setText("Age:");

        genderLabel.setText("Gender:");

        genderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldActionPerformed(evt);
            }
        });

        startDateLabel.setText("Start Date(dd/MM/YYYY): ");

        startDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateFieldActionPerformed(evt);
            }
        });

        levelLabel.setText("Level:");

        levelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFieldActionPerformed(evt);
            }
        });

        phoneField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFieldFocusLost(evt);
            }
        });
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneFieldKeyTyped(evt);
            }
        });

        phoneLabel.setText("Phone Number:");

        mailLabel.setText("Email Address:");

        mailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailFieldFocusLost(evt);
            }
        });
        mailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailFieldActionPerformed(evt);
            }
        });

        browsePhotoButton.setBackground(new java.awt.Color(153, 153, 255));
        browsePhotoButton.setText("Browse Photo:");
        browsePhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePhotoButtonActionPerformed(evt);
            }
        });

        ageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFieldFocusLost(evt);
            }
        });
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageFieldKeyTyped(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(153, 153, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        employeeIDLabel.setText("Employee ID:");

        employeeIDField.setEditable(false);
        employeeIDField.setBackground(new java.awt.Color(204, 204, 204));
        employeeIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(browsePhotoButton))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(photoDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(levelLabel)
                                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameField)
                                        .addComponent(genderField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(employeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(employeeIDLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDLabel)
                    .addComponent(employeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel)
                    .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browsePhotoButton)
                    .addComponent(photoDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void genderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFieldActionPerformed

    private void startDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateFieldActionPerformed

    private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void mailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailFieldActionPerformed

    private void browsePhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePhotoButtonActionPerformed
        JFileChooser browseImageFile = new JFileChooser();
        
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Images", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedPhoto = browseImageFile.getSelectedFile();
            selectedPhotoPath = selectedPhoto.getAbsolutePath();
            ImageIcon imagePreview = new ImageIcon(selectedPhotoPath);
            
            Image image = imagePreview.getImage().getScaledInstance(photoDisplayLabel.getWidth(), photoDisplayLabel.getHeight(), Image.SCALE_SMOOTH);
            
            photoDisplayLabel.setIcon(new ImageIcon(image));
            
            inputEmployee.setPhoto(selectedPhotoPath);
        }
    }//GEN-LAST:event_browsePhotoButtonActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        if(selectedPhotoPath.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a photo", "Error", HEIGHT);
            
        }
        
        Date startDate = new Date();
                
        try{        
        inputEmployee.setName(nameField.getText());
        inputEmployee.setEmployeeId(getEmployeeID());
        
        
        
        inputEmployee.setGender(genderField.getText());
        inputEmployee.setLevel(levelField.getText());
        inputEmployee.setEmail(mailField.getText());
        
        
        
        try {
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDateField.getText());
            inputEmployee.setStartDate(startDate);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the date in the dd/MM/yyyy format", "Error", HEIGHT);
            return;
        }
        
        allEmployees.addEmployee(inputEmployee);
        resetForm();
        JOptionPane.showMessageDialog(this, "User Saved Successfully", "Success", HEIGHT);
               
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter all your details", "Error", HEIGHT);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void employeeIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDFieldActionPerformed

    private void ageFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
        {
            JOptionPane.showMessageDialog(this, "Only Numeric Value");
            evt.consume();
        }
        
        
        
    }//GEN-LAST:event_ageFieldKeyTyped

    private void mailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFieldFocusLost
        // TODO add your handling code here:
        String emaill = mailField.getText();
        if(emaill.contains("@") && emaill.contains("."))
        {
            //JOptionPane.showMessageDialog(this,"Valid email");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Invalid email");
            mailField.requestFocusInWindow();
        }
        
    }//GEN-LAST:event_mailFieldFocusLost

    private void phoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
        {
            JOptionPane.showMessageDialog(this, "Only Numeric value");
            evt.consume();
        }
    }//GEN-LAST:event_phoneFieldKeyTyped

    private void phoneFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFieldFocusLost
        // TODO add your handling code here:
        if(phoneField.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Phone number should be 10 digits long", "Error", HEIGHT);
            phoneField.requestFocusInWindow();
        } else {
            inputEmployee.setPhoneNumber(Long.parseLong(phoneField.getText()));
        }
    }//GEN-LAST:event_phoneFieldFocusLost

    private void ageFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(ageField.getText()) < 18 || Integer.parseInt(ageField.getText()) > 65) {
            JOptionPane.showMessageDialog(this, "Please enter an age between 18 and 65", "Error", HEIGHT);
            ageField.requestFocusInWindow();
        } else {
            inputEmployee.setAge(Integer.parseInt(ageField.getText()));
        }
    }//GEN-LAST:event_ageFieldFocusLost

    private int getEmployeeID() {
        int newEmployeeId = 1;
        ArrayList<Employee> currentEmployees = allEmployees.getAllEmployees();
        
       if(currentEmployees.isEmpty()) {
           return newEmployeeId;
       }
        
        for(int i = 0; i < currentEmployees.size(); i++) {
            if(currentEmployees.get(i).getEmployeeId() == newEmployeeId) {
                newEmployeeId++;
            } else {
                break;
            }
        }
        
        return newEmployeeId;
    }
    
    private void resetForm() {
        inputEmployee = new Employee();
        employeeIDField.setText(Integer.toString(getEmployeeID()));
        
        nameField.setText("");
        ageField.setText("");
        genderField.setText("");
        levelField.setText("");
        mailField.setText("");
        phoneField.setText("");
        startDateField.setText("");
        photoDisplayLabel.setIcon(new ImageIcon());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton browsePhotoButton;
    private javax.swing.JTextField employeeIDField;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField levelField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel photoDisplayLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField startDateField;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}