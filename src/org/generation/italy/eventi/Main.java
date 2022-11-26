package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		try {
			
			Evento ev = new Evento("Sziget festival", LocalDate.now().minusDays(17), 0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} finally {
			
			System.out.println("------------------------\n");
			Evento event = new Evento("Sziget festival", LocalDate.now().plusDays(17), 10);
			System.out.println(event);
		}
		
		// Milestone 2
		
		Evento event = new Evento("Sziget festival", LocalDate.now().plusDays(17), 20);
		System.out.println(event);
		
		System.out.println("------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		
		// Book Seat
		
		System.out.println("Quante prenotazioni vuoi effettuare?");
		int seatsNo = sc.nextInt();
		
		for (int i=1; i<=seatsNo; i++) {
			
			try {
				
				event.bookSeat();
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("------------------------\n");
		System.out.println(event);
		
		
		// Cancel Seat
		
		System.out.println("Quante prenotazioni vuoi cancellare?");
		int cancNo = sc.nextInt();

		
		for (int i=1; i<=cancNo; i++) {
			
			try {
				
				event.cancelSeat();
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		
		System.out.println("------------------------\n");
		System.out.println(event);
		
		
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		
		
		
		// Milestone 3
		
		ProgrammEventi prg = new ProgrammEventi("Great Events", null);
		
		
		// Add events 
		
		try {
			
			prg.addEvent("Sziget Festival", LocalDate.now().plusMonths(8), 5000);
			prg.addEvent("Jova Beach Party", LocalDate.now().plusMonths(8), 50000);
			prg.addEvent("Tomorrowland", LocalDate.now().plusMonths(6), 2000);
			prg.addEvent("Kappa tour", LocalDate.now().plusMonths(7), 3000);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println(prg);
		
		
		// Get elements by data 
		
		System.out.println("------------------------\n");
		
		System.out.println("Gli eventi di Luglio: \n");
		System.out.println(prg.getEvensBytData(LocalDate.now().plusMonths(8)));
		
		
		// Showing how many methods ProgrammEventi contains
		
		System.out.println("------------------------\n");
		
		System.out.print("Gli eventi in programma sono: ");
		System.out.println(prg.getEventsNo());
		
		
		// Empty prg List
		
//		prg.emptyEventsList();
//		
//		System.out.print("Gli eventi in programma sono: ");
//		System.out.println(prg.getEventsNo());
		
		
		// Get events program
		
		System.out.println("------------------------\n");
		System.out.println(prg.getEventsList());
		
	
		
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		System.out.println("------------------------\n");
		
		
		
		// Milestone 4
		
		try {
			
			Concerto c = new Concerto("La favola di ed Eva: Tour", LocalDate.now().minusMonths(8), 300, LocalTime.now(), BigDecimal.valueOf(30.99));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} finally {
			
			Concerto concert = new Concerto("La favola di Adamo ed Eva: Tour", LocalDate.now().plusMonths(10), 300, LocalTime.now(), BigDecimal.valueOf(30.99));
			System.out.println(concert);
		}
		
		
		
	}
}
