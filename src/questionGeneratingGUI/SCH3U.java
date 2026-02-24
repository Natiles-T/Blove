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
public class SCH3U extends Courses
{
    private int courseUnit;
    private int questionNum;
    
    private String question;
    
    // A variable to store the answer of each question
    private String correctAnswer;
    
    // NOTE: Unfortunately, it is pretty much impossible to randomize numbers and have them work in questions in this course;
    // this part is just to show for a demo. HOWEVER, if you'd like to see geniunely generated questions,
    // please check the SPH4U class! Some questions there, namely unit 1 and 2, are actually generated and randomized.
    
    public SCH3U(int unit, int qNum)
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
                        question = "1A - Jillium (Ji), another hypothetical element, has 3 isotopes and an average atomic mass of 300amu [(Ji-324, 0.56%), (Ji-?, 82.58%), (Ji-342, ?%)]. "
                                + "Determine the mass number of the unknown isotope to 2 decimal places.";
                        
                        correctAnswer = "291.26amu";
                        break;
                    case 2:
                        question = "1A - Within the molecule P₂F₄, where do most electrons spend most of their time in the bond between phosphorus and fluorine?";
                        
                        correctAnswer = "Fluorine";
                        break;
                    case 3:
                        question = "1A - Given these 3 ions that are isoelectronic to Argon: K\u207A, S\u00B2\u207B, Cl\u207B, list them in order of "
                                + "decreasing ionic radius. Include argon in your list.";
                        
                        correctAnswer = "S\u00B2\u207B > Cl\u207B > Ar > K\u207A";
                        break;
                    case 4:
                        question = "1B - Which of the following compounds is the least soluble in water?: Methanol, CH₃OH, Hexane, C₆H₁₄, or Diethyl ether, (CH₃CH₂)₂O";
                        
                        correctAnswer = "Hexane - Non-Polar.";
                        break;
                    case 5:
                        question = "1B - In the compound CH₃COOH, what is the strongest Intermolecular Force present?";
                        
                        correctAnswer = "Hydrogen Bonding (H-Bond)";
                        break;
                    case 6:
                        question = "1B - How many electrons are in the Lewis Structure of a perbromate ion, BrO₄\u207A?";
                        
                        correctAnswer = "32 electrons";
                        break;
                    case 7:
                        question = "1B - What shape best describes the compound: CH₂Cl₂?";
                        
