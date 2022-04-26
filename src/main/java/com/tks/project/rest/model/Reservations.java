package com.tks.project.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservations_model")
public class Reservations {

@Id
@GeneratedValue
private int id; 
@Column
private int reservationNo;
@Column
private String checkinDate;
@Column
private String checkoutDate;

public Reservations() {
	super();
}

public Reservations(int reservationNo, String checkinDate, String checkoutDate) {
	super();
	this.reservationNo = reservationNo;
	this.checkinDate = checkinDate;
	this.checkoutDate = checkoutDate;
}

public int getId() {
	return id;
}

public void setId(int id) {
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

@Override
public String toString() {
	return "Reservations [id=" + id + ", reservationNo=" + reservationNo + ", checkinDate=" + checkinDate
			+ ", checkoutDate=" + checkoutDate + "]";
}
	

}
