package micro_processor;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krrishdholakia
 */
public class EducateX1v1_User extends javax.swing.JFrame {

    /**
     * Creates new form EducateX1v1_User
     */
    public EducateX1v1_User() {
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

        jLabel1 = new javax.swing.JLabel();
        Tag_Cmb_Bx = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Topic_Area_Question_Cmb_Bx = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Topic_Area_Summary_Txt_Fld = new javax.swing.JTextField();
        Done_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tag");

        Tag_Cmb_Bx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Tag_Cmb_Bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tag_Cmb_BxActionPerformed(evt);
            }
        });

        jLabel2.setText("Topic Area Question");

        Topic_Area_Question_Cmb_Bx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Topic_Area_Question_Cmb_Bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Topic_Area_Question_Cmb_BxActionPerformed(evt);
            }
        });

        jLabel3.setText("Topic Area Summary");

        Topic_Area_Summary_Txt_Fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Topic_Area_Summary_Txt_FldActionPerformed(evt);
            }
        });

        Done_Btn.setText("Done");
        Done_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Topic_Area_Question_Cmb_Bx, 0, 178, Short.MAX_VALUE)
                            .addComponent(Tag_Cmb_Bx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Topic_Area_Summary_Txt_Fld)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Done_Btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tag_Cmb_Bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Topic_Area_Question_Cmb_Bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Topic_Area_Summary_Txt_Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(Done_Btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Topic_Area_Summary_Txt_FldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Topic_Area_Summary_Txt_FldActionPerformed
        // TODO add your handling code here:
        
        String filer = Topic_Area_Question_Cmb_Bx.getSelectedItem().toString()+".txt";
        File file1 = new File(filer);
        
        BufferedReader Buff_reader2 = null;
        try {
            Buff_reader2 = new BufferedReader(new FileReader(file1));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
        }

        String line = null; 
        String liner = null;
        
        try {
            while((line = Buff_reader2.readLine())!= null)
            {
                liner = liner + " /n" + line;
            }
            
            Topic_Area_Summary_Txt_Fld.setText(liner);
        } catch (IOException ex) {
            Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Topic_Area_Summary_Txt_FldActionPerformed

    private void Done_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Done_BtnActionPerformed

    private void Tag_Cmb_BxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tag_Cmb_BxActionPerformed
        // TODO add your handling code here:
        
        BufferedReader Buff_reader2 = null;
              
              Tag_Cmb_Bx.removeAll();

         try {                                           
            String filer = "LoginDetails.txt";
            File file2 = new File(filer);
            Buff_reader2 = new BufferedReader(new FileReader(file2));

            String line = null;
            try {
                
                while((line = Buff_reader2.readLine()) != null)
                {
                    
                    Tag_Cmb_Bx.addItem(line);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
            }  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tag_Cmb_BxActionPerformed

    private void Topic_Area_Question_Cmb_BxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Topic_Area_Question_Cmb_BxActionPerformed
        // TODO add your handling code here:
        BufferedReader Buff_reader2 = null;
              
              Tag_Cmb_Bx.removeAll();

         try {                                           
            String filer = Tag_Cmb_Bx.getSelectedItem().toString()+".txt";
            File file2 = new File(filer);
            Buff_reader2 = new BufferedReader(new FileReader(file2));

            String line = null;
            try {
                
                while((line = Buff_reader2.readLine()) != null)
                {
                    
                    Topic_Area_Question_Cmb_Bx.addItem(line);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
            }  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EducateX1v1_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Topic_Area_Question_Cmb_BxActionPerformed

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
            java.util.logging.Logger.getLogger(EducateX1v1_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EducateX1v1_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EducateX1v1_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EducateX1v1_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EducateX1v1_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Done_Btn;
    private javax.swing.JComboBox Tag_Cmb_Bx;
    private javax.swing.JComboBox Topic_Area_Question_Cmb_Bx;
    private javax.swing.JTextField Topic_Area_Summary_Txt_Fld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
