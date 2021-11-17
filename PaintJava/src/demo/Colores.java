package demo;

import java.awt.Color;

public class Colores extends javax.swing.JFrame {

    private Color actual;
    private int R,G,B;
    
    public Colores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void cambiarColor() {

        R = sliderRojo.getValue();
        G = sliderVerde.getValue();
        B = sliderAzul.getValue();
        mostrarColor.setBackground(new Color(R,G,B));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labRojo = new javax.swing.JLabel();
        labVerde = new javax.swing.JLabel();
        labAzul = new javax.swing.JLabel();
        sliderRojo = new javax.swing.JSlider();
        sliderVerde = new javax.swing.JSlider();
        sliderAzul = new javax.swing.JSlider();
        paletaRGB = new javax.swing.JPanel();
        mostrarColor = new javax.swing.JPanel();
        cancelarBtn = new javax.swing.JButton();
        aceptarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labRojo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labRojo.setForeground(new java.awt.Color(255, 0, 0));
        labRojo.setText("ROJO (R = 0)");
        getContentPane().add(labRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, -1));

        labVerde.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labVerde.setForeground(new java.awt.Color(0, 204, 0));
        labVerde.setText("VERDE (G = 0)");
        getContentPane().add(labVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, -1));

        labAzul.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labAzul.setForeground(new java.awt.Color(0, 0, 204));
        labAzul.setText("AZUL (B = 0)");
        getContentPane().add(labAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, -1));

        sliderRojo.setBackground(new java.awt.Color(255, 255, 255));
        sliderRojo.setMajorTickSpacing(50);
        sliderRojo.setMaximum(255);
        sliderRojo.setPaintLabels(true);
        sliderRojo.setPaintTicks(true);
        sliderRojo.setValue(0);
        sliderRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRojoStateChanged(evt);
            }
        });
        getContentPane().add(sliderRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 370, -1));

        sliderVerde.setBackground(new java.awt.Color(255, 255, 255));
        sliderVerde.setMajorTickSpacing(50);
        sliderVerde.setMaximum(255);
        sliderVerde.setPaintLabels(true);
        sliderVerde.setPaintTicks(true);
        sliderVerde.setValue(0);
        sliderVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVerdeStateChanged(evt);
            }
        });
        getContentPane().add(sliderVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 370, -1));

        sliderAzul.setBackground(new java.awt.Color(255, 255, 255));
        sliderAzul.setMajorTickSpacing(50);
        sliderAzul.setMaximum(255);
        sliderAzul.setPaintLabels(true);
        sliderAzul.setPaintTicks(true);
        sliderAzul.setValue(0);
        sliderAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAzulStateChanged(evt);
            }
        });
        getContentPane().add(sliderAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 370, -1));

        paletaRGB.setBackground(new java.awt.Color(255, 255, 255));
        paletaRGB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 129, 171), 5));
        paletaRGB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarColor.setBackground(new java.awt.Color(0, 0, 0));
        mostrarColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mostrarColorLayout = new javax.swing.GroupLayout(mostrarColor);
        mostrarColor.setLayout(mostrarColorLayout);
        mostrarColorLayout.setHorizontalGroup(
            mostrarColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        mostrarColorLayout.setVerticalGroup(
            mostrarColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        paletaRGB.add(mostrarColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        cancelarBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        cancelarBtn.setText("CANCELAR");
        cancelarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBtnMouseClicked(evt);
            }
        });
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        paletaRGB.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        aceptarBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        aceptarBtn.setText("ACEPTAR");
        aceptarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarBtnMouseClicked(evt);
            }
        });
        paletaRGB.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        getContentPane().add(paletaRGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRojoStateChanged
        cambiarColor();
        labRojo.setText("ROJO (R = " +sliderRojo.getValue() +")");
    }//GEN-LAST:event_sliderRojoStateChanged

    private void sliderVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVerdeStateChanged
        cambiarColor();
        labVerde.setText("VERDE (G = " +sliderVerde.getValue() +")");
    }//GEN-LAST:event_sliderVerdeStateChanged

    private void sliderAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAzulStateChanged
        cambiarColor();
        labAzul.setText("AZUL (A = " +sliderAzul.getValue() +")");
    }//GEN-LAST:event_sliderAzulStateChanged

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked
        actual = null;
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void aceptarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBtnMouseClicked
        actual = new Color (R,G,B);
        this.setVisible(false);
    }//GEN-LAST:event_aceptarBtnMouseClicked

    public Color getColor(){
        return actual;
    }
    
    public void setColor(Color nuevo){
        actual = nuevo;
    }
    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel labAzul;
    private javax.swing.JLabel labRojo;
    private javax.swing.JLabel labVerde;
    private javax.swing.JPanel mostrarColor;
    private javax.swing.JPanel paletaRGB;
    private javax.swing.JSlider sliderAzul;
    private javax.swing.JSlider sliderRojo;
    private javax.swing.JSlider sliderVerde;
    // End of variables declaration//GEN-END:variables

    
}
