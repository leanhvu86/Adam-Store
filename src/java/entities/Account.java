/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Win
 */
@Entity
@Table(name = "Account")
@XmlRootElement
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Username")
    private String username;
 
    @Column(name = "Password")
    private String password;
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Customer customerId;

    public Account() {
    }

    public Account(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}
