/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountGUI;

/**
 *
 * @author pamlee
 */
public class Admin 
{
    private int access;
    private String username;
    private String password;

    public Admin(String username, String password, int loginStreak, int blovePts) 
    {
        this.access = 2;
        this.username = username;
        this.password = password;
    }
}
