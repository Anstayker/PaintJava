package demo;
import java.awt.Color;

public class ColoresHSV extends javax.swing.JFrame {
    private Color actual; 
    private float H,S,V;
    private float R,G,B = 0 ;
    
    public ColoresHSV() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void cambiarColor() {  
        float c,x,m;
        H = sliderH.getValue();
        S = sliderS.getValue();
        V = sliderV.getValue();

        S /= 100;
        V /= 100;
        
        c = V*S;
        x = c * (1- Math.abs((H/60)%2 -1));
        m = V-c;        
        
        if(H>=0 && H<60){
            R=c; G=x;B=0;
        }else{
            if(H>=60 && H<120){
                R=x; G=c;B=0;
            }else{
                if(H>=120 && H<180){
                    R=0; G=c;B=x;
                }else{
                    if(H>=180 && H<240){
                        R=0; G=x;B=c;
                    }else{
                        if(H>=240 && H<300){
                            R=x; G=0;B=c;
                        }else{
                            R=c; G=0;B=x;
                        }
                    }
                }
            }
        }
        
        R += m; G += m; B+=m;
   
        mostrarColor.setBackground(new Color(R,G,B));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paletaHSV = new javax.swing.JPanel();
        mostrarColor = new javax.swing.JPanel();
        cancelarBtn = new javax.swing.JButton();
        aceptarBtn = new javax.swing.JButton();
        labH = new javax.swing.JLabel();
        labS = new javax.swing.JLabel();
        labV = new javax.swing.JLabel();
        sliderH = new javax.swing.JSlider();
        sliderS = new javax.swing.JSlider();
        sliderV = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        paletaHSV.setBackground(new java.awt.Color(255, 255, 255));
        paletaHSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 129, 171), 5));
        paletaHSV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        paletaHSV.add(mostrarColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

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
        paletaHSV.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        aceptarBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        aceptarBtn.setText("ACEPTAR");
        aceptarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarBtnMouseClicked(evt);
            }
        });
        paletaHSV.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        labH.setBackground(new java.awt.Color(255, 255, 255));
        labH.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labH.setText("HUE (H = 0)");
        paletaHSV.add(labH, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        labS.setBackground(new java.awt.Color(255, 255, 255));
        labS.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labS.setText("SATURACION (S = 0)");
        paletaHSV.add(labS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        labV.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labV.setText("VALUE (V = 0)");
        paletaHSV.add(labV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        sliderH.setBackground(new java.awt.Color(255, 255, 255));
        sliderH.setMajorTickSpacing(50);
        sliderH.setMaximum(360);
        sliderH.setPaintLabels(true);
        sliderH.setPaintTicks(true);
        sliderH.setValue(0);
        sliderH.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderHStateChanged(evt);
            }
        });
        paletaHSV.add(sliderH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 380, -1));

        sliderS.setBackground(new java.awt.Color(255, 255, 255));
        sliderS.setMajorTickSpacing(10);
        sliderS.setPaintLabels(true);
        sliderS.setPaintTicks(true);
        sliderS.setValue(0);
        sliderS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSStateChanged(evt);
            }
        });
        paletaHSV.add(sliderS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 380, -1));

        sliderV.setBackground(new java.awt.Color(255, 255, 255));
        sliderV.setMajorTickSpacing(10);
        sliderV.setPaintLabels(true);
        sliderV.setPaintTicks(true);
        sliderV.setValue(0);
        sliderV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVStateChanged(evt);
            }
        });
        paletaHSV.add(sliderV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paletaHSV, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paletaHSV, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked
        actual = null;
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void aceptarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBtnMouseClicked
        actual = new Color (R,G,B);
        this.setVisible(false);
    }//GEN-LAST:event_aceptarBtnMouseClicked

    private void sliderHStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderHStateChanged
        cambiarColor();
        labH.setText("HUE (H = " +sliderH.getValue() +")");
    }//GEN-LAST:event_sliderHStateChanged

    private void sliderSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSStateChanged
        cambiarColor();
        labS.setText("SATURATION (S = " +sliderS.getValue() +")");
    }//GEN-LAST:event_sliderSStateChanged

    private void sliderVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVStateChanged
        cambiarColor();
        labV.setText("VALUE (V = " +sliderV.getValue() +")");
    }//GEN-LAST:event_sliderVStateChanged

    public Color getColor(){
        return actual;
    }
    
    public void setColor(Color nuevo){
        actual = nuevo;
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
            java.util.logging.Logger.getLogger(ColoresHSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColoresHSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColoresHSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColoresHSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColoresHSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel labH;
    private javax.swing.JLabel labS;
    private javax.swing.JLabel labV;
    private javax.swing.JPanel mostrarColor;
    private javax.swing.JPanel paletaHSV;
    private javax.swing.JSlider sliderH;
    private javax.swing.JSlider sliderS;
    private javax.swing.JSlider sliderV;
    // End of variables declaration//GEN-END:variables
}
