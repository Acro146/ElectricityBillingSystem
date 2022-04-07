package Views.Admin;

import Controllers.Interface.AdminDashboardController;
import Controllers.Interface.AdministratorController;
import Controllers.Interface.Controller;
import Models.Enum.Role;
import Views.FixedSizeDocument;
import Views.View;
import Views.ViewsHelper;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author xorigin
 */
public class NewAdministratorView extends javax.swing.JFrame implements View{

    /**
     * Creates new form NewAdministratorView
     * @param previousFrame
     */
    public NewAdministratorView(javax.swing.JFrame previousFrame) {
        
        this.setPreviousFrame(previousFrame);
        
        initComponents();
        
        this.setSpecialSettings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        Required1 = new javax.swing.JLabel();
        Required2 = new javax.swing.JLabel();
        Required3 = new javax.swing.JLabel();
        Required4 = new javax.swing.JLabel();
        Required5 = new javax.swing.JLabel();
        Required6 = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        PhoneNumberLabel = new javax.swing.JLabel();
        RoleLabel = new javax.swing.JLabel();
        FrameDescription = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        NationalIDLabel = new javax.swing.JLabel();
        NationalIDField = new javax.swing.JTextField();
        PhoneNumberField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        RoleField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Administrator Registration");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 58, -1));

        Required1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required1.setForeground(new java.awt.Color(255, 0, 0));
        Required1.setText("*");
        getContentPane().add(Required1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 49, -1, -1));

