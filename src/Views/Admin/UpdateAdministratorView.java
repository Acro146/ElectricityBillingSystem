package Views.Admin;

import Controllers.Interface.AdministratorController;
import Controllers.Interface.Controller;
import Models.Enum.Column;
import Models.Enum.Role;
import Views.FixedSizeDocument;
import Views.View;
import Views.ViewsHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author xorigin
 */
public class UpdateAdministratorView extends javax.swing.JFrame implements View{

    /**
     * Creates new form UpdateAdministratorView
     * @param previousFrame
     */
    public UpdateAdministratorView(javax.swing.JFrame previousFrame) {
        
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
        FrameDescription = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhoneNumberField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RoleField = new javax.swing.JComboBox<>();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Administrator");
        setResizable(false);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        FrameDescription.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FrameDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FrameDescription.setText(" Update an admin ");
        FrameDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Address");

        AddressField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        AddressField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AddressFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("E-mail");

        EmailField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        EmailField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EmailFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone number");

        PhoneNumberField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PhoneNumberField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PhoneNumberFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        PhoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        RoleField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        RoleField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RoleFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        RoleField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RoleFieldFocusLost(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RoleField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FrameDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoleField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
            
        if(!this.oldAddress.equals(this.AddressField.getText())) {
            
            this.fields.add(Column.Address);
            this.values.add(this.AddressField.getText());
        }
        
        if(!this.controller.isValidAddress(this.AddressField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid address.", "Address field", JOptionPane.WARNING_MESSAGE);  
        }

    }//GEN-LAST:event_AddressFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        
        if(!this.oldEmail.equals(this.EmailField.getText())) {
            this.fields.add(Column.Email);
            this.values.add(this.EmailField.getText());
        }
        
        
        if(!this.controller.isValidEmail(this.EmailField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid email.", "Email field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void PhoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberFieldActionPerformed
        
        if(!this.oldPhone.equals(this.PhoneNumberField.getText())) {
            
            this.fields.add(Column.PhoneNumber);
            this.values.add(this.PhoneNumberField.getText());
        }
        
        
        if(!this.controller.isValidPhoneNumber(this.PhoneNumberField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number.", "Phone number field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_PhoneNumberFieldActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
        this.globalValidationState = true;
        
        this.AddressFieldActionPerformed(null);
        this.EmailFieldActionPerformed(null);
        this.PhoneNumberFieldActionPerformed(null);
        this.RoleFieldFocusLost(null);
        this.RoleFieldPropertyChangeChecker();
        
        if(this.globalValidationState && !this.fields.isEmpty()) {
            
            String message = "Admin has been updated";
            this.controller.updateAdmin(fields,values,this.controller.getTargetID());
            
            this.updateOldValues();
            
            JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else {
            
            String message = "Please enter new values, or valid values.";
            JOptionPane.showMessageDialog(this, message, "Unsuccessful operation", JOptionPane.WARNING_MESSAGE);
        }
          
        
        this.clearFieldsValues();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddressFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AddressFieldAncestorAdded
        
        this.oldAddress =(String) this.controller.getInfo(Arrays.asList(Column.Address), this.controller.getTargetID()).get(Column.Address);
        this.AddressField.setText(this.oldAddress);
    }//GEN-LAST:event_AddressFieldAncestorAdded

    private void EmailFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmailFieldAncestorAdded
        
        this.oldEmail =(String) this.controller.getInfo(Arrays.asList(Column.Email), this.controller.getTargetID()).get(Column.Email);
        this.EmailField.setText(this.oldEmail);
    }//GEN-LAST:event_EmailFieldAncestorAdded

    private void PhoneNumberFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PhoneNumberFieldAncestorAdded
        
        this.oldPhone =(String) this.controller.getInfo(Arrays.asList(Column.PhoneNumber), this.controller.getTargetID()).get(Column.PhoneNumber);
        this.PhoneNumberField.setText(this.oldPhone);
    }//GEN-LAST:event_PhoneNumberFieldAncestorAdded

    private void RoleFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RoleFieldAncestorAdded
        
        this.fillRole();
        this.oldRole =(String) this.controller.getInfo(Arrays.asList(Column.Role), this.controller.getTargetID()).get(Column.Role);
        this.RoleField.setSelectedItem(this.oldRole);
    }//GEN-LAST:event_RoleFieldAncestorAdded

    private void RoleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RoleFieldFocusLost
        
        int numberOfRegisteredRole = this.controller.getNumOfRegisteredInRole(this.oldRole);
        
        if(numberOfRegisteredRole == 1 && !this.oldRole.equals(this.RoleField.getSelectedItem().toString())){
            
            this.globalValidationState = false;
            String message = "Can not perform the change. \n Only one "+ this.oldRole +" left.";
            
            JOptionPane.showMessageDialog(this,message, "Role field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_RoleFieldFocusLost


    private void RoleFieldPropertyChangeChecker() {
        
        if(!this.oldRole.equals(this.RoleField.getSelectedItem().toString())) {
            
            this.fields.add(Column.Role);
            this.values.add(this.RoleField.getSelectedItem().toString());
        }
    }
    
    private void fillRole(){
    
        String[] roles = ViewsHelper.getEnumValues(Role.values());    
        
        for(String role : roles) {
            this.RoleField.addItem(role);
        }
    }
    
    private void updateOldValues(){
    
        this.oldAddress = this.AddressField.getText();
        this.oldEmail = this.EmailField.getText();
        this.oldRole = this.RoleField.getSelectedItem().toString();
        this.oldPhone = this.PhoneNumberField.getText();
    }
    
    private void clearFieldsValues(){
    
        this.fields.clear();
        this.values.clear();
    }
    
    @Override
    public final void setSpecialSettings() {
        
        this.setLocationRelativeTo(null);
        this.EmailField.setDocument(new FixedSizeDocument(100));
        this.PhoneNumberField.setDocument(new FixedSizeDocument(11));
    }
    
    @Override
    public void setController(Controller controller){
    
        this.controller = (AdministratorController) controller;
    }
    
    @Override
    public final void setPreviousFrame(JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    
    
    private AdministratorController controller;
    private javax.swing.JFrame previousFrame;
    private boolean globalValidationState = false;
    
    private String oldAddress;
    private String oldPhone;
    private String oldEmail;
    private String oldRole;
    private List<Enum> fields = new ArrayList<>();
    private List<Object> values = new ArrayList<>();
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel FrameDescription;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JComboBox<String> RoleField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
