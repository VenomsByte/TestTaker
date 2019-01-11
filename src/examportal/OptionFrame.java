/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examportal;

/**
 *
 * @author HP
 */
public class OptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionFrame
     */
    public OptionFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        ExamPanel = new javax.swing.JPanel();
        ExamLabel = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JPanel();
        AdminLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        ExamPanel.setBackground(new java.awt.Color(255, 204, 0));
        ExamPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamPanelMouseClicked(evt);
            }
        });

        ExamLabel.setForeground(new java.awt.Color(255, 255, 255));
        ExamLabel.setText("Examination");
        ExamLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ExamPanelLayout = new javax.swing.GroupLayout(ExamPanel);
        ExamPanel.setLayout(ExamPanelLayout);
        ExamPanelLayout.setHorizontalGroup(
            ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(ExamLabel)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        ExamPanelLayout.setVerticalGroup(
            ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExamLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminPanel.setBackground(new java.awt.Color(51, 102, 0));
        AdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminPanelMouseClicked(evt);
            }
        });

        AdminLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdminLabel.setText("Adminstration");
        AdminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(AdminLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminLabel)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Online Examination System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(450, 272));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLabelMouseClicked
        MainFrame f=new MainFrame();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminLabelMouseClicked

    private void AdminPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPanelMouseClicked
       
         MainFrame f=new MainFrame();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminPanelMouseClicked

    private void ExamPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamPanelMouseClicked
        // TODO add your handling code here:
         MainFrame f=new MainFrame();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExamPanelMouseClicked

    private void ExamLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamLabelMouseClicked
        // TODO add your handling code here:
         MainFrame f=new MainFrame();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExamLabelMouseClicked

    /**
     * @param args the command line arguments
     */
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JLabel ExamLabel;
    private javax.swing.JPanel ExamPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