        Required2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required2.setForeground(new java.awt.Color(255, 0, 0));
        Required2.setText("*");
        getContentPane().add(Required2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 118, -1, -1));

        Required3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required3.setForeground(new java.awt.Color(255, 0, 0));
        Required3.setText("*");
        getContentPane().add(Required3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 187, -1, -1));

        Required4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required4.setForeground(new java.awt.Color(255, 0, 0));
        Required4.setText("*");
        getContentPane().add(Required4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 256, -1, -1));

        Required5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required5.setForeground(new java.awt.Color(255, 0, 0));
        Required5.setText("*");
        getContentPane().add(Required5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 325, -1, -1));

        Required6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required6.setForeground(new java.awt.Color(255, 0, 0));
        Required6.setText("*");
        getContentPane().add(Required6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 10, -1));

        EmailLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        EmailLabel.setText("Email");
        EmailLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 251, -1, 26));

        EmailField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        EmailField.setToolTipText("Enter your email");
        EmailField.setMinimumSize(new java.awt.Dimension(64, 30));
        EmailField.setName(""); // NOI18N
        EmailField.setPreferredSize(new java.awt.Dimension(64, 30));
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 284, 218, -1));

        AddressLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        AddressLabel.setText("Address");
        AddressLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 182, -1, 26));

        AddressField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        AddressField.setToolTipText("Enter your address");
        AddressField.setMinimumSize(new java.awt.Dimension(64, 30));
        AddressField.setPreferredSize(new java.awt.Dimension(64, 30));
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(AddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 215, 218, -1));

        PhoneNumberLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PhoneNumberLabel.setLabelFor(PhoneNumberField);
        PhoneNumberLabel.setText("Phone Number");
        PhoneNumberLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(PhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 320, -1, 26));

        RoleLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        RoleLabel.setLabelFor(RoleField);
        RoleLabel.setText("Role");
        RoleLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(RoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 26));

        FrameDescription.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FrameDescription.setText("Add Administrator");
        FrameDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(FrameDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 6, -1, -1));

        NameLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NameLabel.setText("Name");
        NameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 44, -1, 26));

        NameField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NameField.setToolTipText("Enter your name");
        NameField.setMinimumSize(new java.awt.Dimension(64, 30));
        NameField.setPreferredSize(new java.awt.Dimension(64, 30));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, 218, -1));

        NationalIDLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NationalIDLabel.setText("National ID");
        NationalIDLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(NationalIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 113, -1, 26));

        NationalIDField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NationalIDField.setToolTipText("Enter your national id");
        NationalIDField.setMinimumSize(new java.awt.Dimension(64, 30));
        NationalIDField.setPreferredSize(new java.awt.Dimension(64, 30));
        NationalIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NationalIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 146, 218, -1));

        PhoneNumberField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PhoneNumberField.setToolTipText("Enter your phone number");
        PhoneNumberField.setMinimumSize(new java.awt.Dimension(64, 30));
        PhoneNumberField.setPreferredSize(new java.awt.Dimension(64, 30));
        PhoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 218, -1));

        SubmitButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.setToolTipText("Request a meter");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 486, 218, 44));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 470, 388, 10));

        RoleField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        RoleField.setToolTipText("Select your type of use");
        RoleField.setMinimumSize(new java.awt.Dimension(76, 30));
        RoleField.setPreferredSize(new java.awt.Dimension(76, 30));
        getContentPane().add(RoleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        this.globalValidationState = true;

        this.NameFieldActionPerformed(null);
        this.NationalIDFieldActionPerformed(null);
        this.AddressFieldActionPerformed(null);
        this.EmailFieldActionPerformed(null);
        this.PhoneNumberFieldActionPerformed(null);
        this.RoleFieldFocusLost(null);
        

        if(this.globalValidationState){

            String message = "You will receive an email with your ID and Password";

            this.controller.registerAdministrator(this.NameField.getText(), this.NationalIDField.getText(),
                this.AddressField.getText(), this.EmailField.getText(),
                this.RoleField.getSelectedItem().toString(), this.PhoneNumberField.getText()
                );

                    JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);
                }

    }//GEN-LAST:event_SubmitButtonActionPerformed
    

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed

        if(this.EmailField.getText().isBlank() || !this.controller.isValidEmail(this.EmailField.getText())){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please enter a valid email.", "Email field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed

        if(this.AddressField.getText().isBlank() || !this.controller.isValidAddress(this.AddressField.getText())){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please enter a valid address.", "Address field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed

        if(this.NameField.getText().isBlank() || !this.controller.isValidName(this.NameField.getText())){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please enter a valid name.", "Name field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_NameFieldActionPerformed

    private void NationalIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalIDFieldActionPerformed

        if(this.NationalIDField.getText().isBlank() || !this.controller.isValidNationalID(this.NationalIDField.getText())){

            this.globalValidationState = false;

            String message = "The national number has been entered incorrectly or you are already registered.";

            JOptionPane.showMessageDialog(this, message, "National ID field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_NationalIDFieldActionPerformed

    private void PhoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberFieldActionPerformed
        // TODO add your handling code here:
        if(this.PhoneNumberField.getText().isBlank() || !this.controller.isValidPhoneNumber(this.PhoneNumberField.getText())){

                this.globalValidationState = false;

                JOptionPane.showMessageDialog(this, "Please enter a valid phone number.", "Phone number field", JOptionPane.WARNING_MESSAGE);  
            }
    }//GEN-LAST:event_PhoneNumberFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButtonActionPerformed

        this.globalValidationState = true;

        this.NameFieldActionPerformed(null);
        this.NationalIDFieldActionPerformed(null);
        this.AddressFieldActionPerformed(null);
        this.EmailFieldActionPerformed(null);
        this.PhoneNumberFieldActionPerformed(null);
        

        if(this.globalValidationState){

            String message = "You will receive an email with your Meter code and Password";

            this.controller.registerAdministrator(this.NameField.getText(), this.NationalIDField.getText(),
                this.AddressField.getText(), this.EmailField.getText(),
                this.RoleField.getSelectedItem().toString(), this.PhoneNumberField.getText()
                );

                    JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);
                }

    }//GEN-LAST:event_RequestButtonActionPerformed

    private void RoleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TypeOfUseFieldFocusLost

        if(this.RoleField.getSelectedIndex() == 0){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please select your type of use.", "Type of use field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_TypeOfUseFieldFocusLost

    private void fillRoleField(){
    
        String[] roles = ViewsHelper.getSortedEnumValues(Role.values());
        
        this.RoleField.addItem(this.RoleFieldInitialState);
        this.RoleField.setSelectedIndex(0);

        for(String role : roles)
            this.RoleField.addItem(role);            
    }
    @Override
    public final void setSpecialSettings() {
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.fillRoleField();
        this.NameField.setDocument(new FixedSizeDocument(60));
        this.NationalIDField.setDocument(new FixedSizeDocument(14));
        this.EmailField.setDocument(new FixedSizeDocument(100));
    }
    
    @Override
    public void setController(Controller controller){
    
        this.controller = (AdminDashboardController) controller;
    }
    
    @Override
    public final void setPreviousFrame(JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    private final String RoleFieldInitialState = "Select Role";
    private boolean globalValidationState = false;
    private AdminDashboardController controller;
    private javax.swing.JFrame previousFrame;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FrameDescription;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NationalIDField;
    private javax.swing.JLabel NationalIDLabel;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel Required1;
    private javax.swing.JLabel Required2;
    private javax.swing.JLabel Required3;
    private javax.swing.JLabel Required4;
    private javax.swing.JLabel Required5;
    private javax.swing.JLabel Required6;
    private javax.swing.JComboBox<String> RoleField;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
