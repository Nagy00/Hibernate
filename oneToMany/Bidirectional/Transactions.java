/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.oneToMany.Bidirectional;

import hibernate.oneToMany.Undirectional.*;
import hibernate.oneToOne.Bidirectional.*;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Alaa.khairy
 */
public class Transactions {
    
    @Id
    private int id;
    
    //owning entity
    // IN BIDIRECTINAL ASSO THE OWNING ENTITY IS THE ENTITY WITH THE FOREIGN KEY 
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID",referencedColumnName = "ID")
    private Account user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }
    
    
    
    
}
