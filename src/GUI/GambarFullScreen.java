/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Rayhan
 */
public class GambarFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form GambarFullScreen
     */
    public GambarFullScreen() {
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

        button = new javax.swing.JPanel();
        ronaldobtn = new javax.swing.JButton();
        mbappe = new javax.swing.JButton();
        messi = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        image = new javax.swing.JPanel();
        mbappe10 = new javax.swing.JLabel();
        messi10 = new javax.swing.JLabel();
        ronaldo7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ronaldobtn.setText("Cristiano Ronaldo");
        ronaldobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ronaldobtnActionPerformed(evt);
            }
        });

        mbappe.setText("Mbappe");
        mbappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbappeActionPerformed(evt);
            }
        });

        messi.setText("Lionel Messi");
        messi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messiActionPerformed(evt);
            }
        });

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonLayout = new javax.swing.GroupLayout(button);
        button.setLayout(buttonLayout);
        buttonLayout.setHorizontalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ronaldobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mbappe, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonLayout.setVerticalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLayout.createSequentialGroup()
                .addGroup(buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ronaldobtn)
                    .addComponent(mbappe)
                    .addComponent(messi)
                    .addComponent(exitbtn))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(button, java.awt.BorderLayout.PAGE_START);

        image.setLayout(new java.awt.CardLayout());

        mbappe10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mbappe10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/buaksib-2-2021-06-29T222229.350.png"))); // NOI18N
        image.add(mbappe10, "1");

        messi10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messi10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Messi.jpg"))); // NOI18N
        image.add(messi10, "2");
        messi10.getAccessibleContext().setAccessibleName("2");

        ronaldo7.setBackground(new java.awt.Color(102, 153, 255));
        ronaldo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ronaldo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/efek-cristiano-ronaldo-harga-tiket-laga-man-united-vs-newcastle-melambung-tinggi-peL8JcXuld.jpeg"))); // NOI18N
        image.add(ronaldo7, "0");

        getContentPane().add(image, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ronaldobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ronaldobtnActionPerformed
        CardLayout cl = (CardLayout) (image.getLayout());
        cl.show(image,"0");
    }//GEN-LAST:event_ronaldobtnActionPerformed

    private void mbappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbappeActionPerformed
        CardLayout cl = (CardLayout) (image.getLayout());
        cl.show(image,"1");
    }//GEN-LAST:event_mbappeActionPerformed

    private void messiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messiActionPerformed
       CardLayout cl = (CardLayout) (image.getLayout());
        cl.show(image,"2");
    }//GEN-LAST:event_messiActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GambarFullScreen fullFrame = new GambarFullScreen();
                
                GraphicsDevice device =
                           GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                           device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel button;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel image;
    private javax.swing.JButton mbappe;
    private javax.swing.JLabel mbappe10;
    private javax.swing.JButton messi;
    private javax.swing.JLabel messi10;
    private javax.swing.JLabel ronaldo7;
    private javax.swing.JButton ronaldobtn;
    // End of variables declaration//GEN-END:variables
}
