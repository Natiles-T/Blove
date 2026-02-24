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
public class SPH3U extends Courses
{
    private int courseUnit;
    private int questionNum;
    
    private String question;
    
    // A variable to store the answer of each question
    private String correctAnswer;
    
    // NOTE: Unfortunately, it is pretty much impossible to randomize numbers and have them work in questions in this course;
    // this part is just to show for a demo. HOWEVER, if you'd like to see geniunely generated questions,
    // please check the SPH4U class! Some questions there, namely unit 1 and 2, are actually generated and randomized.
    
    public SPH3U(int unit, int qNum)
    {
        questionNum = qNum;
        courseUnit = unit;
        
        // Switch case to sort questions based on the unit the user chooses
        switch(courseUnit)
        {
            case 1:
                switch(questionNum)
                {
                    case 1:
                        question = "A skateboarder moves at a speed of 12.1m/s. What is his speed in km/h?";
                        
                        correctAnswer = "43.6km/h";
                        break;
                    case 2:
                        question = "If the final velocity of an object is to the west, and the initial velocity is to the east, what is the direction "
                                + "of the average acceleration?";
                        
                        correctAnswer = "West";
                        break;
                    case 3:
                        question = "A delivery truck travels 95m[S], then 110m[E] in 45 seconds in order to reach its destination. "
                                + "Determine the truck's average velocity during this time.";
                        
                        correctAnswer = "3.3m/s[S49E]";
                        break;
                    case 4:
                        question = "A car is traveling at 20.0m/s when a driver sees a red light 150m ahead. The driver applies the brakes, "
                                + "causing the car to slow down at a constant acceleration of 2.5m/s\u00B2. How many seconds does it take for the car to "
                                + "come to a stop?";
                        
                        correctAnswer = "8 seconds";
                        break;
                    case 5:
                        question = "A car is traveling at 20.0m/s when a driver sees a red light 150m ahead. The driver applies the brakes, "
                                + "causing the car to slow down at a constant acceleration of 2.5m/s\u00B2. It takes 8 seconds to stop. How far ahead from the"
                                + " red light does it stop?";
                        
                        correctAnswer = "70m ahead";
                        break;
                    case 6:
                        question = "An electric scooter rider starts from rest and accelerates at 2.0m/s\u00B2 for 4.0s before reaching maximum speed. The rider then continues "
                                + "at this constant speed for 10.0s before braking at -3.0m/s\u00B2 until coming to a stop. How far does the rider travel during the entire trip?";
                        
                        correctAnswer = "106.67m";
                        break;
                    case 7:
                        question = "A snowboarder launches off a ramp with an intital speed of 12.0m/s at an angle of 25.0 above the horizontal. The landing area "
                                + "is 3.0m below the takeoff point. What is the maximum height reached by the snowboarder, relative to the starting point?";
                        
                        correctAnswer = "1.3m";
                        break;
                    default:
                        //
                }
                break;
            case 2:
                switch(questionNum)
                {
                    case 1:
                        question = "What is the name of the property of matter which makes it resist changes to its motion? ";
                        
                        correctAnswer = "Inertia";
                        break;
                    case 2:
                        question = "In order to swim in a pool of water, we need to push the water backwards, which propels us forward. Which of Newton's Laws does this demonstrate?";
                        
                        correctAnswer = "Newton's 3rd law.";
                        break;
                    case 3:
                        question = "A net force of 30N is exerted on an object which is initally at rest. If the object reaches a final speed "
                                + "of 10m/s after 3 seconds, what is the mass of the object?";
                        
                        correctAnswer = "9kg";
                        break;
                    case 4:
                        question = "A 55kg student is trying to measure their weight, but their friend tricks them by placing the scale inside of an accelerating elevator. The "
                                + "scale reading shows that their weight is 46kg. What is the acceleration of the elevator?";
                        
                        correctAnswer = "1.60m/s\u00B2[down]";
                        break;
                    case 5:
                        question = "Two friends are trying to push a 76kg piece of furniture across a living room. The second friend pulls the furniture upwards instead of sideways with a force of 210N. "
                                + "If the coefficient of friction is 0.45, what minimum amount of force will the first friend need to apply in order to get the furniture "
                                + "to move?";
                        
                        correctAnswer = "2.4 x 10\u00B2N";
                        break;
                    case 6:
                        question = "A racing car has a mass of 1500kg, and is able to reach a speed of 31m/s in 2.5s from rest. Determine the driving force required if the "
                                + "coefficient of kinetic friction is 0.90.";
                        
                        correctAnswer = "31830N";
                        break;
                    case 7:
                        question = "Smaller mass m = 2.0kg is sitting ontop of a larger mass M = 5.0kg. The coefficient of kinetic friction between mass M and the ground is 0.30. The "
                                + "coefficient of static friction between the 2 masses is 0.55. What is the maximum amount of force that could be applied to the larger mass without the smaller "
                                + "mass sliding off of the larger one?";
                        
                        correctAnswer = "58.31N";
                        break;
                    default:
                        //
                }
                break;
            case 3:
                switch(questionNum)
                {
                    case 1:
                        question = "If the speed of a car is doubled, how much more kinetic energy does it have? ";
                        
                        correctAnswer = "4x";
                        break;
                    case 2:
                        question = "What does kilowwatt-hours (kWh) measure?";
                        
                        correctAnswer = "Energy";
                        break;
                    case 3:
                        question = "What process is used to generate electricity in a nuclear power plant?";
                        
                        correctAnswer = "Nuclear Fission";
                        break;
                    case 4:
                        question = "Which of the following types of radiation is LEAST likely to penetrate human skin: Gamma, Alpha, Beta-Negative";
                        
                        correctAnswer = "Alpha";
                        break;
                    case 5:
                        question = "What is the average kinetic energy of atoms withint a given substance measured by?";
                        
                        correctAnswer = "Temperature";
                        break;
                    case 6:
                        question = "A 72kg runner accelerates from 3.0m/s to 11m/s in 4.5 seconds. Calculate the runner's power output.";
                        
                        correctAnswer = "896W";
                        break;
                    case 7:
                        question = "A 0.20kg piece of aluminum at 375°C is placed in 300mL of water at 15.0°C to be cooled quickly. Determine the final "
                                + "temperature (in °C) of the aluminum-water mixture.";
                        
                        correctAnswer = "61.06°C";
                        break;
                    default:
                        //
                }
                break;
            case 4:
                switch(questionNum)
                {
                    case 1:
                        question = "What does the slope of a voltage vs. current graph for a given load tell you the value of?";
                        
                        correctAnswer = "Resistance";
                        break;
                    case 2:
                        question = "How long does it take for a curren tof 9.3mA to transfer 1.25 x 10\u00B2\u2070 through a given point in the wire?";
                        
                        correctAnswer = "2150s";
                        break;
                    case 3:
                        question = "A conducting wire with current flowing out of the page is surrounded by an external magnetic field which points from left to right "
                                + "across the page. What is the direction ofthe magenetic force exerted on the wire?";
                        
                        correctAnswer = "Up";
                        break;
                    case 4:
                        question = "A transformer is applied toa primary circuit which results in a smaller induced current in the secondary circuit. Which circuit contains the greater "
                                + "number of loop windings?";
                        
                        correctAnswer = "Secondary Circuit";
                        break;
                    case 5:
                        question = "Two straight parallel wires separated by a small distance have equal currents flowing in opposite directions. Each wire produces a magenetic field which then "
                                + "exerts a force on the other wire. What will happen to the system of wires?";
                        
                        correctAnswer = "The wires will repel";
                        break;
                    case 6:
                        question = "A parallel circuit has three identical resistors R₁, R₂, R₃. If the value of R₂ is tripled (while the other 2 remain the same), how much greater is the equivalent "
                                + "resistance compared to the original circuit?";
                        
                        correctAnswer = "28.57% Greater";
                        break;
                    case 7:
                        question = "A power plant operating at 25.0 kV transmits a current of 20.0 kA. If the resistance in the transmission wire is 0.20Ω, what percentage of power is "
                                + "lost in the transmission line?";
                        
                        correctAnswer = "16%";
                        break;
                    default:
                        //
                }
                break;
            case 5:
                switch(questionNum)
                {
                    case 1:
                        question = "What happens to the speed of a wave on a string if you increase the tension in the string by a factor of 4, while "
                                + "keeping every other variable the same?";
                        
                        correctAnswer = "Increases x2";
                        break;
                    case 2:
                        question = "Sound waves with frequencies above the normal human hearing range are reffered to as?";
                        
                        correctAnswer = "Ultrasonic";
                        break;
                    case 3:
                        question = "A sound detector picks up two distinct sound waves in short succession. The first sound registers at 70dB, the second sound "
                                + "at 90dB. How many times louder is the second sound compared to the first?";
                        
                        correctAnswer = "100";
                        break;
                    case 4:
                        question = "A tour guide shouts across a canyon. At a temperature of 20°C, her echo is heard 2.00s later. How wide is the canon?";
                        
                        correctAnswer = "343.52m";
                        break;
                    case 5:
                        question = "If a 2.5m long string on a wave machine has tension of 240N, and the wave speed is 300m/s, what is the total mass of the string, in grams?";
                        
                        correctAnswer = "6.67g";
                        break;
                    case 6:
                        question = "A guitar string is tightened so that it resonates at its second harmonic frequency of 600Hz. The guitar string is 0.56m in length. Calculate "
                                + "the speed of the waves in the string.";
                        
                        correctAnswer = "336m/s";
                        break;
                    case 7:
                        question = "A police car is travelling at 24m/s is chasing after a suspect who is trying to run away at 7.0m/s. The police siren is emitting a sound at a "
                                + "frequency of 450Hz. The air temperature is 10°C. What will be the observed frequency of the siren from the point of view of the suspect?";
                        
                        correctAnswer = "474.41Hz";
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
