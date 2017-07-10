/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.oneToOne.Bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Alaa.khairy
 */
public class Credntials {
    
    @Id
    private int id;
    
    @OneToOne(cascade = CascadeType.ALL) // when inserting this object the user  object will inserted also.
    @JoinColumn(name = "USER_ID",referencedColumnName = "ID")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    
}
