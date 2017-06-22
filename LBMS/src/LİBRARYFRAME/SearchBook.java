
package LİBRARYFRAME;
import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;


public class SearchBook extends javax.swing.JFrame {
    
    
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

    public SearchBook() {
        initComponents();
        fillList();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AuthorText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PublisherText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Reserve = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        YearText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BookID = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<String>();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setText("Name of Book");

        jLabel1.setText("Author of Book");

        jLabel3.setText("Publisher of Book");

        jLabel6.setText("Reserve TRUE OR FALSE?");

        Reserve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TRUE", "FALSE", " " }));

        jLabel5.setText("Year of Book");

        jLabel2.setText("BOOKID ");

        BookID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PublisherText, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearText, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameText, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(AuthorText)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(Reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
           Reserve.setSelectedItem(rs.getBoolean(4));
           YearText.setText(rs.getString(5));
           BookID.setSelectedItem(rs.getString(6));
        }
        
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
         try 
        {
        
           String url="jdbc:derby://localhost:1527/LBMS";
            String username="aa";
            String password="aa";

        
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        String Query ="UPDATE BOOK SET NAME = '"+NameText.getText()+"' , AUTHOR = '"+AuthorText.getText()+"' , PUBLISHER = '"+PublisherText.getText()+"' , RESERVE = '"+Reserve.getSelectedItem()+"' , YEARR= '"+YearText.getText() +"' , BOOKID = '"+BookID.getSelectedItem()+"' WHERE NAME = '"+List1.getSelectedValue()+"'";      
        stmt.execute(Query);
             
        
        JOptionPane.showMessageDialog(null, "Book is Updated succesfully.");
        fillList();
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
         try 
        {
        
          String url="jdbc:derby://localhost:1527/LBMS";
            String username="aa";
            String password="aa";

        
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt= con.createStatement();
        String Query ="DELETE FROM BOOK WHERE NAME = '"+List1.getSelectedValue()+"'";      
        stmt.execute(Query);
             
        
        JOptionPane.showMessageDialog(null, "Book is Deleted succesfully.");
        fillList();
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
      int result=  List1.getNextMatch(SearchText.getText(), 0, Position.Bias.Forward);
        if(result>0)
        {
            List1.setSelectedIndex(result);
          JOptionPane.showMessageDialog(null, "This Book is found"); 
        }
        else 
            
           JOptionPane.showMessageDialog(null, "This Book is not found");
       
     
     
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        Staff st = new Staff();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorText;
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<String> BookID;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PublisherText;
    private javax.swing.JComboBox<String> Reserve;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField YearText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
