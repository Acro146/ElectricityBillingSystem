package Views.Customer;

import Controllers.Interface.Controller;
import Controllers.Interface.CustomerDashboardController;
import Models.Enum.Column;
import Models.Enum.GovernmentCode;
import Models.Enum.PaymentState;
import Views.View;
import Views.ViewsHelper;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xorigin
 */
public class CustomerBillsView extends javax.swing.JFrame implements View{

    /**
     * Creates new form CustomerBillsView
     * @param previousFrame
     * @param controller
     */
    public CustomerBillsView(javax.swing.JFrame previousFrame, Controller controller) {
        
        this.setPreviousFrame(previousFrame);
        this.setController(controller);
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BillsTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        StatusField = new javax.swing.JComboBox<>();
        StatusLabel = new javax.swing.JLabel();
        NumOfBillsLabel = new javax.swing.JLabel();
        NumOfBillsField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Customer Bills");
        setResizable(false);

        BillsTable.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        BillsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Governorate", "Tariff", "Last Reading", "Current Reading", "Consumption", "Money Value", "Status", "Release Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillsTable.getTableHeader().setReorderingAllowed(false);
        BillsTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BillsTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(BillsTable);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        StatusField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        StatusField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                StatusFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        StatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusFieldActionPerformed(evt);
            }
        });

        StatusLabel.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        StatusLabel.setLabelFor(StatusField);
        StatusLabel.setText("Select status");

        NumOfBillsLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NumOfBillsLabel.setText("Number of Bills: ");

        NumOfBillsField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NumOfBillsField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(NumOfBillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumOfBillsField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(151, 151, 151)
                        .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NumOfBillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(NumOfBillsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void StatusFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_StatusFieldAncestorAdded
        
        this.fillStatusField();
    }//GEN-LAST:event_StatusFieldAncestorAdded

    private void BillsTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BillsTablePropertyChange
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        for(int iterator = 0; iterator < BillsTable.getColumnCount(); iterator++)
            BillsTable.getColumnModel().getColumn(iterator).setCellRenderer(centerRenderer);
    }//GEN-LAST:event_BillsTablePropertyChange

    private void StatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusFieldActionPerformed
        
        this.fillBillsTableByStatus(this.StatusField.getSelectedItem().toString());
    }//GEN-LAST:event_StatusFieldActionPerformed

    private void fillBillsTableByStatus(String status){
    
        this.tableModel = (DefaultTableModel) this.BillsTable.getModel();
        
        this.clearTableRows();
        
        for(Map<Enum, Object> bill : this.bills)
            if(status.equals(bill.get(Column.Status).toString()))
                this.tableModel.addRow(this.constructRow(bill));
        
        this.updateNumOfBills();
    }
    
    
    private void clearTableRows(){
    
        this.tableModel.setRowCount(0);
    }
    
    
    private Object[] constructRow(Map<Enum, Object> bill){
    
        Object[] billInfo = new Object[9];
        billInfo[0] = bill.get(Column.Num);
        billInfo[1] = GovernmentCode.getEnumNameForValue(bill.get(Column.GovernmentCode)).replaceAll("_", " ");
        billInfo[2] = bill.get(Column.Tariff);
        billInfo[3] = bill.get(Column.LastReading);
        billInfo[4] = bill.get(Column.CurrentReading);
        billInfo[5] = bill.get(Column.Consumption);
        billInfo[6] = String.format("%.2f", bill.get(Column.MoneyValue));
        billInfo[7] = bill.get(Column.Status);
        billInfo[8] = bill.get(Column.ReleaseDate);
        
        return billInfo;
    }
    
    private void updateNumOfBills(){
    
        this.NumOfBillsField.setText(String.valueOf(this.tableModel.getRowCount()));
    }
    
    private void fillStatusField(){
    
        String[] states = ViewsHelper.getEnumValues(PaymentState.values());
        
        for(String state : states)
            this.StatusField.addItem(state);
        
        this.StatusField.setSelectedIndex(1);
    }

    @Override
    public final void setSpecialSettings() {
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.bills = this.controller.getAllBillsOfMeterCode();
    }
    
    @Override
    public final void setController(Controller controller){
        
        this.controller = (CustomerDashboardController) controller;
    }
    
    @Override
    public final void setPreviousFrame(JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    
    List<Map<Enum, Object>> bills;
    DefaultTableModel tableModel;
    private CustomerDashboardController controller;
    private javax.swing.JFrame previousFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTable BillsTable;
    private javax.swing.JLabel NumOfBillsField;
    private javax.swing.JLabel NumOfBillsLabel;
    private javax.swing.JComboBox<String> StatusField;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
