/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pastTestGUI;

import accountGUI.LoggedOutMainGUI;
import accountGUI.streakAccountGUI;
import accountGUI.accountSettingsGUI;
import javax.swing.ImageIcon;
import pomodoroGUI.*;
import mainGUI.*;
import notepadGUI.*;
import questionGeneratingGUI.*;
import testUploadGUI.*;
import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.imageio.*;
import java.io.*;


/**
 *
 * @author pamlee
 */
public class pastTestDisplayGUI extends javax.swing.JFrame {
    
    // Sets currentPage equal to 1
    int intCurrentPage = 1;
    // Initializes class variables
    int intPageTotal;
    String [] strLocationsSplit;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(pastTestDisplayGUI.class.getName());

    /**
     * Creates new form pastTestDisplayGUI
     */
    
    public pastTestDisplayGUI(String testLocation) 
    {
        // Initializes components
        initComponents();
        // Takes the string and splits it if there are comma's
        strLocationsSplit = testLocation.split(",");
        // Sets the number of pages equal to the length on the array 
        intPageTotal = strLocationsSplit.length;
        // Displays photo on screen
        photoPageDisplay();
        
        // Making all the buttons appear as just text (app aesthetic)
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setFocusPainted(false);
        
        btnAccount.setContentAreaFilled(false);
        btnAccount.setFocusPainted(false);
        
        btnCloseMenu.setContentAreaFilled(false);
        btnCloseMenu.setFocusPainted(false);
        
        btnOpenMenu.setContentAreaFilled(false);
        btnOpenMenu.setFocusPainted(false);
        
        btnStudyTools.setContentAreaFilled(false);
        btnStudyTools.setFocusPainted(false);
        
        btnPomoTimer.setContentAreaFilled(false);
        btnPomoTimer.setFocusPainted(false);
        
        btnPastTest.setContentAreaFilled(false);
        btnPastTest.setFocusPainted(false);
        
        btnQuestionGen.setContentAreaFilled(false);
        btnQuestionGen.setFocusPainted(false);
        
        btnUploadTest.setContentAreaFilled(false);
        btnUploadTest.setFocusPainted(false);
        
        btnNotepad.setContentAreaFilled(false);
        btnNotepad.setFocusPainted(false);
        
        btnMyStreak.setContentAreaFilled(false);
        btnMyStreak.setFocusPainted(false);
        
        btnPreviousPage.setContentAreaFilled(false);
        btnPreviousPage.setFocusPainted(false);
        
        btnNextPage.setContentAreaFilled(false);
        btnNextPage.setFocusPainted(false);
        
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        
        // Hide the full-page buttons (open menu, extra button only in full-screen)
        btnOpenMenu.setEnabled(false);
        btnOpenMenu.setVisible(false);
    }
    
