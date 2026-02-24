/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionGeneratingGUI;

import java.text.DecimalFormat;

/**
 *
 * @author pamlee
 */
// OOP - Inheritance
public class SPH4U extends Courses
{
    DecimalFormat threeSigFig = new DecimalFormat ("#.00");
    DecimalFormat threeDecimals = new DecimalFormat ("0.000");
    DecimalFormat fourDecimals = new DecimalFormat ("0.0000");
    DecimalFormat angleDigits = new DecimalFormat ("#.0");
    
    // \u00B2 unicode for squared symbol
    private int courseUnit;
    private int questionNum;
    
    private String question;
    
    // A variable to store the answer of each question
    private float correctAnswer;
    
    public SPH4U(int unit, int qNum)
    {
        questionNum = qNum;
        courseUnit = unit;
        
        // First attempt --> Didn't use a switch case :(
        // All questions in unit 1 and some in Unit 2 are actually "generated"!!
        
        // The rest of the units are just for the demo.
        // The rest of the units are also switch cases; this one is just the first try.
        if(courseUnit == 1)
        {
            switch(questionNum)
            {
                case 1:
                    float distance1Q1 = (float)Math.round(Math.random() * (50)*10);
                    distance1Q1 = distance1Q1/10;

                    float distance2Q1 = (float)Math.round(Math.random() * (9) *10);
                    distance2Q1 = distance2Q1/10;

                    question = "Meow #1 walks " + threeSigFig.format(distance1Q1) + "m[N] and turns to walk " + threeSigFig.format(distance2Q1) + 
                            "m[E]. What is the MAGNITUDE of Meow #1's DISPLACEMENT?";

                    double displacementQ1;

                    // Math method: Hypotenuse
                    displacementQ1 = Math.hypot(distance1Q1, distance2Q1);

                    // Ensures the answer is in 3 significant figures

                    if(displacementQ1 < 10)
                    {
                        correctAnswer = (float)(Math.round(displacementQ1*100))/100;
                    }
                    else
                    { 
                        correctAnswer = (float)(Math.round(displacementQ1*10))/10;
                    }
                    break;
                case 2:
                    // Random displacement from range 10m - 20m (inclusive)
                    float displacementQ2 = (float)Math.round((Math.random() * (20 - 10 + 1) + 10) * 10);
                    displacementQ2 = displacementQ2/10;

                    // Random sidewalk distance (smaller than displacement)
                    float sidewalkDistanceQ2 = (float)Math.round((Math.random() * (6 - 3 + 1) + 3) * 10);
                    sidewalkDistanceQ2 = sidewalkDistanceQ2/10;

                    question = "Meow #2 takes a shortcut and walks "+ Float.toString(displacementQ2)+ "km diagonally South of East. If one side of the sidewalk is "
                            + threeSigFig.format(sidewalkDistanceQ2) +"km[S] long, at what angle South of East did Meow #2 walk?";

                    // We are solving for angle South of East (ES), but we need to solve for the angle East of South (SE) first
                    int angleSE, angleES;
                    // Solves for the angle South of East and rounds it to the nearest degree
                    angleSE = (int)Math.round(Math.toDegrees((Math.acos(sidewalkDistanceQ2/displacementQ2))));

                    angleES = 90 - angleSE;

                    // All angles are rounded to the nearest whole number.
                    correctAnswer = (int)angleES;

                    // Debug
                    // System.out.println((int)correctAnswer);
                    break;
                case 3:
                    float distance1Q3, distance2Q3;

                    // Random distances
                    distance1Q3 = (float)Math.round((Math.random() * (80 - 50 + 1) + 50) * 10);
                    distance1Q3 = distance1Q3/10;
                    distance2Q3 = (float)Math.round((Math.random() * (70 - 30 + 1) + 30) * 10);
                    distance2Q3 = distance2Q3/10;

                    float timePassed;

                    // Random time up to 10s
                    timePassed = (float)Math.round(Math.random() * (10) * 10);
                    timePassed = timePassed/10;
                    double angle1, angle2;

                    // Random angles
                    angle1 = (int)Math.round(Math.random() * (50));
                    angle2 = (int)Math.round(Math.random() * (10));

                    question = "Meow #1 flies "+ Float.toString(distance1Q3)+"km[E"+ angleDigits.format(angle1) +"N], then flies for another " + Float.toString(distance2Q3) + "km[E" + angleDigits.format(angle2) +
                            "S]. If Meow #1 flew for " + threeSigFig.format(timePassed) + "hours in total, what was the MAGNITUDE of Meow #1’s Average Velocity?";

                    // Converting the angle to radians for the Math.cos and sin method
                    angle1 = Math.toRadians(angle1);
                    angle2 = Math.toRadians(angle2);

                    // Calculates the horizontal and vertical component of each distance travelled
                    double horizontalDis1Q3, verticalDis1Q3, horizontalDis2Q3, verticalDis2Q3;
                    horizontalDis1Q3 = distance1Q3 * Math.cos(angle1);
                    verticalDis1Q3 = distance1Q3 * Math.sin(angle1);

                    horizontalDis2Q3 = distance2Q3 * Math.cos(angle2);
                    // This distance goes southward, opposite to the Northward from distance 1.
                    verticalDis2Q3 = distance2Q3 * Math.sin(angle2) * -1;

                    // Calculates the horizontal and vertical component of the overal displacement
                    double horizontalDisplacementQ3, verticalDisplacementQ3;
                    horizontalDisplacementQ3 = horizontalDis1Q3 + horizontalDis2Q3;
                    verticalDisplacementQ3 = verticalDis1Q3 + verticalDis2Q3;

                    // Calculates total displacement with Hypotenuse method
                    double totalDisplacement;
                    totalDisplacement = Math.hypot(horizontalDisplacementQ3, verticalDisplacementQ3);

                    double averageVelocityQ3;
                    averageVelocityQ3 = totalDisplacement/timePassed;

                    // Rounds to 3 significant figures
                    if(averageVelocityQ3 < 10)
                    {
                        correctAnswer = (float)(Math.round(averageVelocityQ3*100))/100;
                    }
                    else
                    {
                        correctAnswer = (float)(Math.round(averageVelocityQ3*10))/10;
                    }

                    // System.out.println(correctAnswer);
                    break;
                case 4:
                    // Random acceleration from range 10m/s^2 - 12m/s^2 (inclusive)
                    float accelerationQ5 = Math.round((Math.random() * (12 - 10 + 1) + 10) * 10);
                    accelerationQ5 = accelerationQ5/10;

                    // Random time from range 3s - 5s (inclusive)
                    float timeQ5 = Math.round((Math.random() * (5 - 3 + 1) + 3) * 10);
                    timeQ5 = timeQ5/10;

                    // Random horizontal velocities from range 1m/s - 5m/s (inclusive) and 10m/s - 20m/s (inclusive)
                    float horizontalInitialQ5, horizontalFinalQ5;
                    horizontalInitialQ5 = Math.round((Math.random() * (5 - 1 + 1) + 1) * 10);
                    horizontalInitialQ5 = horizontalInitialQ5/10;

                    horizontalFinalQ5 = Math.round((Math.random() * (20 - 10 + 1) + 10) * 10);
                    horizontalFinalQ5 = horizontalFinalQ5/10;

                    question = "Meow #1 accelerates the Super MeowMobile for " + threeSigFig.format(timeQ5) + " seconds at"+ Float.toString(accelerationQ5) + "m/s^2 at an angle North of West. If the MeowMobile’s initial"
                            + "horizontal velocity was " + Float.toString(horizontalInitialQ5) +"m/s[E] and the final horizontal velocity was " + Float.toString(horizontalFinalQ5) +"m/s[W], at what angle North of West did Meow #1 accelerate?";

                    // calculating the change in velocity (a = v/t; v = at)
                    double deltaVelocityQ5;
                    deltaVelocityQ5 = accelerationQ5 * timeQ5;

                    // m/s [W] - m/s[E] = m/s [W] + m/s[W]
                    float horizontalVelocityQ5 = horizontalFinalQ5 + horizontalInitialQ5;

                    double angleWN;
                    angleWN = Math.acos(horizontalVelocityQ5/deltaVelocityQ5);
                    angleWN = Math.toDegrees(angleWN);

                    correctAnswer = (int)Math.round(angleWN);
                    // System.out.println((int)correctAnswer);

                    break;
                case 5:

                    // Random initial velocity from range 10m/s - 30m/s (inclusive)
                    float initialVelocityQ6;
                    initialVelocityQ6 = Math.round((Math.random() * (30 - 10 + 1) + 10) * 10);
                    initialVelocityQ6 = initialVelocityQ6/10;

                    double initialVerticalQ6;
                    initialVerticalQ6 = initialVelocityQ6 * Math.sin(Math.toRadians(45));

                    // Calculates a reasonable time for Meow #1 to catch it!
                    float timeCaughtQ6 = Math.round(initialVerticalQ6/4.9 * 10);
                    timeCaughtQ6 = timeCaughtQ6/10;

                    double angleAHQ6;

                    question = "Meow #2 throws some bread at an initial velocity of " + Float.toString(initialVelocityQ6) + "m/s[45° above the Horizontal] to Meow #1." + 
                            "If Meow #1 catches it in " + Float.toString(timeCaughtQ6) + " seconds at the same height Meow #2 threw it, how far from Meow #2 was Meow #1 standing?";

                    // Converting the angle to radians for the Math.cos method
                    angleAHQ6 = Math.toRadians(45);

                    // Solves for horizontal velocity by multiplying the initial velocity and the cosine of the angle
                    double horizontalVelocityQ6;
                    horizontalVelocityQ6 = initialVelocityQ6 * Math.cos(angleAHQ6);

                    // Calculates the horizontal range; in this case, it is how far Meow #1 is standing.
                    double rangeMeow1;
                    rangeMeow1 = horizontalVelocityQ6 * timeCaughtQ6;

                    // Ensures to round to 2 significant figures (63.6 --> 64)

                    if (rangeMeow1 < 10)
                    {
                        correctAnswer = (float)(Math.round(rangeMeow1*10))/10;
                    }
                    else
                    {
                        correctAnswer = (int)Math.round(rangeMeow1);
                    }

                    // System.out.println((int)correctAnswer);

                    break;
                case 6:
                    // Random angle from range 30 - 40 (inclusive)
                    double angleAHQ7;
                    angleAHQ7 = (int)Math.round(Math.random() * (45 - 30 + 1) + 30);

                    // Random initial velocity from range 20m/s - 30m/s (inclusive)
                    float initialVelocityQ7;
                    initialVelocityQ7 = Math.round((Math.random() * (30 - 20 + 1) + 20) * 10);
                    initialVelocityQ7 /= 10;

                    // The displacement would be -.
                    // Using the equation d = Vt + 1/2at^2, rearranging to solve for time would result in +.
                    float verticalDisplacementQ7 = Math.round((Math.random() * (9 - 5 + 1) + 5) * 10);
                    verticalDisplacementQ7 /= 10;

                    question = "Meow #1 drives the MeowMobile over a ramp and starts flying off the ramp at " + Float.toString(initialVelocityQ7) + "m/s[" + angleDigits.format(angleAHQ7) + "° above the Horizontal]."
                                + "If the MeowMobile lands " + threeSigFig.format(verticalDisplacementQ7) + "m lower than where it flew, what was the MeowMobile’s air time?";

                    // Converts the angle to radians for the Math.sin method to use
                    angleAHQ7 = Math.toRadians(angleAHQ7);

                    // Calculates vertical velocity ('y' component) of the initial velocity by multiplying 
                    // the value of theinitial velocity with the sin of the angle (sin(x))
                    double verticalVelocityQ7;
                    verticalVelocityQ7 = initialVelocityQ7 * Math.sin(angleAHQ7);

                    float accelerationQ7 = -9.8f;

                    double airTimeQ7;
                    // Acceleration divided by 2 due to the 1/2at^2 in the formula
                    airTimeQ7 = QuadraticFormula((accelerationQ7)/2, verticalVelocityQ7, verticalDisplacementQ7);

                    // Rounds to 3 significant figures
                    airTimeQ7 = Math.round(airTimeQ7*100);

                    correctAnswer = (float)(airTimeQ7/100);

                    // System.out.println(correctAnswer);
                    break;
                case 7:
                    float initialVelocityQ8;
                    initialVelocityQ8 = Math.round((Math.random() * (20 - 10 + 1) + 10) * 10);
                    initialVelocityQ8 /= 10;

                    double angleAHQ8;
                    angleAHQ8 = (int)Math.round(Math.random() * (70 - 60 + 1) + 60);

                    // The displacement would be -0.500m.
                    // Using the equation d = Vt + 1/2at^2, rearranging to solve for time would result in +0.500m.
                    float verticalDisplacementQ8 = Math.round(Math.random() * 10);
                    verticalDisplacementQ8 /= 10;

                    question = "Meow #1 launches a pancake into the air. The pancake’s initial velocity as it flies off the pan is " + Float.toString(initialVelocityQ8) + "m/s[" + angleDigits.format(angleAHQ8) + "° above the horizontal]." +
                                "How far away can Meow #2 stand to still catch the pancake? Assume Meow #2 catches the pancake "+ threeDecimals.format(verticalDisplacementQ8) +"m lower than the pan.";

                    // Converts the angle to radians in order to use sin and cos methods
                    angleAHQ8 = Math.toRadians(angleAHQ8);

                    // Calculates the horizontal / vertical components of the velocity
                    double horizontalVelocityQ8, verticalVelocityQ8;
                    horizontalVelocityQ8 = initialVelocityQ8 * Math.cos(angleAHQ8);
                    verticalVelocityQ8 = initialVelocityQ8 * Math.sin(angleAHQ8);

                    // Acceleration will be divided by 2 due to the 1/2at^2 in the formula
                    float accelerationQ8 = -9.8f;

                    // Solve for time using the Quadratic Formula
                    double airTimeQ8;
                    airTimeQ8 = QuadraticFormula((accelerationQ8)/2, verticalVelocityQ8, verticalDisplacementQ8);

                    // Solving for the range; the furthest horizontal distance Meow #2 can stand
                    double horizontalRangeQ8;
                    horizontalRangeQ8 = horizontalVelocityQ8 * airTimeQ8;

                    // Rounds to 3 digits (12.14 --> 12.1)
                    horizontalRangeQ8 = Math.round(horizontalRangeQ8*10);

                    correctAnswer = (float)(horizontalRangeQ8/10);

                    // System.out.println(correctAnswer);
                    break;
                default:
                    //
            }
        }
        else if(courseUnit == 2)
        {
            switch(questionNum)
            {
                case 1: 
                    float springConstantQ1 = Math.round((Math.random() * (450 - 300 + 1) + 300) * 10) / 10.0f;
                    float springCompressionQ1 = Math.round((Math.random() * (20 - 10 + 1) + 10) * 10) / 10f;
                    double massBulletQ1 = Math.round((Math.random() * (40 - 30 + 1) + 30)) / 1000.0;
                    double massBlockQ1 = Math.round((Math.random() * (10 - 5 + 1) + 5) * 10) / 10.0;

                    question = "A " + threeSigFig.format(massBlockQ1) + "kg block of wood is attached to a spring with k = " + threeSigFig.format(springConstantQ1) + 
                               " N/m. A " + fourDecimals.format(massBulletQ1) + "kg bullet is fired into the block, and the spring compresses " + 
                               threeSigFig.format(springCompressionQ1) + " cm. Calculate the speed of the bullet before the collision.";

                    // Calculate the velocity of the block+bullet system after impact
                    // Using 1/2(M+m)V^2 = 1/2kx^2  -->  V = sqrt( (k * x^2) / (M + m) )
                    double combinedMass = massBlockQ1 + massBulletQ1;
                    // Need to convert cm to m
                    double velocityAfterImpact = Math.sqrt((springConstantQ1 * Math.pow(springCompressionQ1/100, 2)) / combinedMass);

                    // Calculate the initial speed of the bullet (v) using Conservation of Momentum
                    // v = ((M + m)V) / m
                    double initialVelocityBullet;
                    initialVelocityBullet = (combinedMass * velocityAfterImpact) / massBulletQ1;

                    initialVelocityBullet = Math.round(initialVelocityBullet);
                    // Sig figs
                    correctAnswer = (int)initialVelocityBullet;

                    // System.out.println(correctAnswer);
                    break;
                case 2:
                    double massBulletQ2 = 8.0;
                    double initialVelocityQ2 = Math.round((Math.random() * (450 - 350) + 350)); 
                    double finalVelocityQ2 = Math.round((Math.random() * (150 - 50) + 50));
                    double timeQ2 = 0.0004;

                    question = "An " + threeSigFig.format(massBulletQ2) + " g bullet, moving at " + threeSigFig.format(initialVelocityQ2) + " m/s, goes through a stationary block of wood in "
                               + "4.0 x 10^-4 s, emerging at a speed of " + threeSigFig.format(finalVelocityQ2) + " m/s. How thick is the block of wood in cm?";

                    // Calculation: d = ((vi + vf)/2) * t
                    double thicknessMeters = ((initialVelocityQ2 + finalVelocityQ2) / 2.0) * timeQ2;
                    
                    // Convert to centimeters and round to 3 sig-figs
                    thicknessMeters = Math.round(thicknessMeters * 100);
                    
                    correctAnswer = (float)thicknessMeters/100;
                    break;
                case 3:
                    long massCar1Q3 = Math.round((Math.random() * (6.5 - 4) + 4)*1000);
                    long massCar2Q3 = Math.round((Math.random() * (5 - 3) + 3)*1000);
                    double velocity1Q3 = Math.round((Math.random() * (4 - 2) + 2) * 10) / 10.0;
                    double velocity2Q3 = (Math.round((Math.random() * (4 - 2) + 2) * 10) / 10.0);

                    question = "A loaded railway car of mass " + Long.toString(massCar1Q3) + " kg is rolling to the right at " + threeSigFig.format(velocity1Q3) + " m/s when it collides and couples with an "
                               + "empty freight car of mass " + Long.toString(massCar2Q3) + " kg, rolling to the left on the same pair of tracks at " + threeSigFig.format(velocity2Q3) + " m/s. What is the "
                               + "speed of the pair after the collision?";

                    // Calculating the final velocity
                    // Multiplying -1 for the velocity going left
                    double finalVelocityQ3 = ((massCar1Q3 * velocity1Q3) + (massCar2Q3 * (velocity2Q3 * -1))) / (massCar1Q3 + massCar2Q3);
                    correctAnswer = (float) (Math.round(Math.abs(finalVelocityQ3) * 100.0) / 100.0);
                    break;
            
// The rest of the questions from here on out are directly taken from our past tests!
// This will be great practice for students - Some of these tests are not uploaded on the past test system.
                case 4:
                    question = "A 0.20-kg model railroad car moving at a speed of 0.24 m/s is struck from behind by a 0.42-kg model "
                            + "locomotive moving along the same line with a speed of 0.52 m/s. If they stick together after the collision, what"
                            + "is their speed";
                    
                    correctAnswer = 0.43f;
                    break;
                case 5:
                    question = "A freight elevator with a total mass of 100.0 kg is moving downward at 3.00 m/s when the cable "
                            + "snaps. The car falls 4.00 m onto a huge spring with a spring constant of 8.000 x 10\u00B3 N/m. By "
                            + "how much will the spring be compressed when the elevator stops moving in meters?";
                    
                    correctAnswer = 1.18f;
                    break;
                case 6:
                    question = "A child’s toy shoots a rubber dart horizontally using a compressed spring with a force constant of "
                            + "3.5 x 10^2 N/m. The dart has a mass of mass 7.8 g and the spring is initially compressed 4.5 cm."
                            + "What is the elastic potential energy of the spring in joules?";
                    
                    correctAnswer = 0.35f;
                    break;
                case 7:
                    question = "A 0.30kg puck, intitally at rest on a horizontal, fricitonless surface, is struck by a 0.20kg puck initially"
                            + "moving with a velocity of 5.0m/s[W]. After the collision, the 0.20kg puck has a speed of 2.0m/s at an"
                            + "angle of [W 55 N]. Determine the speed of the 0.30kg puck after the collision.";
                    correctAnswer = 2.79f;
                    break;
                default:
                    //
                        
            }
        }
        else if(courseUnit == 3)
        {
            switch(questionNum)
            {
                case 1:
                    question = "Determine the elevation in kilometers above the surface of Uranus where the gravitational field strength "
                            + "is 1.0 N/kg, given that the mass of Uranus is 8.68 x 10^25 kg and its radius is 25,362 km.";
                    
                    correctAnswer = 51000f;
                    break;
                case 2:
                    question = "Three point charges are placed at the following points on the x-axis: +2.0 μC at x = 0, -3.0 μC "
                            + "at x = 40.0 cm, and -5.0 μC at x = 120.0 cm. Determine the magnitude of the force on the -3.0 μC charge.";
                    
                    correctAnswer = 0.55f;
                    break;
                case 3:
                    question = "A particle of unknown charge obtains 0.042 J of kinetic energy as it moves from point A to B. Point A has an"
                            + " electric potential of 700.0 V; and point B has an electric potential of 200.0 V. Determine the magnitude of the unknown charge.";
                    
                    correctAnswer = (float)(8.4 * Math.pow(10, -5));
                    break;
                case 4:
                    question = "A 0.25m long wire carries a current of 3.0 A through a uniform magnetic field of 0.20 T. The angle between the wire"
                            + " and the magnetic field is 90. Calculate the magnetic force acting on the wire.";
                    
                    correctAnswer = 0.15f;
                    break;
                case 5:
                    question = "A point charge of 3.0 x 10^-6 C is located in space. Another charge of 2.0 x 10^-6C is placed 0.50m away. Calculate "
                            + "the electric potential energy of the system.";
                    
                    correctAnswer = 0f;
                    break;
                case 6:
                    question = "2 parallel plates are positioned 0.0445m apart. If the electric potential difference between the 2 plates was measured to be 5.5 V,"
                            + "what is the electric field strength between the plates?";
                    
                    correctAnswer = (float)(-1.2 * 100);
                case 7:
                    question = "A particle with a charge of 8.4 x 10^-5 enters a uniform magnetic field of magnitude 0.15 T at a speed of 4.0 x 10^6 m/s. "
                            + "The radius of the circular path of the particle is 0.025 m. What is the mass of the particle?";
                    
                    correctAnswer = (float)(7.9 * Math.pow(10, -14));
                    break;
                default:
                    //
            }
        }
        else if(courseUnit == 4)
        {
            switch(questionNum)
            {
                case 1:
                    question = "Two point sources in a ripple tank vibrate in phase at a frequency of 18 Hz to produce waves of wavelength 0.8cm. What is the difference"
                            + " in path length (in cm) from two point sources to a point on the second nodal line?";
                    
                    correctAnswer = 1.2f;
                    break;
                case 2:
                    question = "If a wave with wavelength 0.0011m travels at a speed of 330 m/s, what is the frequency of the "
                            + " of the wave?";
                    
                    correctAnswer = (float)(3 * Math.pow(10, 5));
                    break;
                case 3:
                    question = "An interference pattern is set up by two point sources located 0.75cm apart, vibrating in phase. The distance from the right bisector to a "
                            + "point on the fifth nodal line, P , is 8.5 cm. The wavelength produced by the waves is 0.0011 m. What is the distance from"
                            + " Point P to the midpoint between the two sources?";
                    
                    correctAnswer = 0.13f;
                    break;
                case 4:
                    question = "An interference pattern is set up by two point sources located 0.75cm apart, vibrating in phase. If the wavelength of the"
                            + "produced waves is 0.0011m, what is the angle for the fifth nodal line?";
                    
                    correctAnswer = 41;
                    break;
                case 5:
                    question = "In a Double-Slit experiment, a setup produces an interference pattern using light of wavelength 550nm. The slits are separated "
                            + "by a distance of 0.25 mm, and the screen is placed at a distance of 2.7m from the slits. Determine the distance of the "
                            + "first bright fringe from the central maxima.";
                    
                    correctAnswer = (float)(5.9 * Math.pow(10, -3));
                    break;
                case 6:
                    question = "Two slits are 0.158 mm apart. A mixture of red light (wavelength = 665 nm) and "
                            + "yellow-green light wavelength = 565 nm) falls on the slits. A flat observation screen "
                            + "is located 2.24 m away. What is the distance on the screen between the third-order "
                            + "red fringe and the third-order yellow-green fringe?";
                    
                    correctAnswer = (float)(4.3/1000);
                    break;
                case 7:
                    question = "In a Young’s double-slit experiment the separation y between the second-order "
                            + "bright fringe and the central bright fringe on a flat screen is 0.0180 m when the light"
                            + " has a wavelength of 425 nm. Assume that the angles that locate the fringes on the "
                            + "screen are small enough so that sinθ ≈ tanθ. Find the separation y when the light "
                            + "has a wavelength of 585 nm.";
                    
                    correctAnswer = 0.0248f;
                    break;
                default:
                    //
            }
        }
        else if(courseUnit == 5)
        {
            //
        }
    }
    
