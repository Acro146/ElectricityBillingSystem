package Views;

import Controllers.Interface.IController;
import Controllers.Interface.ICustomerDashboardController;
import Models.Enum.ActivationState;
import java.awt.Color;

/**
 *
 * @author xorigin
 */
public class CustomerDashboardView extends javax.swing.JFrame implements IView{

    /**
     * Creates new form CustomerDashboardView
     * @param previousFrame
     */
    public CustomerDashboardView(javax.swing.JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
        
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
        ViewBillsButton = new javax.swing.JButton();
        ActivationLabel = new javax.swing.JLabel();
        ActivationStateLabel = new javax.swing.JLabel();
        MonthlyReadingButton = new javax.swing.JButton();
        ComplainButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Dashboard");
        setResizable(false);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Log out");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        FrameDescription.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FrameDescription.setText(" Customer Dashboard ");
        FrameDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ViewBillsButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        ViewBillsButton.setText("View all bills");
        ViewBillsButton.setToolTipText("Press to view all bills");
        ViewBillsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBillsButtonActionPerformed(evt);
            }
        });

        ActivationLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ActivationLabel.setForeground(new java.awt.Color(51, 51, 51));
        ActivationLabel.setText("Your meter is:");
        ActivationLabel.setOpaque(true);

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

        MonthlyReadingButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        MonthlyReadingButton.setText("Enter monthly reading");
        MonthlyReadingButton.setToolTipText("Press to enter new monthly reading");
        MonthlyReadingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyReadingButtonActionPerformed(evt);
            }
        });

        ComplainButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        ComplainButton.setText("Complain about bill");
        ComplainButton.setToolTipText("Press to enter new complain");
        ComplainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplainButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FrameDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ActivationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ActivationStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ViewBillsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComplainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MonthlyReadingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FrameDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActivationStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActivationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(MonthlyReadingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ComplainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ViewBillsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ViewBillsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBillsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewBillsButtonActionPerformed

    private void MonthlyReadingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyReadingButtonActionPerformed
     
        this.dispose();
        new MonthlyReadingView(this, this.controller);
    }//GEN-LAST:event_MonthlyReadingButtonActionPerformed

    private void ComplainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplainButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComplainButtonActionPerformed

    private void ActivationStateLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ActivationStateLabelAncestorAdded
        
        String state = this.controller.getActivationState();
       
        if(state.equals(ActivationState.Active.name())){
        
            this.ActivationStateLabel.setText(ActivationState.Active.name());
            this.ActivationStateLabel.setForeground(Color.GREEN);
            this.ActivationStateLabel.setToolTipText("Meter is active");
            
        } else if(state.equals(ActivationState.Inactive.name())){
        
            this.ActivationStateLabel.setText(ActivationState.Inactive.name());
            this.ActivationStateLabel.setForeground(Color.RED);
            this.ActivationStateLabel.setToolTipText("Meter is inactive");
            this.MonthlyReadingButton.setEnabled(false);
            String toolTips = "You must activate the meter to be able to enter the reading, please contact the company.";
            this.MonthlyReadingButton.setToolTipText(toolTips);
        }
        
        this.ActivationStateLabel.setBackground(Color.BLACK);
    }//GEN-LAST:event_ActivationStateLabelAncestorAdded

    
    @Override
    public final void setSpecialSettings() {
        
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public void setController(IController controller){
        
        this.controller = (ICustomerDashboardController) controller;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    
    
    private ICustomerDashboardController controller;
    private final javax.swing.JFrame previousFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActivationLabel;
    private javax.swing.JLabel ActivationStateLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ComplainButton;
    private javax.swing.JLabel FrameDescription;
    private javax.swing.JButton MonthlyReadingButton;
    private javax.swing.JButton ViewBillsButton;
    // End of variables declaration//GEN-END:variables
}
