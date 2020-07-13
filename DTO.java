/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author longvo
 */
public class DTO {
    private String Username;
    private String Password;
    private String Classname;

    public DTO(String Username, String Password, String Classname) {
        this.Username = Username;
        this.Password = Password;
        this.Classname = Classname;
    }

   public DTO() {
        
    }

    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String Classname) {
        this.Classname = Classname;
    }
    
}
