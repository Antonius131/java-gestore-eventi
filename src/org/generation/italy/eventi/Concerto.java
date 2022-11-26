package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{

	LocalTime hour;
	BigDecimal price;
	
	public Concerto(String title, LocalDate date, int seats, LocalTime hour, BigDecimal price) throws Exception {
		
		super(title, date, seats);
		setHour(hour);
		setPrice(price);
	}

	public LocalTime getHour() {
		return hour;
	}
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public String formatPrice() {
		
		DecimalFormat df = new DecimalFormat();
		
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(0);
		df.setGroupingUsed(false);
		
		return df.format(price);
	}
	
	public String getDateAndTime() {
		
		return formatDate() + " " + "-" + " " + getHour();
	}
	
	
	@Override
	public String toString() {
	
		return "Data e ora: " + getDateAndTime()
			+ "\nTitolo: " + getTitle() 
			+ "\nPrezzo: " + formatPrice() + "€";
	}
	
}
