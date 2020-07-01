/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

/**
 *
 * @author user
 */
public class Register {
    private int Register;
    private String name;
    
    public Register(int personID, String name){
        this.Register = personID;
        this.name = name;
    }

    /**
     * @return the Register
     */
    public int getRegister() {
        return Register;
    }

    /**
     * @param Register the Register to set
     */
    public void setRegister(int Register) {
        this.Register = Register;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
