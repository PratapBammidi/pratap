/**
 * program on Contact Details Of Hosteller 
 * @author Pratap
 * @since 2nd Aug 2023
 */
package com.techzenure.day6;

public class Hosteller extends Student {
	 private String hostelName;
	    private int roomNumber;

	    // Getters and setters for Hosteller class
	    public String getHostelName() {
	        return hostelName;
	    }

	    public void setHostelName(String hostelName) {
	        this.hostelName = hostelName;
	    }

	    public int getRoomNumber() {
	        return roomNumber;
	    }

	    public void setRoomNumber(int roomNumber) {
	        this.roomNumber = roomNumber;
	    }
}
