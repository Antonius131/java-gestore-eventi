package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {

	private String title;
	private LocalDate date;
	private int seats;
	private int reservedSeats;
	
	public Evento(String title, LocalDate date, int seats) throws Exception {
		
		setTitle(title);
		setDate(date);
		setSeats(seats);
		setReservedSeats(reservedSeats);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) throws Exception {
			
//		if (date.isBefore(LocalDate.now())) {
//			
//			throw new Exception("Impossibile creare un evento per una data già passata");
//		}
		
 		this.date = date;
	}

	public int getSeats() {
		return seats;
	}
	private void setSeats(int seats) throws Exception {
		
		if (seats < 0) {
			
			throw new Exception("Non possono esserci posti minori di zero");
		}
		
		this.seats = seats;
	}

	public int getReservedSeats() {
		return reservedSeats;
	}
	private void setReservedSeats(int reservedSeats) {
		this.reservedSeats = 0;
	}
	
	
	
	// Methods
	
	public void bookSeat() throws Exception {
		
		if (LocalDate.now().isAfter(date)) {
			
			throw new Exception("L'evento è già passato. Non puoi più acquistare il tuo biglietto.");
		} else if (reservedSeats == seats) {
			
			throw new Exception("Non ci sono più posti disponibili");
		}
			
		reservedSeats += 1;
	}
	
	public void cancelSeat() throws Exception{		
		
		if (LocalDate.now().isAfter(date)) {
			
			throw new Exception("Non puoi più cancellare il biglietto di un evento già passato.");
		} else if (reservedSeats == 0) {
			
			throw new Exception("Non esistono prenotazioni per questo evento");
		}
		
		reservedSeats -= 1;
	}
	
	public String formatDate() {
		
		return date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear();
	}
	
	
	
	
	
	
	@Override
	public String toString() {

		return "\nEvento: " + getTitle()
				+ "\nData: " + getDate()
				+ "\nPosti: " + getSeats()
				+ "\nPosti prenotati: " + getReservedSeats() + "\n";
	}
}
