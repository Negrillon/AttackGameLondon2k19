/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attackgame.View;

import attackgame.Controller.GameController;
import attackgame.Model.Map;
import attackgame.Model.Registre_Element;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author joris
 */
public class Game extends javax.swing.JFrame {

    GamePanel gamePanel = new GamePanel(Map.getInstance().getMap());
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        this.setTitle("Game");
        
        //this.setContentPane(pnl);
        
        //panel.add(gamePanel);
       
        //this.setContentPane(panel);
        JPanel jpanel = new JPanel();
        jpanel.setSize(getWidth(), getHeight());
        jpanel.setBackground(Color.red);
        //JLabel label = new JLabel();
        
        //label.setText("TEST");
        //jpanel.add(label);
        jpanel.add(gamePanel);
        //this.setContentPane(jpanel);
        this.add(jpanel);
        
        
        //gamePanel.paintComponent(this.getGraphics());
        jpanel.setVisible(true);
        
       
        //this.setContentPane(gamePanel);
        
       
       // gamePanel.paintComponent(this.getGraphics());
        //pnl.add(new JLabel(new ImageIcon("./src/Ressources/cat.png")));
        
        //this.setBackground(Color.yellow);
        //panel.setBackground(Color.BLACK);
        //panel.setForeground(Color.red);
        
        //this.add(new GamePanel());
        //initialisation de la map

//        for (int i = 0; i < Map.getInstance().getMap().length; i++) {
//            mapView.addRowSelectionInterval(i, i);
//            for (int j = 0; j < Map.getInstance().getMap()[1].length; j++) {
//                mapView.addColumnSelectionInterval(j, i);
//                //mapView.editCellAt(i, j);
//            }
//            System.out.println();
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        score = new javax.swing.JTable();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        right = new javax.swing.JButton();
        left = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        score.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(score);

        up.setText("UP");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        down.setText("DOWN");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        right.setText("RIGHT");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });

        left.setText("LEFT");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(left)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(up)
                    .addComponent(down))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 238, Short.MAX_VALUE)
                        .addComponent(up)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(down)
                            .addComponent(right)
                            .addComponent(left))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
        //Déplacement haut
//        for(int i = 0 ; i < Registre_Element.getInstance().listElements.size() ; i++){
//            Registre_Element.getInstance().listElements.get(i).move_up();
//            Map.getInstance().remplirMap(Registre_Element.getInstance().listElements);
//            Map.getInstance().drawMap(Map.getInstance().getMap());
//        }
        int choice=1;
        GameController.getInstance().moveController(choice, Registre_Element.getInstance());
        
    }//GEN-LAST:event_upActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        // TODO add your handling code here:
        //Déplacement gauche
        int choice=3;
        GameController.getInstance().moveController(choice, Registre_Element.getInstance());
    }//GEN-LAST:event_leftActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
        //Déplacement bas
        int choice=2;
        GameController.getInstance().moveController(choice, Registre_Element.getInstance());
    }//GEN-LAST:event_downActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        // TODO add your handling code here:
        //Déplacement droite
        int choice=4;
        GameController.getInstance().moveController(choice, Registre_Element.getInstance());
    }//GEN-LAST:event_rightActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Game().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton down;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton left;
    private javax.swing.JButton right;
    private javax.swing.JTable score;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
