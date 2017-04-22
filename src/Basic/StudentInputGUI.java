package Basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class StudentInputGUI extends javax.swing.JFrame {

    String fName, add, contry, gend;
    String degree = "";
    String gap = " ";
    JFileChooser fc;
    File dir;
    DefaultTableModel model;
    File file = null;

    /**
     * Creates new form StudentInputGUI
     */
    public StudentInputGUI() {
        initComponents();
        model = new DefaultTableModel();
        showAllTable.setModel(model);
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Gander");
        model.addColumn("Degree");
        model.addColumn("Country");

        //setIconImage(new ImageIcon("C:\\Users\\mokle\\OneDrive\\Documents\\NetBeansProjects\\JavaSwingBasicGUI\\src\\Basic\\imgs\\unnamed.png").getImage());
        URL iconURL = getClass().getResource("/Basic/imgs/unnamed.png");

        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ganderbuttonGroup = new javax.swing.ButtonGroup();
        inputPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        countryComboBox = new javax.swing.JComboBox<>();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        degreePanel = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        showAllPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showAllTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        showTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        displayInTextArButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        displayInTableButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Persional Info");

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Personal Info"));

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Country");

        jLabel4.setText("Gander");

        jLabel5.setText("Degree");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        addressTextField.setToolTipText("Type Name Her");

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Country-", "Bagladesh", "India", "Canada", "USA", "UK" }));

        ganderbuttonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        ganderbuttonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        jCheckBox1.setText("SSC");

        jCheckBox2.setText("HSC");

        jCheckBox3.setText("DIPLOMA");

        jCheckBox4.setText("BSc");

        jCheckBox5.setText("MSc");

        jCheckBox6.setText("PHD");

        javax.swing.GroupLayout degreePanelLayout = new javax.swing.GroupLayout(degreePanel);
        degreePanel.setLayout(degreePanelLayout);
        degreePanelLayout.setHorizontalGroup(
            degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(degreePanelLayout.createSequentialGroup()
                .addGroup(degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(100, 100, 100)
                .addGroup(degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        degreePanelLayout.setVerticalGroup(
            degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(degreePanelLayout.createSequentialGroup()
                .addGroup(degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(degreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)))
        );

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(76, 76, 76)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countryComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(degreePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField)
                    .addComponent(addressTextField))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(degreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        showAllPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("All Student List"));

        showAllTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Gander", "Degree", "Country"
            }
        ));
        jScrollPane1.setViewportView(showAllTable);

        showTextArea.setColumns(20);
        showTextArea.setRows(5);
        jScrollPane2.setViewportView(showTextArea);

        javax.swing.GroupLayout showAllPanelLayout = new javax.swing.GroupLayout(showAllPanel);
        showAllPanel.setLayout(showAllPanelLayout);
        showAllPanelLayout.setHorizontalGroup(
            showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAllPanelLayout.createSequentialGroup()
                .addGroup(showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        showAllPanelLayout.setVerticalGroup(
            showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAllPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        displayInTextArButton.setText("Display in TextArea");
        displayInTextArButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInTextArButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        displayInTableButton.setText("Display in Table");
        displayInTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInTableButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(displayInTextArButton)
                .addGap(18, 18, 18)
                .addComponent(displayInTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(displayInTextArButton)
                    .addComponent(displayInTableButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(showAllPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showAllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        getAllRecord();
        if (nameTextField.getText().isEmpty() && addressTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill the Name and Address field.");
            nameTextField.requestFocus();
        } else if (nameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill the Name field.");
            nameTextField.requestFocus();
        } else if (addressTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill the Address field.");
            addressTextField.requestFocus();
        } else {
            if (countryComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Select Country.");
                countryComboBox.requestFocus();
            } else {
                fc = new JFileChooser(dir);
                //file filter
                FileNameExtensionFilter filter;
                filter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
                fc.addChoosableFileFilter(filter);
                int option = fc.showSaveDialog(this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    dir = fc.getCurrentDirectory();
                    model.addRow(new Object[]{fName, add, gend, degree, contry});

                    file = fc.getSelectedFile();
                    try {
                        writeAll();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void dispInTextarea() {
        FileInputStream fis = null;
        fc = new JFileChooser(dir);
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            dir = fc.getCurrentDirectory();
            try {
                String str1 = "";
                fis = new FileInputStream(file);
                int len = (int) file.length();
                for (int i = 0; i < len; i++) {
                    char str2 = 0;
                    try {
                        str2 = (char) fis.read();
                        if (str2 == ',') {
                            str2 = '\t';
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    str1 = str1 + str2;
                }
                showTextArea.setText(str1);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (Exception e) {
                }
            }

        }
    }

    private void dispInTable() {
        InputStream is = null;
        fc = new JFileChooser(dir);
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            dir = fc.getCurrentDirectory();
            try {
                File f = file;
                is = new FileInputStream(f);
                Scanner scan = new Scanner(is);
                String[] mArr;
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if (line.indexOf(",") > 1) {
                        mArr = line.split(",");

                    } else {
                        mArr = line.split("\n");
                    }
                    Object[] data = new Object[mArr.length];
                    for (int i = 0; i < data.length; i++) {
                        data[i] = mArr[i];

                    }
                    model.addRow(data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (Exception e) {

                }
            }

        }
    }

    private void writeAll() throws IOException {
        BufferedWriter buf = null;
        try {
            buf = new BufferedWriter(new FileWriter(file + getExtention(), true));
            buf.write(fName + ", " + add + ", " + gend + ", " + degree + ", " + contry);
            buf.newLine();
            JOptionPane.showMessageDialog(this, "Data Save");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (buf != null) {
                buf.close();
            }
        }
    }

    private String getExtention() {
        String ext = "";
        String extention = fc.getFileFilter().getDescription();
        if (extention.equals("*.txt")) {
            ext = ".txt";
        }
        return ext;
    }
    private void displayInTextArButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInTextArButtonActionPerformed
        //showTextArea.setText("Name: " + fName + " Address: " + add + " Country: " + contry + "\n" + "Gander: " + gend + "\nDegree: " + degree);
        dispInTextarea();
    }//GEN-LAST:event_displayInTextArButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        nameTextField.setText("");
        addressTextField.setText("");
        countryComboBox.setSelectedIndex(0);
        ganderbuttonGroup.clearSelection();
        showTextArea.setText("");
        degree = "";
        for (int i = 0; i < degreePanel.getComponentCount(); i++) {
            JCheckBox box = (JCheckBox) degreePanel.getComponent(i);
            if (box.isSelected()) {
                box.setSelected(false);
            }

        }
        if (showAllTable.getRowCount() > 0) {
            for (int i = showAllTable.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);

            }
        }


    }//GEN-LAST:event_clearButtonActionPerformed

    private void displayInTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInTableButtonActionPerformed
        dispInTable();
    }//GEN-LAST:event_displayInTableButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void getAllRecord() {
        fName = nameTextField.getText();
        add = addressTextField.getText();
        contry = countryComboBox.getSelectedItem().toString();
        if (maleRadioButton.isSelected()) {
            gend = "Male";
        } else {
            gend = "Female";
        }

        for (int i = 0; i < degreePanel.getComponentCount(); i++) {
            JCheckBox checkBox = (JCheckBox) degreePanel.getComponent(i);
            if (checkBox.isSelected()) {
                degree += checkBox.getText() + " ";
            } else {
                degree += gap;
            }
        }
    }

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
            java.util.logging.Logger.getLogger(StudentInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInputGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JPanel degreePanel;
    private javax.swing.JButton displayInTableButton;
    private javax.swing.JButton displayInTextArButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup ganderbuttonGroup;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel showAllPanel;
    private javax.swing.JTable showAllTable;
    private javax.swing.JTextArea showTextArea;
    // End of variables declaration//GEN-END:variables
}
