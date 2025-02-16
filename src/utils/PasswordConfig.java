/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Onur Eğe
 */
public class PasswordConfig {
    
    public String encrypt(String text){
        return BCrypt.hashpw(text,BCrypt.gensalt(10));
    }
    
    public boolean decrypt(String password, String hashedPassword){
        return BCrypt.checkpw(password, hashedPassword);
    }
}
