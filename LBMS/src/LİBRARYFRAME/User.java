
package LİBRARYFRAME;

import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;


public class User extends javax.swing.JFrame {

    final void fillList()
    {
        try 
      {
        
           String url="jdbc:derby://localhost:1527/LBMS";
            String username="aa";
            String password="aa";

        
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        String Query ="SELECT * FROM BOOK ORDER BY NAME";      
        ResultSet rs= stmt.executeQuery(Query);
        
        DefaultListModel DLM= new DefaultListModel();
        
        while(rs.next())
        {
            DLM.addElement(rs.getString(1));
        }
        
        List1.setModel(DLM);
      }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
    
   
    public User() {
        initComponents();
        fillList();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchBtn = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        YearText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PublisherText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AuthorText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ReserveText = new javax.swing.JTextField();
        ReserveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<String>();
        ıdtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Name of Book");

        jLabel5.setText("Year of Book");

        jLabel3.setText("Publisher of Book");

        jLabel1.setText("Author of Book");

        jLabel6.setText("Reserve TRUE OR FALSE?");

        ReserveBtn.setText("Reserve");
        ReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBtnActionPerformed(evt);
            }
        });

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NameText, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(AuthorText))
                            .addComponent(ıdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PublisherText, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YearText, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReserveText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ReserveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ıdtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PublisherText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReserveText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReserveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        ıdtext.setText(UserPassword.isim+UserPassword.soyisim);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        try
        {
            
            String url="jdbc:derby://localhost:1527/LBMS";
            String username="aa";
            String password="aa";

            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt= con.createStatement();
            String Query ="SELECT * FROM BOOK WHERE NAME= '"+SearchText.getText()+"'";
            ResultSet rs= stmt.executeQuery(Query);

            while(rs.next())
            {
                
                NameText.setText(rs.getString(1));
                AuthorText.setText(rs.getString(2));
                PublisherText.setText(rs.getString(3));                
                YearText.setText(rs.getString(5));
                if(rs.getBoolean(4)==true)
                {
                    ReserveText.setText("True");
                }
                else
                    ReserveText.setText("False");
                 if(rs.getBoolean(4)==false)
                 {
                     JOptionPane.showMessageDialog(null, "Book is suitible for you.");
                 }
            }

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        UserPassword up = new UserPassword();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
       
        
        if( ReserveText.getText().equals("False"))
        {
         
             try
        {

            String url="jdbc:derby://localhost:1527/LBMS";
            String username="aa";
            String password="aa";

            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt= con.createStatement();
            String Query ="UPDATE BOOK SET RESERVE = 'True' WHERE NAME='"+List1.getSelectedValue()+"'";
            stmt.execute(Query);
            String Query1 ="UPDATE BOOK SET ID = (SELECT ID FROM USER1 WHERE NAME='"+UserPassword.isim+"' AND SURNAME= '"+UserPassword.soyisim+"') WHERE NAME='"+List1.getSelectedValue()+"'";
            stmt.execute(Query1);
            fillList();
            JOptionPane.showMessageDialog(null, "Book is RESERVED for you.");
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        }
        
        
        
        
        
    }//GEN-LAST:event_ReserveBtnActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        try
        {

            String url="jdbc:derby://localhost:1527/LBMS";
            String username="aa";
            String password="aa";

            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt= con.createStatement();
            String Query ="SELECT * FROM BOOK WHERE NAME= '"+List1.getSelectedValue()+"'";
            ResultSet rs= stmt.executeQuery(Query);

            while(rs.next())
            {
                NameText.setText(rs.getString(1));
                AuthorText.setText(rs.getString(2));
                PublisherText.setText(rs.getString(3));               
                YearText.setText(rs.getString(5));
                if(rs.getBoolean(4)==true)
                {
                    ReserveText.setText("True");
                }
                else
                    ReserveText.setText("False");
            }

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorText;
    private javax.swing.JButton BackBtn;
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PublisherText;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JTextField ReserveText;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchText;
    private javax.swing.JTextField YearText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ıdtext;
    // End of variables declaration//GEN-END:variables
}
