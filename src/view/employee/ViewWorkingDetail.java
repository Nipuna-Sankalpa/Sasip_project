/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.employee;

import controller.employee.EmployeeController;
import datalayer.employee.EmployeeWorkDetailDA;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.employee.Employee;
import utilities.ComboBoxUtility;

/**
 *
 * @author Mampitiya
 */
public class ViewWorkingDetail extends javax.swing.JInternalFrame {//this interface is used to display the 
                                                                    //working details of an employee

    private DefaultTableModel tableModel;
    private EmployeeController empController;

    /**
     * Creates new form ViewWorkingDetail
     */
    public ViewWorkingDetail() {
        String columns[] = {"Date", "Time", "Class ID"};
        tableModel = new DefaultTableModel(columns, 0);
        initComponents();
        imageLbl.setPreferredSize(new Dimension(128, 128));
        imageLbl.setMaximumSize(new Dimension(128, 128));
        imageLbl.setMinimumSize(new Dimension(128, 128));
        empController = new EmployeeController();
        try {
            ComboBoxUtility.setComboItem(idCmbx, "Select employeeId from employee order by 1");
            ComboBoxUtility.setComboItem(nameCmbx, "Select concat(firstName,' ', lastName) as name from employee");
        } catch (SQLException | ClassNotFoundException ex) {
        }

        JTextField textField = (JTextField) idCmbx.getEditor().getEditorComponent();
        new ComboBoxUtility().setSearchableCombo(idCmbx, textField, "No such employee..");

        JTextField textField1 = (JTextField) nameCmbx.getEditor().getEditorComponent();
        new ComboBoxUtility().setSearchableCombo(nameCmbx, textField1, "No such employee..");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idCmbx = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        desiTxt = new javax.swing.JTextField();
        pnlLoggedIn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeDetailTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();
        nameCmbx = new javax.swing.JComboBox();
        clearBtn = new javax.swing.JButton();

        setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Working Details"));

        jLabel1.setText("Employee ID :");

        jLabel2.setText("Employee Name :");

        idCmbx.setEditable(true);
        idCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCmbxActionPerformed(evt);
            }
        });

        jLabel3.setText("Designation :");

        desiTxt.setEditable(false);

        pnlLoggedIn.setBorder(javax.swing.BorderFactory.createTitledBorder("Logged in Details:"));
        pnlLoggedIn.setPreferredSize(new java.awt.Dimension(380, 60));

        employeeDetailTable.setModel(tableModel);
        jScrollPane1.setViewportView(employeeDetailTable);

        javax.swing.GroupLayout pnlLoggedInLayout = new javax.swing.GroupLayout(pnlLoggedIn);
        pnlLoggedIn.setLayout(pnlLoggedInLayout);
        pnlLoggedInLayout.setHorizontalGroup(
            pnlLoggedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
            .addGroup(pnlLoggedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoggedInLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlLoggedInLayout.setVerticalGroup(
            pnlLoggedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
            .addGroup(pnlLoggedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoggedInLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Picture"));

        imageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/business_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(imageLbl)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLbl)
                .addContainerGap())
        );

        nameCmbx.setEditable(true);
        nameCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCmbxActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLoggedIn, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(desiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addComponent(pnlLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        idCmbx.setSelectedIndex(0);
        nameCmbx.setSelectedIndex(0);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/employee_images/business_user.png"));

        imageLbl.setIcon(imageIcon);
        desiTxt.setText("");
        tableModel.setRowCount(0);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void idCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCmbxActionPerformed
        String id = "";
        tableModel.setRowCount(0);
        if (idCmbx.getSelectedItem() != null && idCmbx.getSelectedIndex() != 0) {
            id = idCmbx.getSelectedItem().toString();
            if (!id.equals("No such employee..")) {
                try {
                    ResultSet rst = EmployeeWorkDetailDA.searchWorkingDetByID(id);
                    Employee employee = empController.searchEmployeeByID(id);

                    if (employee != null) {
                        nameCmbx.setSelectedItem(employee.getFirstName() + " " + employee.getLastName());
                        desiTxt.setText(employee.getDesignation());
                        imageLbl.setIcon(employee.getImage());
                    }
                    
                    while (rst.next()) {
                        String date = rst.getTime(1).toString();
                        String time = rst.getTime(2).toString();
                        String classID = rst.getString(3);
                        tableModel.addRow(new String[]{date, time, classID});
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                }
            }
        }
    }//GEN-LAST:event_idCmbxActionPerformed

    private void nameCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCmbxActionPerformed
        tableModel.setRowCount(0);
        String name = "";
        if (nameCmbx.getSelectedItem() != null && nameCmbx.getSelectedIndex() != 0) {
            name = nameCmbx.getSelectedItem().toString();

            if (!name.equals("No such employee..")) {
                try {
                    Employee employee = empController.searchEmployeeByName(name);
                    if (employee != null) {
                        idCmbx.setSelectedItem(employee.getEmployeeID());
                        desiTxt.setText(employee.getDesignation());
                        imageLbl.setIcon(employee.getImage());
                    }

                    ResultSet rst = EmployeeWorkDetailDA.searchWorkingDetByName(name);
                    while (rst.next()) {
                        String date = rst.getDate(1).toString();
                        String time = rst.getTime(2).toString();
                        String classID = rst.getString(3);
                        tableModel.addRow(new String[]{date, time, classID});
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                }
            }
        }
    }//GEN-LAST:event_nameCmbxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField desiTxt;
    private javax.swing.JTable employeeDetailTable;
    private javax.swing.JComboBox idCmbx;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox nameCmbx;
    private javax.swing.JPanel pnlLoggedIn;
    // End of variables declaration//GEN-END:variables
}
