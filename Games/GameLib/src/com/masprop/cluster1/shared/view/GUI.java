package com.masprop.cluster1.shared.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
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
        guiManager = new GUIManager(this) {};
        initComponents();
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        sideMenuPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
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

        sideMenuPanel.setBackground(new java.awt.Color(187, 178, 178));

        javax.swing.GroupLayout sideMenuPanelLayout = new javax.swing.GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        sideMenuPanelLayout.setVerticalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(sideMenuPanel);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(mainPanel);

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
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
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
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem loadGameMenuItem;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem manualMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JMenuItem scoresMenuItem;
    private javax.swing.JPanel sideMenuPanel;
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
