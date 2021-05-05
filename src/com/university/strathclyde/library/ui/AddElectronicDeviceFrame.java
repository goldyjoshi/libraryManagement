/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.strathclyde.library.ui;

import com.university.strathclyde.library.Utility;
import com.university.strathclyde.library.resource.ElectronicDevice;

/**
 *
 * @author vijayshreejoshi
 */
public class AddElectronicDeviceFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddElectronicdevice
     */
    public AddElectronicDeviceFrame() {
        initComponents();
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
        deviceLocationjTextField = new javax.swing.JTextField();
        deviceModeljLabel = new javax.swing.JLabel();
        deviceBrandjLabel = new javax.swing.JLabel();
        deviceLocationjLabel = new javax.swing.JLabel();
        deviceModeljTextField = new javax.swing.JTextField();
        deviceBrandjTextField = new javax.swing.JTextField();
        canceljButton = new javax.swing.JButton();
        addDevicejButton = new javax.swing.JButton();
        nameljLabel = new javax.swing.JLabel();
        deviceModeljTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Electronic Device "));

        deviceLocationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceLocationjTextFieldActionPerformed(evt);
            }
        });

        deviceModeljLabel.setText("Device Model:");

        deviceBrandjLabel.setText("Device Brand:");

        deviceLocationjLabel.setText("Device Location:");

        deviceModeljTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceModeljTextFieldActionPerformed(evt);
            }
        });

        deviceBrandjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceBrandjTextFieldActionPerformed(evt);
            }
        });

        canceljButton.setText("Cancel");
        canceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljButtonActionPerformed(evt);
            }
        });

        addDevicejButton.setText("Add Device to Library");
        addDevicejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDevicejButtonActionPerformed(evt);
            }
        });

        nameljLabel.setText("Name:");

        deviceModeljTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceModeljTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addDevicejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(canceljButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deviceBrandjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameljLabel)
                            .addComponent(deviceModeljLabel)
                            .addComponent(deviceLocationjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deviceModeljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deviceBrandjTextField)
                            .addComponent(deviceModeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deviceLocationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deviceBrandjTextField, deviceLocationjTextField, deviceModeljTextField, deviceModeljTextField1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameljLabel)
                    .addComponent(deviceModeljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deviceBrandjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deviceBrandjTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deviceModeljLabel)
                    .addComponent(deviceModeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deviceLocationjLabel)
                    .addComponent(deviceLocationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceljButton)
                    .addComponent(addDevicejButton))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deviceModeljTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceModeljTextFieldActionPerformed

    }//GEN-LAST:event_deviceModeljTextFieldActionPerformed

    private void deviceBrandjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceBrandjTextFieldActionPerformed

    }//GEN-LAST:event_deviceBrandjTextFieldActionPerformed

    private void deviceLocationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceLocationjTextFieldActionPerformed

    }//GEN-LAST:event_deviceLocationjTextFieldActionPerformed

    private void canceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceljButtonActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_canceljButtonActionPerformed

    private void addDevicejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDevicejButtonActionPerformed
        String deviceName = deviceModeljTextField1.getText();
        String brand = deviceBrandjTextField.getText();
        String model = deviceModeljTextField.getText();
        String deviceLocation = deviceLocationjTextField.getText();
        String resourceId = deviceName.concat("-").concat(String.valueOf(System.currentTimeMillis()));
        ElectronicDevice newElectronicDevice = new ElectronicDevice(resourceId,deviceName,brand,model,deviceLocation);
        String message = LibraryMainUi.getLibrary().addDeviceInLibrary(newElectronicDevice);
        Utility.showMessageToUser(this, message);
        this.setVisible(false);
    }//GEN-LAST:event_addDevicejButtonActionPerformed

    private void deviceModeljTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceModeljTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviceModeljTextField1ActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDevicejButton;
    private javax.swing.JButton canceljButton;
    private javax.swing.JLabel deviceBrandjLabel;
    private javax.swing.JTextField deviceBrandjTextField;
    private javax.swing.JLabel deviceLocationjLabel;
    private javax.swing.JTextField deviceLocationjTextField;
    private javax.swing.JLabel deviceModeljLabel;
    private javax.swing.JTextField deviceModeljTextField;
    private javax.swing.JTextField deviceModeljTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameljLabel;
    // End of variables declaration//GEN-END:variables
}
