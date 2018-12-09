/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Manufacture;

import Business.Supplier.Product;
import Business.Supplier.Supplier;
import Business.Enterprise.Enterprise;
import Business.User.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Network.Network;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author peichun
 */
public class ProductCreate extends javax.swing.JPanel {

    
    Supplier supplier;
    Product product;
    JPanel userProcessContainer;
    private Enterprise enterprise;
    private User user;
    private Network network;
    /**
     * Creates new form ProductCreate
     */
//    public ProductCreate(JPanel userProcessContainer, Supplier sup, User user, Enterprise enterprise){
//        initComponents();
//        supplier = sup;
//        this.userProcessContainer = userProcessContainer;
//        this.enterprise = enterprise;
//        this.user = user;
//    }
    
    public ProductCreate(JPanel userProcessContainer, Enterprise enterprise,Network network){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network=network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton1 = new javax.swing.JButton();
        PriceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        SizeField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        QuantityField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        PriceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Product Name:");

        NameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText(" Original Price :");

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add Product");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        SizeField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Weight :");

        QuantityField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Quantity :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton1)
                            .addComponent(jLabel5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(createButton)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton1)
                    .addComponent(createButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProductManage chooseAirplaneModelToSchedule = (ProductManage) component;
        chooseAirplaneModelToSchedule.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
  
    }
    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        Product product =new Product();
        List<String> L=new ArrayList<>();
        
        for(Product p:enterprise.getDatastore().getProList())
            //L.add(p.getName());
            if(p.getName().equals(NameField.getText()))
            {
               JOptionPane.showMessageDialog(null, "Product already existed");
               return;
            }
        
        
        try{
            double price =Double.parseDouble(PriceField.getText());
            product.setOriginPrice(price);
        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "number only");
            return;

        }

        try{
            int cap =Integer.parseInt(QuantityField.getText());
            product.setNum(cap);
        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "number only");
            return;

        }
        

        try{
            double cap =Double.parseDouble(SizeField.getText());
            product.setSize(cap);
        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "number only");
            return;

        }
        


                
        
        
        product.setName(NameField.getText());
        
        product.setSupplierName(enterprise.getName());
        
        
        //enterprise.getProList().addProduct(product);

        JOptionPane.showMessageDialog(null, "Product successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);

        
//        
//        List<String> supplierName = new ArrayList<>();
//        
//        for(Supplier sup:enterprise.getDatastore().getSupList()){
//            if(!supplierName.contains(sup.getSpName()))
//                supplierName.add(sup.getSpName());
//         }
//         
//        if(!supplierName.contains(supplier.getSpName())){
//            enterprise.getDatastore().getSupList().add(supplier);
//        }

        network.getNetworkDataStore().getProList().add(product);
        enterprise.getDatastore().getProList().add(product);
        //enterprise.getDatastore().getProList().add(new Product(product.getName(),product.getOriginPrice(),product.getNum(),product.getSize(),product.getSupplierName()));

    }//GEN-LAST:event_createButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JTextField SizeField;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
