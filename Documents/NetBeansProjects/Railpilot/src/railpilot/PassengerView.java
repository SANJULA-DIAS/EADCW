/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railpilot;

import java.awt.Color;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Sanjula
 */
public class PassengerView extends javax.swing.JFrame {

    /**
     * Creates new form PassengerView
     */
    public PassengerView() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btn_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call a method to handle the search action
               
            }
        });

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
        jTable1 = new javax.swing.JTable();
        TxtEmail = new javax.swing.JTextField();
        TxtTicket = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        btndele = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        btnback = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(768, 478));
        setMinimumSize(new java.awt.Dimension(768, 478));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 770, 70));
        getContentPane().add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 150, -1));
        getContentPane().add(TxtTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, -1));

        btn_search.setBackground(new java.awt.Color(0, 255, 255));
        btn_search.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.setBorder(null);
        btn_search.setBorderPainted(false);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 140, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 50, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ticket Number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railpilot/BOOK TRAIN (5).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 460, 70));

        panel3.setBackground(new java.awt.Color(0, 255, 255));

        btnupdate.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnupdate.setText("        UPDATE TICKET");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnupdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 30));

        panel4.setBackground(new java.awt.Color(0, 255, 255));

        btndele.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btndele.setText("         DELETE TICKET");
        btndele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndeleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndeleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btndele, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 220, 30));

        panel5.setBackground(new java.awt.Color(0, 255, 255));

        btnback.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnback.setText("                 BACK");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 220, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjula\\Downloads\\Untitled design (8).png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
    String email = TxtEmail.getText().trim();
    String ticketNumber = TxtTicket.getText().trim();

    // Check if either email or ticket number is empty
    if (email.isEmpty() || ticketNumber.isEmpty()) {
        // Show an error message to the user
        JOptionPane.showMessageDialog(this, "Email and Ticket Number cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Both fields are filled, proceed with the search
        performSearch();
    }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        ticketupdate obj = new ticketupdate();
        obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateMouseClicked

    private void btnupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseEntered
        setColor(panel3);
    }//GEN-LAST:event_btnupdateMouseEntered

    private void btnupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseExited
        resetColor(panel3);
    }//GEN-LAST:event_btnupdateMouseExited

    private void btndeleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleMouseClicked
        ticketdelete obj = new ticketdelete();
        obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleMouseClicked

    private void btndeleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleMouseEntered
        setColor(panel4);
    }//GEN-LAST:event_btndeleMouseEntered

    private void btndeleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleMouseExited
        resetColor(panel4);
    }//GEN-LAST:event_btndeleMouseExited

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        setColor(panel5);
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        resetColor(panel5);
    }//GEN-LAST:event_btnbackMouseExited

    String dbloc = "jdbc:mysql://localhost:3306/railpilot";
    String username = "root";

    
private void performSearch() {
    try {
        // Establish a connection to the database
        Connection connection = DriverManager.getConnection(dbloc, username, "");

        // Prepare the SQL query based on the text field values
        String query = "SELECT * FROM Passenger WHERE Email = ? AND PassengerTicket_Id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, TxtEmail.getText());
        preparedStatement.setString(2, TxtTicket.getText());

        // Execute the query and get the result set
        ResultSet resultSet = preparedStatement.executeQuery();

        // Check if the result set is empty
        if (!resultSet.isBeforeFirst()) {
                javax.swing.table.DefaultTableModel emptyTableModel = new javax.swing.table.DefaultTableModel();
                jTable1.setModel(emptyTableModel);

            throw new SQLException("No data found for the given criteria.");
        }

        // Populate the table with the results
        jTable1.setModel(buildTableModel(resultSet));

        // Close the resources
        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException ex) {
        // Handle any SQL exceptions
        ex.printStackTrace();
        // Provide a user-friendly error message
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private static javax.swing.table.TableModel buildTableModel(ResultSet resultSet) throws SQLException {
    ResultSetMetaData metaData = resultSet.getMetaData();

    // Get number of columns
    int columnCount = metaData.getColumnCount();

    // Create column names array
    String[] columnNames = new String[columnCount];

    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
        // Get column name
        columnNames[columnIndex - 1] = metaData.getColumnName(columnIndex);
    }

    // Create data array
    Object[][] data = new Object[0][columnCount];

    // Loop through the result set and populate the data array
    while (resultSet.next()) {
        Object[] row = new Object[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            row[i - 1] = resultSet.getObject(i);
        }
        // Resize the data array to accommodate the new row
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = row;
    }

    // Create and return the DefaultTableModel
    return new javax.swing.table.DefaultTableModel(data, columnNames);
    
    }
    
    
        public void setColor(JPanel p)
    {
        p.setBackground(new Color(0,206,209));
    }
        public void resetColor(JPanel pl)
    {
        pl.setBackground(new Color(0,255,255));
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PassengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtTicket;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btndele;
    private javax.swing.JLabel btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    // End of variables declaration//GEN-END:variables
}
