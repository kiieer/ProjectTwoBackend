package com.tks.project.rest.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class Users implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private boolean mailingList;
    @Column
    private Long phoneNumber;
    @Column
    private String resetToken;
  
    
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Reservations> reservations;
    
    

    public Users() {
		super();
	}

	public Users(String firstName, String lastName, String username, String password, String email, boolean mailingList,
            Long phoneNumber, String resetToken) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mailingList = mailingList;
        this.phoneNumber = phoneNumber;
        this.resetToken= resetToken; 
    }
    
    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMailingList() {
		return mailingList;
	}

	public void setMailingList(boolean mailingList) {
		this.mailingList = mailingList;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<Reservations> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservations> reservations) {
		this.reservations = reservations;
	}

	@Override
    public String toString() {
        return "Users [userId=" + userId + "firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
                + password + ", email=" + email + ", mailingList=" + mailingList + ", phoneNumber=" + phoneNumber + ", resetToken=" + resetToken + "]";
    }
    
    
}
