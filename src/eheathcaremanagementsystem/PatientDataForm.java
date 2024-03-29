/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eheathcaremanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Agha
 */
public class PatientDataForm extends javax.swing.JFrame {

    /**
     * Creates new form PatientDataForm
     */
    public PatientDataForm() {
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

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        add_Button = new javax.swing.JButton();
        back_Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Id_TextField = new javax.swing.JTextField();
        name_TextField = new javax.swing.JTextField();
        age_TextField = new javax.swing.JTextField();
        disease_TextField = new javax.swing.JTextField();
        phoneNo_TextField = new javax.swing.JTextField();
        male_RadioButton = new javax.swing.JRadioButton();
        female_RadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                                                                                                                                                                          HN Health Care Management System");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_Button.setBackground(new java.awt.Color(153, 0, 0));
        add_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_Button.setForeground(new java.awt.Color(255, 255, 255));
        add_Button.setText("ADD");
        add_Button.setBorderPainted(false);
        add_Button.setOpaque(true);
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(add_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 640, 110, 40));

        back_Button.setBackground(new java.awt.Color(153, 0, 0));
        back_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back_Button.setForeground(new java.awt.Color(255, 255, 255));
        back_Button.setText("BACK");
        back_Button.setBorderPainted(false);
        back_Button.setOpaque(true);
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 110, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Patient's Information");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 220, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eheathcaremanagementsystem/upper background.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 260, 330));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Name :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Age :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Disease :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Phone No :");

        Id_TextField.setForeground(new java.awt.Color(204, 204, 204));
        Id_TextField.setText("Enter your valid email id");
        Id_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Id_TextFieldMouseClicked(evt);
            }
        });
        Id_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Id_TextFieldKeyPressed(evt);
            }
        });

        name_TextField.setForeground(new java.awt.Color(204, 204, 204));
        name_TextField.setText("Enter your name");
        name_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name_TextFieldMouseClicked(evt);
            }
        });

        age_TextField.setForeground(new java.awt.Color(204, 204, 204));
        age_TextField.setText("Enter your age");
        age_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                age_TextFieldMouseClicked(evt);
            }
        });

        disease_TextField.setForeground(new java.awt.Color(204, 204, 204));
        disease_TextField.setText("Enter your health problems");
        disease_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disease_TextFieldMouseClicked(evt);
            }
        });

        phoneNo_TextField.setForeground(new java.awt.Color(204, 204, 204));
        phoneNo_TextField.setText("Enter your phone number");
        phoneNo_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNo_TextFieldMouseClicked(evt);
            }
        });

        male_RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(male_RadioButton);
        male_RadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        male_RadioButton.setText("Male");
        male_RadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        female_RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(female_RadioButton);
        female_RadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female_RadioButton.setText("Female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(male_RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(female_RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name_TextField)
                    .addComponent(Id_TextField)
                    .addComponent(phoneNo_TextField)
                    .addComponent(disease_TextField)
                    .addComponent(age_TextField))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(male_RadioButton)
                        .addComponent(female_RadioButton)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(age_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(disease_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(phoneNo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 86, 540, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eheathcaremanagementsystem/background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        // TODO add your handling code here:
        
        PatientMenu pm = new PatientMenu();
        pm.setVisible(true);
        pm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ButtonActionPerformed
        // TODO add your handling code here:
        try{
        if(Id_TextField.getText().isEmpty() || name_TextField.getText().isEmpty() || male_RadioButton.getText().isEmpty() || age_TextField.getText().isEmpty() || disease_TextField.getText().isEmpty()|| phoneNo_TextField.getText().isEmpty() ){
           JOptionPane.showMessageDialog(this, "Information Missing");
        }
         else{
        String ids = Id_TextField.getText();
        String name = name_TextField.getText();
        String gender = "";
        if(male_RadioButton.isSelected()){
            gender="male";
        }
        else{
            gender="female";
        }
        String ages = age_TextField.getText();
        String disease = disease_TextField.getText();
        String phoneNo = phoneNo_TextField.getText();
        int age = Integer.parseInt(ages);
        Patient p = new Patient(ids,name,gender,age,disease,phoneNo);
        //third layer
        PatientFileHandler f = new PatientFileHandler();
        f.write(p);
        //using business class
        JOptionPane.showMessageDialog(this, "Patient information is added successfully");
        Id_TextField.setText("");
        name_TextField.setText("");
        male_RadioButton.setText("");
        age_TextField.setText("");
        disease_TextField.setText("");
        phoneNo_TextField.setText("");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Information is wrong");
        }
    }//GEN-LAST:event_add_ButtonActionPerformed

    private void Id_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Id_TextFieldMouseClicked
        // TODO add your handling code here:
        if(Id_TextField.getText().equals("Enter your valid email id"))
        {
        Id_TextField.setText(null);
        Id_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Id_TextField.setText("");
        }
    }//GEN-LAST:event_Id_TextFieldMouseClicked

    private void name_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_TextFieldMouseClicked
        // TODO add your handling code here:
        if(name_TextField.getText().equals("Enter your name"))
        {
        name_TextField.setText(null);
        name_TextField.setForeground(new java.awt.Color(0, 0, 0));
        name_TextField.setText("");
        }
    }//GEN-LAST:event_name_TextFieldMouseClicked

    private void age_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_age_TextFieldMouseClicked
        // TODO add your handling code here:
        if(age_TextField.getText().equals("Enter your age"))
        {
        age_TextField.setText(null);
        age_TextField.setForeground(new java.awt.Color(0, 0, 0));
        age_TextField.setText("");
        }
    }//GEN-LAST:event_age_TextFieldMouseClicked

    private void disease_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disease_TextFieldMouseClicked
        // TODO add your handling code here:
        if(disease_TextField.getText().equals("Enter your health problems"))
        {
        disease_TextField.setText(null);
        disease_TextField.setForeground(new java.awt.Color(0, 0, 0));
        disease_TextField.setText("");
        }
    }//GEN-LAST:event_disease_TextFieldMouseClicked

    private void phoneNo_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNo_TextFieldMouseClicked
        // TODO add your handling code here:
        if(phoneNo_TextField.getText().equals("Enter your phone number"))
        {
        phoneNo_TextField.setText(null);
        phoneNo_TextField.setForeground(new java.awt.Color(0, 0, 0));
        phoneNo_TextField.setText("");
        }
    }//GEN-LAST:event_phoneNo_TextFieldMouseClicked

    private void Id_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Id_TextFieldKeyPressed
        // TODO add your handling code here:
        if(Id_TextField.getText().equals("Enter your valid email id"))
        {
        Id_TextField.setText(null);
        Id_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Id_TextField.setText("");
        }
    }//GEN-LAST:event_Id_TextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(PatientDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_TextField;
    private javax.swing.JButton add_Button;
    private javax.swing.JTextField age_TextField;
    private javax.swing.JButton back_Button;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField disease_TextField;
    private javax.swing.JRadioButton female_RadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton male_RadioButton;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JTextField phoneNo_TextField;
    // End of variables declaration//GEN-END:variables
}
