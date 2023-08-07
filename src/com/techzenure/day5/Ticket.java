/**
 * program on Ticket Price Calculation 
 * @author Pratap
 * @since  1st Aug 2023
 */
package com.techzenure.day5;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		if(availableTickets <= 0) {
			System.err.println("Invalid input");
		}else {
			Ticket.availableTickets = availableTickets;
		}
	}
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets >= noOfTickets) {
			availableTickets -= noOfTickets;
			return (noOfTickets*price);
		}else {
		System.out.println("in sufficenet tickets");
		}
		return noOfTickets;
	}
	
}
