package com.masprop.cluster1.shared.view;

import com.masprop.cluster1.shared.controller.ApplicationController;
import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.model.GameType;
import com.masprop.cluster1.shared.model.GameVariant;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

/**
 * GUI :-)
 * @author Michal Karm Babacek
 * 
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
        sudokuNewGameWizard = new javax.swing.JFrame();
        tabbedChoicesPanel = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        Variant = new javax.swing.JPanel();
        NinexNine = new javax.swing.JRadioButton();
        FourxFour = new javax.swing.JRadioButton();
        SixteenxSixteen = new javax.swing.JRadioButton();
        Difficulty = new javax.swing.JPanel();
        Easy = new javax.swing.JRadioButton();
        Medium = new javax.swing.JRadioButton();
        Difficult = new javax.swing.JRadioButton();
        Extreme = new javax.swing.JRadioButton();
        CreationSettings = new javax.swing.JPanel();
        creationBox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        Ok = new javax.swing.JButton();
        Dismiss = new javax.swing.JButton();
        tryProg = new javax.swing.JProgressBar();
        txtProg = new javax.swing.JTextField();
        VariantBG = new javax.swing.ButtonGroup();
        DifficultyBG = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        sidebar = new javax.swing.JPanel();
        buttonGameIsDone = new javax.swing.JButton();
        timerForGame = new javax.swing.JLabel();
        gameBoard = new javax.swing.JPanel();
        statusBar = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        gameGenerationBar = new javax.swing.JProgressBar();
        gameGenerationText = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newGameMenuItem = new javax.swing.JMenuItem();
        loadGameMenuItem = new javax.swing.JMenuItem();
        saveGameMenuItem = new javax.swing.JMenuItem();
        scoresMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        sudokuMenu = new javax.swing.JMenu();
        createSudokuMenuItem = new javax.swing.JMenuItem();
        validateSudokuMenuItem = new javax.swing.JMenuItem();
        solveSudokuMenuItem = new javax.swing.JMenuItem();
        sudokuHints = new javax.swing.JCheckBoxMenuItem();
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
                .addContainerGap(130, Short.MAX_VALUE))
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

        sudokuNewGameWizard.setTitle("New Game Wizard");
        sudokuNewGameWizard.setMinimumSize(new java.awt.Dimension(250, 300));

        VariantBG.add(NinexNine);
        NinexNine.setSelected(true);
        NinexNine.setText("9x9");
        NinexNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NinexNineActionPerformed(evt);
            }
        });

        VariantBG.add(FourxFour);
        FourxFour.setText("4x4");

        VariantBG.add(SixteenxSixteen);
        SixteenxSixteen.setText("16x16");

        javax.swing.GroupLayout VariantLayout = new javax.swing.GroupLayout(Variant);
        Variant.setLayout(VariantLayout);
        VariantLayout.setHorizontalGroup(
            VariantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariantLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(VariantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NinexNine)
                    .addComponent(FourxFour)
                    .addComponent(SixteenxSixteen))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        VariantLayout.setVerticalGroup(
            VariantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariantLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(NinexNine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FourxFour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SixteenxSixteen)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tabs.addTab("Variant", Variant);

        DifficultyBG.add(Easy);
        Easy.setText("EASY");

        DifficultyBG.add(Medium);
        Medium.setText("MEDIUM");

        DifficultyBG.add(Difficult);
        Difficult.setText("DIFFICULT");

        DifficultyBG.add(Extreme);
        Extreme.setSelected(true);
        Extreme.setText("EXTREME");

        javax.swing.GroupLayout DifficultyLayout = new javax.swing.GroupLayout(Difficulty);
        Difficulty.setLayout(DifficultyLayout);
        DifficultyLayout.setHorizontalGroup(
            DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultyLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Extreme)
                    .addComponent(Medium)
                    .addComponent(Easy)
                    .addComponent(Difficult))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        DifficultyLayout.setVerticalGroup(
            DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Easy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Medium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Difficult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Extreme)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tabs.addTab("Difficulty", Difficulty);

        creationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BlankGrid", "5-15", "15-30", "30-45" }));

        jLabel15.setText("No of Cells filled (percentage)");

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(70);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(35);

        javax.swing.GroupLayout CreationSettingsLayout = new javax.swing.GroupLayout(CreationSettings);
        CreationSettings.setLayout(CreationSettingsLayout);
        CreationSettingsLayout.setHorizontalGroup(
            CreationSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreationSettingsLayout.createSequentialGroup()
                .addGroup(CreationSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreationSettingsLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(creationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreationSettingsLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreationSettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CreationSettingsLayout.setVerticalGroup(
            CreationSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreationSettingsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tabs.addTab("CreationSettings", CreationSettings);

        javax.swing.GroupLayout tabbedChoicesPanelLayout = new javax.swing.GroupLayout(tabbedChoicesPanel);
        tabbedChoicesPanel.setLayout(tabbedChoicesPanelLayout);
        tabbedChoicesPanelLayout.setHorizontalGroup(
            tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );
        tabbedChoicesPanelLayout.setVerticalGroup(
            tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );

        Ok.setText("Ok");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdkGameWizardOkActionPerformed(evt);
            }
        });

        Dismiss.setText("Dismiss");

        txtProg.setText("jTextField1");

        javax.swing.GroupLayout sudokuNewGameWizardLayout = new javax.swing.GroupLayout(sudokuNewGameWizard.getContentPane());
        sudokuNewGameWizard.getContentPane().setLayout(sudokuNewGameWizardLayout);
        sudokuNewGameWizardLayout.setHorizontalGroup(
            sudokuNewGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedChoicesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sudokuNewGameWizardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sudokuNewGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(sudokuNewGameWizardLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tryProg, 0, 0, Short.MAX_VALUE))
                    .addComponent(Dismiss, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(sudokuNewGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sudokuNewGameWizardLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudokuNewGameWizardLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        sudokuNewGameWizardLayout.setVerticalGroup(
            sudokuNewGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudokuNewGameWizardLayout.createSequentialGroup()
                .addComponent(tabbedChoicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sudokuNewGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dismiss)
                    .addComponent(Ok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sudokuNewGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tryProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        timerForGame.setText("sdkTimer");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGameIsDone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidebarLayout.createSequentialGroup()
                    .addGap(0, 38, Short.MAX_VALUE)
                    .addComponent(timerForGame)
                    .addGap(0, 38, Short.MAX_VALUE)))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGameIsDone)
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidebarLayout.createSequentialGroup()
                    .addGap(0, 187, Short.MAX_VALUE)
                    .addComponent(timerForGame)
                    .addGap(0, 188, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(sidebar);

        gameBoard.setBackground(new java.awt.Color(236, 179, 95));
        gameBoard.setLayout(new java.awt.GridLayout(10, 10));
        jSplitPane1.setRightComponent(gameBoard);

        statusBar.setBackground(new java.awt.Color(248, 233, 210));
        statusBar.setLayout(new java.awt.GridLayout(1, 0));

        statusText.setText("Welcome");
        statusBar.add(statusText);
        statusBar.add(gameGenerationBar);

        gameGenerationText.setText("jTextField1");
        gameGenerationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameGenerationTextActionPerformed(evt);
            }
        });
        statusBar.add(gameGenerationText);

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

        sudokuMenu.setText("Sudoku");

        createSudokuMenuItem.setText("Create");
        createSudokuMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        sudokuMenu.add(createSudokuMenuItem);

        validateSudokuMenuItem.setText("Validate");
        validateSudokuMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        sudokuMenu.add(validateSudokuMenuItem);

        solveSudokuMenuItem.setText("Solve");
        solveSudokuMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveSudokuMenuItemActionPerformed(evt);
            }
        });
        sudokuMenu.add(solveSudokuMenuItem);

        sudokuHints.setSelected(true);
        sudokuHints.setText("Hints");
        sudokuHints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sudokuHintsActionPerformed(evt);
            }
        });
        sudokuMenu.add(sudokuHints);

        menuBar.add(sudokuMenu);

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

    public JTextField getGameGenerationText() {
        return gameGenerationText;
    }

    public void setGameGenerationText(JTextField gameGenerationText) {
        this.gameGenerationText = gameGenerationText;
    }
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
           String time = getTimerForGame().getText();
        String[] timeparts = time.split(":");
        long hrs = Long.valueOf(timeparts[0])*3600;
        long min = Long.valueOf(timeparts[1])*60;
        long sec = Long.valueOf(timeparts[2]);
        long totalTime = hrs+min+sec;
        System.out.println(" total time = " + totalTime);
        getGuiManager().getGame().setTime(totalTime);

        double score = ApplicationController.getUniqueInstance().getGameManager().getStatisticsManager().getScoreFor(getGuiManager().getGame());
        System.out.println("score for the game = " + score);
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
        if(ApplicationController.getGameToPlay() == GameType.SUDOKU)
        {
            System.out.println(" cop" +tabs.getComponentAt(1));
//            JPanel creationTab = (JPanel) tabs.getComponentAt(1);
            if(tabs.getTabCount()==3)
                tabs.remove(tabs.getComponentAt(2));
             if(tabs.getTabCount()==2)
             {
                tabs.remove(tabs.getComponentAt(1));
                tabs.addTab("Difficulty", Difficulty);
             }
            sudokuNewGameWizard.validate();
            sudokuNewGameWizard.repaint();
            sudokuNewGameWizard.setVisible(true);

            //the difficulty tab was removed
            if(tabs.getTabCount() == 1)
            {

            }

        }
        else
            guiManager.getNewGame(null);
    }//GEN-LAST:event_newGameMenuItemActionPerformed

    private void wizzardDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizzardDoneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wizzardDoneButtonActionPerformed

    private void wizardDismissButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizardDismissButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wizardDismissButtonActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
       System.out.println("GUIMANAGER:"+guiManager);
        if(ApplicationController.getGameToPlay() == GameType.SUDOKU)
        {

            //controls the removal of the difficulty tab
            if(tabs.getTabCount() == 3)
                tabs.remove(tabs.getComponentAt(1));


//            JPanel creationTab = (JPanel) tabs.getComponentAt(1);
            if(tabs.getTabCount()==2)
            {
                tabs.remove(tabs.getComponentAt(1));

                tabs.addTab("CreationSettings", CreationSettings);
            }
//        javax.swing.GroupLayout tabbedChoicesPanelLayout = new javax.swing.GroupLayout(tabbedChoicesPanel);
//        tabbedChoicesPanel.setLayout(tabbedChoicesPanelLayout);
//        tabbedChoicesPanelLayout.setHorizontalGroup(
//            tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 224, Short.MAX_VALUE)
//            .addGroup(tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
//        );
//        tabbedChoicesPanelLayout.setVerticalGroup(
//            tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 200, Short.MAX_VALUE)
//            .addGroup(tabbedChoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//        );

            sudokuNewGameWizard.setSize(250,300);
            sudokuNewGameWizard.validate();
            sudokuNewGameWizard.repaint();
            sudokuNewGameWizard.setVisible(true);
        }
       
        

    }//GEN-LAST:event_createActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        // TODO add your handling code here:
        guiManager.validateGame(null);
    }//GEN-LAST:event_validateActionPerformed

    private void sudokuHintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sudokuHintsActionPerformed
        // TODO add your handling code here:
        System.out.println(" sudokuHints " + sudokuHints.isSelected());
    }//GEN-LAST:event_sudokuHintsActionPerformed

    private void NinexNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NinexNineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NinexNineActionPerformed

    private void sdkGameWizardOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdkGameWizardOkActionPerformed
        // TODO add your handling code here:

        
        JRadioButton gameVariantRb = getSelection(VariantBG);
        JRadioButton gameDiffultyRb = getSelection(DifficultyBG);
        System.out.println(" gameVariantRb " + gameVariantRb.getText());
        System.out.println(" gameDiffultyRb " + gameDiffultyRb.getText());


        String gameVariant = gameVariantRb.getText().equals("9x9") ?
            "NINEcrossNINE" : gameVariantRb.getText().equals("16x16") ?
                "SIXTEENcrossSIXTEEN" : "FOURcrossFOUR";

        
        Class<?> gVariant;
        GameVariant gaVariant = null;
        try {
            gVariant = Class.forName("com.masprop.cluster1.sudoku.model.SudokuGameVariant");
            gaVariant = (GameVariant)gVariant.getMethod("valueOf", String.class).invoke(gVariant, gameVariant);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        System.out.println("did i gett the gameVariant !??>!>?!." + gaVariant);

        System.out.println(" the filled %age value wanted " + jSlider1.getValue());

        int percent = jSlider1.getValue();

        int createdGivens  = gameVariant.equals("NINEcrossNINE") ? (int)Math.floor(percent*.01*9*9)
             : gameVariant.equals("SIXTEENcrossSIXTEEN") ?
                (int)Math.floor(percent*.01*16*16) : (int)Math.floor(percent*.01*4*4);

        System.out.println("the created givens will become  " + createdGivens);

        /*
         * The options in the comboBox are
         * BlankGrid
         5-15
15-30
30-45
         * 1.
         * 2.
         * 3.
         * 4.
         *
         *
         * */

        int noOfGivens = 0;
        Constraint constraint = null;
        if(tabs.getComponentAt(1) == CreationSettings)
        {
            String selected = (String)creationBox.getSelectedItem();
            System.out.println("selected is present wohooo !! it will still work --- !!!");

            noOfGivens = "5-15".equals(selected) ? 5 : "16-30".equals(selected) ? 16 : "30-40".equals(selected) ?  30 : -100;
            constraint = new Constraint(null,gaVariant, createdGivens);
        }
        else
            constraint = new Constraint(GameLevelType.valueOf(gameDiffultyRb.getText()),gaVariant, createdGivens);


        // Sudoku will switch on the constraint property noOfGivens
        // >0 or -100  implies a 'create' action
        // =0 would imply a new GameOption
        
        

        sudokuNewGameWizard.setVisible(false);

        guiManager.getNewGame(constraint);
      

        

    }//GEN-LAST:event_sdkGameWizardOkActionPerformed

    private void gameGenerationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameGenerationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameGenerationTextActionPerformed

    private void solveSudokuMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveSudokuMenuItemActionPerformed
        // TODO add your handling code here:

        //this is just an invocation to the guiManager
        guiManager.solveGame(null);
    }//GEN-LAST:event_solveSudokuMenuItemActionPerformed

          // This method returns the selected radio button in a button group
    public static JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e=group.getElements(); e.hasMoreElements(); ) {
            JRadioButton b = (JRadioButton)e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreationSettings;
    private javax.swing.JRadioButton Difficult;
    private javax.swing.JPanel Difficulty;
    private javax.swing.ButtonGroup DifficultyBG;
    private javax.swing.JButton Dismiss;
    private javax.swing.JRadioButton Easy;
    private javax.swing.JRadioButton Extreme;
    private javax.swing.JRadioButton FourxFour;
    private javax.swing.JRadioButton Medium;
    private javax.swing.JRadioButton NinexNine;
    private javax.swing.JButton Ok;
    private javax.swing.JRadioButton SixteenxSixteen;
    private javax.swing.JPanel Variant;
    private javax.swing.ButtonGroup VariantBG;
    private javax.swing.JDialog aboutDialog;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton buttonGameIsDone;
    private javax.swing.JButton buttonGameIsDone1;
    private javax.swing.JMenuItem createSudokuMenuItem;
    private javax.swing.JComboBox creationBox;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel gameBoard;
    private javax.swing.JProgressBar gameGenerationBar;
    private javax.swing.JTextField gameGenerationText;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem loadGameMenuItem;
    private javax.swing.JMenuItem manualMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JMenuItem saveGameMenuItem;
    private javax.swing.JMenuItem scoresMenuItem;
    private javax.swing.JPanel sidebar;
    private javax.swing.JMenuItem solveSudokuMenuItem;
    private javax.swing.JPanel statusBar;
    private javax.swing.JLabel statusText;
    private javax.swing.JCheckBoxMenuItem sudokuHints;
    private javax.swing.JMenu sudokuMenu;
    private javax.swing.JFrame sudokuNewGameWizard;
    private javax.swing.JPanel tabbedChoicesPanel;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel timerForGame;
    private javax.swing.JProgressBar tryProg;
    private javax.swing.JTextField txtProg;
    private javax.swing.JMenuItem validateSudokuMenuItem;
    private javax.swing.JButton wizardDismissButton;
    private javax.swing.JPanel wizardOptionsPanel;
    private javax.swing.JFrame wizardWindow;
    private javax.swing.JButton wizzardDoneButton;
    // End of variables declaration//GEN-END:variables

    public JLabel getTimerForGame() {
        return timerForGame;
    }

    public void setTimerForGame(JLabel timerForGame) {
        this.timerForGame = timerForGame;
    }
    // End of variables declaration

    public JProgressBar getGameGenerationBar() {
        return gameGenerationBar;
    }
    // End of variables declaration

    public JFrame getSudokuNewGameWizard() {
        return sudokuNewGameWizard;
    }
    // End of variables declaration

    public JCheckBoxMenuItem getSudokuHints() {
        return sudokuHints;
    }
    // End of variables declaration

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
