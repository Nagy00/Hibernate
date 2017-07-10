/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.ManyToMany.Undirectional;

import hibernate.oneToOne.Bidirectional.*;
import javax.persistence.OneToOne;

/**
 *
 * @author Alaa.khairy
 */
public class User {
    
    private int id;
    
    private String fname;
    
    private String lname;
    
    @OneToOne(mappedBy = "user")
    private Credntials cred;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Credntials getCred() {
        return cred;
    }

    public void setCred(Credntials cred) {
        this.cred = cred;
    }
    
    
    
}
