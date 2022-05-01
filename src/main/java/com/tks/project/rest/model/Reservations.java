package com.tks.project.rest.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="reservations")
public class Reservations implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id; 
@Column(insertable = false,
        nullable = false, unique = true, columnDefinition = "bigserial")
private int reservationNo;
@Column
private String checkinDate;
@Column
private String checkoutDate;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "user_id", nullable = false)
@JsonIgnore
private Users users;

public Reservations() {
	super();
}

public Reservations(int reservationNo, String checkinDate, String checkoutDate, Users users) {
	super();
	this.reservationNo = reservationNo;
	this.checkinDate = checkinDate;
	this.checkoutDate = checkoutDate;
	this.users = users;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getReservationNo() {
	return reservationNo;
}

public void setReservationNo(int reservationNo) {
	this.reservationNo = reservationNo;
}

public String getCheckinDate() {
	return checkinDate;
}

public void setCheckinDate(String checkinDate) {
	this.checkinDate = checkinDate;
}

public String getCheckoutDate() {
	return checkoutDate;
}

public void setCheckoutDate(String checkoutDate) {
	this.checkoutDate = checkoutDate;
}



public Users getUsers() {
	return users;
}

public void setUsers(Users users) {
	this.users = users;
}

public void setId(long id) {
	this.id = id;
}

@Override
public String toString() {
	return "Reservations [id=" + id + ", reservationNo=" + reservationNo + ", checkinDate=" + checkinDate
			+ ", checkoutDate=" + checkoutDate + "]";
}

}
