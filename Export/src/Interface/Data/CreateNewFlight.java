/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Data;

import Business.Airline.AirlineDirectory;
import Business.Airline.Airline;
import Business.Airline.Flight;
import Business.Airline.Airline;
import Business.Enterprise.Enterprise;
import Business.User.User;
import Business.helper.CtyDetail;
import Business.helper.DataStore;

//import UserInterface.AdminstrativeRole.ManageSuppliers;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author peichun
 */
public class CreateNewFlight extends javax.swing.JPanel {
    
    Airline airline;
    Flight flight;
    JPanel userProcessContainer;
    private Enterprise enterprise;
    private User user;

    /**
     * Creates new form CreateNewFlight
     */
    public CreateNewFlight(JPanel userProcessContainer, Airline air, User user, Enterprise enterprise){
        initComponents();
        airline = air;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FlightnumberField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Capacity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DestinationField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DepartureTimeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Flight");

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add Flight");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Flight Number:");

        FlightnumberField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FlightnumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightnumberFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Capacity :");

        Capacity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Destination:");

        DestinationField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Departure time:");

        DepartureTimeField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("            Price :");

        PriceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6)
                            .addGap(33, 33, 33)
                            .addComponent(FlightnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(DestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(DepartureTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel5)
                            .addGap(32, 32, 32)
                            .addComponent(Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton1)
                            .addGap(127, 127, 127)
                            .addComponent(createButton)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FlightnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DepartureTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backButton1)
                        .addComponent(createButton))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        Flight flight = airline.getFltList().addFlight();
        try{
            int price =Integer.parseInt(PriceField.getText());
            flight.setPrice(price);
        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "number only");
            return;

        }

        try{
            double cap =Double.parseDouble(Capacity.getText());
            flight.setCapacity(cap);
        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "number only");
            return;

        }
        flight.setFlightnumber(FlightnumberField.getText());
        //flight.setCapacity(Capacity.getText());
        flight.setCty(DestinationField.getText());
        flight.setTime(DepartureTimeField.getText());

        JOptionPane.showMessageDialog(null, "Flight successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
        List<String> ctyname = new ArrayList<>();
        
        
//        if(!ctyname.contains(DestinationField.getText()))
//        {
//            ctyname.add(DestinationField.getText());
//            enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
//        }
        
         for(CtyDetail cty:enterprise.getDatastore().getCountryList()){
            if(!ctyname.contains(cty.getCtyName()))
                ctyname.add(cty.getCtyName());
         }
         
        if(!ctyname.contains(DestinationField.getText())){
            enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
        }
        
        enterprise.getDatastore().getAirList().add(airline);
        

        
        
//        for(CtyDetail cty:enterprise.getDatastore().getCountryList())
//        {
//            if(!ctyname.contains(cty.getCtyName()))
//            {
//                ctyname.add(cty.getCtyName());
//                enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
//            }
//        
//        }
         
       // enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
    }//GEN-LAST:event_createButtonActionPerformed

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlight chooseAirplaneModelToSchedule = (ManageFlight) component;
        chooseAirplaneModelToSchedule.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
  
    }
    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void FlightnumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightnumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightnumberFieldActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Capacity;
    private javax.swing.JTextField DepartureTimeField;
    private javax.swing.JTextField DestinationField;
    private javax.swing.JTextField FlightnumberField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}