    // Private method
    private double QuadraticFormula(float a, double b, float c)
    {
        // x = [-b +- sqrt(b^2 - 4ac)]/2a
        double squareRoot, numeratorPlus, numeratorMinus, denominator, positiveAnswer;
        
        squareRoot = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        
        numeratorPlus = (b * -1) + squareRoot;
        numeratorMinus = (b * -1) - squareRoot;
        denominator = 2*a;
        
        if(numeratorPlus/denominator > 0)
        {
            positiveAnswer = numeratorPlus/denominator;
        }
        
        // This condition is only for physics questions to determine range.
        // This ensures that this method returns the greater time (x) value.
        else if(numeratorPlus/denominator > 0 && numeratorMinus/denominator > 0)
        {
            if(numeratorPlus/denominator > numeratorMinus/denominator)
            {
                positiveAnswer = numeratorPlus/denominator;
            }
            else
            {
                positiveAnswer = numeratorMinus/denominator;
            }
        }
        else
        {
            positiveAnswer = numeratorMinus/denominator;
        }
        return positiveAnswer;
    }
    
    // Polymorphism + encapsulation
    // Encapsulation --> getter methods
    @Override
    public String getQuestion()
    {
        return question;
    }
    
    public float getAnswer()
    {
        return correctAnswer;
    }
}
