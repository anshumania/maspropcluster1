package com.masprop.cluster1.shared.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Michal Karm Babacek
 */
public class GUI extends javax.swing.JFrame implements FocusListener {

    /**
     * Actions and Swingworkers handled here manager.
     */
    private GUIManager guiManager = null;
    List<JTextField> cells = null;

    /**
     * Initialization of all the components included in this JFrame.
     */
    public GUI() {
        guiManager = new GUIManager(this) {
        };
        initComponents();
        cells = new ArrayList<JTextField>();

        for (Component comp : jPanel2.getComponents()) {
            if (comp instanceof JTextField) {
                cells.add((JTextField) comp);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        buttonGameIsDone = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cell00 = new javax.swing.JTextField();
        cell1 = new javax.swing.JTextField();
        cell2 = new javax.swing.JTextField();
        cell3 = new javax.swing.JTextField();
        cell4 = new javax.swing.JTextField();
        cell5 = new javax.swing.JTextField();
        cell6 = new javax.swing.JTextField();
        cell7 = new javax.swing.JTextField();
        cell8 = new javax.swing.JTextField();
        cell9 = new javax.swing.JTextField();
        cell10 = new javax.swing.JTextField();
        cell11 = new javax.swing.JTextField();
        cell12 = new javax.swing.JTextField();
        cell13 = new javax.swing.JTextField();
        cell14 = new javax.swing.JTextField();
        cell15 = new javax.swing.JTextField();
        cell16 = new javax.swing.JTextField();
        cell17 = new javax.swing.JTextField();
        cell18 = new javax.swing.JTextField();
        cell19 = new javax.swing.JTextField();
        cell20 = new javax.swing.JTextField();
        cell21 = new javax.swing.JTextField();
        cell22 = new javax.swing.JTextField();
        cell23 = new javax.swing.JTextField();
        cell24 = new javax.swing.JTextField();
        cell25 = new javax.swing.JTextField();
        cell26 = new javax.swing.JTextField();
        cell27 = new javax.swing.JTextField();
        cell28 = new javax.swing.JTextField();
        cell29 = new javax.swing.JTextField();
        cell30 = new javax.swing.JTextField();
        cell31 = new javax.swing.JTextField();
        cell32 = new javax.swing.JTextField();
        cell33 = new javax.swing.JTextField();
        cell34 = new javax.swing.JTextField();
        cell35 = new javax.swing.JTextField();
        cell36 = new javax.swing.JTextField();
        cell37 = new javax.swing.JTextField();
        cell38 = new javax.swing.JTextField();
        cell39 = new javax.swing.JTextField();
        cell40 = new javax.swing.JTextField();
        cell41 = new javax.swing.JTextField();
        cell42 = new javax.swing.JTextField();
        cell43 = new javax.swing.JTextField();
        cell44 = new javax.swing.JTextField();
        cell45 = new javax.swing.JTextField();
        cell46 = new javax.swing.JTextField();
        cell47 = new javax.swing.JTextField();
        cell48 = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newGameMenuItem = new javax.swing.JMenuItem();
        loadGameMenuItem = new javax.swing.JMenuItem();
        scoresMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        manualMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jSplitPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(200, 1));

        jPanel1.setBackground(new java.awt.Color(254, 197, 111));

        buttonGameIsDone.setText("Done");
        buttonGameIsDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGameIsDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGameIsDone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGameIsDone)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(236, 179, 95));
        jPanel2.setLayout(new java.awt.GridLayout(7, 7));

