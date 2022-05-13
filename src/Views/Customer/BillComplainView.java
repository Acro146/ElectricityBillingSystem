package Views.Customer;

import Controllers.Interface.Controller;
import Models.Enum.Column;
import Models.Enum.GovernmentCode;
import Models.Enum.PaymentState;
import Views.View;
import Views.ViewsHelper;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Controllers.Interface.CustomerController;

/**
 *
 * @author xorigin
 */
public class BillComplainView extends javax.swing.JFrame implements View{

    /**
     * Creates new form BillComplainView
     * @param previousFrame
     * @param controller
     */
    public BillComplainView(javax.swing.JFrame previousFrame, Controller controller) {
        
        this.setPreviousFrame(previousFrame);
        this.setController(controller);
        
        initComponents();
        setSpecialSettings();
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
        SelectBillLabel = new javax.swing.JLabel();
        ComplainScrollPane = new javax.swing.JScrollPane();
        ComplainField = new javax.swing.JTextArea();
        EnterComplainLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        BillsScrollPane = new javax.swing.JScrollPane();
        BillsTable = new javax.swing.JTable();
        NumOfBillsLabel = new javax.swing.JLabel();
        NumOfBillsField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complain about bill");
        setResizable(false);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BackIcon.png"))); // NOI18N
        BackButton.setToolTipText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        SelectBillLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SelectBillLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SelectBillLabel.setText("Select bill");

        ComplainField.setColumns(20);
        ComplainField.setRows(5);
        ComplainScrollPane.setViewportView(ComplainField);

        EnterComplainLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EnterComplainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EnterComplainLabel.setText("Enter Complain");

        SubmitButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

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
        BillsTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BillsTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        BillsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BillsTableMousePressed(evt);
            }
        });
        BillsTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BillsTablePropertyChange(evt);
            }
        });
        BillsScrollPane.setViewportView(BillsTable);

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
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComplainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EnterComplainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumOfBillsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumOfBillsField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BillsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SelectBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumOfBillsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NumOfBillsField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterComplainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComplainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        this.dispose();
        this.previousFrame.revalidate();
        this.previousFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BillsTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BillsTablePropertyChange

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for(int i = 0; i < BillsTable.getColumnCount(); i++)
        BillsTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }//GEN-LAST:event_BillsTablePropertyChange

    private void BillsTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BillsTableAncestorAdded

        this.fillBillsTableByStatus(PaymentState.Unpaid.toString());
        this.selectNextBill();
    }//GEN-LAST:event_BillsTableAncestorAdded

    private void BillsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillsTableMousePressed
        
        if(!this.NumOfBillsField.getText().equals("0"))
            this.selectedBill = this.getNumOfBill();
    }//GEN-LAST:event_BillsTableMousePressed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        
        if(this.NumOfBillsField.getText().equals("0")){
            
            String message = "No invoices to submit a complaint.";
            JOptionPane.showMessageDialog(this, message, "Unsuccessful operation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(this.controller.isValidComplaint(this.ComplainField.getText())){
            
            this.controller.complainAboutBill(this.ComplainField.getText(), this.selectedBill);

            String message = "Complaint has been sent successfully.";
            JOptionPane.showMessageDialog(this, message, "Successful operation", JOptionPane.INFORMATION_MESSAGE);

            this.removeRowAfterSubmit();
            
        } else {
        
            String message = "Enter valid complaint.";
            JOptionPane.showMessageDialog(this, message, "Complain field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void removeRowAfterSubmit(){
    
        int numOfRows = this.tableModel.getRowCount();
        this.tableModel.removeRow(this.BillsTable.getSelectedRow());
        this.tableModel.setRowCount(numOfRows - 1);
        
        this.updateNumOfBills();
        this.selectNextBill();
        this.BillsTableMousePressed(null);
    }
    
    private int getNumOfBill(){
    
        return (int) this.BillsTable.getValueAt(this.BillsTable.getSelectedRow(), 0);
    }
    
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
        billInfo[1] = ViewsHelper.getStringValueFromEnumStringValue(GovernmentCode.getEnumNameForValue(bill.get(Column.GovernmentCode)));
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
    
    private void selectNextBill(){
    
        if(!this.NumOfBillsField.getText().equals("0"))
            this.BillsTable.setRowSelectionInterval(0, 0);
    }
    
    
    @Override
    public final void setSpecialSettings() {
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.bills = this.controller.getAllBillsOfMeterCode();
    }
    
    @Override
    public final void setController(Controller controller){
        
        this.controller = (CustomerController) controller;
    }
    
    @Override
    public final void setPreviousFrame(JFrame previousFrame) {
        
        this.previousFrame = previousFrame;
    }
    
    @Override
    public javax.swing.JFrame getPreviousFrame(){
    
        return this.previousFrame;
    }
    
    int selectedBill = 0;
    List<Map<Enum, Object>> bills;
    DefaultTableModel tableModel;
    private CustomerController controller;
    private javax.swing.JFrame previousFrame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JScrollPane BillsScrollPane;
    private javax.swing.JTable BillsTable;
    private javax.swing.JTextArea ComplainField;
    private javax.swing.JScrollPane ComplainScrollPane;
    private javax.swing.JLabel EnterComplainLabel;
    private javax.swing.JLabel NumOfBillsField;
    private javax.swing.JLabel NumOfBillsLabel;
    private javax.swing.JLabel SelectBillLabel;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables
}
