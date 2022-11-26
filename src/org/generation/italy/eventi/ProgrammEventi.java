package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {

	private String title;
	private List<Evento> events;
	
	public ProgrammEventi(String title, List<Evento> events) {
		
		setTitle(title);
		setEvent(events);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<Evento> getEvent() {
		return events;
	}
	public void setEvent(List<Evento> event) {
		this.events = new ArrayList<>();
	}
	
	
	// Methods
	
	public void addEvent(String title, LocalDate date, int seats) throws Exception {
		
		Evento ev = new Evento(title, date, seats);
		
		events.add(ev);
	}
	
	public List<Evento> getEvensBytData(LocalDate date) {
		
		List<Evento> eventsData = new ArrayList<>();
		
		for (Evento ev : events) {
			
			if (ev.getDate().equals(date)) {
				
				eventsData.add(ev);
			}
		}
		
		return eventsData;
	}
	
	public int getEventsNo() {
		
		return events.size();
	}
	
	public void emptyEventsList() {
		
		events.removeAll(events);
	}
	
	
	// sort events method 

	
	public String getEventsList() {
		
		String list = 
				"Titolo: " + getTitle() 
				+ "\nEventi: \n";
		
		for (Evento ev : events) {
			
			list += ev.getDate() + " " + "- " + ev.getTitle() + "\n";
		}
		
		return list;
	}
	
	
	@Override
	public String toString() {
		
		return "\nTitolo: " + getTitle() + "\n"
				+ "\nEventi: \n" + getEvent() + "\n";
	}
}
