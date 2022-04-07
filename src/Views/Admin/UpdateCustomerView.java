package Views.Admin;

import Controllers.CustomerDashboardControllerImp;
import Controllers.Interface.Controller;
import Models.Enum.Column;
import Models.Enum.GovernmentCode;
import Models.Enum.TypeOfUse;
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
public class UpdateCustomerView extends javax.swing.JFrame implements View{

    /**
     * Creates new form UpdateCustomerView
     * @param previousFrame
     */
    public UpdateCustomerView(javax.swing.JFrame previousFrame) {
        
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
        GovernmentField = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TypeOfUseField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Customer");
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
        FrameDescription.setText(" Update a customer ");
        FrameDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Adress");

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

        jLabel3.setText("Phone Number");

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

        jLabel4.setText("Governorate");

        GovernmentField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        GovernmentField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                GovernmentFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Type Of Use");

        TypeOfUseField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        TypeOfUseField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TypeOfUseFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeOfUseField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GovernmentField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PhoneNumberField)
                    .addComponent(AddressField)
                    .addComponent(EmailField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackButton)
                    .addComponent(FrameDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GovernmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeOfUseField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
        
        if(this.AddressField.getText().isBlank() || !this.controller.isValidAddress(this.AddressField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid address.", "Address field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        this.globalValidationState = true;
        
        this.AddressFieldActionPerformed(null);
        this.EmailFieldActionPerformed(null);
        this.PhoneNumberFieldActionPerformed(null);
        this.GovernateFieldPropertyChangeChecker();
        this.TypeOfUseFieldPropertyChangeChecker();
        
        if(this.globalValidationState && !this.fields.isEmpty()) {
            
            String message = "Customer has been updated";
            this.controller.updateCustomer(fields, values, this.controller.getMeterCode());

            this.updateOldValues();
            
            JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            
            String message = "Please enter new values, or valid values.";
            JOptionPane.showMessageDialog(this, message, "Unsuccessful operation", JOptionPane.WARNING_MESSAGE);
        }
        
        this.clearFieldsValues();
    }//GEN-LAST:event_UpdateActionPerformed

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
    
    
    private void AddressFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AddressFieldAncestorAdded
        
        this.oldAddress =(String) this.controller.getInfo(Arrays.asList(Column.Address), this.controller.getMeterCode()).get(Column.Address);
        this.AddressField.setText(this.oldAddress);
    }//GEN-LAST:event_AddressFieldAncestorAdded

    private void EmailFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmailFieldAncestorAdded
        
        this.oldEmail =(String) this.controller.getInfo(Arrays.asList(Column.Email), this.controller.getMeterCode()).get(Column.Email);
        this.EmailField.setText(this.oldEmail);
    }//GEN-LAST:event_EmailFieldAncestorAdded

    private void PhoneNumberFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PhoneNumberFieldAncestorAdded
        
        this.oldPhone =(String) this.controller.getInfo(Arrays.asList(Column.PhoneNumber), this.controller.getMeterCode()).get(Column.PhoneNumber);
        this.PhoneNumberField.setText(this.oldPhone);
    }//GEN-LAST:event_PhoneNumberFieldAncestorAdded

    private void GovernmentFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_GovernmentFieldAncestorAdded
        
        this.fillGovernate();
        this.oldGovernate =(String) this.controller.getInfo(Arrays.asList(Column.GovernmentCode), this.controller.getMeterCode()).get(Column.GovernmentCode);
        
        String itemName = GovernmentCode.getEnumNameForValue(this.oldGovernate).replaceAll("_", " ");
        System.out.println(this.oldGovernate + "  added " + itemName);
        this.GovernmentField.setSelectedItem(itemName);
    }//GEN-LAST:event_GovernmentFieldAncestorAdded

    private void TypeOfUseFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TypeOfUseFieldAncestorAdded
        
        this.fillTypeOfUse();
        this.oldTypeOfUse =(String) this.controller.getInfo(Arrays.asList(Column.TypeOfUse), this.controller.getMeterCode()).get(Column.TypeOfUse);
        this.TypeOfUseField.setSelectedItem(this.oldTypeOfUse);
    }//GEN-LAST:event_TypeOfUseFieldAncestorAdded

    //ComboBox Fill Functions
    
    private void fillTypeOfUse(){
    
        String[] typeOfUseList = ViewsHelper.getEnumValues(TypeOfUse.values());    
        
        for(String typeofuse : typeOfUseList) {
            this.TypeOfUseField.addItem(typeofuse);
        }
    }
    
    private void fillGovernate(){
    
        String[] governorates = ViewsHelper.getSortedEnumValues(GovernmentCode.values());
        
        for(String governorate : governorates)
            this.GovernmentField.addItem(governorate);  
    }
    
    private void TypeOfUseFieldPropertyChangeChecker() {
        
         if(!this.oldTypeOfUse.equals(this.TypeOfUseField.getSelectedItem().toString())) {
             
            this.fields.add(Column.TypeOfUse);
            this.values.add(this.TypeOfUseField.getSelectedItem().toString());
        }
    }
    
    private void GovernateFieldPropertyChangeChecker() {
        
        String newGovernmentCode = GovernmentCode.valueOf(ViewsHelper.getEnumValue(this.GovernmentField.getSelectedItem().toString())).getCode();
        
        
        if(!this.oldGovernate.equals(newGovernmentCode)) {
             
            this.fields.add(Column.GovernmentCode);
            
            String governmentCode = GovernmentCode.valueOf(ViewsHelper.getEnumValue(this.GovernmentField.getSelectedItem().toString())).getCode();
            
            this.values.add(governmentCode);
        }
    }
    
    private void updateOldValues(){
    
        this.oldAddress = this.AddressField.getText();
        this.oldEmail = this.EmailField.getText();
        this.oldGovernate = GovernmentCode.valueOf(ViewsHelper.getEnumValue(this.GovernmentField.getSelectedItem().toString())).getCode();
        this.oldPhone = this.PhoneNumberField.getText();
        this.oldTypeOfUse = this.TypeOfUseField.getSelectedItem().toString();
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
    
        this.controller = (CustomerDashboardControllerImp) controller;
    }
    
    @Override
    public final void setPreviousFrame(JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    
    private CustomerDashboardControllerImp controller;
    private javax.swing.JFrame previousFrame;
    private boolean globalValidationState = false;
    
    private String oldAddress;
    private String oldPhone;
    private String oldEmail;
    private String oldGovernate;
    private String oldTypeOfUse;
    private List<Enum> fields = new ArrayList<>();
    private List<Object> values = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel FrameDescription;
    private javax.swing.JComboBox<String> GovernmentField;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JComboBox<String> TypeOfUseField;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
