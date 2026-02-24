/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountGUI;

/**
 *
 * @author pamlee
 */
public abstract class User 
{
    protected int access;
    protected int loginStreak;
    protected int blovePts;
    protected int lastLogin;
    protected String password;
    protected String username;
    protected boolean redeemed1;
    protected boolean redeemed2;

    public abstract void updData();
}
