package com.masprop.cluster1.shared.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * GUI :-)
 * @author Michal Karm Babacek
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Actions and Swingworkers handled here manager.
     */
    private GUIManager guiManager = null;

    /**
     * Initialization of all the components included in this JFrame.
     */
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonGameIsDone1 = new javax.swing.JButton();
        fileChooser = new javax.swing.JFileChooser();
        wizardWindow = new javax.swing.JFrame();
        wizardOptionsPanel = new javax.swing.JPanel();
        wizzardDoneButton = new javax.swing.JButton();
        wizardDismissButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        sidebar = new javax.swing.JPanel();
        buttonGameIsDone = new javax.swing.JButton();
        gameBoard = new javax.swing.JPanel();
        statusBar = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newGameMenuItem = new javax.swing.JMenuItem();
        loadGameMenuItem = new javax.swing.JMenuItem();
        saveGameMenuItem = new javax.swing.JMenuItem();
        scoresMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        manualMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        aboutDialog.setTitle("About");
        aboutDialog.setIconImage(null);
        aboutDialog.setIconImages(null);
        aboutDialog.setMinimumSize(new java.awt.Dimension(400, 350));
        aboutDialog.setResizable(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel1.setText("Authors:");

        jLabel2.setText("Michal \"Karm\" Babacek");

        jLabel3.setText("Anshuman Mehta");

        jLabel4.setText("Adrien Daunou");

        jLabel5.setText("Matus Pleva");

        jLabel6.setText("Matteo De Martino");

        jLabel7.setText("Andrea Gritti");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel8.setText("Version:");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel9.setText("Licence:");

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel10.setText("Third party:");

        jLabel11.setText("Icons by Brsev, CC by-nc-nd, 3.0");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 2, 14));
        jLabel12.setText("http://brsev.deviantart.com/");

        jLabel13.setText("0.1b, rev32");

        jLabel14.setText("Apache 2");

        buttonGameIsDone1.setBackground(new java.awt.Color(196, 186, 166));
        buttonGameIsDone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_exit.png"))); // NOI18N
        buttonGameIsDone1.setText("Dismiss");
        buttonGameIsDone1.setToolTipText("Close this window.");
        buttonGameIsDone1.setActionCommand("Close");
        buttonGameIsDone1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGameIsDone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGameIsDone1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aboutDialogLayout = new javax.swing.GroupLayout(aboutDialog.getContentPane());
        aboutDialog.getContentPane().setLayout(aboutDialogLayout);
        aboutDialogLayout.setHorizontalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutDialogLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)))
                    .addGroup(aboutDialogLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(aboutDialogLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(aboutDialogLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutDialogLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(buttonGameIsDone1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        aboutDialogLayout.setVerticalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGameIsDone1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        fileChooser.setBackground(new java.awt.Color(230, 215, 193));
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        wizardWindow.setTitle("Settings");
        wizardWindow.setBackground(new java.awt.Color(228, 219, 206));

        wizardOptionsPanel.setBackground(new java.awt.Color(239, 227, 209));

        wizzardDoneButton.setBackground(new java.awt.Color(196, 186, 166));
        wizzardDoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/button_ok.png"))); // NOI18N
        wizzardDoneButton.setText("Done");
        wizzardDoneButton.setToolTipText("Click if you are done.");
        wizzardDoneButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wizzardDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizzardDoneButtonActionPerformed(evt);
            }
        });

        wizardDismissButton.setBackground(new java.awt.Color(196, 186, 166));
        wizardDismissButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_exit.png"))); // NOI18N
        wizardDismissButton.setText("Dismiss");
        wizardDismissButton.setToolTipText("Click if you are done.");
        wizardDismissButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wizardDismissButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizardDismissButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wizardWindowLayout = new javax.swing.GroupLayout(wizardWindow.getContentPane());
        wizardWindow.getContentPane().setLayout(wizardWindowLayout);
        wizardWindowLayout.setHorizontalGroup(
            wizardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wizardWindowLayout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(wizardDismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wizzardDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(wizardOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        wizardWindowLayout.setVerticalGroup(
            wizardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wizardWindowLayout.createSequentialGroup()
                .addComponent(wizardOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wizardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wizzardDoneButton)
                    .addComponent(wizardDismissButton))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jSplitPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(200, 1));
        jSplitPane1.setMinimumSize(new java.awt.Dimension(200, 1));

        sidebar.setBackground(new java.awt.Color(254, 197, 111));

        buttonGameIsDone.setBackground(new java.awt.Color(196, 186, 166));
        buttonGameIsDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/button_done.png"))); // NOI18N
        buttonGameIsDone.setText("Done");
        buttonGameIsDone.setToolTipText("Click if you are done.");
        buttonGameIsDone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGameIsDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGameIsDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGameIsDone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGameIsDone)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(sidebar);

        gameBoard.setBackground(new java.awt.Color(236, 179, 95));
        gameBoard.setLayout(new java.awt.GridLayout(10, 10));
        jSplitPane1.setRightComponent(gameBoard);

        statusBar.setBackground(new java.awt.Color(248, 233, 210));
        statusBar.setLayout(new java.awt.BorderLayout());

        statusText.setText("Welcome");
        statusBar.add(statusText, java.awt.BorderLayout.CENTER);

        menuBar.setBackground(new java.awt.Color(230, 215, 193));

        fileMenu.setText("File");

        newGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newGameMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_new_game.png"))); // NOI18N
        newGameMenuItem.setText("New game");
        newGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newGameMenuItem);

        loadGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loadGameMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_load_game.png"))); // NOI18N
        loadGameMenuItem.setText("Load game");
        loadGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGameMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadGameMenuItem);

        saveGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveGameMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_save_game.png"))); // NOI18N
        saveGameMenuItem.setText("Save game");
        saveGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGameMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveGameMenuItem);

        scoresMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        scoresMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_scores.png"))); // NOI18N
        scoresMenuItem.setText("Scores");
        fileMenu.add(scoresMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_exit.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        manualMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_manual.png"))); // NOI18N
        manualMenuItem.setText("Manual");
        helpMenu.add(manualMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/shared/view/graphics/menu_about.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(statusBar, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void buttonGameIsDone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGameIsDone1ActionPerformed
        aboutDialog.setVisible(false);
    }//GEN-LAST:event_buttonGameIsDone1ActionPerformed

    private void loadGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGameMenuItemActionPerformed
        fileChooser.showOpenDialog(menuBar);
    }//GEN-LAST:event_loadGameMenuItemActionPerformed

    private void saveGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGameMenuItemActionPerformed
        fileChooser.showSaveDialog(menuBar);
    }//GEN-LAST:event_saveGameMenuItemActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        if (fileChooser.getDialogType() == JFileChooser.OPEN_DIALOG) {
            guiManager.loadGame(fileChooser.getSelectedFile());
        } else if (fileChooser.getDialogType() == JFileChooser.SAVE_DIALOG) {
            guiManager.saveGame(fileChooser.getSelectedFile());
        } else {
            throw new IllegalArgumentException("illegal fileChooser state");
        }
    }//GEN-LAST:event_fileChooserActionPerformed

    private void newGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameMenuItemActionPerformed
        System.out.println("GUIMANAGER:"+guiManager);
        guiManager.getNewGame(null);
    }//GEN-LAST:event_newGameMenuItemActionPerformed

    private void wizzardDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizzardDoneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wizzardDoneButtonActionPerformed

    private void wizardDismissButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardDismissButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wizardDismissButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog aboutDialog;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton buttonGameIsDone;
    private javax.swing.JButton buttonGameIsDone1;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel gameBoard;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem loadGameMenuItem;
    private javax.swing.JMenuItem manualMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JMenuItem saveGameMenuItem;
    private javax.swing.JMenuItem scoresMenuItem;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel statusBar;
    private javax.swing.JLabel statusText;
    private javax.swing.JButton wizardDismissButton;
    private javax.swing.JPanel wizardOptionsPanel;
    private javax.swing.JFrame wizardWindow;
    private javax.swing.JButton wizzardDoneButton;
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

    public JPanel getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(JPanel gameBoard) {
        this.gameBoard = gameBoard;
    }

    public JLabel getStatusText() {
        return statusText;
    }

    public void setStatusText(JLabel statusText) {
        this.statusText = statusText;
    }

    public JDialog getAboutDialog() {
        return aboutDialog;
    }

    public void setAboutDialog(JDialog aboutDialog) {
        this.aboutDialog = aboutDialog;
    }

    public JButton getButtonGameIsDone() {
        return buttonGameIsDone;
    }

    public void setButtonGameIsDone(JButton buttonGameIsDone) {
        this.buttonGameIsDone = buttonGameIsDone;
    }

    public JButton getButtonGameIsDone1() {
        return buttonGameIsDone1;
    }

    public void setButtonGameIsDone1(JButton buttonGameIsDone1) {
        this.buttonGameIsDone1 = buttonGameIsDone1;
    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    public GUIManager getGuiManager() {
        return guiManager;
    }

    public void setGuiManager(GUIManager guiManager) {
        this.guiManager = guiManager;
    }

    public JSplitPane getjSplitPane1() {
        return jSplitPane1;
    }

    public void setjSplitPane1(JSplitPane jSplitPane1) {
        this.jSplitPane1 = jSplitPane1;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public JMenuItem getSaveGameMenuItem() {
        return saveGameMenuItem;
    }

    public void setSaveGameMenuItem(JMenuItem saveGameMenuItem) {
        this.saveGameMenuItem = saveGameMenuItem;
    }

    public JPanel getSidebar() {
        return sidebar;
    }

    public void setSidebar(JPanel sidebar) {
        this.sidebar = sidebar;
    }

    public JPanel getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(JPanel statusBar) {
        this.statusBar = statusBar;
    }

    public JButton getWizardDismissButton() {
        return wizardDismissButton;
    }

    public void setWizardDismissButton(JButton wizardDismissButton) {
        this.wizardDismissButton = wizardDismissButton;
    }

    public JPanel getWizardOptionsPanel() {
        return wizardOptionsPanel;
    }

    public void setWizardOptionsPanel(JPanel wizardOptionsPanel) {
        this.wizardOptionsPanel = wizardOptionsPanel;
    }

    public JFrame getWizardWindow() {
        return wizardWindow;
    }

    public void setWizardWindow(JFrame wizardWindow) {
        this.wizardWindow = wizardWindow;
    }

    public JButton getWizzardDoneButton() {
        return wizzardDoneButton;
    }

    public void setWizzardDoneButton(JButton wizzardDoneButton) {
        this.wizzardDoneButton = wizzardDoneButton;
    }
    
    public  void init()
    {
    	
    }
    
}
