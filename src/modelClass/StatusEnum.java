/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

/**
 *
 * @author Mohd Mohsin Ismail
 */
public enum StatusEnum {
    SUCCESSFUL("Successful"),
    FAILED("Failed"),
    PENDING("Pending");
    
    public final String label;
    
    private StatusEnum(String label){
        this.label = label;
    }
}
