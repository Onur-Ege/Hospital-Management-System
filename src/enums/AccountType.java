/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Onur Eğe
 */
public enum AccountType {
    DOCTOR(1),PATIENT(2);
    
    final int state;
    
    AccountType(int state){
        this.state = state;
    }
}
