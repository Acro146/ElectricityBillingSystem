package Views.Operator;

import Controllers.Interface.Controller;
import Controllers.Interface.CustomerDashboardController;
import Models.Enum.ActivationState;
import Views.View;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author acro
 */
public class ActivationView extends javax.swing.JFrame implements View {

    /**
     * Creates new form ActivationView
     *
     * @param previousFrame
     */
    public ActivationView(javax.swing.JFrame previousFrame) {

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

        ActivationStateLabel = new javax.swing.JLabel();
        SignedAsField = new javax.swing.JLabel();
        SignedAsLabel = new javax.swing.JLabel();
        ActivationLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        toggle = new javax.swing.JToggleButton();
        toggle = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Activation State");
        setResizable(false);

        ActivationStateLabel.setBackground(new java.awt.Color(0, 0, 0));
        ActivationStateLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ActivationStateLabel.setForeground(new java.awt.Color(153, 153, 153));
        ActivationStateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActivationStateLabel.setToolTipText("");
        ActivationStateLabel.setOpaque(true);
        ActivationStateLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ActivationStateLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        SignedAsField.setFont(new java.awt.Font("Chandas", 1, 14)); // NOI18N
        SignedAsField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignedAsField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SignedAsFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        SignedAsLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        SignedAsLabel.setForeground(new java.awt.Color(51, 51, 51));
        SignedAsLabel.setText("Meter code:");
        SignedAsLabel.setOpaque(true);

        ActivationLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        ActivationLabel.setForeground(new java.awt.Color(51, 51, 51));
        ActivationLabel.setText("Meter status:");
        ActivationLabel.setOpaque(true);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Log out");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        toggle.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        toggle.setText("Activate / Deactive");
        toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SignedAsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addComponent(ActivationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ActivationStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignedAsField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(toggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SignedAsField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SignedAsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActivationStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ActivationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(toggle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActivationStateLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ActivationStateLabelAncestorAdded

        changeActivationStateLabelText(this.controller.getActivationState());
        this.ActivationStateLabel.setBackground(Color.BLACK);
    }//GEN-LAST:event_ActivationStateLabelAncestorAdded
    private void setAsActive() {

        this.ActivationStateLabel.setText(ActivationState.Active.name());
        this.ActivationStateLabel.setForeground(Color.GREEN);
        this.ActivationStateLabel.setToolTipText("Meter is active");

    }

    private void setAsInactive() {

        this.ActivationStateLabel.setText(ActivationState.Inactive.name());
        this.ActivationStateLabel.setForeground(Color.RED);
        this.ActivationStateLabel.setToolTipText("Meter is inactive");
    }

    private void changeActivationStateLabelText(String toSwitchState) {

        if (toSwitchState.equals(ActivationState.Active.name())) {

            setAsActive();

        } else if (toSwitchState.equals(ActivationState.Inactive.name())) {

            setAsInactive();

        }
    }

    private String switchActivationState(String state) {
        
        if (state.equals(ActivationState.Active.name())) {
            return ActivationState.Inactive.name();
        } else if (state.equals(ActivationState.Inactive.name())) {
            return ActivationState.Active.name();
        }
        return "";
    }
    
    private void SignedAsFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SignedAsFieldAncestorAdded

        this.SignedAsField.setText(this.controller.getMeterCode());
    }//GEN-LAST:event_SignedAsFieldAncestorAdded

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActionPerformed

        String state = this.controller.getActivationState();
        String toSwitchState = switchActivationState(state);
        
     
        int exitTheProcess = 1;
        exitTheProcess = JOptionPane.showConfirmDialog(null, "Are you sure to " + switchActivationStateWarning(toSwitchState) + " this meter :" + this.controller.getMeterCode(), toSwitchState, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
////////////////
        if (exitTheProcess == 1) {
            return;
        }

        changeActivationStateLabelText(toSwitchState);
        this.controller.toggleActivation(this.controller.getMeterCode());
        this.ActivationStateLabel.setBackground(Color.BLACK);
         toggle.setToolTipText("Click to deactivate");
    }//GEN-LAST:event_toggleActionPerformed
    
    private String switchActivationStateWarning(String toSwitchState){
        if (toSwitchState.equals(ActivationState.Active.name())) {
            return ActivationState.activate.name();
        } else if (toSwitchState.equals(ActivationState.Inactive.name())) {
            return  ActivationState.deactivate.name();
        }
        return "";
    }
    
    @Override
    public final void setSpecialSettings() {

        this.setLocationRelativeTo(null);
    }

    @Override
    public final void setController(Controller controller) {

        this.controller = (CustomerDashboardController) controller;
    }

    @Override
    public final void setPreviousFrame(JFrame previousFrame) {

        this.previousFrame = previousFrame;
    }

    @Override
    public javax.swing.JFrame getPreviousFrame() {

        return this.previousFrame;
    }

    private CustomerDashboardController controller;
    private javax.swing.JFrame previousFrame;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActivationLabel;
    private javax.swing.JLabel ActivationStateLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel SignedAsField;
    private javax.swing.JLabel SignedAsLabel;
    private javax.swing.JToggleButton toggle;
    // End of variables declaration//GEN-END:variables

}
