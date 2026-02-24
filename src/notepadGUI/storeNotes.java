package notepadGUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jasmita Munjal
 */
import java.util.*;
public class storeNotes { /*Central storage for all the user's note names. */
    public static Map<String, ArrayList<String>> userNotes = new HashMap<>(); /*The HashMap stores all of the users + notes. The key is the username. It has the users notes associated with it. The key helps us access the notes*/
}
