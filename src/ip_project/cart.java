/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip_project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayush
 */
public class cart extends javax.swing.JFrame {

    /**
     * Creates new form cart
     */
    public cart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cbp = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbp.setBackground(new java.awt.Color(51, 204, 255));
        cbp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbp.setText("PRIME CUSTOMER");
        cbp.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        cbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpActionPerformed(evt);
            }
        });
        getContentPane().add(cbp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 255, 255));
        jButton5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jButton5.setText("Checkout & Pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jButton4.setText("Delete Item");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BILL AMOUNT ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jButton3.setText("Refresh items");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jButton2.setText("VIEW CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        tb1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S no", "Product ", "Quantity", "Net amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 580, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip_project/3379d420-6679-4b55-a85c-f2c2a46740d9.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        String n=mainscreen.nm.getText();
        int x=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String query="select * from "+n+";";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                String sno=rs.getString("Sno");
                String item=rs.getString("Product");
                String qty=rs.getString("Quantity");
                String net=rs.getString("Netamnt");
                int a=Integer.parseInt(net);
                model.addRow(new Object[]{sno,item,qty,net});
                
                x=x+a;
                
            }lb1.setText(Integer.toString(x));}
            catch(ClassNotFoundException | SQLException e)
                    {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        String n=mainscreen.nm.getText();
        int x=0;
        
        int rowCount = model.getRowCount();
    for (int i = rowCount-1; i >= 0 ; i--)
    {
        model.removeRow(0);
    } 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String query="select * from "+n+";";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                String sno=rs.getString("Sno");
                String item=rs.getString("Product");
                String qty=rs.getString("Quantity");
                String net=rs.getString("Netamnt");
                int a=Integer.parseInt(net);
                model.addRow(new Object[]{sno,item,qty,net});
                
                x=x+a;
                
            }lb1.setText(Integer.toString(x));}
            catch(ClassNotFoundException | SQLException e)
                    {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String x=JOptionPane.showInputDialog(this,"Please enter the Sno of the item.");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String n=mainscreen.nm.getText();
            String query="delete from "+n+" where Sno="+x+";";
            int i=st.executeUpdate(query);
        if(i>0)
        {
            JOptionPane.showMessageDialog(this,"Item successfully deleted.");
            
        }}
        catch(ClassNotFoundException | SQLException | HeadlessException e)
                {
                JOptionPane.showMessageDialog(this,e.getMessage());
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                String z,y,x=mainscreen.nm.getText();
                y=lb1.getText();
        JOptionPane.showMessageDialog(this,"Thanks for visiting us.");
       if(cbp.isSelected())
       {try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String query="drop table "+x+";";
            st.executeUpdate(query);
        JOptionPane.showMessageDialog(this,"Please pay Rs."+ y +" at the counter."
                + "Thanks, visit us again.");
        System.exit(0);}
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }}
       else
       {
        if(Integer.parseInt(y)>10000)
        {try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String query="select usernm from login where name='"+x+"';";
            ResultSet rs=st.executeQuery(query);
            if(rs.wasNull()){JOptionPane.showMessageDialog(this,"You are not our prime customer.");}
            else{
                rs.next();
            z=rs.getString("usernm");
            String query1="insert into prime values('"+z+"');";
            st.executeUpdate(query1);
        JOptionPane.showMessageDialog(this,"You are now our prime customer.");
        System.exit(0);}}
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }  
       }
       else
        {
        System.exit(0);    
        }}

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String x=mainscreen.nm.getText();
        JOptionPane.showMessageDialog(this,"Thanks for visiting us.");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String query="drop table "+x+";";
            st.executeUpdate(query);
        System.exit(0);}
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpActionPerformed
        // TODO add your handling code here:
        String x=JOptionPane.showInputDialog(this,"Please enter your username.");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject", "root", "tiger");
            Statement st=con.createStatement();
            String query="select * from prime where usrnm='"+x+"';";
            ResultSet rs=st.executeQuery(query);
        if(!rs.wasNull())
        {double i=Double.parseDouble(lb1.getText());
        double z=0.9*i;
        lb1.setText(Double.toString(z));
        JOptionPane.showMessageDialog(this,"10% discount applied.");}
        else
        {
            JOptionPane.showMessageDialog(this,"You're not eligible for discount."
                    + "please make a purchase of more than 10000 to become a prime customer.");
        }}
        
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_cbpActionPerformed

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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
