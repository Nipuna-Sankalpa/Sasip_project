/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.student;

import controller.student.StudentDetailController;
import datalayer.student.StudentDA;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.student.Student;
import utilities.ComboBoxUtility;

/**
 *
 * @author Mampitiya
 */
public class EditStudent extends javax.swing.JInternalFrame {
    private String filePath;
    StudentDetailController controller;
    /**
     * Creates new form EditStudent
     */
    public EditStudent() {
        initComponents();
        imgLbl.setPreferredSize(new Dimension(128, 128));
        imgLbl.setMaximumSize(new Dimension(128, 128));
        imgLbl.setMinimumSize(new Dimension(128, 128));
        controller = new StudentDetailController();
        try {
            ComboBoxUtility.setComboItem(idCmbx, "Select studentID from student order by 1");
            ComboBoxUtility.setComboItem(nameCmbx, "Select concat(firstName,' ',lastName) as name from student");
            
            JTextField txt1 = (JTextField) idCmbx.getEditor().getEditorComponent();
            new ComboBoxUtility().setSearchableCombo(idCmbx, txt1, "No such student");
            
            JTextField txt2 = (JTextField) nameCmbx.getEditor().getEditorComponent();
            new ComboBoxUtility().setSearchableCombo(nameCmbx, txt2, "No such student");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Database Error!");            
        }
    }

