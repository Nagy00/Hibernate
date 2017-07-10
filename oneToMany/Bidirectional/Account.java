/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.oneToMany.Bidirectional;

import hibernate.oneToMany.Undirectional.*;
import hibernate.oneToOne.Bidirectional.*;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Alaa.khairy
 */
public class Account {
    
    private int id;
    
    private String fname;
    
    private String lname;
    
    //THE INVERSE OF THE RELATION ALAWYS HAVE THE MAPPED BY ATTRIBUTE.
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List <Transactions> trans;

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

    public List<Transactions> getTrans() {
        return trans;
    }

    public void setTrans(List<Transactions> trans) {
        this.trans = trans;
    }

    
    
}
