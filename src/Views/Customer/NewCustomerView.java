package Views.Customer;

import Models.Enum.GovernmentCode;
import Models.Enum.TypeOfUse;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Controllers.Interface.Controller;
import Controllers.Interface.NewCustomerController;
import Views.FixedSizeDocument;
import Views.View;
import Views.ViewsHelper;
import javax.swing.JFrame;

/**
 *
 * @author xorigin
 */
public class NewCustomerView extends javax.swing.JFrame implements View{

    /**
     * Creates new form NewCustomerView
     * @param previousFrame
     */
    public NewCustomerView(javax.swing.JFrame previousFrame) {
        
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
        NameLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        NationalIDLabel = new javax.swing.JLabel();
        NationalIDField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberField = new javax.swing.JTextField();
        TypeOfUseLabel = new javax.swing.JLabel();
        GovernmentLabel = new javax.swing.JLabel();
        GovernmentField = new javax.swing.JComboBox<>();
        TypeOfUseField = new javax.swing.JComboBox<>();
        PropertyOwnershipContractLabel = new javax.swing.JLabel();
        PropertyOwnershipContractField = new javax.swing.JTextField();
        BrowseButton = new javax.swing.JButton();
        RequestButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Required1 = new javax.swing.JLabel();
        Required2 = new javax.swing.JLabel();
        Required3 = new javax.swing.JLabel();
        Required4 = new javax.swing.JLabel();
        Required5 = new javax.swing.JLabel();
        Required6 = new javax.swing.JLabel();
        Required7 = new javax.swing.JLabel();
        Required8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Customer Registration");
        setResizable(false);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        FrameDescription.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FrameDescription.setText(" Request for a new meter ");
        FrameDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NameLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NameLabel.setLabelFor(NameField);
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
        NationalIDLabel.setLabelFor(NationalIDField);
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

        EmailLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        EmailLabel.setLabelFor(EmailField);
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
        AddressLabel.setLabelFor(AddressField);
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

        PhoneNumberField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PhoneNumberField.setToolTipText("Enter your phone number");
        PhoneNumberField.setMinimumSize(new java.awt.Dimension(64, 30));
        PhoneNumberField.setPreferredSize(new java.awt.Dimension(64, 30));
        PhoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberFieldActionPerformed(evt);
            }
        });

        TypeOfUseLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        TypeOfUseLabel.setLabelFor(TypeOfUseField);
        TypeOfUseLabel.setText("Type of Use");
        TypeOfUseLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        GovernmentLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        GovernmentLabel.setLabelFor(GovernmentField);
        GovernmentLabel.setText("Governorate");
        GovernmentLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        GovernmentField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        GovernmentField.setToolTipText("Select your governorate");
        GovernmentField.setMinimumSize(new java.awt.Dimension(76, 30));
        GovernmentField.setPreferredSize(new java.awt.Dimension(76, 30));
        GovernmentField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                GovernmentFieldFocusLost(evt);
            }
        });

        TypeOfUseField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        TypeOfUseField.setToolTipText("Select your type of use");
        TypeOfUseField.setMinimumSize(new java.awt.Dimension(76, 30));
        TypeOfUseField.setPreferredSize(new java.awt.Dimension(76, 30));
        TypeOfUseField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TypeOfUseFieldFocusLost(evt);
            }
        });

        PropertyOwnershipContractLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PropertyOwnershipContractLabel.setLabelFor(NameField);
        PropertyOwnershipContractLabel.setText("Property Ownership Contract");
        PropertyOwnershipContractLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        PropertyOwnershipContractField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        PropertyOwnershipContractField.setToolTipText("Enter your property ownership contract");
        PropertyOwnershipContractField.setMinimumSize(new java.awt.Dimension(64, 30));
        PropertyOwnershipContractField.setPreferredSize(new java.awt.Dimension(64, 30));
        PropertyOwnershipContractField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertyOwnershipContractFieldActionPerformed(evt);
            }
        });

        BrowseButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        RequestButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        RequestButton.setText("Request");
        RequestButton.setToolTipText("Request a meter");
        RequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButtonActionPerformed(evt);
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

        Required7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required7.setForeground(new java.awt.Color(255, 0, 0));
        Required7.setText("*");

        Required8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Required8.setForeground(new java.awt.Color(255, 0, 0));
        Required8.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameDescription)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TypeOfUseField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GovernmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(GovernmentLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Required6))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(TypeOfUseLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Required7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PropertyOwnershipContractField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BrowseButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(NameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Required1))
                                        .addComponent(NationalIDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AddressField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(NationalIDLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Required2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AddressLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Required3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(EmailLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Required4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PhoneNumberLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Required5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PropertyOwnershipContractLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Required8)))))
                        .addGap(51, 51, 51))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(RequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FrameDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NationalIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NationalIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GovernmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GovernmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeOfUseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeOfUseField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PropertyOwnershipContractLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Required8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PropertyOwnershipContractField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image jpg, jpeg, png", "jpg", "jpeg", "png");

        fileChooser.addChoosableFileFilter(filter);

        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        
        if(fileChooser.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            this.PropertyOwnershipContractField.setText(selectedFile.getAbsolutePath());
        }
        
    }//GEN-LAST:event_BrowseButtonActionPerformed
     
    private void RequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButtonActionPerformed
        
        this.globalValidationState = true;
        
        this.NameFieldActionPerformed(null);
        this.NationalIDFieldActionPerformed(null);
        this.AddressFieldActionPerformed(null);
        this.EmailFieldActionPerformed(null);
        this.PhoneNumberFieldActionPerformed(null);
        this.GovernmentFieldFocusLost(null);
        this.TypeOfUseFieldFocusLost(null);
        this.PropertyOwnershipContractFieldActionPerformed(null);
        
        if(this.globalValidationState){
        
            String message = "You will receive an email with your Meter code and Password";
            
            this.controller.registerCustomer(this.NameField.getText(), this.NationalIDField.getText(),
                                             this.AddressField.getText(), this.EmailField.getText(),
                                             this.getGovernmentCode(), this.PhoneNumberField.getText(),
                                             this.getTypeOfUse(), this.PropertyOwnershipContractField.getText().replaceAll("\\\\", "/"));
            
            JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_RequestButtonActionPerformed

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

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        
        if(this.AddressField.getText().isBlank() || !this.controller.isValidAddress(this.AddressField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid address.", "Address field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        
        if(this.EmailField.getText().isBlank() || !this.controller.isValidEmail(this.EmailField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid email.", "Email field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void PhoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberFieldActionPerformed
        
        if(this.PhoneNumberField.getText().isBlank() || !this.controller.isValidPhoneNumber(this.PhoneNumberField.getText())){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number.", "Phone number field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_PhoneNumberFieldActionPerformed

    private void PropertyOwnershipContractFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertyOwnershipContractFieldActionPerformed
        
        File file = new File(this.PropertyOwnershipContractField.getText().replaceAll("\\\\", "/"));
        
        if(!file.exists()){
        
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "The property ownership contract not found!", "Property ownership contract field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_PropertyOwnershipContractFieldActionPerformed

    private void GovernmentFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GovernmentFieldFocusLost
        
        if(this.GovernmentField.getSelectedIndex() == 0){
            
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please select your governorate.", "Governorate field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_GovernmentFieldFocusLost

    private void TypeOfUseFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TypeOfUseFieldFocusLost
        
        if(this.TypeOfUseField.getSelectedIndex() == 0){
            
            this.globalValidationState = false;
            
            JOptionPane.showMessageDialog(this, "Please select your type of use.", "Type of use field", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_TypeOfUseFieldFocusLost
    
     private void fillGovernmentField(){
    
        String[] governorates = ViewsHelper.getSortedEnumValues(GovernmentCode.values());
        
        this.GovernmentField.addItem(this.governmentFieldInitialState);
        this.GovernmentField.setSelectedIndex(0);

        for(String governorate : governorates)
            this.GovernmentField.addItem(governorate);            
    }
    
    private void fillTypeOfUse(){
    
        String[] types = ViewsHelper.getEnumValues(TypeOfUse.values());
        
        this.TypeOfUseField.addItem(typeOfUseFieldInitialState);
        this.TypeOfUseField.setSelectedIndex(0);
        
        for(String type : types)
            this.TypeOfUseField.addItem(type);
    }
    
    private String getGovernmentCode(){
    
        return GovernmentCode.valueOf(this.GovernmentField.getSelectedItem().toString()).getCode();
    }
    
    private String getTypeOfUse(){
    
        return this.TypeOfUseField.getSelectedItem().toString();
    }
    
    
    @Override
    public final void setSpecialSettings(){
    
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.fillGovernmentField();
        this.fillTypeOfUse();
        
        this.NameField.setDocument(new FixedSizeDocument(60));
        this.NationalIDField.setDocument(new FixedSizeDocument(14));
        this.EmailField.setDocument(new FixedSizeDocument(100));
        this.PhoneNumberField.setDocument(new FixedSizeDocument(11));
    }
    
    @Override
    public void setController(Controller controller){
    
        this.controller = (NewCustomerController) controller;
    }
    
    @Override
    public final void setPreviousFrame(JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    
    
    private final String governmentFieldInitialState = "Select governorate";
    private final String typeOfUseFieldInitialState = "Select your type of use";
    private boolean globalValidationState = false;
    private NewCustomerController controller;
    private javax.swing.JFrame previousFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BrowseButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FrameDescription;
    private javax.swing.JComboBox<String> GovernmentField;
    private javax.swing.JLabel GovernmentLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NationalIDField;
    private javax.swing.JLabel NationalIDLabel;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PropertyOwnershipContractField;
    private javax.swing.JLabel PropertyOwnershipContractLabel;
    private javax.swing.JButton RequestButton;
    private javax.swing.JLabel Required1;
    private javax.swing.JLabel Required2;
    private javax.swing.JLabel Required3;
    private javax.swing.JLabel Required4;
    private javax.swing.JLabel Required5;
    private javax.swing.JLabel Required6;
    private javax.swing.JLabel Required7;
    private javax.swing.JLabel Required8;
    private javax.swing.JComboBox<String> TypeOfUseField;
    private javax.swing.JLabel TypeOfUseLabel;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}