    public pastTestDisplayGUI() 
    {
        initComponents();
        
        // Making all the buttons appear as just text (app aesthetic)
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setFocusPainted(false);
        
        btnAccount.setContentAreaFilled(false);
        btnAccount.setFocusPainted(false);
        
        btnCloseMenu.setContentAreaFilled(false);
        btnCloseMenu.setFocusPainted(false);
        
        btnOpenMenu.setContentAreaFilled(false);
        btnOpenMenu.setFocusPainted(false);
        
        btnStudyTools.setContentAreaFilled(false);
        btnStudyTools.setFocusPainted(false);
        
        btnPomoTimer.setContentAreaFilled(false);
        btnPomoTimer.setFocusPainted(false);
        
        btnPastTest.setContentAreaFilled(false);
        btnPastTest.setFocusPainted(false);
        
        btnQuestionGen.setContentAreaFilled(false);
        btnQuestionGen.setFocusPainted(false);
        
        btnNotepad.setContentAreaFilled(false);
        btnNotepad.setFocusPainted(false);
        
        btnUploadTest.setContentAreaFilled(false);
        btnUploadTest.setFocusPainted(false);
        
        btnMyStreak.setContentAreaFilled(false);
        btnMyStreak.setFocusPainted(false);
        
        btnPreviousPage.setContentAreaFilled(false);
        btnPreviousPage.setFocusPainted(false);
        
        btnNextPage.setContentAreaFilled(false);
        btnNextPage.setFocusPainted(false);
        
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        
        // Hide the full-page buttons (open menu, extra button only in full-screen)
        btnOpenMenu.setEnabled(false);
        btnOpenMenu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNextPage = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnPreviousPage = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        pnlScrollTest = new javax.swing.JScrollPane();
        lblTestDisplay = new javax.swing.JLabel();
        btnCloseMenu = new javax.swing.JButton();
        btnMyStreak = new javax.swing.JButton();
        btnNotepad = new javax.swing.JButton();
        btnUploadTest = new javax.swing.JButton();
        btnQuestionGen = new javax.swing.JButton();
        btnPastTest = new javax.swing.JButton();
        btnPomoTimer = new javax.swing.JButton();
        btnStudyTools = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        btnOpenMenu = new javax.swing.JButton();
        lblBackgroundWOMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        btnNextPage.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        btnNextPage.setForeground(new java.awt.Color(255, 117, 31));
        btnNextPage.setText("Next Page");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });
        jPanel1.add(btnNextPage);
        btnNextPage.setBounds(990, 629, 170, 50);

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 117, 31));
        btnBack.setText("Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(753, 629, 170, 50);

        btnPreviousPage.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        btnPreviousPage.setForeground(new java.awt.Color(255, 117, 31));
        btnPreviousPage.setText("Previous Page");
        btnPreviousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousPageActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreviousPage);
        btnPreviousPage.setBounds(518, 629, 170, 50);

        btnAccount.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(255, 117, 31));
        btnAccount.setText("MANAGE ACCOUNT");
        btnAccount.setBorder(null);
        btnAccount.setBorderPainted(false);
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccount);
        btnAccount.setBounds(970, 20, 280, 50);

        pnlScrollTest.setBackground(new java.awt.Color(255, 255, 255));

        lblTestDisplay.setToolTipText("");
        lblTestDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTestDisplay.setMaximumSize(new java.awt.Dimension(393, 644));
        lblTestDisplay.setMinimumSize(new java.awt.Dimension(393, 644));
        lblTestDisplay.setPreferredSize(new java.awt.Dimension(393, 644));
        pnlScrollTest.setViewportView(lblTestDisplay);

        jPanel1.add(pnlScrollTest);
        pnlScrollTest.setBounds(640, 190, 393, 430);

        btnCloseMenu.setBackground(new java.awt.Color(255, 117, 31));
        btnCloseMenu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCloseMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnCloseMenu.setText("CLOSE MENU");
        btnCloseMenu.setBorder(null);
        btnCloseMenu.setBorderPainted(false);
        btnCloseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnCloseMenu);
        btnCloseMenu.setBounds(130, 110, 140, 30);

        btnMyStreak.setBackground(new java.awt.Color(255, 204, 102));
        btnMyStreak.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnMyStreak.setText("My Streak");
        btnMyStreak.setBorder(null);
        btnMyStreak.setBorderPainted(false);
        btnMyStreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyStreakActionPerformed(evt);
            }
        });
        jPanel1.add(btnMyStreak);
        btnMyStreak.setBounds(60, 560, 270, 30);

        btnNotepad.setBackground(new java.awt.Color(255, 204, 102));
        btnNotepad.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnNotepad.setText("Notepad");
        btnNotepad.setBorder(null);
        btnNotepad.setBorderPainted(false);
        btnNotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotepadActionPerformed(evt);
            }
        });
        jPanel1.add(btnNotepad);
        btnNotepad.setBounds(60, 500, 270, 30);

        btnUploadTest.setBackground(new java.awt.Color(255, 204, 102));
        btnUploadTest.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnUploadTest.setText("Upload A Test");
        btnUploadTest.setBorder(null);
        btnUploadTest.setBorderPainted(false);
        btnUploadTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadTestActionPerformed(evt);
            }
        });
        jPanel1.add(btnUploadTest);
        btnUploadTest.setBounds(60, 440, 270, 30);

        btnQuestionGen.setBackground(new java.awt.Color(255, 204, 102));
        btnQuestionGen.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnQuestionGen.setText("Question Generator");
        btnQuestionGen.setBorder(null);
        btnQuestionGen.setBorderPainted(false);
        btnQuestionGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionGenActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuestionGen);
        btnQuestionGen.setBounds(60, 380, 270, 30);

        btnPastTest.setBackground(new java.awt.Color(255, 204, 51));
        btnPastTest.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnPastTest.setForeground(new java.awt.Color(255, 0, 0));
        btnPastTest.setText("Past Student Tests");
        btnPastTest.setBorder(null);
        btnPastTest.setBorderPainted(false);
        btnPastTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastTestActionPerformed(evt);
            }
        });
        jPanel1.add(btnPastTest);
        btnPastTest.setBounds(60, 320, 270, 30);

        btnPomoTimer.setBackground(new java.awt.Color(255, 204, 51));
        btnPomoTimer.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnPomoTimer.setText("Pomodoro Timer");
        btnPomoTimer.setBorder(null);
        btnPomoTimer.setBorderPainted(false);
        btnPomoTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPomoTimerActionPerformed(evt);
            }
        });
        jPanel1.add(btnPomoTimer);
        btnPomoTimer.setBounds(60, 260, 270, 30);

        btnStudyTools.setBackground(new java.awt.Color(255, 153, 0));
        btnStudyTools.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        btnStudyTools.setForeground(new java.awt.Color(255, 255, 255));
        btnStudyTools.setText("STUDY TOOLS");
        btnStudyTools.setBorder(null);
        btnStudyTools.setBorderPainted(false);
        btnStudyTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudyToolsActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudyTools);
        btnStudyTools.setBounds(10, 170, 360, 60);

        btnLogOut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 51, 51));
        btnLogOut.setText("LOG OUT");
        btnLogOut.setBorder(null);
        btnLogOut.setBorderPainted(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(100, 620, 180, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Past Student Test Display (WITH menu).png"))); // NOI18N
        lblBackground.setSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        btnOpenMenu.setBackground(new java.awt.Color(255, 117, 31));
        btnOpenMenu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnOpenMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnOpenMenu.setText("OPEN MENU");
        btnOpenMenu.setBorder(null);
        btnOpenMenu.setBorderPainted(false);
        btnOpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpenMenu);
        btnOpenMenu.setBounds(40, 118, 140, 30);

        lblBackgroundWOMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Past Student Tests Display (WITHOUT menu).png"))); // NOI18N
        lblBackgroundWOMenu.setSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(lblBackgroundWOMenu);
        lblBackgroundWOMenu.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        accountSettingsGUI accountGUI = new accountSettingsGUI();
        
        accountGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnCloseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMenuActionPerformed
        // disables buttons to show buttons for the open-menu and remove closed-menu buttons; (app aesthetic)
        lblBackground.setEnabled(false);
        lblBackground.setVisible(false);

        btnCloseMenu.setEnabled(false);
        btnCloseMenu.setVisible(false);

        btnStudyTools.setEnabled(false);
        btnStudyTools.setVisible(false);

        btnPomoTimer.setEnabled(false);
        btnPomoTimer.setVisible(false);

        btnPastTest.setEnabled(false);
        btnPastTest.setVisible(false);

        btnQuestionGen.setEnabled(false);
        btnQuestionGen.setVisible(false);

        btnUploadTest.setEnabled(false);
        btnUploadTest.setVisible(false);
        
        btnNotepad.setEnabled(false);
        btnNotepad.setVisible(false);

        btnMyStreak.setEnabled(false);
        btnMyStreak.setVisible(false);

        btnOpenMenu.setEnabled(true);
        btnOpenMenu.setVisible(true);

        btnLogOut.setLocation(753, 18);
        btnLogOut.setSize(190, 54);
        
        pnlScrollTest.setLocation(440, 190);
        pnlScrollTest.setSize(393, 430);
        
        btnPreviousPage.setLocation(206, 636);
        btnPreviousPage.setSize(230, 50);
        
        btnBack.setLocation(522, 636);
        btnBack.setSize(235, 50);
        
        btnNextPage.setLocation(840, 636);
        btnNextPage.setSize(238, 50);
    }//GEN-LAST:event_btnCloseMenuActionPerformed

    private void btnStudyToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudyToolsActionPerformed
        // Opens the main menu GUI
        MainGUI mainGUI = new MainGUI();

        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStudyToolsActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        LoggedOutMainGUI logOut = new LoggedOutMainGUI();

        logOut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnOpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenMenuActionPerformed
        // Re-enables buttons to show buttons for the opened-menu; (app aesthetic)
        lblBackground.setEnabled(true);
        lblBackground.setVisible(true);

        // Hide open menu button again
        btnOpenMenu.setEnabled(false);
        btnOpenMenu.setVisible(false);

        // Show the rest of the buttons again
        btnCloseMenu.setEnabled(true);
        btnCloseMenu.setVisible(true);

        btnStudyTools.setEnabled(true);
        btnStudyTools.setVisible(true);

        btnPomoTimer.setEnabled(true);
        btnPomoTimer.setVisible(true);

        btnPastTest.setEnabled(true);
        btnPastTest.setVisible(true);

        btnQuestionGen.setEnabled(true);
        btnQuestionGen.setVisible(true);

        btnUploadTest.setEnabled(true);
        btnUploadTest.setVisible(true);
        
        btnNotepad.setEnabled(true);
        btnNotepad.setVisible(true);

        btnMyStreak.setEnabled(true);
        btnMyStreak.setVisible(true);

        btnLogOut.setLocation(100, 620);
        btnLogOut.setSize(180, 30);
        
        pnlScrollTest.setLocation(640, 190);
        pnlScrollTest.setSize(393, 430);
        
        btnPreviousPage.setLocation(518, 629);
        btnPreviousPage.setSize(170, 50);
        
        btnBack.setLocation(753, 629);
        btnBack.setSize(170, 50);
        
        btnNextPage.setLocation(990, 629);
        btnNextPage.setSize(170, 50);
    }//GEN-LAST:event_btnOpenMenuActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
        // Adds 1 to the page number
        intCurrentPage += 1;
        // Displays the correct page
        photoPageDisplay();
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void btnPreviousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousPageActionPerformed
        // Subtracts 1 from the page number
        intCurrentPage -= 1;
        // Displays the correct page
        photoPageDisplay();
    }//GEN-LAST:event_btnPreviousPageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Closes this page
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMyStreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyStreakActionPerformed
        streakAccountGUI accountGUI = new streakAccountGUI();

        accountGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyStreakActionPerformed

    private void btnNotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotepadActionPerformed
        noteGetterGUI notePad = new noteGetterGUI();
        
        notePad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNotepadActionPerformed

    private void btnUploadTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadTestActionPerformed
        testUploadGUI testUploadNew = new testUploadGUI();

        testUploadNew.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUploadTestActionPerformed

    private void btnQuestionGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionGenActionPerformed
        QuestionGenerator qGen = new QuestionGenerator();

        qGen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuestionGenActionPerformed

    private void btnPastTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastTestActionPerformed
        pastTestGUI pastTestGUI = new pastTestGUI();

        pastTestGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPastTestActionPerformed

    private void btnPomoTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPomoTimerActionPerformed
        pomodoroGUI pomoGUI = new pomodoroGUI();

        pomoGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPomoTimerActionPerformed

    
    // Method that displays the page on the screen
    public void photoPageDisplay(){
        // Sets both nextPage and previousPage buttons to not visible
        btnNextPage.setVisible(false);
        btnPreviousPage.setVisible(false);
        // Checks if the total number of pages is greater than 1, and that the current page is not equal to the total pages
        if (intPageTotal > 1 && intCurrentPage != intPageTotal){
            // Sets visibility of the next page button to true
            btnNextPage.setVisible(true);
        }
        // Checks if the current page is not the first page
        if (intCurrentPage != 1){
            // Displays previous page button
            btnPreviousPage.setVisible(true);
        }
        
        // Resizing the image to fit on the screen
        BufferedImage test; 
        try
        {
            test = ImageIO.read(new File(strLocationsSplit[intCurrentPage- 1]));
            Image displayImage = test.getScaledInstance(393, 644, Image.SCALE_SMOOTH);
            // Creates image icon using the location of the photo in the array at the current page
            ImageIcon testPhoto = new ImageIcon(displayImage);
            // Displays photo on the screen
            lblTestDisplay.setIcon(testPhoto);
        }
        catch(IOException e)
        {
            e.printStackTrace();
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new pastTestDisplayGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCloseMenu;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMyStreak;
    private javax.swing.JButton btnNextPage;
    private javax.swing.JButton btnNotepad;
    private javax.swing.JButton btnOpenMenu;
    private javax.swing.JButton btnPastTest;
    private javax.swing.JButton btnPomoTimer;
    private javax.swing.JButton btnPreviousPage;
    private javax.swing.JButton btnQuestionGen;
    private javax.swing.JButton btnStudyTools;
    private javax.swing.JButton btnUploadTest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackgroundWOMenu;
    private javax.swing.JLabel lblTestDisplay;
    private javax.swing.JScrollPane pnlScrollTest;
    // End of variables declaration//GEN-END:variables
}
