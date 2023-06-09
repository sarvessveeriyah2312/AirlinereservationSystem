/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineReservationSystem2021;

import java.awt.Image;
import java.awt.image.BufferedImage;

import java.net.URL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.function.Function;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import modelClass.Reservation;

/**
 *
 * @author amiras
 */
public class ReservationItem extends javax.swing.JPanel {

    
    private static Reservation reservation;
    
    /**
     * Creates new form ReservationItem
     */
    public ReservationItem(Reservation reservation) {
        initComponents();
        this.reservation = reservation;
        
        txtFrom.setText(reservation.getTicket().getFlight().getOrigin().getValue());
        txtTo.setText(reservation.getTicket().getFlight().getDestination().getValue());
        

        //String strDate = dateFormat.format(ticket.getBoardingDate());
        txtFlightNo.setText(reservation.getTicket().getFlight().getFlightNo());

        txtTicketId.setText(String.valueOf(reservation.getTicket().getTicketId()));

        txtSeat.setText(reservation.getTicket().getSeatNo());
        txtGate.setText(reservation.getTicket().getFlight().getGate().toString());
        URL url;

        try {
            url = new URL(reservation.getTicket().getFlight().getImageUrl());
            BufferedImage bufferedImage = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(bufferedImage);
            Image imageFlight = icon.getImage();
            imageFlight = imageFlight.getScaledInstance(299, 166,
                    Image.SCALE_SMOOTH);

            imgFlightImage.setIcon(new ImageIcon(imageFlight));

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

       
        txtDate.setText(reservation.getTicket().getFlight().getBoardingDateString());
        if(reservation.getCancelledAt() == null)
        {
            btnCancel.setVisible(true);
            btnDelete.setVisible(false);
        }
        else
        {
            btnCancel.setVisible(false);
            btnDelete.setVisible(true);
        }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JLabel();
        txtTo = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtDeparture = new javax.swing.JLabel();
        txtTicketId = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JLabel();
        txtGate = new javax.swing.JLabel();
        txtSeat = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        imgFlightImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(984, 220));

        jLabel1.setText("From");

        jLabel2.setText("To");

        jLabel3.setText("Date");

        jLabel4.setText("Departure");

        jLabel5.setText("Ticket Id");

        jLabel6.setText("Flight No.");

        jLabel7.setText("Gate");

        jLabel8.setText("Seat");

        txtFrom.setText("from");

        txtTo.setText("to");

        txtDate.setText("date");

        txtDeparture.setText("departure");

        txtTicketId.setText("ticketId");

        txtFlightNo.setText("flightNo");

        txtGate.setText("gate");

        txtSeat.setText("seat");

        btnCancel.setBackground(new java.awt.Color(102, 255, 102));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        imgFlightImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imgFlightImage, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTo)
                    .addComponent(txtDate)
                    .addComponent(txtSeat)
                    .addComponent(txtGate)
                    .addComponent(txtFlightNo)
                    .addComponent(txtTicketId)
                    .addComponent(txtDeparture)
                    .addComponent(txtFrom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFrom))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTo))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDeparture))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTicketId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFlightNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtGate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSeat)))
                    .addComponent(imgFlightImage, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int options = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Are you sure want to delete the reservation?", "SERIOUS QUESTION", options, 3);
        if (result == JOptionPane.YES_OPTION) {
            try {
                String query = "DELETE  FROM reservations WHERE id = " + reservation.getReservationId() + "";
                String query2 = "DELETE FROM tickets WHERE id = " + reservation.getTicket().getTicketId() + "";
                String query3 = "DELETE FROM payments WHERE id = " + reservation.getPayment().getPaymentId() + "";
                //System.out.println(query);
                PreparedStatement preparedStmt = InitDb.getConnection().prepareStatement(query);
                preparedStmt = InitDb.getConnection().prepareStatement(query2);
                preparedStmt = InitDb.getConnection().prepareStatement(query3);
                preparedStmt.executeUpdate(query);
                preparedStmt.executeUpdate(query2);
                preparedStmt.executeUpdate(query3);
                
                
            } catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        } else if (result == JOptionPane.NO_OPTION) {

        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        String reason;
        reason = JOptionPane.showInputDialog("Please state a reason for the cancellation");

        if (reason != null) {
            int options = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Are you sure want to cancel the reservation?", "SERIOUS QUESTION", options, 3);
            if (result == JOptionPane.YES_OPTION) {
                
                try {
                    String query = "UPDATE reservations SET cancelled_at = ?, cancellation_reason = ? "
                            + "WHERE id = ?";
                    //System.out.println(query);
                    PreparedStatement preparedStmt = InitDb.getConnection().prepareStatement(query);
                    preparedStmt.setDate(1, (Date) Calendar.getInstance().getTime());
                    preparedStmt.setString(2, reason);
                    preparedStmt.setString(3, reservation.getReservationId());
                    preparedStmt.executeUpdate(query);

                } catch (Exception e) {
                    System.err.println("Got an exception! ");
                    System.err.println(e.getMessage());
                }
            } else if (result == JOptionPane.NO_OPTION) {

            }
        }
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel imgFlightImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDeparture;
    private javax.swing.JLabel txtFlightNo;
    private javax.swing.JLabel txtFrom;
    private javax.swing.JLabel txtGate;
    private javax.swing.JLabel txtSeat;
    private javax.swing.JLabel txtTicketId;
    private javax.swing.JLabel txtTo;
    // End of variables declaration//GEN-END:variables

}
