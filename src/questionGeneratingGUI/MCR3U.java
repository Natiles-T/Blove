/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionGeneratingGUI;

/**
 *
 * @author pamlee
 */

// Class specifically for grade 11 functions questions
public class MCR3U extends Courses
{
    private int courseUnit;
    private int questionNum;
    
    private String question;
    
    // A variable to store the answer of each question
    private String correctAnswer;
    
    // NOTE: Unfortunately, it is pretty much impossible to randomize numbers and have them work in questions in this course;
    // this part is just to show for a demo. HOWEVER, if you'd like to see geniunely generated questions,
    // please check the SPH4U class! Some questions there, namely unit 1 and 2, are actually generated and randomized.
    
    public MCR3U(int unit, int qNum)
    {
        questionNum = qNum;
        courseUnit = unit;
        // \u221A squareroot symbol , \u207A exponent + , \u207B exponent -
        // \u2208 \u211D e R (Domain/Range)
        // rest of the symbols are noted in MHF4U
        
        // Switch case to sort questions based on the unit the user chooses
        switch(courseUnit)
        {
            case 1:
                switch(questionNum)
                {
                    case 1:
                        question = "1A - Rewrite the equation, y = -3\u00B2 + 5x + 6, in vertex form by completing the square. (* Your answer "
                                + "should not include decimals.)";
                        
                        correctAnswer = "-3[x-(5/6)]\u00B2 + 97/12";
                        break;
                    case 2:
                        question = "1A - Fully factor the following: 7(2x+3)\u00B3 - 78(2x+3)\u00B2 + 11(2x+3)";
                        
                        correctAnswer = "4(2x+3)(x-4)(7x+10)";
                        break;
                    case 3:
                        question = "1A - Solve the following equation using an appropriate method: (2n-3)\u00B2 = 9n\u00B2";
                        
                        correctAnswer = "n = -3, (3/5)";
                        break;
                    case 4:
                        question = "1B - EXPAND AND SIMPLIFY: (2\u221A3 - 4\u221A5)(4\u221A3 + 5\u221A3)";
                        
                        correctAnswer = "54 - 36\u221A15";
                        break;
                    case 5:
                        question = "1B - SOLVE the following exponential equation: (1/125)\u207B\u02B7\u207A\u2075 = 5\u00B2\u02B7";
                        
                        correctAnswer = "w = (15/7)";
                        break;
                    case 6:
                        question = "1B - SIMPLIFY the following. Do not state restrictions. (3x\u00B2+3x+1)/(3x\u00B2-5x-2) / "
                                + "(x\u00B2-2x-3)/(-5x\u00B2+25x-30)";
                        
                        correctAnswer = "-5";
                        break;
                    case 7:
                        question = "1B - Solve the following: 6\u02E3\u207A\u00B2 + 6\u02E3\u207A\u00B3 = 42";
                        
                        correctAnswer = "x = -1";
                        break;
                    default:
                        // Unit 1 has too many topics, so I just included the first 2 for demo purposes.
                }
                break;
            case 2:
                switch(questionNum)
                {
                    case 1:
                        question = "2A - State the domain of the following: h(x) = (1/4)(-3(x+4))\u00B2 + 1";
                        
                        correctAnswer = "{x | x \u2208 \u211D}";
                        break;
                    case 2:
                        question = "2A - State the range of the following: k(x) = (1/4)\u221A[-3(x+4)] + 1";
                        
                        correctAnswer = "{y | y \u2208 \u211D, y \u2265 1}";
                        break;
                    case 3:
                        question = "2A - State the vertical asymptote of the following: m(x) = (1/4)[1/(-3(x+4))] + 1";
                        
                        correctAnswer = "x = -4";
                        break;
                    case 4:
                        question = "2B - State the range for the following: t(x) = -4cos(2x) + 3";
                        
                        correctAnswer = "{y | y \u2208 \u211D, -1 \u2264 y \u2264 7}";
                        break;
                    case 5:
                        question = "2B - An exponential function has an asymptote of y=2, a y-intercept of -1, and goes through the point "
                                + "(1, -10). Determine the equation of the exponential equation.";
                        
                        correctAnswer = "f(x) = -3(4)\u02E3 + 2";
                        break;
                    case 6:
                        question = "2B - For f(Θ) = 2sin(3Θ - 60°)+1, write the mapping notation that would transform cosΘ to f(Θ).";
                        
                        correctAnswer = "(x,y) --> (x/3 + 20, 2y + 1)";
                        break;
                    case 7:
                        question = "Write a cosine function given the following: Amplitude of 1/3, period of 1440° and a maximum of (1080°, 5/3) and no reflection "
                                + "across the x-axis.";
                        
                        correctAnswer = "f(x) = (1/3)cos[1/4(x+360°)] + (4/3)";
                        break;
                    default:
                        //
                }
                break;
            case 3:
                switch(questionNum)
                {
                    case 1:
                        question = "Bavi throws a disc into the air. The height of the disc can be modelled by the function, h(t) = -5t\u00B2 + 31.5t + 2, where "
                                + "h(t) is the height in meters after t seconds. Harkomal fires a paintball at the disc. The path of the paintball is: g(t) = 30t + 1. "
                                + "How hight off the ground will the disc be when it is hit?";
                        
                        correctAnswer = "19.6m off the ground";
                        break;
                    case 2:
                        question = "A certain species of fish in finland doubles in population every 4 years. The population will be 16000 in the year "
                                + "2035. What is its population in 2025?";
                        
                        correctAnswer = "~2828 fish";
                        break;
                    case 3:
                        question = "You take out a mortgage with a bank to purchase a townhome worth $680000. The bank charges an interest of 6.12% compounded monthly. "
                                + "You pay a down payment of $46000. What is the value of your mortgage?";
                        
                        correctAnswer = "$634000";
                        break;
                    case 4:
                        question = "You take out a mortgage with a bank to purchase a townhome worth $680000. The bank charges an interest of 6.12% compounded monthly. "
                                + "You pay a down payment of $46000. Calculate the monthly payments you will make based on a 20-year amortization period.";
                        
                        correctAnswer = "~$4586.17";
                        break;
                    case 5:
                        question = "You take out a mortgage with a bank to purchase a townhome worth $680000. The bank charges an interest of 6.12% compounded monthly. "
                                + "You pay a down payment of $46000, and you've already calcualted that your monthly payment based on a 20-year amotization period will be ~$4586.17. "
                                + "Your mortgage will renew after 5 years. How much will you owe on the mortgage at the end of the 5-year term?";
                        
                        correctAnswer = "~$539325.00";
                        break;
                    case 6:
                        question = "After 5 years, you owe ~$539325.00 on your mortgage. Your mortgage renews at a lower interest rate of 5.85% compounded monthly, but the amortization period "
                                + "stays the same. What is your NEW monthly payment?";
                        
                        correctAnswer = "~$4507.54";
                        break;
                    case 7:
                        question = "Given the function, d(t) = 4sin[1440(x-0.0625)] + 6, determine the value of d(t) when t = 2.4 seconds. Round to the nearest hundredth.";
                        
                        correctAnswer = "9.24";
                        break;
                    default:
                        //
                }
                break;
            default:
                //
        }
    }
    
    // Polymorphism + encapsulation
    @Override
    public String getQuestion()
    {
        return question;
    }
    
    public String getAnswer()
    {
        return correctAnswer;
    }
}
