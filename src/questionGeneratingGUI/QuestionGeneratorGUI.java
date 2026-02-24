/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package questionGeneratingGUI;

import accountGUI.LoggedOutMainGUI;
import accountGUI.streakAccountGUI;
import accountGUI.accountSettingsGUI;
import java.text.DecimalFormat;
import pomodoroGUI.*;
import mainGUI.*;
import notepadGUI.*;
import testUploadGUI.*;
import pastTestGUI.*;

/**
 *
 * @author pamlee
 */
public class QuestionGeneratorGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(QuestionGeneratorGUI.class.getName());

    // Get the course input
    String courseCode = QuestionGenerator.getCourseCode();
    int courseUnit = QuestionGenerator.getCourseUnit();
    
    // Variables to help display the questions
    int questionNum = 1;
    String question = "";
    float answer = 0;
    
    // String answer for math solutions
    String strAnswer = "";
    
    DecimalFormat threeSigFig = new DecimalFormat ("#.00");
    DecimalFormat threeDecimals = new DecimalFormat ("0.000");
    DecimalFormat angleDigits = new DecimalFormat ("#.0");
    
    
    /**
     * Creates new form QuestionGeneratorGUI
     */
    public QuestionGeneratorGUI() {
        initComponents();
        questionNum = 1;
        
        // Making all the buttons appear as just text (app aesthetic)
        btnShowAnswer.setContentAreaFilled(false);
        btnShowAnswer.setFocusPainted(false);
        
        btnNext.setContentAreaFilled(false);
        btnNext.setFocusPainted(false);
        
        btnEndSession.setContentAreaFilled(false);
        btnEndSession.setFocusPainted(false);
        
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
        
        // Hiding the "open menu" button
        btnOpenMenu.setEnabled(false);
        btnOpenMenu.setVisible(false);
        
        // Ensures the answer box is empty
        txtAnswer.setText("");
        
        // switch case to see which course questions the user wants to do
        switch(courseCode)
        {
            // OOP - Instantiating questions as objects from each course
            case "MCR3U":
                MCR3U newQuestionM3U  = new MCR3U(courseUnit, questionNum);
                question = newQuestionM3U.getQuestion();
                strAnswer = newQuestionM3U.getAnswer();
                
                txtQuestion.setText(question);
                break;
            case "MHF4U":
                MHF4U newQuestionM4U  = new MHF4U(courseUnit, questionNum);
                question = newQuestionM4U.getQuestion();
                strAnswer = newQuestionM4U.getAnswer();
                
                txtQuestion.setText(question);
                break;
            case "SCH3U":
                SCH3U newQuestionC3U  = new SCH3U(courseUnit, questionNum);
                question = newQuestionC3U.getQuestion();
                strAnswer = newQuestionC3U.getAnswer();
                
                txtQuestion.setText(question);
                break;
            case "SPH3U":
                SPH3U newQuestionP3U  = new SPH3U(courseUnit, questionNum);
                question = newQuestionP3U.getQuestion();
                strAnswer = newQuestionP3U.getAnswer();
                
                txtQuestion.setText(question);
                break;
            case "SPH4U":
                SPH4U newQuestionP4U  = new SPH4U(courseUnit, questionNum);
                question = newQuestionP4U.getQuestion();
                answer = newQuestionP4U.getAnswer();
                
                txtQuestion.setText(question);
                break;
            default:
                // Error testing
                System.out.println("Something went wrong :(");
        }
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
        txtAnswer = new javax.swing.JTextField();
        btnEndSession = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnShowAnswer = new javax.swing.JButton();
        txtQuestion = new javax.swing.JTextArea();
        btnAccount = new javax.swing.JButton();
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

        txtAnswer.setEditable(false);
        txtAnswer.setBackground(new java.awt.Color(255, 255, 255));
        txtAnswer.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jPanel1.add(txtAnswer);
        txtAnswer.setBounds(548, 500, 430, 58);

        btnEndSession.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnEndSession.setForeground(new java.awt.Color(255, 117, 31));
        btnEndSession.setText("END SESSION");
        btnEndSession.setBorder(null);
        btnEndSession.setBorderPainted(false);
        btnEndSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndSessionActionPerformed(evt);
            }
        });
        jPanel1.add(btnEndSession);
        btnEndSession.setBounds(843, 633, 187, 55);

        btnNext.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 117, 31));
        btnNext.setText("NEXT");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(653, 633, 162, 55);

        btnShowAnswer.setBackground(new java.awt.Color(255, 117, 31));
        btnShowAnswer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnShowAnswer.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAnswer.setText("SHOW ANSWER");
        btnShowAnswer.setBorder(null);
        btnShowAnswer.setBorderPainted(false);
        btnShowAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAnswerActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowAnswer);
        btnShowAnswer.setBounds(992, 500, 149, 58);

        txtQuestion.setEditable(false);
        txtQuestion.setBackground(new java.awt.Color(255, 255, 255));
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        txtQuestion.setWrapStyleWord(true);
        jPanel1.add(txtQuestion);
        txtQuestion.setBounds(550, 200, 590, 290);

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
        btnQuestionGen.setForeground(new java.awt.Color(255, 0, 0));
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

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Question w menu.png"))); // NOI18N
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

        lblBackgroundWOMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Question wo menu.png"))); // NOI18N
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
        
        // Move buttons
        btnLogOut.setLocation(753, 18);
        btnLogOut.setSize(190, 54);
        
        var btnFont = btnEndSession.getFont();
        btnEndSession.setLocation(30, 175);
        btnEndSession.setFont(btnFont.deriveFont(19f));
        btnEndSession.setSize(187, 69);
        
        btnNext.setLocation(1022, 353);
        btnNext.setSize(130, 68);
        
        btnShowAnswer.setLocation(820, 571);
        btnShowAnswer.setFont(btnFont.deriveFont(18f));
        btnShowAnswer.setSize(180, 70);
        
        txtAnswer.setLocation(290, 570);
        txtAnswer.setSize(520, 70);
        
        var txtFont = txtQuestion.getFont();
        txtQuestion.setLocation(290, 210);
        txtQuestion.setFont(txtFont.deriveFont(34f));
        txtQuestion.setSize(710, 350);
    }//GEN-LAST:event_btnCloseMenuActionPerformed

    private void btnStudyToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudyToolsActionPerformed
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
        // Re-enables buttons to show buttons for the closed-menu; (app aesthetic)s
        lblBackground.setEnabled(true);
        lblBackground.setVisible(true);

        // Hide open menu button again
        btnOpenMenu.setEnabled(false);
        btnOpenMenu.setVisible(false);

        // Show the rest of the buttons again after opening the menu
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
        
        btnNotepad.setEnabled(true);
        btnNotepad.setVisible(true);

        btnUploadTest.setEnabled(true);
        btnUploadTest.setVisible(true);

        btnMyStreak.setEnabled(true);
        btnMyStreak.setVisible(true);

        // Move some buttons back in place
        btnLogOut.setLocation(100, 620);
        btnLogOut.setSize(180, 30);
        
        // Changing the font size after opening the menu --> Making it smaller
        var btnFont = btnEndSession.getFont();
        btnEndSession.setLocation(843, 633);
        btnEndSession.setFont(btnFont.deriveFont(18f));
        btnEndSession.setSize(187, 55);
        
        btnNext.setLocation(653, 633);
        btnNext.setSize(162, 55);
        
        btnShowAnswer.setLocation(992, 500);
        btnShowAnswer.setFont(btnFont.deriveFont(14f));
        btnShowAnswer.setSize(149, 58);
        
        txtAnswer.setLocation(548, 500);
        txtAnswer.setSize(430, 58);

        var txtFont = txtQuestion.getFont();
        txtQuestion.setLocation(550, 200);
        txtQuestion.setFont(txtFont.deriveFont(26f));
        txtQuestion.setSize(590, 290);
    }//GEN-LAST:event_btnOpenMenuActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // Clears the answer box
        txtAnswer.setText("");
        
        if(questionNum == 7)
        {
            questionNum = 1;
        }
        else
        {
            questionNum += 1;
        }
        System.out.println(questionNum);

        // "Generates" the next question --> Creates new question objects
        switch(courseCode)
        {
            // Instantiating questions as objects from each course
            case "MCR3U":
                MCR3U newQuestionM3U  = new MCR3U(courseUnit, questionNum);
                question = newQuestionM3U.getQuestion();
                strAnswer = newQuestionM3U.getAnswer();
                
                break;
            case "MHF4U":
                MHF4U newQuestionM4U  = new MHF4U(courseUnit, questionNum);
                question = newQuestionM4U.getQuestion();
                strAnswer = newQuestionM4U.getAnswer();
                
                break;
            case "SCH3U":
                SCH3U newQuestionC3U  = new SCH3U(courseUnit, questionNum);
                question = newQuestionC3U.getQuestion();
                strAnswer = newQuestionC3U.getAnswer();
                
                break;
            case "SPH3U":
                SPH3U newQuestionP3U  = new SPH3U(courseUnit, questionNum);
                question = newQuestionP3U.getQuestion();
                strAnswer = newQuestionP3U.getAnswer();
                
                break;
            case "SPH4U":
                SPH4U newQuestionP4U  = new SPH4U(courseUnit, questionNum);
                question = newQuestionP4U.getQuestion();
                answer = newQuestionP4U.getAnswer();
                
                break;
            default:
                //
        }

        txtQuestion.setText(question);
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnShowAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAnswerActionPerformed
        // Display the answer; different type based on the course
        // Physics 12U displays mathematical answers!
        switch(courseCode)
        {
            case "MCR3U":
                txtAnswer.setText(strAnswer);
                break;
            case "MHF4U":
                txtAnswer.setText(strAnswer);
                break;
            case "SCH3U":
                txtAnswer.setText(strAnswer);
                break;
            case "SPH3U":
                txtAnswer.setText(strAnswer);
                break;
            case "SPH4U":
                txtAnswer.setText(Float.toString(answer));
                break;
            default:
                // Error testing
                System.out.println("Something went wrong :(");
        }
    }//GEN-LAST:event_btnShowAnswerActionPerformed

    private void btnEndSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSessionActionPerformed
        questionNum = 1;
        QuestionGenerator questionGUI = new QuestionGenerator();
        
        questionGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEndSessionActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        btnSubmitmbus (introduced in btnSubmit6) is not available, stay with tbtnSubmitlt look and feel.
//         * For details see btnSubmitownload.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
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
        java.awt.EventQueue.invokeLater(() -> new QuestionGeneratorGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnCloseMenu;
    private javax.swing.JButton btnEndSession;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMyStreak;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNotepad;
    private javax.swing.JButton btnOpenMenu;
    private javax.swing.JButton btnPastTest;
    private javax.swing.JButton btnPomoTimer;
    private javax.swing.JButton btnQuestionGen;
    private javax.swing.JButton btnShowAnswer;
    private javax.swing.JButton btnStudyTools;
    private javax.swing.JButton btnUploadTest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackgroundWOMenu;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
