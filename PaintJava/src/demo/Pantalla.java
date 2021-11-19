package demo;

import java.awt.*;
import desplazable.Desface;

import java.awt.geom.Point2D;

public class Pantalla extends javax.swing.JFrame {
    private Desface desplace;
    private int xMouse, yMouse;
    private Color color = new Color (0,0,0);
    private Colores paletaRGB = new Colores();
    private ColoresHSV paletaHSV = new ColoresHSV();
    
    public Pantalla() {
        initComponents();
        desplace = new Desface();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabezera = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        Lienzo = new javax.swing.JPanel();
        menuColor = new javax.swing.JPanel();
        celesteBtn = new javax.swing.JPanel();
        rojoBtn = new javax.swing.JPanel();
        naranjaBtn = new javax.swing.JPanel();
        verdeBtn = new javax.swing.JPanel();
        amarilloBtn = new javax.swing.JPanel();
        violetaBtn = new javax.swing.JPanel();
        cafeBtn = new javax.swing.JPanel();
        blancoBtn = new javax.swing.JPanel();
        grisBtn = new javax.swing.JPanel();
        negrBtn2 = new javax.swing.JPanel();
        azulBtn = new javax.swing.JPanel();
        verdeOsc = new javax.swing.JPanel();
        hsvBtn = new javax.swing.JButton();
        rgbBtn = new javax.swing.JButton();
        menuFigu1 = new javax.swing.JPanel();
        cuadrado = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        triangulo = new javax.swing.JLabel();
        circulo = new javax.swing.JLabel();
        menuGrosor = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        segmento = new javax.swing.JLabel();
        grosor1 = new javax.swing.JLabel();
        grosor2 = new javax.swing.JLabel();
        grosor3 = new javax.swing.JLabel();
        menuTam = new javax.swing.JPanel();
        grandeBtn = new javax.swing.JLabel();
        pequenioBtn = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        menu = new javax.swing.JPanel();
        guardarBtn = new javax.swing.JPanel();
        guardarImg = new javax.swing.JLabel();
        guardartxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        figGeoBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lineaBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CurvaBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        segmentadoBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        colorBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        segmentadoBtn1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        girarBtn1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        girarBtn2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tamanioBtn = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabezera.setBackground(new java.awt.Color(19, 129, 171));
        cabezera.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cabezera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabezeraMouseDragged(evt);
            }
        });
        cabezera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabezeraMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(19, 129, 171));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(19, 129, 171));
        exitBtn.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setText("X");
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addGap(0, 806, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        Lienzo.setBackground(new java.awt.Color(255, 255, 255));
        Lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LienzoMouseClicked(evt);
            }
        });
        Lienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuColor.setBackground(new java.awt.Color(255, 255, 255));
        menuColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 129, 171), 3));
        menuColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        celesteBtn.setBackground(new java.awt.Color(51, 204, 255));
        celesteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        celesteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                celesteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout celesteBtnLayout = new javax.swing.GroupLayout(celesteBtn);
        celesteBtn.setLayout(celesteBtnLayout);
        celesteBtnLayout.setHorizontalGroup(
            celesteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        celesteBtnLayout.setVerticalGroup(
            celesteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(celesteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 20, 20));

        rojoBtn.setBackground(new java.awt.Color(255, 0, 0));
        rojoBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rojoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rojoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rojoBtnLayout = new javax.swing.GroupLayout(rojoBtn);
        rojoBtn.setLayout(rojoBtnLayout);
        rojoBtnLayout.setHorizontalGroup(
            rojoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        rojoBtnLayout.setVerticalGroup(
            rojoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(rojoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        naranjaBtn.setBackground(new java.awt.Color(255, 102, 0));
        naranjaBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        naranjaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naranjaBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout naranjaBtnLayout = new javax.swing.GroupLayout(naranjaBtn);
        naranjaBtn.setLayout(naranjaBtnLayout);
        naranjaBtnLayout.setHorizontalGroup(
            naranjaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        naranjaBtnLayout.setVerticalGroup(
            naranjaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(naranjaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        verdeBtn.setBackground(new java.awt.Color(0, 255, 0));
        verdeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verdeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verdeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout verdeBtnLayout = new javax.swing.GroupLayout(verdeBtn);
        verdeBtn.setLayout(verdeBtnLayout);
        verdeBtnLayout.setHorizontalGroup(
            verdeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        verdeBtnLayout.setVerticalGroup(
            verdeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(verdeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 20, 20));

        amarilloBtn.setBackground(new java.awt.Color(255, 235, 43));
        amarilloBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        amarilloBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amarilloBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout amarilloBtnLayout = new javax.swing.GroupLayout(amarilloBtn);
        amarilloBtn.setLayout(amarilloBtnLayout);
        amarilloBtnLayout.setHorizontalGroup(
            amarilloBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        amarilloBtnLayout.setVerticalGroup(
            amarilloBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(amarilloBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        violetaBtn.setBackground(new java.awt.Color(153, 0, 153));
        violetaBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        violetaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                violetaBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout violetaBtnLayout = new javax.swing.GroupLayout(violetaBtn);
        violetaBtn.setLayout(violetaBtnLayout);
        violetaBtnLayout.setHorizontalGroup(
            violetaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        violetaBtnLayout.setVerticalGroup(
            violetaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(violetaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 20, 20));

        cafeBtn.setBackground(new java.awt.Color(102, 0, 0));
        cafeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cafeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cafeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cafeBtnLayout = new javax.swing.GroupLayout(cafeBtn);
        cafeBtn.setLayout(cafeBtnLayout);
        cafeBtnLayout.setHorizontalGroup(
            cafeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        cafeBtnLayout.setVerticalGroup(
            cafeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(cafeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 20, 20));

        blancoBtn.setBackground(new java.awt.Color(255, 255, 255));
        blancoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blancoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blancoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blancoBtnLayout = new javax.swing.GroupLayout(blancoBtn);
        blancoBtn.setLayout(blancoBtnLayout);
        blancoBtnLayout.setHorizontalGroup(
            blancoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        blancoBtnLayout.setVerticalGroup(
            blancoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        menuColor.add(blancoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 20, 20));

        grisBtn.setBackground(new java.awt.Color(153, 153, 153));
        grisBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grisBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout grisBtnLayout = new javax.swing.GroupLayout(grisBtn);
        grisBtn.setLayout(grisBtnLayout);
        grisBtnLayout.setHorizontalGroup(
            grisBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        grisBtnLayout.setVerticalGroup(
            grisBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(grisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 20, 20));

        negrBtn2.setBackground(new java.awt.Color(0, 0, 0));
        negrBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negrBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negrBtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout negrBtn2Layout = new javax.swing.GroupLayout(negrBtn2);
        negrBtn2.setLayout(negrBtn2Layout);
        negrBtn2Layout.setHorizontalGroup(
            negrBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        negrBtn2Layout.setVerticalGroup(
            negrBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(negrBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 20, 20));

        azulBtn.setBackground(new java.awt.Color(0, 0, 255));
        azulBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        azulBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                azulBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout azulBtnLayout = new javax.swing.GroupLayout(azulBtn);
        azulBtn.setLayout(azulBtnLayout);
        azulBtnLayout.setHorizontalGroup(
            azulBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        azulBtnLayout.setVerticalGroup(
            azulBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(azulBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 20, 20));

        verdeOsc.setBackground(new java.awt.Color(0, 153, 51));
        verdeOsc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verdeOsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verdeOscMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout verdeOscLayout = new javax.swing.GroupLayout(verdeOsc);
        verdeOsc.setLayout(verdeOscLayout);
        verdeOscLayout.setHorizontalGroup(
            verdeOscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        verdeOscLayout.setVerticalGroup(
            verdeOscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        menuColor.add(verdeOsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, 20));

        hsvBtn.setBackground(new java.awt.Color(255, 255, 255));
        hsvBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        hsvBtn.setText("HSV");
        hsvBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hsvBtnMouseClicked(evt);
            }
        });
        menuColor.add(hsvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 55, 60, 30));

        rgbBtn.setBackground(new java.awt.Color(255, 255, 255));
        rgbBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        rgbBtn.setText("RGB");
        rgbBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rgbBtnMouseClicked(evt);
            }
        });
        menuColor.add(rgbBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 15, 60, 30));

        Lienzo.add(menuColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 470, 200, 100));

        menuFigu1.setBackground(new java.awt.Color(255, 255, 255));
        menuFigu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 129, 171), 3));
        menuFigu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cuadrado.JPG"))); // NOI18N
        cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadradoMouseClicked(evt);
            }
        });
        menuFigu1.add(cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 70));

        jSeparator5.setBackground(new java.awt.Color(19, 129, 171));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuFigu1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 20, 70));

        jSeparator6.setBackground(new java.awt.Color(19, 129, 171));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuFigu1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 70));

        triangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/triangulo.JPG"))); // NOI18N
        triangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trianguloMouseClicked(evt);
            }
        });
        menuFigu1.add(triangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 50, 70));

        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circulo.JPG"))); // NOI18N
        circulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circuloMouseClicked(evt);
            }
        });
        menuFigu1.add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 0, 50, 70));

        Lienzo.add(menuFigu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 199, 180, 70));

        menuGrosor.setBackground(new java.awt.Color(255, 255, 255));
        menuGrosor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 129, 171), 3));
        menuGrosor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator8.setBackground(new java.awt.Color(19, 129, 171));
        menuGrosor.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 10));

        jSeparator9.setBackground(new java.awt.Color(19, 129, 171));
        menuGrosor.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 10));

        jSeparator10.setBackground(new java.awt.Color(19, 129, 171));
        menuGrosor.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, 10));

        segmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/segmentado_1.png"))); // NOI18N
        segmento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segmentoMouseClicked(evt);
            }
        });
        menuGrosor.add(segmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 50, 15));

        grosor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grosor1.png"))); // NOI18N
        grosor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grosor1MouseClicked(evt);
            }
        });
        menuGrosor.add(grosor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 26, 50, 15));

        grosor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grosor2.png"))); // NOI18N
        grosor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grosor2MouseClicked(evt);
            }
        });
        menuGrosor.add(grosor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 42, 50, 20));

        grosor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grosor3.png"))); // NOI18N
        grosor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grosor3MouseClicked(evt);
            }
        });
        menuGrosor.add(grosor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 63, 50, 14));

        Lienzo.add(menuGrosor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 390, 60, 80));

        menuTam.setBackground(new java.awt.Color(255, 255, 255));
        menuTam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 129, 171), 3));
        menuTam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grandeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grande.png"))); // NOI18N
        grandeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grandeBtnMouseClicked(evt);
            }
        });
        menuTam.add(grandeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        pequenioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pequenio.png"))); // NOI18N
        pequenioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pequenioBtnMouseClicked(evt);
            }
        });
        menuTam.add(pequenioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 7, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(19, 129, 171));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuTam.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 10, 50));

        Lienzo.add(menuTam, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 280, 90, 48));

        getContentPane().add(Lienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 770, 570));

        menu.setBackground(new java.awt.Color(19, 129, 171));
        menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarBtn.setBackground(new java.awt.Color(255, 255, 255));
        guardarBtn.setMinimumSize(new java.awt.Dimension(64, 55));
        guardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarBtnMouseExited(evt);
            }
        });
        guardarBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.jpg"))); // NOI18N
        guardarBtn.add(guardarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, -2, -1, 40));

        guardartxt.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        guardartxt.setText("Guardar");
        guardartxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarBtn.add(guardartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 33, 50, -1));

        menu.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 10, 60, 52));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 90, 20));

        figGeoBtn.setBackground(new java.awt.Color(255, 255, 255));
        figGeoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                figGeoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                figGeoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                figGeoBtnMouseExited(evt);
            }
        });
        figGeoBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/figuras geometricas_1.jpg"))); // NOI18N
        figGeoBtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 39));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel11.setText("Fig. Geo.");
        figGeoBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, -1, 26));

        menu.add(figGeoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 60, 55));

        lineaBtn.setBackground(new java.awt.Color(255, 255, 255));
        lineaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lineaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lineaBtnMouseExited(evt);
            }
        });
        lineaBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recta.png"))); // NOI18N
        lineaBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Recta");
        lineaBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 25, -1, 26));

        menu.add(lineaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 50));

        CurvaBtn.setBackground(new java.awt.Color(255, 255, 255));
        CurvaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CurvaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CurvaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CurvaBtnMouseExited(evt);
            }
        });
        CurvaBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/curva.jpg"))); // NOI18N
        jLabel2.setAlignmentX(2.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CurvaBtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("Curva");
        CurvaBtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 25, -1, 40));

        menu.add(CurvaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 55));

        segmentadoBtn.setBackground(new java.awt.Color(255, 255, 255));
        segmentadoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segmentadoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                segmentadoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                segmentadoBtnMouseExited(evt);
            }
        });
        segmentadoBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estilo.png"))); // NOI18N
        segmentadoBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 4, -1, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setText("Estilo");
        segmentadoBtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 28, -1, 26));

        menu.add(segmentadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 405, 60, 50));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        menu.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, 10));

        colorBtn.setBackground(new java.awt.Color(255, 255, 255));
        colorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colorBtnMouseExited(evt);
            }
        });
        colorBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/paleta.png"))); // NOI18N
        colorBtn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel12.setText("Colores");
        colorBtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, -1));

        menu.add(colorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 495, 60, 54));
        menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 80, 10));

        segmentadoBtn1.setBackground(new java.awt.Color(255, 255, 255));
        segmentadoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segmentadoBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                segmentadoBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                segmentadoBtn1MouseExited(evt);
            }
        });
        segmentadoBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estilo.png"))); // NOI18N
        segmentadoBtn1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 4, -1, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel10.setText("Estilo");
        segmentadoBtn1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 28, -1, 26));

        menu.add(segmentadoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 405, 60, 50));

        girarBtn1.setBackground(new java.awt.Color(255, 255, 255));
        girarBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girarBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girarBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girarBtn1MouseExited(evt);
            }
        });
        girarBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/girar.png"))); // NOI18N
        girarBtn1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 0, 40, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel16.setText("Girar");
        girarBtn1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 28, -1, 20));

        girarBtn2.setBackground(new java.awt.Color(255, 255, 255));
        girarBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girarBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girarBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girarBtn2MouseExited(evt);
            }
        });
        girarBtn2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/girar.png"))); // NOI18N
        girarBtn2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 0, 40, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel18.setText("Girar");
        girarBtn2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 28, -1, 26));

        girarBtn1.add(girarBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 333, 60, 50));

        menu.add(girarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 335, 60, 47));

        tamanioBtn.setBackground(new java.awt.Color(255, 255, 255));
        tamanioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tamanioBtnMouseClicked(evt);
            }
        });
        tamanioBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tamanio.png"))); // NOI18N
        tamanioBtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 2, 40, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel14.setText("Tamaño");
        tamanioBtn.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 32, -1, -1));

        menu.add(tamanioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 280, 60, 47));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cabezeraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabezeraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_cabezeraMousePressed

    private void cabezeraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabezeraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_cabezeraMouseDragged

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        
    }//GEN-LAST:event_exitMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        exit.setBackground(new Color(19,129,171));
        exitBtn.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitBtnMouseExited

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        
    }//GEN-LAST:event_exitMouseExited

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        exit.setBackground(Color.RED);
        exitBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void LienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LienzoMouseClicked

    private void guardarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseClicked
        System.out.print("Guardado");
    }//GEN-LAST:event_guardarBtnMouseClicked

    private void guardarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseEntered
        guardarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_guardarBtnMouseEntered

    private void guardarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseExited
        guardarBtn.setBorder(null);
    }//GEN-LAST:event_guardarBtnMouseExited

    private void figGeoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_figGeoBtnMouseEntered
       
    }//GEN-LAST:event_figGeoBtnMouseEntered

    private void lineaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineaBtnMouseEntered
        
    }//GEN-LAST:event_lineaBtnMouseEntered

    private void CurvaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurvaBtnMouseEntered
        
    }//GEN-LAST:event_CurvaBtnMouseEntered

    private void segmentadoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentadoBtnMouseEntered
       
    }//GEN-LAST:event_segmentadoBtnMouseEntered

    private void colorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorBtnMouseEntered
        
    }//GEN-LAST:event_colorBtnMouseEntered

    private void figGeoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_figGeoBtnMouseExited
        
    }//GEN-LAST:event_figGeoBtnMouseExited

    private void lineaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineaBtnMouseExited

    }//GEN-LAST:event_lineaBtnMouseExited

    private void CurvaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurvaBtnMouseExited
        
    }//GEN-LAST:event_CurvaBtnMouseExited
    
    private void segmentadoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentadoBtnMouseExited

    }//GEN-LAST:event_segmentadoBtnMouseExited

    private void colorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorBtnMouseExited

    }//GEN-LAST:event_colorBtnMouseExited

    private void figGeoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_figGeoBtnMouseClicked
        if(menuFigu1.getX() == -180){
            desplace.desplazarDerecha(menuFigu1, menuFigu1.getX(), 0, 10, 1);
        }else{
            desplace.desplazarIzquierda(menuFigu1, menuFigu1.getX(), -180, 10, 1);
        }
    }//GEN-LAST:event_figGeoBtnMouseClicked

    private void segmentadoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentadoBtnMouseClicked
        if(menuGrosor.getX() == -60){
            desplace.desplazarDerecha(menuGrosor, menuGrosor.getX(), 0, 10, 1);
        }else{
            desplace.desplazarIzquierda(menuGrosor, menuGrosor.getX(), -60, 10, 1);
        } 
    }//GEN-LAST:event_segmentadoBtnMouseClicked

    private void cuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadradoMouseClicked
        Graphics g = Lienzo.getGraphics();
        verificarColor();
        g.setColor(color);
        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.drawCuadrado(g, 200, 200, 300, 300);
        
        desplace.desplazarIzquierda(menuFigu1, menuFigu1.getX(), -180, 10, 1);
    }//GEN-LAST:event_cuadradoMouseClicked

    private void trianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trianguloMouseClicked
        Graphics g = Lienzo.getGraphics();
        verificarColor();
        g.setColor(color);
        
        Triangulo triangulo = new Triangulo();
        triangulo.drawTriangulo(g, 300, 100, 200, 300, 400, 300);
        desplace.desplazarIzquierda(menuFigu1, menuFigu1.getX(), -180, 10, 1);
    }//GEN-LAST:event_trianguloMouseClicked

    private void circuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circuloMouseClicked
        Graphics g = Lienzo.getGraphics();
        verificarColor();
        g.setColor(color);
        
        Circunferencia circulo = new Circunferencia();
        circulo.drawCirculo(g, 400, 400, 100);
        
        desplace.desplazarIzquierda(menuFigu1, menuFigu1.getX(), -180, 10, 1);
    }//GEN-LAST:event_circuloMouseClicked

    private void segmentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentoMouseClicked
        System.out.println("Segmentado");
        desplace.desplazarIzquierda(menuGrosor, menuGrosor.getX(), -60, 5, 1);
    }//GEN-LAST:event_segmentoMouseClicked

    private void grosor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grosor1MouseClicked
        System.out.println("grosor1");
        desplace.desplazarIzquierda(menuGrosor, menuGrosor.getX(), -60, 5, 1);
    }//GEN-LAST:event_grosor1MouseClicked

    private void grosor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grosor2MouseClicked
        System.out.println("grosor2");
        desplace.desplazarIzquierda(menuGrosor, menuGrosor.getX(), -60, 5, 1);
    }//GEN-LAST:event_grosor2MouseClicked

    private void grosor3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grosor3MouseClicked
        System.out.println("grosor3");
        desplace.desplazarIzquierda(menuGrosor, menuGrosor.getX(), -60, 10, 1);
    }//GEN-LAST:event_grosor3MouseClicked

    private void colorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorBtnMouseClicked
        if(menuColor.getX() == -200){
            desplace.desplazarDerecha(menuColor, menuColor.getX(), 0, 10, 1);
        }else{
            desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 10, 1);
        } 
    }//GEN-LAST:event_colorBtnMouseClicked

    private void rgbBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgbBtnMouseClicked
        paletaRGB.setVisible(true);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 10, 1);
        
    }//GEN-LAST:event_rgbBtnMouseClicked

    private void rojoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rojoBtnMouseClicked
        color = new Color(255,0,0);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_rojoBtnMouseClicked

    private void celesteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celesteBtnMouseClicked
        color = new Color(51,204,255);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_celesteBtnMouseClicked

    private void naranjaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naranjaBtnMouseClicked
        color = new Color(255,102,0);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_naranjaBtnMouseClicked

    private void verdeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verdeBtnMouseClicked
        color = new Color(0,255,0);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_verdeBtnMouseClicked

    private void amarilloBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amarilloBtnMouseClicked
        color = new Color(255,235,43);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
        
    }//GEN-LAST:event_amarilloBtnMouseClicked

    private void violetaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_violetaBtnMouseClicked
        color = new Color(153,0,153);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_violetaBtnMouseClicked

    private void cafeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafeBtnMouseClicked
        color = new Color(102,0,0);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_cafeBtnMouseClicked

    private void blancoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blancoBtnMouseClicked
        color = new Color(255,255,255);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_blancoBtnMouseClicked

    private void grisBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grisBtnMouseClicked
        color = new Color(153,153,153);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_grisBtnMouseClicked

    private void negrBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negrBtn2MouseClicked
        color = new Color(0,0,0);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_negrBtn2MouseClicked

    private void azulBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azulBtnMouseClicked
        color = new Color(0,0,255);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_azulBtnMouseClicked

    private void verdeOscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verdeOscMouseClicked
        color = new Color(0,153,51);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 5, 1);
    }//GEN-LAST:event_verdeOscMouseClicked

    private void segmentadoBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentadoBtn1MouseClicked
        System.out.println("Segmentado");
    }//GEN-LAST:event_segmentadoBtn1MouseClicked

    private void segmentadoBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentadoBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_segmentadoBtn1MouseEntered

    private void segmentadoBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segmentadoBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_segmentadoBtn1MouseExited

    private void girarBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girarBtn1MouseClicked
        System.out.println("Girar");
    }//GEN-LAST:event_girarBtn1MouseClicked

    private void girarBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girarBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_girarBtn1MouseEntered

    private void girarBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girarBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_girarBtn1MouseExited

    private void girarBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girarBtn2MouseClicked
        System.out.println("Girar");
    }//GEN-LAST:event_girarBtn2MouseClicked

    private void girarBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girarBtn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_girarBtn2MouseEntered

    private void girarBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girarBtn2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_girarBtn2MouseExited

    private void tamanioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamanioBtnMouseClicked
        if(menuTam.getX() == -90){
            desplace.desplazarDerecha(menuTam, menuTam.getX(), 0, 10, 1);
        }else{
            desplace.desplazarIzquierda(menuTam, menuTam.getX(), -90, 10, 1);
        } 
    }//GEN-LAST:event_tamanioBtnMouseClicked

    private void grandeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grandeBtnMouseClicked
        System.out.println("CRECE");
        desplace.desplazarIzquierda(menuTam, menuTam.getX(), -90, 10, 1);
    }//GEN-LAST:event_grandeBtnMouseClicked

    private void pequenioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pequenioBtnMouseClicked
        System.out.println("decrece");
        desplace.desplazarIzquierda(menuTam, menuTam.getX(), -90, 10, 1);
    }//GEN-LAST:event_pequenioBtnMouseClicked

    private void lineaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineaBtnMouseClicked
        Graphics g = Lienzo.getGraphics();
        verificarColor();
        g.setColor(color);
        Linea linea = new Linea();
        linea.drawLinea(g, 100, 100, 300, 300);
    }//GEN-LAST:event_lineaBtnMouseClicked

    private void hsvBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hsvBtnMouseClicked
        paletaHSV.setVisible(true);
        desplace.desplazarIzquierda(menuColor, menuColor.getX(), -200, 10, 1);
    }//GEN-LAST:event_hsvBtnMouseClicked

    private void CurvaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurvaBtnMouseClicked
        //Ejemplo de como se debe usar los colores
        Graphics g = Lienzo.getGraphics();
        verificarColor();
        g.setColor(color);      
        Bezier curva = new Bezier();
        
            Point2D puntoA = new Point2D.Double(100, 200);
            Point2D puntoB = new Point2D.Double(700, 500);
            Point2D puntoC = new Point2D.Double(300, 600);
            Point2D puntoD = new Point2D.Double(600, 100);
        
        curva.drawBezier((Graphics2D) g, puntoA, puntoB, puntoC, puntoD);
    }//GEN-LAST:event_CurvaBtnMouseClicked

    private void verificarColor(){
        Color aux = paletaRGB.getColor();
        Color aux2 = paletaHSV.getColor();
        if(aux!=null){
            color = aux;
            paletaRGB.setColor(null);
        }else{
            if(aux2!=null){
                color = aux2;
                paletaHSV.setColor(null);
            }
        }
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CurvaBtn;
    private javax.swing.JPanel Lienzo;
    private javax.swing.JPanel amarilloBtn;
    private javax.swing.JPanel azulBtn;
    private javax.swing.JPanel blancoBtn;
    private javax.swing.JPanel cabezera;
    private javax.swing.JPanel cafeBtn;
    private javax.swing.JPanel celesteBtn;
    private javax.swing.JLabel circulo;
    private javax.swing.JPanel colorBtn;
    private javax.swing.JLabel cuadrado;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel figGeoBtn;
    private javax.swing.JPanel girarBtn1;
    private javax.swing.JPanel girarBtn2;
    private javax.swing.JLabel grandeBtn;
    private javax.swing.JPanel grisBtn;
    private javax.swing.JLabel grosor1;
    private javax.swing.JLabel grosor2;
    private javax.swing.JLabel grosor3;
    private javax.swing.JPanel guardarBtn;
    private javax.swing.JLabel guardarImg;
    private javax.swing.JLabel guardartxt;
    private javax.swing.JButton hsvBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel lineaBtn;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuColor;
    private javax.swing.JPanel menuFigu1;
    private javax.swing.JPanel menuGrosor;
    private javax.swing.JPanel menuTam;
    private javax.swing.JPanel naranjaBtn;
    private javax.swing.JPanel negrBtn2;
    private javax.swing.JLabel pequenioBtn;
    private javax.swing.JButton rgbBtn;
    private javax.swing.JPanel rojoBtn;
    private javax.swing.JPanel segmentadoBtn;
    private javax.swing.JPanel segmentadoBtn1;
    private javax.swing.JLabel segmento;
    private javax.swing.JPanel tamanioBtn;
    private javax.swing.JLabel triangulo;
    private javax.swing.JPanel verdeBtn;
    private javax.swing.JPanel verdeOsc;
    private javax.swing.JPanel violetaBtn;
    // End of variables declaration//GEN-END:variables
}