                        correctAnswer = "Tetrahedral";
                        break;
                    default:
                        //
                }
                break;
            case 2:
                switch(questionNum)
                {
                    case 1:
                        question = "Name the chemical formula: Cobalt(II) chloride dihydrate";
                        
                        correctAnswer = "CoCl₂ • 2H₂O";
                        break;
                    case 2:
                        question = "Name the compound: FePO₄• 4H₂O";
                        
                        correctAnswer = "Iron(III) phosphate tetrahydrate";
                        break;
                    case 3:
                        question = "Name the chemical formula: Lead(IV) Acetate";
                        
                        correctAnswer = "Pb(CH₃COO)₄";
                        break;
                    case 4:
                        question = "Name the compound: Ca(IO)₂";
                        
                        correctAnswer = "Calcium hypoiodite";
                        break;
                    case 5:
                        question = "Name the chemical formula: Barium hydrogen sulfate";
                        
                        correctAnswer = "Ba(HSO₄)₂";
                        break;
                    case 6:
                        question = "Name the compound: KH₂PO₃";
                        
                        correctAnswer = "Potassium Dihydrogen Phosphate";
                        break;
                    case 7:
                        question = "Name the chemical formula: Perchloric Acid";
                        
                        correctAnswer = "HClO₄(aq)";
                        break;
                    default:
                        //
                }
                break;
            case 3:
                switch(questionNum)
                {
                    case 1:
                        question = "3A - Ascorbic Acid, C₆H₈O₆, also known as Vitamin C is essential for the growth and repair of tissues in the body. If 4 bottles "
                                + "of pure Vitamin C contain 5.801 x 10²⁶ carbon atoms, what is the mass of Vitamin C in EACH bottle?";
                        
                        correctAnswer = "7071g";
                        break;
                    case 2:
                        question = "3A - What is the empirical formula for C₈H₁₀?";
                        
                        correctAnswer = "C₄H₅";
                        break;
                    case 3:
                        question = "3A - An alien hydrate containing Jillium perphosphate (Ji₃PO₅) with a molar mass of 361.89g/mol has been found! After heating the 6.982g of "
                                + "HYDRATED Jillium perphosphate crystals, 4.65g of anhydrous jillium perphosphate was collected. Determine the formula for the hydrate.";
                        
                        correctAnswer = "Ji₃PO₅ • 10H₂O";
                        break;
                    case 4:
                        question = "3B - At a water treatment facility, a solution containing 480. g of calcium hydroxide (Ca(OH)₂), also known as slaked lime, is added to a batch of contaminated "
                                + "water to neutralize the sulturfic acid (H₂SO₄). Calculate the mass of sulfuric acid that can be neutralized with this amount of calcium hydroxide.";
                        
                        correctAnswer = "635g";
                        break;
                    case 5:
                        question = "3B - Given the reaction: 6FeCl₃ + H₂O₂ + 2H₂O --> 6FeCl₂ + 2O₂ + 6HCl, identify the limiting reagent if 40.0g of FeCl₃, 7.0g of H₂O₂, and 30.0g of H₂O mix.";
                        
                        correctAnswer = "FeCl₃ (0.0411mol)";
                        break;
                    case 6:
                        question = "3B - Given the reaction: 6FeCl₃ + H₂O₂ + 2H₂O --> 6FeCl₂ + 2O₂ + 6HCl, how much excess H₂O₂ was left over after the reaction took place?";
                        
                        correctAnswer = "5.6g";
                        break;
                    case 7:
                        question = "3B - In a precipitation reaction, the theoretical mass of the precipitate is 1.62g. After filtering and drying the precipitate, the mass ofthe filter paper is "
                                + "0.85g, and the mass of the filter paper and dry precipitate is 2.42g. What is the percentage yield of the reaction?";
                        
                        correctAnswer = "96.9%";
                        break;
                    default:
                        //
                }
                break;
            case 4:
                switch(questionNum)
                {
                    case 1:
                        question = "Menthyl mercury (CH₃Hg\u207A) is an organometallic cation that is one of the most toxic forms of mercury. A Northern Pike (fish) has a mass of "
                                + "4.3kg and a concentration of 100. ppb CH₃Hg in its tissue. Calculate the total mass of menthyl mercury (in grams) in the fish.";
                        
                        correctAnswer = "4.3 x 10\u207B\u2074";
                        break;
                    case 2:
                        question = "What volume of 6.00% (v/v) H₂SO₄ is required to obtain 15mL of pure sulfuric acid?";
                        
                        correctAnswer = "2.5 x 10\u00B2";
                        break;
                    case 3:
                        question = "A solution of potassium sulfate, K₂SO₄(aq), is mixed with a solution of lead(II) nitrate, Pb(NO₃)₂(aq). What are the spectator ions in this reaction?";
                        
                        correctAnswer = "K\u207A(aq) & NO₃\u207B";
                        break;
                    case 4:
                        question = "What volume (in mL) of 0.25 mol/L (NH₄)₂SO₄(aq) solution contains 1.5 mol of ammonium ions?";
                        
                        correctAnswer = "3000mL";
                        break;
                    case 5:
                        question = "How many times more basic is a solution with a pOH of 4 compared to one with a pOH of 7?";
                        
                        correctAnswer = "1000 times";
                        break;
                    case 6:
                        question = "What is the concentration of H\u207A (aq) for 0.0350M of sulfuric acid?";
                        
                        correctAnswer = "0.0700mol/L H\u207A";
                        break;
                    case 7:
                        question = "You are given two equal-concentration solutions of HCl and Hf. Which acid is stronger and ionizes completely?";
                        
                        correctAnswer = "HCl";
                        break;
                    default:
                        //
                }
                break;
            case 5:
                switch(questionNum)
                {
                    case 1:
                        question = "A constant quantity of a gas doubles in pressure and the temperature of the system quadruples. What will happen to the volume of this gas?";
                        
                        correctAnswer = "Volume will double (x2)";
                        break;
                    case 2:
                        question = "If you had 1 mole of each of the following gases at STP: He, O₂, N₂, which gas would have the largest volume?";
                        
                        correctAnswer = "All 3 gasses will occupy the same volume";
                        break;
                    case 3:
                        question = "A wet nitrogen gas sample has a pressure of 107.20kPa at 25°C (Vapour pressure: 3.17kPa). What is the pressure of the dry nitrogen gas?";
                        
                        correctAnswer = "104.03kPa";
                        break;
                    case 4:
                        question = "A 5.50L balloon of pure JiCl₂(g) is kept at 23.4°C. The balloon is then placed in Ms. Massad's cat a temperature of 34.5°C. ASSUME that the "
                                + "moles and pressure of JiCl₂ did not change. What is the CHANGE in the balloon's volume?";
                        
                        correctAnswer = "0.21L";
                        break;
                    case 5:
                        question = "A 2.0L sample of carbon dioxide gas is at STP. Calculate the number of carbon dioxide molecules in this sample.";
                        
                        correctAnswer = "5.4 x 10²² molecules";
                        break;
                    case 6:
                        question = "A new Massadium based gas is found to have an empirical formula of MaO(g). 4.40g of this gas at SATP conditions has a volume of "
                                + "837mL. Determine the molecular formula of this gas. (Molar Mass of Ma is 49.11g/mol)";
                        
                        correctAnswer = "Ma₂O₂";
                        break;
                    case 7:
                        question = "Ammonia can be produced through the reaction N₂(g) + 3H₂(g) --> 2NH₃(g). At SATP, 4.50g of hydrogen gas reacts with 8.0L of nitrogen gas. The "
                                + "ammonia produced is then collected over water. The resulting wet ammonia gas has a pressure of 102.0kPa at 28.0°C. What volume of DRY ammonia gas was collected?";
                        
                        correctAnswer = "17L";
                        break;
                    default:
                        //
                }
                break;
            default:
                //
        }
    }
    
    // Polymorphism + encapsulation    @Override
    public String getQuestion()
    {
        return question;
    }
    
    public String getAnswer()
    {
        return correctAnswer;
    }
}