    public EditStudent(StudentDetailController controller) {
        initComponents();
        try {
            ComboBoxUtility.setComboItem(idCmbx, "Select studentID from student order by 1");
            ComboBoxUtility.setComboItem(nameCmbx, "Select concat(firstName,' ',lastName) as name from student");
            
            JTextField txt1 = (JTextField) idCmbx.getEditor().getEditorComponent();
            new ComboBoxUtility().setSearchableCombo(idCmbx, txt1, "No such student");
            
            JTextField txt2 = (JTextField) nameCmbx.getEditor().getEditorComponent();
            new ComboBoxUtility().setSearchableCombo(nameCmbx, txt2, "No such student");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Database Error!");            
        }
        
        this.controller = controller;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        idRbtn = new javax.swing.JRadioButton();
        idCmbx = new javax.swing.JComboBox();
        nameRbtn = new javax.swing.JRadioButton();
        nameCmbx = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        genderCmbx = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        detailLbl1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gurdNameTxt = new javax.swing.JTextField();
        guardPhnTxt = new javax.swing.JTextField();
        detailLbl2 = new javax.swing.JLabel();
        detailLbl3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By"));

        buttonGroup1.add(idRbtn);
        idRbtn.setSelected(true);
        idRbtn.setText("Student ID:");
        idRbtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                idRbtnStateChanged(evt);
            }
        });

        idCmbx.setEditable(true);
        idCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCmbxActionPerformed(evt);
            }
        });

        buttonGroup1.add(nameRbtn);
        nameRbtn.setText("Student Name:");
        nameRbtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nameRbtnStateChanged(evt);
            }
        });

        nameCmbx.setEditable(true);
        nameCmbx.setEnabled(false);
        nameCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCmbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idRbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameRbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRbtn)
                    .addComponent(idCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRbtn)
                    .addComponent(nameCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Profile"));

        jLabel3.setText("Address: ");

        jLabel4.setText("Telephone: ");

        jLabel5.setText("Gender: ");

        phoneTxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                phoneTxtCaretUpdate(evt);
            }
        });

        genderCmbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Male", "Female" }));
        genderCmbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                genderCmbxItemStateChanged(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(3);
        txtAddress.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAddressCaretUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(txtAddress);

        detailLbl1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(genderCmbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(87, 87, 87))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detailLbl1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailLbl1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(genderCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        imgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/user.png"))); // NOI18N

        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imgLbl)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(browseBtn)
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(imgLbl)
                .addGap(25, 25, 25)
                .addComponent(browseBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardian Details"));

        jLabel7.setText("Name: ");

        jLabel8.setText("Telephone:");

        gurdNameTxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                gurdNameTxtCaretUpdate(evt);
            }
        });

        guardPhnTxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                guardPhnTxtCaretUpdate(evt);
            }
        });

        detailLbl2.setForeground(new java.awt.Color(255, 0, 0));

        detailLbl3.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(guardPhnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(detailLbl3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(gurdNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detailLbl2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailLbl2)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(gurdNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailLbl3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(guardPhnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(13, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(clearBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idRbtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_idRbtnStateChanged
        if (idRbtn.isSelected()) {
            idCmbx.setEnabled(true);
            nameCmbx.setEnabled(false);
        }
    }//GEN-LAST:event_idRbtnStateChanged

    private void idCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCmbxActionPerformed
        String id = "";
        if (idCmbx.getSelectedItem() != null && idCmbx.getSelectedIndex() != 0) {
            id = idCmbx.getSelectedItem().toString();
            Student student = controller.searchStudentByID(id);
            txtAddress.setText(student.getAddress());
            phoneTxt.setText(student.getMobileNumber());
            genderCmbx.setSelectedItem(student.isMale()? "Male" : "Female");
            gurdNameTxt.setText(student.getGuardianName());
            guardPhnTxt.setText(student.getGuardianNumber());
            imgLbl.setIcon(student.getImage());
            nameCmbx.setSelectedItem(student.getFirstName() + " " + student.getLastName());
        }
    }//GEN-LAST:event_idCmbxActionPerformed

    private void nameRbtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nameRbtnStateChanged
        if(nameRbtn.isSelected()){
            nameCmbx.setEnabled(true);
            idCmbx.setEnabled(false);
        }
    }//GEN-LAST:event_nameRbtnStateChanged

    private void nameCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCmbxActionPerformed
        String name = "";
        if (nameCmbx.getSelectedItem() != null && nameCmbx.getSelectedIndex() != 0) {
            name = nameCmbx.getSelectedItem().toString();
            Student student = controller.searchStudentByName(name);
            txtAddress.setText(student.getAddress());
            phoneTxt.setText(student.getMobileNumber());
            genderCmbx.setSelectedItem(student.isMale()? "Male" : "Female");
            gurdNameTxt.setText(student.getGuardianName());
            imgLbl.setIcon(student.getImage());
            guardPhnTxt.setText(student.getGuardianNumber());
            idCmbx.setSelectedItem(student.getStudentID());
        }
    }//GEN-LAST:event_nameCmbxActionPerformed

    private void phoneTxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_phoneTxtCaretUpdate
        String tel = phoneTxt.getText();
        boolean isLetter = false;
        for (int i = 0; i < tel.length(); i++) {
            if (!Character.isDigit(tel.charAt(i))) {
                isLetter = true;
                break;
            }
        }
        if (isLetter || tel.length() > 10) {
            detailLbl1.setText("Invalid number");
        } else {
            detailLbl1.setText("");
        }
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_phoneTxtCaretUpdate

    private void gurdNameTxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_gurdNameTxtCaretUpdate
        String name = gurdNameTxt.getText();
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)) & !Character.isSpaceChar(name.charAt(i))) {
                detailLbl2.setText("Invalid name");
                break;
            } else {
                detailLbl2.setText("");
            }
        }
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_gurdNameTxtCaretUpdate

    private void guardPhnTxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_guardPhnTxtCaretUpdate
        String tel = guardPhnTxt.getText();
        boolean isLetter = false;
        for (int i = 0; i < tel.length(); i++) {
            if (!Character.isDigit(tel.charAt(i))) {
                isLetter = true;
                break;
            }
        }
        if (isLetter || tel.length() > 10) {
            detailLbl3.setText("Invalid number");
        } else {
            detailLbl3.setText("");
        }
        
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_guardPhnTxtCaretUpdate

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
            imgLbl.setIcon(new ImageIcon(filePath));
        }
    }//GEN-LAST:event_browseBtnActionPerformed

    private void txtAddressCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAddressCaretUpdate
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtAddressCaretUpdate

    private void genderCmbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_genderCmbxItemStateChanged
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_genderCmbxItemStateChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = idCmbx.getSelectedItem().toString();
        String names[] = nameCmbx.getSelectedItem().toString().split(" ");        
        String address = txtAddress.getText();
        String mobile = phoneTxt.getText();
        boolean gender = (genderCmbx.getSelectedIndex() == 1);
        String guard = gurdNameTxt.getText();
        String guardNo = guardPhnTxt.getText();
        Student student = new Student(id, names[0], names[1], address, mobile, guard, guardNo, gender);
        int res = controller.updateStudent(student);
        if(res == 1){
            JOptionPane.showMessageDialog(this, "Successfully Updated!");
            clearBtnActionPerformed(evt);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        idCmbx.setSelectedIndex(0);
        nameCmbx.setSelectedIndex(0);
        txtAddress.setText("");
        phoneTxt.setText("");
        guardPhnTxt.setText("");
        gurdNameTxt.setText("");
        genderCmbx.setSelectedIndex(0);
        imgLbl.setIcon(new ImageIcon(getClass().getResource("/resources/student_images/user.png")));
        btnUpdate.setEnabled(false); 
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel detailLbl1;
    private javax.swing.JLabel detailLbl2;
    private javax.swing.JLabel detailLbl3;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JComboBox genderCmbx;
    private javax.swing.JTextField guardPhnTxt;
    private javax.swing.JTextField gurdNameTxt;
    private javax.swing.JComboBox idCmbx;
    private javax.swing.JRadioButton idRbtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox nameCmbx;
    private javax.swing.JRadioButton nameRbtn;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextArea txtAddress;
    // End of variables declaration//GEN-END:variables
}
