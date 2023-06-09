/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineReservationSystem2021;

import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelClass.ComboItem;
import modelClass.Reservation;
import modelClass.Flight;
import modelClass.GateEnum;
import modelClass.Payment;
import modelClass.StatusEnum;
import modelClass.User;

/**
 *
 * @author amiras
 */
public class MyReservation extends javax.swing.JFrame {

    /**
     * Creates new form myReservation2
     */
    public MyReservation(User user) {
        initComponents();
        getReservation(user);
    }

    private void getReservation(User user) {
                 try {

            String query = "select `tickets`.*, `flights`.*, `payments`.*, `reservations`.*, `or`.`name` as `origin_name`, `de`.`name` as `destination_name`, `or`.`id` as `origin_id`, `de`.`name` as `destination_id`, `payments`.`date` as `payment_date` from `reservations` inner join `tickets` on `tickets`.`id` = `reservations`.`ticket_id` inner join `flights` on `flights`.`id` = `tickets`.`flight_id` inner join `payments` on `payments`.`id` = `reservations`.`payment_id` inner join `airports` as `or` on `or`.`id` = `flights`.`origin` inner join `airports` as `de` on `de`.`id` = `flights`.`destination` where `reservations`.`user_id` = ?";

            PreparedStatement preparedStmt = InitDb.getConnection().prepareStatement(query);
            preparedStmt.setString(1, user.getId());
            
            ResultSet rs = preparedStmt.executeQuery();
            
            GridLayout glMenu = new GridLayout(0, 1);
            reservationPanel.setLayout(glMenu);
            while (rs.next()) {

                Flight flight = new Flight();

                flight.setFlightNo(rs.getString("flight_no"));
                flight.setOrigin(new ComboItem(rs.getString("origin_id"), rs.getString("origin_name")));
                flight.setDestination(new ComboItem(rs.getString("destination_id"), rs.getString("destination_name")));
                flight.setImageUrl(rs.getString("image_url"));
                flight.setBoardingDate(rs.getDate("boarding_date"));
                flight.setGate(GateEnum.valueOf(rs.getString("gate")));
                flight.setPrice(rs.getDouble("price"));


                Payment payment = new Payment(rs.getInt("payment_id"), rs.getDouble("amount"),  rs.getDate("payment_date"), StatusEnum.valueOf(rs.getString("status")));
                
                //create object reservation
                Reservation reservation = new Reservation(
                        rs.getString("id"),
                        rs.getDate("confirmation_at"),
                        rs.getDate("cancelled_at"),
                        rs.getString("cancellation_reason"),
                        user,
                        payment,
                        rs.getInt("ticket_id"),
                        rs.getString("seat_no"),
                        rs.getDouble("luggage_weight"),
                        flight,
                        rs.getBoolean("gate")
                );
                reservationPanel.add(new ReservationItem(reservation));

            }
            reservationPanel.revalidate();
            reservationPanel.repaint();
            InitDb.close();
            //rs.close();
            preparedStmt.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
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

        jPanel2 = new javax.swing.JPanel();
        etTitle1 = new javax.swing.JLabel();
        btnHome1 = new javax.swing.JLabel();
        btnViewReservation = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(null);

        etTitle1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        etTitle1.setForeground(new java.awt.Color(255, 255, 255));
        etTitle1.setText("ARS");
        jPanel2.add(etTitle1);
        etTitle1.setBounds(30, 20, 80, 40);

        btnHome1.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(255, 255, 255));
        btnHome1.setText("HOME");
        jPanel2.add(btnHome1);
        btnHome1.setBounds(730, 40, 49, 21);

        btnViewReservation.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        btnViewReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnViewReservation.setText("MY RESERVATION");
        btnViewReservation.setToolTipText("");
        jPanel2.add(btnViewReservation);
        btnViewReservation.setBounds(800, 40, 146, 21);

        btnLogout.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        jPanel2.add(btnLogout);
        btnLogout.setBounds(960, 40, 67, 21);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 90));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        reservationPanel.setBackground(new java.awt.Color(255, 255, 255));
        reservationPanel.setOpaque(false);

        javax.swing.GroupLayout reservationPanelLayout = new javax.swing.GroupLayout(reservationPanel);
        reservationPanel.setLayout(reservationPanelLayout);
        reservationPanelLayout.setHorizontalGroup(
            reservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        reservationPanelLayout.setVerticalGroup(
            reservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(reservationPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 127, -1, -1));

        setSize(new java.awt.Dimension(1070, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome1;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnViewReservation;
    private javax.swing.JLabel etTitle1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel reservationPanel;
    // End of variables declaration//GEN-END:variables
}
