/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionGeneratingGUI;

/**
 *
 * @author pamlee
 */
// Abstraction --> extending to inheritance
public abstract class Courses 
{
    // Encapsulation --> accessor method
    public abstract String getQuestion();
    // No abstract method for getAnswer because some courses return strings, while others return floats
}