        cell00.setBackground(new java.awt.Color(239, 227, 209));
        cell00.setColumns(2);
        cell00.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell00.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell00.setInputVerifier(jPanel2.getInputVerifier());
        cell00.setMaximumSize(new java.awt.Dimension(20, 20));
        cell00.setMinimumSize(new java.awt.Dimension(20, 20));
        cell00.setVerifyInputWhenFocusTarget(false);
        cell00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell00ActionPerformed(evt);
            }
        });
        cell00.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell00FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell00FocusLost(evt);
            }
        });
        jPanel2.add(cell00);

        cell1.setBackground(new java.awt.Color(239, 227, 209));
        cell1.setColumns(2);
        cell1.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell1.setInputVerifier(jPanel2.getInputVerifier());
        cell1.setMaximumSize(new java.awt.Dimension(20, 20));
        cell1.setMinimumSize(new java.awt.Dimension(20, 20));
        cell1.setVerifyInputWhenFocusTarget(false);
        cell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell1ActionPerformed(evt);
            }
        });
        cell1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell1FocusLost(evt);
            }
        });
        jPanel2.add(cell1);

        cell2.setBackground(new java.awt.Color(239, 227, 209));
        cell2.setColumns(2);
        cell2.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell2.setInputVerifier(jPanel2.getInputVerifier());
        cell2.setMaximumSize(new java.awt.Dimension(20, 20));
        cell2.setMinimumSize(new java.awt.Dimension(20, 20));
        cell2.setVerifyInputWhenFocusTarget(false);
        cell2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell2ActionPerformed(evt);
            }
        });
        cell2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell2FocusLost(evt);
            }
        });
        jPanel2.add(cell2);

        cell3.setBackground(new java.awt.Color(239, 227, 209));
        cell3.setColumns(2);
        cell3.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell3.setInputVerifier(jPanel2.getInputVerifier());
        cell3.setMaximumSize(new java.awt.Dimension(20, 20));
        cell3.setMinimumSize(new java.awt.Dimension(20, 20));
        cell3.setVerifyInputWhenFocusTarget(false);
        cell3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell3ActionPerformed(evt);
            }
        });
        cell3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell3FocusLost(evt);
            }
        });
        jPanel2.add(cell3);

        cell4.setBackground(new java.awt.Color(239, 227, 209));
        cell4.setColumns(2);
        cell4.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell4.setInputVerifier(jPanel2.getInputVerifier());
        cell4.setMaximumSize(new java.awt.Dimension(20, 20));
        cell4.setMinimumSize(new java.awt.Dimension(20, 20));
        cell4.setVerifyInputWhenFocusTarget(false);
        cell4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell4ActionPerformed(evt);
            }
        });
        cell4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell4FocusLost(evt);
            }
        });
        jPanel2.add(cell4);

        cell5.setBackground(new java.awt.Color(239, 227, 209));
        cell5.setColumns(2);
        cell5.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell5.setInputVerifier(jPanel2.getInputVerifier());
        cell5.setMaximumSize(new java.awt.Dimension(20, 20));
        cell5.setMinimumSize(new java.awt.Dimension(20, 20));
        cell5.setVerifyInputWhenFocusTarget(false);
        cell5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell5ActionPerformed(evt);
            }
        });
        cell5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell5FocusLost(evt);
            }
        });
        jPanel2.add(cell5);

        cell6.setBackground(new java.awt.Color(239, 227, 209));
        cell6.setColumns(2);
        cell6.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell6.setInputVerifier(jPanel2.getInputVerifier());
        cell6.setMaximumSize(new java.awt.Dimension(20, 20));
        cell6.setMinimumSize(new java.awt.Dimension(20, 20));
        cell6.setVerifyInputWhenFocusTarget(false);
        cell6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell6ActionPerformed(evt);
            }
        });
        cell6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell6FocusLost(evt);
            }
        });
        jPanel2.add(cell6);

        cell7.setBackground(new java.awt.Color(239, 227, 209));
        cell7.setColumns(2);
        cell7.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell7.setInputVerifier(jPanel2.getInputVerifier());
        cell7.setMaximumSize(new java.awt.Dimension(20, 20));
        cell7.setMinimumSize(new java.awt.Dimension(20, 20));
        cell7.setVerifyInputWhenFocusTarget(false);
        cell7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell7ActionPerformed(evt);
            }
        });
        cell7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell7FocusLost(evt);
            }
        });
        jPanel2.add(cell7);

        cell8.setBackground(new java.awt.Color(239, 227, 209));
        cell8.setColumns(2);
        cell8.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell8.setInputVerifier(jPanel2.getInputVerifier());
        cell8.setMaximumSize(new java.awt.Dimension(20, 20));
        cell8.setMinimumSize(new java.awt.Dimension(20, 20));
        cell8.setVerifyInputWhenFocusTarget(false);
        cell8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        cell8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell8FocusLost(evt);
            }
        });
        jPanel2.add(cell8);

        cell9.setBackground(new java.awt.Color(239, 227, 209));
        cell9.setColumns(2);
        cell9.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell9.setInputVerifier(jPanel2.getInputVerifier());
        cell9.setMaximumSize(new java.awt.Dimension(20, 20));
        cell9.setMinimumSize(new java.awt.Dimension(20, 20));
        cell9.setVerifyInputWhenFocusTarget(false);
        cell9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell9ActionPerformed(evt);
            }
        });
        cell9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell9FocusLost(evt);
            }
        });
        jPanel2.add(cell9);

        cell10.setBackground(new java.awt.Color(239, 227, 209));
        cell10.setColumns(2);
        cell10.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell10.setInputVerifier(jPanel2.getInputVerifier());
        cell10.setMaximumSize(new java.awt.Dimension(20, 20));
        cell10.setMinimumSize(new java.awt.Dimension(20, 20));
        cell10.setVerifyInputWhenFocusTarget(false);
        cell10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell10ActionPerformed(evt);
            }
        });
        cell10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell10FocusLost(evt);
            }
        });
        jPanel2.add(cell10);

        cell11.setBackground(new java.awt.Color(239, 227, 209));
        cell11.setColumns(2);
        cell11.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell11.setInputVerifier(jPanel2.getInputVerifier());
        cell11.setMaximumSize(new java.awt.Dimension(20, 20));
        cell11.setMinimumSize(new java.awt.Dimension(20, 20));
        cell11.setVerifyInputWhenFocusTarget(false);
        cell11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell11ActionPerformed(evt);
            }
        });
        cell11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell11FocusLost(evt);
            }
        });
        jPanel2.add(cell11);

        cell12.setBackground(new java.awt.Color(239, 227, 209));
        cell12.setColumns(2);
        cell12.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell12.setInputVerifier(jPanel2.getInputVerifier());
        cell12.setMaximumSize(new java.awt.Dimension(20, 20));
        cell12.setMinimumSize(new java.awt.Dimension(20, 20));
        cell12.setVerifyInputWhenFocusTarget(false);
        cell12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell12ActionPerformed(evt);
            }
        });
        cell12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell12FocusLost(evt);
            }
        });
        jPanel2.add(cell12);

        cell13.setBackground(new java.awt.Color(239, 227, 209));
        cell13.setColumns(2);
        cell13.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell13.setInputVerifier(jPanel2.getInputVerifier());
        cell13.setMaximumSize(new java.awt.Dimension(20, 20));
        cell13.setMinimumSize(new java.awt.Dimension(20, 20));
        cell13.setVerifyInputWhenFocusTarget(false);
        cell13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell13ActionPerformed(evt);
            }
        });
        cell13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell13FocusLost(evt);
            }
        });
        jPanel2.add(cell13);

        cell14.setBackground(new java.awt.Color(239, 227, 209));
        cell14.setColumns(2);
        cell14.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell14.setInputVerifier(jPanel2.getInputVerifier());
        cell14.setMaximumSize(new java.awt.Dimension(20, 20));
        cell14.setMinimumSize(new java.awt.Dimension(20, 20));
        cell14.setVerifyInputWhenFocusTarget(false);
        cell14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell14ActionPerformed(evt);
            }
        });
        cell14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell14FocusLost(evt);
            }
        });
        jPanel2.add(cell14);

        cell15.setBackground(new java.awt.Color(239, 227, 209));
        cell15.setColumns(2);
        cell15.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell15.setInputVerifier(jPanel2.getInputVerifier());
        cell15.setMaximumSize(new java.awt.Dimension(20, 20));
        cell15.setMinimumSize(new java.awt.Dimension(20, 20));
        cell15.setVerifyInputWhenFocusTarget(false);
        cell15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell15ActionPerformed(evt);
            }
        });
        cell15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell15FocusLost(evt);
            }
        });
        jPanel2.add(cell15);

        cell16.setBackground(new java.awt.Color(239, 227, 209));
        cell16.setColumns(2);
        cell16.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell16.setInputVerifier(jPanel2.getInputVerifier());
        cell16.setMaximumSize(new java.awt.Dimension(20, 20));
        cell16.setMinimumSize(new java.awt.Dimension(20, 20));
        cell16.setVerifyInputWhenFocusTarget(false);
        cell16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell16ActionPerformed(evt);
            }
        });
        cell16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell16FocusLost(evt);
            }
        });
        jPanel2.add(cell16);

        cell17.setBackground(new java.awt.Color(239, 227, 209));
        cell17.setColumns(2);
        cell17.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell17.setInputVerifier(jPanel2.getInputVerifier());
        cell17.setMaximumSize(new java.awt.Dimension(20, 20));
        cell17.setMinimumSize(new java.awt.Dimension(20, 20));
        cell17.setVerifyInputWhenFocusTarget(false);
        cell17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell17ActionPerformed(evt);
            }
        });
        cell17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell17FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell17FocusLost(evt);
            }
        });
        jPanel2.add(cell17);

        cell18.setBackground(new java.awt.Color(239, 227, 209));
        cell18.setColumns(2);
        cell18.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell18.setInputVerifier(jPanel2.getInputVerifier());
        cell18.setMaximumSize(new java.awt.Dimension(20, 20));
        cell18.setMinimumSize(new java.awt.Dimension(20, 20));
        cell18.setVerifyInputWhenFocusTarget(false);
        cell18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell18ActionPerformed(evt);
            }
        });
        cell18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell18FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell18FocusLost(evt);
            }
        });
        jPanel2.add(cell18);

        cell19.setBackground(new java.awt.Color(239, 227, 209));
        cell19.setColumns(2);
        cell19.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell19.setInputVerifier(jPanel2.getInputVerifier());
        cell19.setMaximumSize(new java.awt.Dimension(20, 20));
        cell19.setMinimumSize(new java.awt.Dimension(20, 20));
        cell19.setVerifyInputWhenFocusTarget(false);
        cell19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell19ActionPerformed(evt);
            }
        });
        cell19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell19FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell19FocusLost(evt);
            }
        });
        jPanel2.add(cell19);

        cell20.setBackground(new java.awt.Color(239, 227, 209));
        cell20.setColumns(2);
        cell20.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell20.setInputVerifier(jPanel2.getInputVerifier());
        cell20.setMaximumSize(new java.awt.Dimension(20, 20));
        cell20.setMinimumSize(new java.awt.Dimension(20, 20));
        cell20.setVerifyInputWhenFocusTarget(false);
        cell20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell20ActionPerformed(evt);
            }
        });
        cell20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell20FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell20FocusLost(evt);
            }
        });
        jPanel2.add(cell20);

        cell21.setBackground(new java.awt.Color(239, 227, 209));
        cell21.setColumns(2);
        cell21.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell21.setInputVerifier(jPanel2.getInputVerifier());
        cell21.setMaximumSize(new java.awt.Dimension(20, 20));
        cell21.setMinimumSize(new java.awt.Dimension(20, 20));
        cell21.setVerifyInputWhenFocusTarget(false);
        cell21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell21ActionPerformed(evt);
            }
        });
        cell21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell21FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell21FocusLost(evt);
            }
        });
        jPanel2.add(cell21);

        cell22.setBackground(new java.awt.Color(239, 227, 209));
        cell22.setColumns(2);
        cell22.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell22.setInputVerifier(jPanel2.getInputVerifier());
        cell22.setMaximumSize(new java.awt.Dimension(20, 20));
        cell22.setMinimumSize(new java.awt.Dimension(20, 20));
        cell22.setVerifyInputWhenFocusTarget(false);
        cell22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell22ActionPerformed(evt);
            }
        });
        cell22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell22FocusLost(evt);
            }
        });
        jPanel2.add(cell22);

        cell23.setBackground(new java.awt.Color(239, 227, 209));
        cell23.setColumns(2);
        cell23.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell23.setInputVerifier(jPanel2.getInputVerifier());
        cell23.setMaximumSize(new java.awt.Dimension(20, 20));
        cell23.setMinimumSize(new java.awt.Dimension(20, 20));
        cell23.setVerifyInputWhenFocusTarget(false);
        cell23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell23ActionPerformed(evt);
            }
        });
        cell23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell23FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell23FocusLost(evt);
            }
        });
        jPanel2.add(cell23);

        cell24.setBackground(new java.awt.Color(239, 227, 209));
        cell24.setColumns(2);
        cell24.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell24.setInputVerifier(jPanel2.getInputVerifier());
        cell24.setMaximumSize(new java.awt.Dimension(20, 20));
        cell24.setMinimumSize(new java.awt.Dimension(20, 20));
        cell24.setVerifyInputWhenFocusTarget(false);
        cell24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell24ActionPerformed(evt);
            }
        });
        cell24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell24FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell24FocusLost(evt);
            }
        });
        jPanel2.add(cell24);

        cell25.setBackground(new java.awt.Color(239, 227, 209));
        cell25.setColumns(2);
        cell25.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell25.setInputVerifier(jPanel2.getInputVerifier());
        cell25.setMaximumSize(new java.awt.Dimension(20, 20));
        cell25.setMinimumSize(new java.awt.Dimension(20, 20));
        cell25.setVerifyInputWhenFocusTarget(false);
        cell25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell25ActionPerformed(evt);
            }
        });
        cell25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell25FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell25FocusLost(evt);
            }
        });
        jPanel2.add(cell25);

        cell26.setBackground(new java.awt.Color(239, 227, 209));
        cell26.setColumns(2);
        cell26.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell26.setInputVerifier(jPanel2.getInputVerifier());
        cell26.setMaximumSize(new java.awt.Dimension(20, 20));
        cell26.setMinimumSize(new java.awt.Dimension(20, 20));
        cell26.setVerifyInputWhenFocusTarget(false);
        cell26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell26ActionPerformed(evt);
            }
        });
        cell26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell26FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell26FocusLost(evt);
            }
        });
        jPanel2.add(cell26);

        cell27.setBackground(new java.awt.Color(239, 227, 209));
        cell27.setColumns(2);
        cell27.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell27.setInputVerifier(jPanel2.getInputVerifier());
        cell27.setMaximumSize(new java.awt.Dimension(20, 20));
        cell27.setMinimumSize(new java.awt.Dimension(20, 20));
        cell27.setVerifyInputWhenFocusTarget(false);
        cell27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell27ActionPerformed(evt);
            }
        });
        cell27.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell27FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell27FocusLost(evt);
            }
        });
        jPanel2.add(cell27);

        cell28.setBackground(new java.awt.Color(239, 227, 209));
        cell28.setColumns(2);
        cell28.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell28.setInputVerifier(jPanel2.getInputVerifier());
        cell28.setMaximumSize(new java.awt.Dimension(20, 20));
        cell28.setMinimumSize(new java.awt.Dimension(20, 20));
        cell28.setVerifyInputWhenFocusTarget(false);
        cell28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell28ActionPerformed(evt);
            }
        });
        cell28.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell28FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell28FocusLost(evt);
            }
        });
        jPanel2.add(cell28);

        cell29.setBackground(new java.awt.Color(239, 227, 209));
        cell29.setColumns(2);
        cell29.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell29.setInputVerifier(jPanel2.getInputVerifier());
        cell29.setMaximumSize(new java.awt.Dimension(20, 20));
        cell29.setMinimumSize(new java.awt.Dimension(20, 20));
        cell29.setVerifyInputWhenFocusTarget(false);
        cell29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell29ActionPerformed(evt);
            }
        });
        cell29.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell29FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell29FocusLost(evt);
            }
        });
        jPanel2.add(cell29);

        cell30.setBackground(new java.awt.Color(239, 227, 209));
        cell30.setColumns(2);
        cell30.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell30.setInputVerifier(jPanel2.getInputVerifier());
        cell30.setMaximumSize(new java.awt.Dimension(20, 20));
        cell30.setMinimumSize(new java.awt.Dimension(20, 20));
        cell30.setVerifyInputWhenFocusTarget(false);
        cell30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell30ActionPerformed(evt);
            }
        });
        cell30.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell30FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell30FocusLost(evt);
            }
        });
        jPanel2.add(cell30);

        cell31.setBackground(new java.awt.Color(239, 227, 209));
        cell31.setColumns(2);
        cell31.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell31.setInputVerifier(jPanel2.getInputVerifier());
        cell31.setMaximumSize(new java.awt.Dimension(20, 20));
        cell31.setMinimumSize(new java.awt.Dimension(20, 20));
        cell31.setVerifyInputWhenFocusTarget(false);
        cell31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell31ActionPerformed(evt);
            }
        });
        cell31.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell31FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell31FocusLost(evt);
            }
        });
        jPanel2.add(cell31);

        cell32.setBackground(new java.awt.Color(239, 227, 209));
        cell32.setColumns(2);
        cell32.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell32.setInputVerifier(jPanel2.getInputVerifier());
        cell32.setMaximumSize(new java.awt.Dimension(20, 20));
        cell32.setMinimumSize(new java.awt.Dimension(20, 20));
        cell32.setVerifyInputWhenFocusTarget(false);
        cell32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell32ActionPerformed(evt);
            }
        });
        cell32.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell32FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell32FocusLost(evt);
            }
        });
        jPanel2.add(cell32);

        cell33.setBackground(new java.awt.Color(239, 227, 209));
        cell33.setColumns(2);
        cell33.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell33.setInputVerifier(jPanel2.getInputVerifier());
        cell33.setMaximumSize(new java.awt.Dimension(20, 20));
        cell33.setMinimumSize(new java.awt.Dimension(20, 20));
        cell33.setVerifyInputWhenFocusTarget(false);
        cell33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell33ActionPerformed(evt);
            }
        });
        cell33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell33FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell33FocusLost(evt);
            }
        });
        jPanel2.add(cell33);

        cell34.setBackground(new java.awt.Color(239, 227, 209));
        cell34.setColumns(2);
        cell34.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell34.setInputVerifier(jPanel2.getInputVerifier());
        cell34.setMaximumSize(new java.awt.Dimension(20, 20));
        cell34.setMinimumSize(new java.awt.Dimension(20, 20));
        cell34.setVerifyInputWhenFocusTarget(false);
        cell34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell34ActionPerformed(evt);
            }
        });
        cell34.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell34FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell34FocusLost(evt);
            }
        });
        jPanel2.add(cell34);

        cell35.setBackground(new java.awt.Color(239, 227, 209));
        cell35.setColumns(2);
        cell35.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell35.setInputVerifier(jPanel2.getInputVerifier());
        cell35.setMaximumSize(new java.awt.Dimension(20, 20));
        cell35.setMinimumSize(new java.awt.Dimension(20, 20));
        cell35.setVerifyInputWhenFocusTarget(false);
        cell35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell35ActionPerformed(evt);
            }
        });
        cell35.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell35FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell35FocusLost(evt);
            }
        });
        jPanel2.add(cell35);

        cell36.setBackground(new java.awt.Color(239, 227, 209));
        cell36.setColumns(2);
        cell36.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell36.setInputVerifier(jPanel2.getInputVerifier());
        cell36.setMaximumSize(new java.awt.Dimension(20, 20));
        cell36.setMinimumSize(new java.awt.Dimension(20, 20));
        cell36.setVerifyInputWhenFocusTarget(false);
        cell36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell36ActionPerformed(evt);
            }
        });
        cell36.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell36FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell36FocusLost(evt);
            }
        });
        jPanel2.add(cell36);

        cell37.setBackground(new java.awt.Color(239, 227, 209));
        cell37.setColumns(2);
        cell37.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell37.setInputVerifier(jPanel2.getInputVerifier());
        cell37.setMaximumSize(new java.awt.Dimension(20, 20));
        cell37.setMinimumSize(new java.awt.Dimension(20, 20));
        cell37.setVerifyInputWhenFocusTarget(false);
        cell37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell37ActionPerformed(evt);
            }
        });
        cell37.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell37FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell37FocusLost(evt);
            }
        });
        jPanel2.add(cell37);

        cell38.setBackground(new java.awt.Color(239, 227, 209));
        cell38.setColumns(2);
        cell38.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell38.setInputVerifier(jPanel2.getInputVerifier());
        cell38.setMaximumSize(new java.awt.Dimension(20, 20));
        cell38.setMinimumSize(new java.awt.Dimension(20, 20));
        cell38.setVerifyInputWhenFocusTarget(false);
        cell38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell38ActionPerformed(evt);
            }
        });
        cell38.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell38FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell38FocusLost(evt);
            }
        });
        jPanel2.add(cell38);

        cell39.setBackground(new java.awt.Color(239, 227, 209));
        cell39.setColumns(2);
        cell39.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell39.setInputVerifier(jPanel2.getInputVerifier());
        cell39.setMaximumSize(new java.awt.Dimension(20, 20));
        cell39.setMinimumSize(new java.awt.Dimension(20, 20));
        cell39.setVerifyInputWhenFocusTarget(false);
        cell39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell39ActionPerformed(evt);
            }
        });
        cell39.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell39FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell39FocusLost(evt);
            }
        });
        jPanel2.add(cell39);

        cell40.setBackground(new java.awt.Color(239, 227, 209));
        cell40.setColumns(2);
        cell40.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell40.setInputVerifier(jPanel2.getInputVerifier());
        cell40.setMaximumSize(new java.awt.Dimension(20, 20));
        cell40.setMinimumSize(new java.awt.Dimension(20, 20));
        cell40.setVerifyInputWhenFocusTarget(false);
        cell40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell40ActionPerformed(evt);
            }
        });
        cell40.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell40FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell40FocusLost(evt);
            }
        });
        jPanel2.add(cell40);

        cell41.setBackground(new java.awt.Color(239, 227, 209));
        cell41.setColumns(2);
        cell41.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell41.setInputVerifier(jPanel2.getInputVerifier());
        cell41.setMaximumSize(new java.awt.Dimension(20, 20));
        cell41.setMinimumSize(new java.awt.Dimension(20, 20));
        cell41.setVerifyInputWhenFocusTarget(false);
        cell41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell41ActionPerformed(evt);
            }
        });
        cell41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell41FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell41FocusLost(evt);
            }
        });
        jPanel2.add(cell41);

        cell42.setBackground(new java.awt.Color(239, 227, 209));
        cell42.setColumns(2);
        cell42.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell42.setInputVerifier(jPanel2.getInputVerifier());
        cell42.setMaximumSize(new java.awt.Dimension(20, 20));
        cell42.setMinimumSize(new java.awt.Dimension(20, 20));
        cell42.setVerifyInputWhenFocusTarget(false);
        cell42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell42ActionPerformed(evt);
            }
        });
        cell42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell42FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell42FocusLost(evt);
            }
        });
        jPanel2.add(cell42);

        cell43.setBackground(new java.awt.Color(239, 227, 209));
        cell43.setColumns(2);
        cell43.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell43.setInputVerifier(jPanel2.getInputVerifier());
        cell43.setMaximumSize(new java.awt.Dimension(20, 20));
        cell43.setMinimumSize(new java.awt.Dimension(20, 20));
        cell43.setVerifyInputWhenFocusTarget(false);
        cell43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell43ActionPerformed(evt);
            }
        });
        cell43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell43FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell43FocusLost(evt);
            }
        });
        jPanel2.add(cell43);

        cell44.setBackground(new java.awt.Color(239, 227, 209));
        cell44.setColumns(2);
        cell44.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell44.setInputVerifier(jPanel2.getInputVerifier());
        cell44.setMaximumSize(new java.awt.Dimension(20, 20));
        cell44.setMinimumSize(new java.awt.Dimension(20, 20));
        cell44.setVerifyInputWhenFocusTarget(false);
        cell44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell44ActionPerformed(evt);
            }
        });
        cell44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell44FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell44FocusLost(evt);
            }
        });
        jPanel2.add(cell44);

        cell45.setBackground(new java.awt.Color(239, 227, 209));
        cell45.setColumns(2);
        cell45.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell45.setInputVerifier(jPanel2.getInputVerifier());
        cell45.setMaximumSize(new java.awt.Dimension(20, 20));
        cell45.setMinimumSize(new java.awt.Dimension(20, 20));
        cell45.setVerifyInputWhenFocusTarget(false);
        cell45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell45ActionPerformed(evt);
            }
        });
        cell45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell45FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell45FocusLost(evt);
            }
        });
        jPanel2.add(cell45);

        cell46.setBackground(new java.awt.Color(239, 227, 209));
        cell46.setColumns(2);
        cell46.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell46.setInputVerifier(jPanel2.getInputVerifier());
        cell46.setMaximumSize(new java.awt.Dimension(20, 20));
        cell46.setMinimumSize(new java.awt.Dimension(20, 20));
        cell46.setVerifyInputWhenFocusTarget(false);
        cell46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell46ActionPerformed(evt);
            }
        });
        cell46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell46FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell46FocusLost(evt);
            }
        });
        jPanel2.add(cell46);

        cell47.setBackground(new java.awt.Color(239, 227, 209));
        cell47.setColumns(2);
        cell47.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell47.setInputVerifier(jPanel2.getInputVerifier());
        cell47.setMaximumSize(new java.awt.Dimension(20, 20));
        cell47.setMinimumSize(new java.awt.Dimension(20, 20));
        cell47.setVerifyInputWhenFocusTarget(false);
        cell47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell47ActionPerformed(evt);
            }
        });
        cell47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell47FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell47FocusLost(evt);
            }
        });
        jPanel2.add(cell47);

        cell48.setBackground(new java.awt.Color(239, 227, 209));
        cell48.setColumns(2);
        cell48.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        cell48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cell48.setInputVerifier(jPanel2.getInputVerifier());
        cell48.setMaximumSize(new java.awt.Dimension(20, 20));
        cell48.setMinimumSize(new java.awt.Dimension(20, 20));
        cell48.setVerifyInputWhenFocusTarget(false);
        cell48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell48ActionPerformed(evt);
            }
        });
        cell48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell48FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cell48FocusLost(evt);
            }
        });
        jPanel2.add(cell48);

        jSplitPane1.setRightComponent(jPanel2);

        menuBar.setBackground(new java.awt.Color(230, 215, 193));

        fileMenu.setText("File");

        newGameMenuItem.setText("New game");
        fileMenu.add(newGameMenuItem);

        loadGameMenuItem.setText("Load game");
        fileMenu.add(loadGameMenuItem);

        scoresMenuItem.setText("Scores");
        fileMenu.add(scoresMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        manualMenuItem.setText("Manual");
        helpMenu.add(manualMenuItem);

        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt GUI Event
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        guiManager.exit();
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void buttonGameIsDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGameIsDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGameIsDoneActionPerformed

    private void cell00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell00ActionPerformed

    private void cell00FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell00FocusGained
        cell00.setBackground(Color.red);
    }//GEN-LAST:event_cell00FocusGained

    private void cell00FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell00FocusLost
        cell00.setBackground(Color.orange);
    }//GEN-LAST:event_cell00FocusLost

    private void cell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell1ActionPerformed

    private void cell1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell1FocusGained
        cell1.setBackground(Color.red);
    }//GEN-LAST:event_cell1FocusGained

    private void cell1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell1FocusLost
        cell1.setBackground(Color.orange);
    }//GEN-LAST:event_cell1FocusLost

    private void cell2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell2ActionPerformed

    private void cell2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell2FocusGained

    private void cell2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell2FocusLost

    private void cell3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell3ActionPerformed

    private void cell3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell3FocusGained

    private void cell3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell3FocusLost

    private void cell4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell4ActionPerformed

    private void cell4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell4FocusGained

    private void cell4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell4FocusLost

    private void cell5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell5ActionPerformed

    private void cell5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell5FocusGained

    private void cell5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell5FocusLost

    private void cell6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell6ActionPerformed

    private void cell6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell6FocusGained

    private void cell6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell6FocusLost

    private void cell7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell7ActionPerformed

    private void cell7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell7FocusGained

    private void cell7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell7FocusLost

    private void cell8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell8ActionPerformed

    private void cell8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell8FocusGained

    private void cell8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell8FocusLost

    private void cell9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell9ActionPerformed

    private void cell9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell9FocusGained

    private void cell9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell9FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell9FocusLost

    private void cell10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell10ActionPerformed

    private void cell10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell10FocusGained

    private void cell10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell10FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell10FocusLost

    private void cell11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell11ActionPerformed

    private void cell11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell11FocusGained

    private void cell11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell11FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell11FocusLost

    private void cell12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell12ActionPerformed

    private void cell12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell12FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell12FocusGained

    private void cell12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell12FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell12FocusLost

    private void cell13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell13ActionPerformed

    private void cell13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell13FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell13FocusGained

    private void cell13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell13FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell13FocusLost

    private void cell14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell14ActionPerformed

    private void cell14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell14FocusGained

    private void cell14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell14FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell14FocusLost

    private void cell15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell15ActionPerformed

    private void cell15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell15FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell15FocusGained

    private void cell15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell15FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell15FocusLost

    private void cell16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell16ActionPerformed

    private void cell16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell16FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell16FocusGained

    private void cell16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell16FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell16FocusLost

    private void cell17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell17ActionPerformed

    private void cell17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell17FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell17FocusGained

    private void cell17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell17FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell17FocusLost

    private void cell18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell18ActionPerformed

    private void cell18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell18FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell18FocusGained

    private void cell18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell18FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell18FocusLost

    private void cell19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell19ActionPerformed

    private void cell19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell19FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell19FocusGained

    private void cell19FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell19FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell19FocusLost

    private void cell20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell20ActionPerformed

    private void cell20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell20FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell20FocusGained

    private void cell20FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell20FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell20FocusLost

    private void cell21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell21ActionPerformed

    private void cell21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell21FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell21FocusGained

    private void cell21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell21FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell21FocusLost

    private void cell22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell22ActionPerformed

    private void cell22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell22FocusGained

    private void cell22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell22FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell22FocusLost

    private void cell23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell23ActionPerformed

    private void cell23FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell23FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell23FocusGained

    private void cell23FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell23FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell23FocusLost

    private void cell24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell24ActionPerformed

    private void cell24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell24FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell24FocusGained

    private void cell24FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell24FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell24FocusLost

    private void cell25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell25ActionPerformed

    private void cell25FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell25FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell25FocusGained

    private void cell25FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell25FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell25FocusLost

    private void cell26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell26ActionPerformed

    private void cell26FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell26FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell26FocusGained

    private void cell26FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell26FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell26FocusLost

    private void cell27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell27ActionPerformed

    private void cell27FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell27FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell27FocusGained

    private void cell27FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell27FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell27FocusLost

    private void cell28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell28ActionPerformed

    private void cell28FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell28FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell28FocusGained

    private void cell28FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell28FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell28FocusLost

    private void cell29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell29ActionPerformed

    private void cell29FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell29FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell29FocusGained

    private void cell29FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell29FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell29FocusLost

    private void cell30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell30ActionPerformed

    private void cell30FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell30FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell30FocusGained

    private void cell30FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell30FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell30FocusLost

    private void cell31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell31ActionPerformed

    private void cell31FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell31FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell31FocusGained

    private void cell31FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell31FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell31FocusLost

    private void cell32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell32ActionPerformed

    private void cell32FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell32FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell32FocusGained

    private void cell32FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell32FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell32FocusLost

    private void cell33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell33ActionPerformed

    private void cell33FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell33FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell33FocusGained

    private void cell33FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell33FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell33FocusLost

    private void cell34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell34ActionPerformed

    private void cell34FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell34FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell34FocusGained

    private void cell34FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell34FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell34FocusLost

    private void cell35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell35ActionPerformed

    private void cell35FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell35FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell35FocusGained

    private void cell35FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell35FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell35FocusLost

    private void cell36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell36ActionPerformed

    private void cell36FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell36FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell36FocusGained

    private void cell36FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell36FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell36FocusLost

    private void cell37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell37ActionPerformed

    private void cell37FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell37FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell37FocusGained

    private void cell37FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell37FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell37FocusLost

    private void cell38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell38ActionPerformed

    private void cell38FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell38FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell38FocusGained

    private void cell38FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell38FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell38FocusLost

    private void cell39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell39ActionPerformed

    private void cell39FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell39FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell39FocusGained

    private void cell39FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell39FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell39FocusLost

    private void cell40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell40ActionPerformed

    private void cell40FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell40FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell40FocusGained

    private void cell40FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell40FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell40FocusLost

    private void cell41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell41ActionPerformed

    private void cell41FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell41FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell41FocusGained

    private void cell41FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell41FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell41FocusLost

    private void cell42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell42ActionPerformed

    private void cell42FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell42FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell42FocusGained

    private void cell42FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell42FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell42FocusLost

    private void cell43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell43ActionPerformed

    private void cell43FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell43FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell43FocusGained

    private void cell43FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell43FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell43FocusLost

    private void cell44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell44ActionPerformed

    private void cell44FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell44FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell44FocusGained

    private void cell44FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell44FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell44FocusLost

    private void cell45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell45ActionPerformed

    private void cell45FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell45FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell45FocusGained

    private void cell45FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell45FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell45FocusLost

    private void cell46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell46ActionPerformed

    private void cell46FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell46FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell46FocusGained

    private void cell46FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell46FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell46FocusLost

    private void cell47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell47ActionPerformed

    private void cell47FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell47FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell47FocusGained

    private void cell47FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell47FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell47FocusLost

    private void cell48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell48ActionPerformed

    private void cell48FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell48FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cell48FocusGained

    private void cell48FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell48FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cell48FocusLost

    public void focusGained(FocusEvent e) {
        //for(JTextField cell: cells) {
          //  if(e.getSource() instanceof JTextField) {
                ((JTextField)e.getSource()).setBackground(Color.red);
            //}
    //    }
    }

    public void focusLost(FocusEvent e) {

    }


    /**
     * Run the main thread.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton buttonGameIsDone;
    private javax.swing.JTextField cell00;
    private javax.swing.JTextField cell1;
    private javax.swing.JTextField cell10;
    private javax.swing.JTextField cell11;
    private javax.swing.JTextField cell12;
    private javax.swing.JTextField cell13;
    private javax.swing.JTextField cell14;
    private javax.swing.JTextField cell15;
    private javax.swing.JTextField cell16;
    private javax.swing.JTextField cell17;
    private javax.swing.JTextField cell18;
    private javax.swing.JTextField cell19;
    private javax.swing.JTextField cell2;
    private javax.swing.JTextField cell20;
    private javax.swing.JTextField cell21;
    private javax.swing.JTextField cell22;
    private javax.swing.JTextField cell23;
    private javax.swing.JTextField cell24;
    private javax.swing.JTextField cell25;
    private javax.swing.JTextField cell26;
    private javax.swing.JTextField cell27;
    private javax.swing.JTextField cell28;
    private javax.swing.JTextField cell29;
    private javax.swing.JTextField cell3;
    private javax.swing.JTextField cell30;
    private javax.swing.JTextField cell31;
    private javax.swing.JTextField cell32;
    private javax.swing.JTextField cell33;
    private javax.swing.JTextField cell34;
    private javax.swing.JTextField cell35;
    private javax.swing.JTextField cell36;
    private javax.swing.JTextField cell37;
    private javax.swing.JTextField cell38;
    private javax.swing.JTextField cell39;
    private javax.swing.JTextField cell4;
    private javax.swing.JTextField cell40;
    private javax.swing.JTextField cell41;
    private javax.swing.JTextField cell42;
    private javax.swing.JTextField cell43;
    private javax.swing.JTextField cell44;
    private javax.swing.JTextField cell45;
    private javax.swing.JTextField cell46;
    private javax.swing.JTextField cell47;
    private javax.swing.JTextField cell48;
    private javax.swing.JTextField cell5;
    private javax.swing.JTextField cell6;
    private javax.swing.JTextField cell7;
    private javax.swing.JTextField cell8;
    private javax.swing.JTextField cell9;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem loadGameMenuItem;
    private javax.swing.JMenuItem manualMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JMenuItem scoresMenuItem;
    // End of variables declaration//GEN-END:variables

    /*Getters and Setters*/
    /**
     * About menu item.
     * Story: User wants to read something about the application.
     * @return an about menu item.
     */
    public JMenuItem getAboutMenuItem() {
        return aboutMenuItem;
    }

    /**
     * About menu item.
     * Story: User wants to read something about the application.
     * @param aboutMenuItem
     */
    public void setAboutMenuItem(JMenuItem aboutMenuItem) {
        this.aboutMenuItem = aboutMenuItem;
    }

    /**
     * Exit menu item.
     * Story: User wishes to exit the application.
     * @return exit menu item
     */
    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    /**
     * Exit menu item.
     * Story: User wishes to exit the application.
     * @param exitMenuItem
     */
    public void setExitMenuItem(JMenuItem exitMenuItem) {
        this.exitMenuItem = exitMenuItem;
    }

    /**
     * File menu
     * Story: User wishes to perform one of the
     * initial use-cases.
     * @return file menu item
     */
    public JMenu getFileMenu() {
        return fileMenu;
    }

    /**
     * File menu
     * Story: User wishes to perform one of the
     * initial use-cases.
     * @param fileMenu
     */
    public void setFileMenu(JMenu fileMenu) {
        this.fileMenu = fileMenu;
    }

    /**
     * Help menu
     * Story: User wishes to know more about the application
     * or wants to access the help / manual.
     * @return help menu item.
     */
    public JMenu getHelpMenu() {
        return helpMenu;
    }

    /**
     * Help menu
     * Story: User wishes to know more about the application
     * or wants to access the help / manual.
     * @param helpMenu
     */
    public void setHelpMenu(JMenu helpMenu) {
        this.helpMenu = helpMenu;
    }

    /**
     * Load game menu item
     * Story: User wishes to load a game from the disk.
     * @return load game menu item
     */
    public JMenuItem getLoadGameMenuItem() {
        return loadGameMenuItem;
    }

    /**
     * Load game menu item
     * Story: User wishes to load a game from the disk.
     * @param loadGameMenuItem
     */
    public void setLoadGameMenuItem(JMenuItem loadGameMenuItem) {
        this.loadGameMenuItem = loadGameMenuItem;
    }

    /**
     * Manual menu item
     * Story: User wishes to read the manual.
     * @return manual menu item
     */
    public JMenuItem getManualMenuItem() {
        return manualMenuItem;
    }

    /**
     * Manual menu item
     * Story: User wishes to read the manual.
     * @param manualMenuItem
     */
    public void setManualMenuItem(JMenuItem manualMenuItem) {
        this.manualMenuItem = manualMenuItem;
    }

    /**
     * Main menu bar.
     * Story: User wishes to perform application control actions.
     * @return main menu bar item.
     */
    public JMenuBar getMainMenuBar() {
        return menuBar;
    }

    /**
     * Main menu bar.
     * Story: User wishes to perform application control actions.
     * @param menuBar
     */
    public void setMainMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    /**
     * New game menu item
     * Story: User wishes to start a new game.
     * @return
     */
    public JMenuItem getNewGameMenuItem() {
        return newGameMenuItem;
    }

    /**
     * New game menu item
     * Story: User wishes to start a new game.
     * @param newGameMenuItem
     */
    public void setNewGameMenuItem(JMenuItem newGameMenuItem) {
        this.newGameMenuItem = newGameMenuItem;
    }

    /**
     * Scores menu item
     * Story: User wishes to browse the score list.
     * @return scores menu item
     */
    public JMenuItem getScoresMenuItem() {
        return scoresMenuItem;
    }

    /**
     * Scores menu item
     * Story: User wishes to browse the score list.
     * @param scoresMenuItem
     */
    public void setScoresMenuItem(JMenuItem scoresMenuItem) {
        this.scoresMenuItem = scoresMenuItem;
    }
}
