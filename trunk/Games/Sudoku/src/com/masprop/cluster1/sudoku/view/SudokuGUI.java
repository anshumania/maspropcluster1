/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SudokuGUI.java
 *
 * Created on 9 Dec, 2009, 8:15:11 PM
 */
package com.masprop.cluster1.sudoku.view;

import com.masprop.cluster1.shared.model.Constraint;
import com.masprop.cluster1.shared.model.GameLevelType;
import com.masprop.cluster1.shared.view.GUI;
import com.masprop.cluster1.sudoku.model.SudokuGame;
import com.masprop.cluster1.sudoku.model.SudokuGameVariant;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author ANSHUMAN
 */
public class SudokuGUI extends GUI {
	
	static
	{
	   	try{

                //    		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                //	   		UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
            } catch (IllegalAccessException ex) {
                
                Logger.getLogger(SudokuGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(SudokuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
	   		
    		
    	catch(InstantiationException e)
    	{
            
    		//e.printStackTrace();
    	}
                catch(ClassNotFoundException ex)
                {
                }
	}

    /** Creates new form SudokuGUI */
    public SudokuGUI() {
 
        super();
        setGuiManager(new SudokuGUIManagerSwingWorker());
        getGuiManager().setGui(this);
        
        this.getGameBoard().setBackground(new Color(240, 240, 240));
        this.getSidebar().setBackground(new Color(240, 240, 240));
        this.getStatusBar().setBackground(new Color(240, 240, 240));
        initComponents();
        addComponentsToParentGUI();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void init() {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SudokuGUI().setVisible(true);
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sudokuMenu = new javax.swing.JMenu();
        Create = new javax.swing.JMenuItem();
        Solve = new javax.swing.JMenuItem();
        Validate = new javax.swing.JMenuItem();
        Hints = new javax.swing.JCheckBoxMenuItem();
        VariantBG = new javax.swing.ButtonGroup();
        DifficultyBG = new javax.swing.ButtonGroup();
        timerForGame = new javax.swing.JLabel();
        sudokuGameWizard = new javax.swing.JFrame();
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
        jLabel15 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        Dismiss = new javax.swing.JButton();
        Ok = new javax.swing.JButton();
        highScore = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        highScoreTable = new javax.swing.JTable();
        OKHighScore = new javax.swing.JButton();
        helpFrame = new javax.swing.JFrame();
        helpScrollPane = new javax.swing.JScrollPane();
        helpEditorPane = new javax.swing.JEditorPane();

        sudokuMenu.setLabel("Sudoku");
        sudokuMenu.setName("Sudoku"); // NOI18N

        Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/sudoku/view/graphics/create_game.png"))); // NOI18N
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSudokuMenuActionPerformed(evt);
            }
        });
        sudokuMenu.add(Create);

        Solve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/sudoku/view/graphics/solve_game.png"))); // NOI18N
        Solve.setText("Solve");
        Solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveSudokuMenuActionPerformed(evt);
            }
        });
        sudokuMenu.add(Solve);

        Validate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/masprop/cluster1/sudoku/view/graphics/validate_game.png"))); // NOI18N
        Validate.setText("Validate");
        Validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateSudokuMenuActionPerformed(evt);
            }
        });
        sudokuMenu.add(Validate);

        Hints.setLabel("Hints");
        Hints.setName("Hints"); // NOI18N
        Hints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintsSudokuMenuActionPerformed(evt);
            }
        });
        sudokuMenu.add(Hints);

        timerForGame.setText("Sudoku Timer");

        sudokuGameWizard.setTitle("Sudoku Game Wizard");
        sudokuGameWizard.setMinimumSize(new java.awt.Dimension(300, 300));

        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setName("tabs"); // NOI18N

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
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabs.addTab("Difficulty", Difficulty);

        jLabel15.setText("Percentage of Initial Grid to fill");

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(70);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(35);

        javax.swing.GroupLayout CreationSettingsLayout = new javax.swing.GroupLayout(CreationSettings);
        CreationSettings.setLayout(CreationSettingsLayout);
        CreationSettingsLayout.setHorizontalGroup(
            CreationSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreationSettingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CreationSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        CreationSettingsLayout.setVerticalGroup(
            CreationSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreationSettingsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tabs.addTab("CreationSettings", CreationSettings);

        Dismiss.setText("Dismiss");
        Dismiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DismissActionPerformed(evt);
            }
        });

        Ok.setText("Ok");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdkGameWizardOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sudokuGameWizardLayout = new javax.swing.GroupLayout(sudokuGameWizard.getContentPane());
        sudokuGameWizard.getContentPane().setLayout(sudokuGameWizardLayout);
        sudokuGameWizardLayout.setHorizontalGroup(
            sudokuGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudokuGameWizardLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(Dismiss)
                .addGap(18, 18, 18)
                .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(sudokuGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sudokuGameWizardLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
        );
        sudokuGameWizardLayout.setVerticalGroup(
            sudokuGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudokuGameWizardLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(sudokuGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dismiss)
                    .addComponent(Ok))
                .addGap(21, 21, 21))
            .addGroup(sudokuGameWizardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sudokuGameWizardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        highScore.setTitle("Sudoku Hall Of Fame");
        highScore.setMinimumSize(new java.awt.Dimension(430, 270));

        highScoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1000000", "Anshuman"},
                {"999999", "Michal"},
                {"999998", "Matteo"},
                {"999997", "Matus"},
                {"999996", "Andrea"},
                {"999997", "Adrien"},
                {"0", "Antonio"},
                {"0", "Jack"},
                {"0", "Jill"},
                {"0", "Droid"}
            },
            new String [] {
                "HighScore", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        highScoreTable.setName("highScoreTable"); // NOI18N
        jScrollPane1.setViewportView(highScoreTable);

        OKHighScore.setText("OK");
        OKHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKHighScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout highScoreLayout = new javax.swing.GroupLayout(highScore.getContentPane());
        highScore.getContentPane().setLayout(highScoreLayout);
        highScoreLayout.setHorizontalGroup(
            highScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(highScoreLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(OKHighScore))
        );
        highScoreLayout.setVerticalGroup(
            highScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(highScoreLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKHighScore, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        helpFrame.setTitle("Sudoku Help");
        helpFrame.setMinimumSize(new java.awt.Dimension(400, 500));
        helpFrame.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        helpEditorPane.setMinimumSize(new java.awt.Dimension(300, 300));
        helpScrollPane.setViewportView(helpEditorPane);

        helpFrame.getContentPane().add(helpScrollPane);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createSudokuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSudokuMenuActionPerformed
        // TODO add your handling code here:

        /*
         * tab1:gamevariant
         * tab2:difficulty
         * tab3:gamecreation
         *
         * the below just help in indexing into the JTabbedPane
         * and removing the appropriate one
         * in the case of 'create'
         * only tab1 and tab3 are to be shown
         */

        //controls the removal of the difficulty tab
        if (tabs.getTabCount() == 3) {
            tabs.remove(tabs.getComponentAt(1));
        }
        if (tabs.getTabCount() == 2) {
            tabs.remove(tabs.getComponentAt(1));
            tabs.addTab("CreationSettings", CreationSettings);
        }


        sudokuGameWizard.setSize(250, 300);
        sudokuGameWizard.validate();
        sudokuGameWizard.repaint();
        sudokuGameWizard.setLocationRelativeTo(this);
        sudokuGameWizard.setVisible(true);


    }//GEN-LAST:event_createSudokuMenuActionPerformed

    private void solveSudokuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveSudokuMenuActionPerformed
        // TODO add your handling code here:

        //an invocation to the underlying GUIManager to solve the game
        // it is currently managing (in the gui).
        getGuiManager().solveGame(null);
        
    }//GEN-LAST:event_solveSudokuMenuActionPerformed

    private void validateSudokuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateSudokuMenuActionPerformed
        // TODO add your handling code here:
         //an invocation to the underlying GUIManager to validate the game
        // it is currently managing (in the gui).
        getGuiManager().validateGame(null);
    }//GEN-LAST:event_validateSudokuMenuActionPerformed

    private void hintsSudokuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintsSudokuMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hintsSudokuMenuActionPerformed

    /**
     * retrieves the selected RadioButton from the ButtonGroup
     * @param group
     * @return
     */
    public static JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }

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


     
     
        System.out.println(" the filled %age value wanted " + jSlider1.getValue());

        int percent = jSlider1.getValue();

        int createdGivens  = gameVariant.equals("NINEcrossNINE") ? (int)Math.floor(percent*.01*9*9)
                : gameVariant.equals("SIXTEENcrossSIXTEEN") ?
                    (int)Math.floor(percent*.01*16*16) : (int)Math.floor(percent*.01*4*4);

        System.out.println("the created givens will become  " + createdGivens);

     
        
        Constraint constraint = null;
        if(tabs.getComponentAt(1) == CreationSettings) {
               constraint = new Constraint(null,SudokuGameVariant.valueOf(gameVariant), createdGivens);
        } else
            // the no of givens is zero for game generation
            constraint = new Constraint(GameLevelType.valueOf(gameDiffultyRb.getText()),SudokuGameVariant.valueOf(gameVariant), 0);


        // Sudoku will switch on the constraint property noOfGivens
        // >0 or -100  implies a 'create' action
        // =0 would imply a new GameOption



        sudokuGameWizard.setVisible(false);

        getGuiManager().getNewGame(constraint);
    }//GEN-LAST:event_sdkGameWizardOkActionPerformed

    private void DismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DismissActionPerformed
        sudokuGameWizard.setVisible(false);
    }//GEN-LAST:event_DismissActionPerformed

    private void OKHighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKHighScoreActionPerformed
        // TODO add your handling code here:
        highScore.setVisible(false);
    }//GEN-LAST:event_OKHighScoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SudokuGUI().setVisible(true);
            }
        });
    }

    private void addComponentsToParentGUI() {

        //add to the SudokuMenu to the Main Menu Bar
        getMainMenuBar().add(sudokuMenu,1);
        //add the timer to the SidePanel
        getSidebar().add(timerForGame);
        //set the about dialog to the center
        getAboutDialog().setLocationRelativeTo(this);
        

        //TODO: customise the fileChooser
//        getFileChooser().addChoosableFileFilter(new FileFiler())setFileSelectionMode(JFileChooser.);




    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Create;
    private javax.swing.JPanel CreationSettings;
    private javax.swing.JRadioButton Difficult;
    private javax.swing.JPanel Difficulty;
    private javax.swing.ButtonGroup DifficultyBG;
    private javax.swing.JButton Dismiss;
    private javax.swing.JRadioButton Easy;
    private javax.swing.JRadioButton Extreme;
    private javax.swing.JRadioButton FourxFour;
    private javax.swing.JCheckBoxMenuItem Hints;
    private javax.swing.JRadioButton Medium;
    private javax.swing.JRadioButton NinexNine;
    private javax.swing.JButton OKHighScore;
    private javax.swing.JButton Ok;
    private javax.swing.JRadioButton SixteenxSixteen;
    private javax.swing.JMenuItem Solve;
    private javax.swing.JMenuItem Validate;
    private javax.swing.JPanel Variant;
    private javax.swing.ButtonGroup VariantBG;
    private javax.swing.JEditorPane helpEditorPane;
    private javax.swing.JFrame helpFrame;
    private javax.swing.JScrollPane helpScrollPane;
    private javax.swing.JFrame highScore;
    private javax.swing.JTable highScoreTable;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JFrame sudokuGameWizard;
    private javax.swing.JMenu sudokuMenu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel timerForGame;
    // End of variables declaration//GEN-END:variables

    public JFrame getSudokuGameWizard() {
        return sudokuGameWizard;
    }
    // End of variables declaration

    public JLabel getTimerForGame() {
        return timerForGame;
    }
    // End of variables declaration

  
    // End of variables declaration

    public JCheckBoxMenuItem getSudokuHints() {
        return Hints;
    }

   
   protected void newGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
//        System.out.println("GUIMANAGER:"+guiManager);
       // guiManager.getNewGame(null);
       /*
        	 * tab1:gamevariant
        	 * tab2:difficulty
        	 * tab3:gamecreation
        	 *
        	 * the below just help in indexing into the JTabbedPane
        	 * and removing the appropriate one
        	 * in the case of 'new'
        	 * only tab1 and tab2 are to be shown
        	 */
            System.out.println(" cop" +tabs.getComponentAt(1));
//            JPanel creationTab = (JPanel) tabs.getComponentAt(1);
            if(tabs.getTabCount()==3)
                tabs.remove(tabs.getComponentAt(2));
             if(tabs.getTabCount()==2)
             {
                tabs.remove(tabs.getComponentAt(1));
                tabs.addTab("Difficulty", Difficulty);
             }
            sudokuGameWizard.validate();
            sudokuGameWizard.repaint();
            sudokuGameWizard.setLocationRelativeTo(this);
            sudokuGameWizard.setVisible(true);


    }

    protected void scoresMenuItemActionPerformed(Properties highScoreProps) {

        
        DefaultTableModel model = (DefaultTableModel)highScoreTable.getModel();
        int size = model.getRowCount();
        System.out.println("Size of the model " + size);
        for(int i=model.getRowCount();i>0;i--)
            model.removeRow(i-1);

//        highScoreTable.removeAll();

        Enumeration highScoresEnum = highScoreProps.keys();
        int i=0;
        while (highScoresEnum.hasMoreElements()) {
            
                String score = (String)highScoresEnum.nextElement();
                String name = (String)highScoreProps.getProperty(score);
                System.out.println(score + " " + name);
                model.insertRow(i++,new Object[]{score,name});
//                model.addRow(arg0)insertRow(i++,new Object[][]{ {score,name} });
            
        }


       highScore.setVisible(true);
    }

    public void manualMenuItemActionPerformed()
    {
        try {
//            URL url = SudokuGUI.class.getResource("resources/help.html");
//        	helpEditorPane.setContentType("text/html");
            InputStream helpIns = getClass().getResourceAsStream("resources/help.html");
//            InputStream helpIns = new FileInputStream();
            
       
            helpEditorPane.setEditable(false);

            helpEditorPane.setEditorKit(new HTMLEditorKit());
            
            helpEditorPane.read(helpIns, null);

            
        } catch (IOException ex) {
              helpEditorPane.setContentType("text/html");
              helpEditorPane.setText("<html>Could not load resources/help.html </html>");
            Logger.getLogger(SudokuGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
        helpFrame.setVisible(true);
        helpFrame.setExtendedState(MAXIMIZED_BOTH);
    }

   
}
