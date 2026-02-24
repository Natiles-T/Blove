/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionGeneratingGUI;

/**
 *
 * @author pamlee
 */
// OOP - Inheritance
public class MHF4U extends Courses
{
    private int courseUnit;
    private int questionNum;
    
    private String question;
    
    // A variable to store the answer of each question
    private String correctAnswer;
    
    // NOTE: Unfortunately, it is pretty much impossible to randomize numbers and have them work in questions in this course;
    // this part is just to show for a demo. HOWEVER, if you'd like to see geniunely generated questions,
    // please check the SPH4U class! Some questions there, namely unit 1 and 2, are actually generated and randomized.
    
    public MHF4U(int unit, int qNum)
    {
        questionNum = qNum;
        courseUnit = unit;
        // Some unicode: \u2074 or 75 exponent of 4/5, \u00B2 or B3 exponent 2/3
        // \u2208 - Element of, \u2260 - pi, \u211D real numbers
        // \u2265 greater than or equal , \u2264 less than or equal, \u221E infinity
        
        // Switch case to sort questions based on the unit the user chooses
        switch(courseUnit)
        {
            // Unit 1 questions
            case 1:
                switch(questionNum)
                {
                    case 1:
                        System.out.println("U1 Q1");
                        
                        question = "1A - For the function g(x) = ax\u2075 + 5x\u00B3 - 8x\u00B2 + 9, determine the value of the leading coefficient given that the "
                                + "constant finite difference is -144.";
                        
                        correctAnswer = "-6/5";
                        break;
                    case 2:
                        question = "1A - The Adam's Family are driving Wednesday to school in their historic customized vehicle. The distance travelled by their"
                                + " vehicle, d in kilometers, relative to the time frmo the start of their journey, t in hours, can be modelled by the function: "
                                + "d(t) = (1/300)t\u2074 + (3/25)t\u00B3 + (2/5)t. Determine the average rate of change of the distance travelled during the first "
                                + "15 hours of their drive.";
                        
                        correctAnswer = "38.65 km/h";
                        break;
                    case 3:
                        question = "1A - Determine an equation for the quartic function with the zeroes at -2 (order 2), 3 (order 1) and -5 (order 1), and f(0) = 10";
                        
                        correctAnswer = "y = (-1/6)(x+2)\u00B2(x-3)(x+5)";
                        break;
                    case 4:
                        question = "1B - Another way of writing log\u209A 7 = k is?";
                        
                        correctAnswer = "P\u1D4F = 7";
                        break;
                    case 5:
                        question = "1B - The function y = -4log(x - 5) + 2 has an asymptote at: ";
                        
                        correctAnswer = "x = 5";
                        break;
                    case 6:
                        question = "1B - Determine the exact value of the trigonometric expression: [sec(5\u03C0/3)][cot(5\u03C0/6)] / [csc(7\u03C0/3)]";
                        
                        correctAnswer = "-3";
                        break;
                    case 7:
                        question = "1B - State the domain and range of y = cotx";
                        
                        correctAnswer = "D: {x \u2208 \u211D | x \u2260 \u03C0k, k \u2208 \u2124 } R: {y \u2208 \u211D}";
                        break;
                    default:
                        // error testing
                }
                break;
            
            // Unit 2 questions
            case 2:
                switch(questionNum)
                {
                    case 1:
                        question = "2A - What is the remainder when x\u2074 - 2x\u00B3 + 4x - 1 is divided by x - 2?";
                        
                        correctAnswer = "R = 7";
                        break;
                    case 2:
                        question = "2A - Solve 2x\u00B3 - x\u00B2 - 7x + 6 \u2265 0.";
                        
                        correctAnswer = "x \u2208 [-2, 1]U[(3/2), \u221E), x \u2208 \u211D";
                        break;
                    case 3:
                        question = "2A - Using a proper mathematical method, determine if g(x) = 5x(x\u00B2 - 4)(x\u00B2 - 1) is even, odd, or neither.";
                        
                        correctAnswer = "g(x) is an ODD function.";
                        break;
                    case 4:
                        question = "2A - A quartic polynomial, p(x) has the following properties: x-1 is a factor and x+2 is a factor, and when p(x) is divided "
                                + "by x-3, the remainder is 30. Additionally, p(x) has a double root at x=0. Determine the specific equation of p(x).";
                        
                        correctAnswer = "p(x) = (1/3)x\u00B2(x-1)(x+2)";
                        break;
                    case 5:
                        question = "2B - Write 4log2 + log6 - log3 as a single logarithm.";
                        
                        correctAnswer = "log32";
                        break;
                    case 6:
                        question = "2B - Express the following as a single trigonometric expression, sin(\u03C0/4)cos(\u03C0/6) - cos(\u03C0/4)sin(\u03C0/6)";
                        
                        correctAnswer = "sin(\u03C0/12)";
                        break;
                    case 7:
                        question = "2B - Rewrite the following as a single logarithm: log(x\u00B3 + 2x\u00B2 - 9x - 18) - log(5x + 10). State restrictions if necessary.";
                        
                        correctAnswer = "log[(x-3)(x+3) / 5], x > 3";
                        break;
                    default:
                        //
                }
                break;
            case 3:
                switch(questionNum)
                {
                    case 1:
                        question = "3A - Solve: (2x+3)/(x\u00B2 + 5x + 6) = x/(x+3) - (x+4)/(x\u00B2 + 6x + 8)";
                        
                        correctAnswer = "x = 3, -2 and 4 are EXTRANEOUS.";
                        break;
                    case 2:
                        question = "3A - Solve: 3sin(2x) + 2 = (1/2), 0 \u2264 x \u2264 2\u03C0";
                        
                        correctAnswer = "x = 7\u03C0/12, 11\u03C0/12, 19\u03C0/12, 23\u03C0/12";
                        break;
                    case 3:
                        question = "3A - Solve: log(x+5) - (1/2)log(3x+15) = log(1)";
                        
                        correctAnswer = "x = -2, -5 is EXTRANEOUS.";
                        break;
                    case 4:
                        question = "3B - State the domain of the following rational function in INTERVAL notation: a(x) = (-x+3)/(2x+5)";
                        
                        correctAnswer = "x \u2208 (-\u221E, (-5/2))U((-5/2), \u221E), x \u2208 \u211D";
                        break;
                    case 5:
                        question = "3B - Determine the range for the following recipricol function: b(x) = 7 / (x\u00B2 + 5x - 6)";
                        
                        correctAnswer = "b(x) \u2208 (-\u221E, (-4/7)] OR (0, \u221E), b(x) \u2208 \u211D";
                        break;
                    case 6:
                        question = "3B - Determine the equation for the Horizontal asymptote for the following: d(x) = -2/(x\u00B2 - 6x + 9)";
                        
                        correctAnswer = "y = 0";
                        break;
                    case 7:
                        question = "3B - Determine the x-intercept (as an ordered pair) for the following: e(x) = x\u00B3/(x+3)(2x-1)(x-4)";
                        
                        correctAnswer = "(0, 0)";
                        break;
                    default:
                        //
                }
                break;
            case 4:
                switch(questionNum)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
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
