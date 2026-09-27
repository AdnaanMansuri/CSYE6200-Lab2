package ui;

import model.UserProfile;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainJFrame extends javax.swing.JFrame {

    private final UserProfile profile = new UserProfile();

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        pnlProfile = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        spnAge = new javax.swing.JSpinner();
        lblGender = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JFormattedTextField();
        lblContinent = new javax.swing.JLabel();
        cmbContinent = new javax.swing.JComboBox<>();
        lblExperience = new javax.swing.JLabel();
        scrExperience = new javax.swing.JScrollPane();
        txtExperience = new javax.swing.JTextArea();
        lblPhoto = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab 2 - User Profile");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblAge.setText("Age:");

        spnAge.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        lblGender.setText("Gender");

        genderGroup.add(rdoMale);
        rdoMale.setText("Male");

        genderGroup.add(rdoFemale);
        rdoFemale.setText("Female");

        lblPhone.setText("Phone:");

        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblContinent.setText("Continent:");

        cmbContinent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa", "Antarctica", "Asia", "Australia", "Europe", "North America", "South America" }));

        lblExperience.setText("Experience:");

        txtExperience.setColumns(20);
        txtExperience.setRows(5);
        scrExperience.setViewportView(txtExperience);

        lblPhoto.setText("Photo:");

        btnUpload.setText("Upload Photo");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProfileLayout = new javax.swing.GroupLayout(pnlProfile);
        pnlProfile.setLayout(pnlProfileLayout);
        pnlProfileLayout.setHorizontalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfileLayout.createSequentialGroup()
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProfileLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnSubmit))
                    .addGroup(pnlProfileLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblPhone)
                            .addComponent(lblContinent)
                            .addComponent(lblExperience)
                            .addComponent(lblPhoto))
                        .addGap(6, 6, 6)
                        .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoMale)
                            .addComponent(rdoFemale)
                            .addGroup(pnlProfileLayout.createSequentialGroup()
                                .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpload))
                            .addComponent(cmbContinent, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlProfileLayout.setVerticalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdoMale))
                .addGap(6, 6, 6)
                .addComponent(rdoFemale)
                .addGap(6, 6, 6)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContinent)
                    .addComponent(cmbContinent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExperience)
                    .addComponent(scrExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpload))
                .addGap(80, 80, 80)
                .addComponent(btnSubmit)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(chooser.getSelectedFile());
                profile.setPhoto(new ImageIcon(img.getScaledInstance(80, 100, Image.SCALE_SMOOTH)));
                txtPhoto.setText(chooser.getSelectedFile().getName());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please choose a valid image file", "Invalid Image", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastName.getText().trim();
        int age = (Integer) spnAge.getValue();
        String phone = txtPhone.getText();
        String experience = txtExperience.getText().trim();
        String errors = "";

        if (!firstName.matches("[a-zA-Z]+")) {
            errors += "First name should have letters only\n";
        }
        if (!lastName.matches("[a-zA-Z]+")) {
            errors += "Last name should have letters only\n";
        }
        if (age < 1) {
            errors += "Age should be between 1 and 120\n";
        }
        if (genderGroup.getSelection() == null) {
            errors += "Please select your gender\n";
        }
        if (!phone.matches("\\d{3}-\\d{3}-\\d{4}")) {
            errors += "Phone should be like 123-456-7890\n";
        }
        if (experience.isEmpty()) {
            errors += "Please enter your experience\n";
        }
        if (profile.getPhoto() == null) {
            errors += "Please upload a photo\n";
        }
        if (!errors.isEmpty()) {
            JOptionPane.showMessageDialog(this, errors, "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        profile.setFirstName(firstName);
        profile.setLastName(lastName);
        profile.setAge(age);
        profile.setGender(rdoMale.isSelected() ? "Male" : "Female");
        profile.setPhone(phone);
        profile.setContinent((String) cmbContinent.getSelectedItem());
        profile.setExperience(experience);

        JOptionPane.showMessageDialog(this, profile.toString(), "User Profile", JOptionPane.INFORMATION_MESSAGE, profile.getPhoto());
    }//GEN-LAST:event_btnSubmitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> cmbContinent;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContinent;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JPanel pnlProfile;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JScrollPane scrExperience;
    private javax.swing.JSpinner spnAge;
    private javax.swing.JTextArea txtExperience;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtPhoto;
    // End of variables declaration//GEN-END:variables
}
