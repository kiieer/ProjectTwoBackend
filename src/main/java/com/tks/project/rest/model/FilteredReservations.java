package com.tks.project.rest.model;

public class FilteredReservations {
	private String checkinDate;
	private String checkoutDate;
	private int reservationNo;
	public FilteredReservations(String checkinDate, String checkoutDate, int reservationNo) {
		super();
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
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
	public int getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}
}
