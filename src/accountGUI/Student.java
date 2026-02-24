/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountGUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author pamlee
 */
public class Student extends User
{
    private String oldUsername;
    private String oldPassword;
    
    public static void registerNew(String username, String password) { // registiration
        LocalDate date = LocalDate.now();
        int day = date.getDayOfYear();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("userinfo.txt", true));
            writer.newLine();
            writer.write(username + "," + password + "," + "1" + "," + "0" + "," + day + "," + false + "," + false);
            writer.close();
        } catch (Exception err) {
        }
    }
    
    public Student(String username, String password, int loginStreak, int blovePts, int lastLogin, boolean redeemed1, boolean redeemed2) {
        this.access = 1;
        this.loginStreak = loginStreak;
        this.username = username;
        this.password = password;
        this.blovePts = blovePts;
        this.lastLogin = lastLogin;
        updData();
        this.redeemed1 = redeemed1;
        this.redeemed2 = redeemed2;
        
        oldUsername = username;
        oldPassword = password;
    }
    
    public void updData() { // updating data, fixing streak
        LocalDate date = LocalDate.now();
        if ((date.getDayOfYear() - this.lastLogin) == 1) {
            blovePts += fibonacciBlovePts(loginStreak);
            loginStreak++;
        }
        else {
            loginStreak = 1;
        }
        lastLogin = date.getDayOfYear();
    }
    
    private static int fibonacciBlovePts(int loginStreak) // fibonacci points
    {
        if(loginStreak == 0 || loginStreak == 1) // base case for fibonacci
        {
            return 1;
        }
        
        return fibonacciBlovePts(loginStreak - 1) + fibonacciBlovePts(loginStreak - 2);
    }
    
    // Getter/setter methods for the 'manage settings' page
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    // Getting blove points for the shop
    public int getBlovePts()
    {
        return blovePts;
    }
    
    public boolean getRedeemed1()
    {
        return redeemed1;
    }
    
    public boolean getRedeemed2()
    {
        return redeemed2;
    }
    
    public int getLoginStreak()
    {
        return loginStreak;
    }
    
    public void setUsername(String newUser)
    {
        oldUsername = username;
        username = newUser;
        saveToFile();
    }
    
    public void setPassword(String newPass)
    {
        oldPassword = password;
        password = newPass;
        saveToFile();
    }
    
    public void setRedeemed1(boolean redeem1)
    {
        redeemed1 = redeem1;
        saveToFile();
    }
    
    public void setRedeemed2(boolean redeem2)
    {
        redeemed1 = redeem2;
        saveToFile();
    }
    
    public void updateBlovePts(int newBP)
    {
        blovePts = newBP;
        saveToFile();
    }
    
    // Saving to the file after the user changes their information
    public void saveToFile() 
    {
        // opens the file that stores all the current user information
        File file = new File("userinfo.txt");
        // New arraylist to store all of the existing information
        ArrayList<String> lines = new ArrayList<>();

        // Opening the file and reading all the lines and appending it all to the arraylist
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) 
            {
                String[] data = line.split(",");

                if (!data[0].equals(oldUsername)) 
                {
                    lines.add(line);
                }
            }
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
        
        // Updating the information in the file to include the new username and password
        String newUserInformation = username + "," + password + "," +
                loginStreak + "," + blovePts + "," + lastLogin + "," + redeemed1 + "," + redeemed2;

        lines.add(newUserInformation);

        // re-write into the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) 
        {
            for (String l : lines) 
            {
                writer.write(l);
                writer.newLine();
            }
        } 
        catch (java.io.IOException e) 
        {
            e.printStackTrace();
        }
    }
}
