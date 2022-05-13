package Views.Admin;

import Controllers.Interface.Controller;
import Models.Enum.Role;
import Views.FixedSizeDocument;
import Views.View;
import Views.ViewsHelper;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controllers.Interface.NewAdministratorController;

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
        Separator = new javax.swing.JSeparator();
        RoleField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Administrator Registration");
        setResizable(false);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        Required1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required1.setForeground(new java.awt.Color(255, 0, 0));
        Required1.setText("*");

        Required2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required2.setForeground(new java.awt.Color(255, 0, 0));
        Required2.setText("*");

        Required3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required3.setForeground(new java.awt.Color(255, 0, 0));
        Required3.setText("*");

        Required4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required4.setForeground(new java.awt.Color(255, 0, 0));
        Required4.setText("*");

        Required5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required5.setForeground(new java.awt.Color(255, 0, 0));
        Required5.setText("*");

        Required6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required6.setForeground(new java.awt.Color(255, 0, 0));
        Required6.setText("*");

        EmailLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        EmailLabel.setText("Email");
        EmailLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        AddressLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        AddressLabel.setText("Address");
        AddressLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        AddressField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        AddressField.setToolTipText("Enter your address");
        AddressField.setMinimumSize(new java.awt.Dimension(64, 30));
        AddressField.setPreferredSize(new java.awt.Dimension(64, 30));
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });

        PhoneNumberLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PhoneNumberLabel.setLabelFor(PhoneNumberField);
        PhoneNumberLabel.setText("Phone Number");
        PhoneNumberLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        RoleLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        RoleLabel.setLabelFor(RoleField);
        RoleLabel.setText("Role");
        RoleLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        FrameDescription.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FrameDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FrameDescription.setText("Add Administrator");
        FrameDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NameLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NameLabel.setText("Name");
        NameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        NameField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NameField.setToolTipText("Enter your name");
        NameField.setMinimumSize(new java.awt.Dimension(64, 30));
        NameField.setPreferredSize(new java.awt.Dimension(64, 30));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        NationalIDLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NationalIDLabel.setText("National ID");
        NationalIDLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        NationalIDField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NationalIDField.setToolTipText("Enter your national id");
        NationalIDField.setMinimumSize(new java.awt.Dimension(64, 30));
        NationalIDField.setPreferredSize(new java.awt.Dimension(64, 30));
        NationalIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalIDFieldActionPerformed(evt);
            }
        });

        PhoneNumberField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PhoneNumberField.setToolTipText("Enter your phone number");
        PhoneNumberField.setMinimumSize(new java.awt.Dimension(64, 30));
        PhoneNumberField.setPreferredSize(new java.awt.Dimension(64, 30));
        PhoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberFieldActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.setToolTipText("Request a meter");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        RoleField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        RoleField.setToolTipText("Select your type of use");
        RoleField.setMinimumSize(new java.awt.Dimension(76, 30));
        RoleField.setPreferredSize(new java.awt.Dimension(76, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(NameLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(Required1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(NationalIDLabel)
                                .addGap(10, 10, 10)
                                .addComponent(Required2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(NationalIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(AddressLabel)
                                .addGap(10, 10, 10)
                                .addComponent(Required3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(EmailLabel)
                                .addGap(7, 7, 7)
                                .addComponent(Required4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(PhoneNumberLabel)
                                .addGap(10, 10, 10)
                                .addComponent(Required5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(RoleLabel)
                                .addGap(10, 10, 10)
                                .addComponent(Required6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(RoleField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(FrameDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton)
                    .addComponent(FrameDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Required1)))
                .addGap(6, 6, 6)
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NationalIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Required2)))
                .addGap(6, 6, 6)
                .addComponent(NationalIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Required3)))
                .addGap(6, 6, 6)
                .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Required4)))
                .addGap(6, 6, 6)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Required5)))
                .addGap(13, 13, 13)
                .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required6))
                .addGap(4, 4, 4)
                .addComponent(RoleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

    }//GEN-LAST:event_SubmitButtonActionPerformed
    

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed

        if(!this.controller.isValidEmail(this.EmailField.getText())){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please enter a valid email.", "Email field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed

        if(!this.controller.isValidAddress(this.AddressField.getText())){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please enter a valid address.", "Address field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed

        if(!this.controller.isValidName(this.NameField.getText())){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please enter a valid name.", "Name field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_NameFieldActionPerformed

    private void NationalIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalIDFieldActionPerformed

        if(!this.controller.isValidNationalID(this.NationalIDField.getText())){

            this.globalValidationState = false;

            String message = "The national number has been entered incorrectly or you are already registered.";

            JOptionPane.showMessageDialog(this, message, "National ID field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_NationalIDFieldActionPerformed

    private void PhoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberFieldActionPerformed

        if(!this.controller.isValidPhoneNumber(this.PhoneNumberField.getText())){

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
        this.RoleFieldFocusLost(null);

        if(this.globalValidationState){

            String message = "You will receive an email with your ID and Password";

            this.controller.registerAdministrator(this.NameField.getText(), this.NationalIDField.getText(),
                this.AddressField.getText(), this.EmailField.getText(),
                this.RoleField.getSelectedItem().toString(), this.PhoneNumberField.getText()
                );

            JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);
            
            this.BackButtonActionPerformed(null);
        }

    }//GEN-LAST:event_RequestButtonActionPerformed

    private void RoleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TypeOfUseFieldFocusLost

        if(this.RoleField.getSelectedIndex() == 0){

            this.globalValidationState = false;

            JOptionPane.showMessageDialog(this, "Please select your Role.", "Role field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_TypeOfUseFieldFocusLost

    private void fillRoleField(){
    
        String[] roles = ViewsHelper.getSortedStringValues(Role.values());
        
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
        this.PhoneNumberField.setDocument(new FixedSizeDocument(11));
    }
    
    @Override
    public void setController(Controller controller){
    
        this.controller = (NewAdministratorController) controller;
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
    private NewAdministratorController controller;
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
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables
}
