package cts.teme.tema1;

public class TestGit {
	public static void main(String[] args) {
		System.out.println("Hello Git! The name of the license project is"
	+" Aplicatie mobila pentru managementul resurselor umane.");
		
		Angajat angajat = new Angajat("Ionescu", "Andrei","HR",3500,true);
		System.out.println("Salariul angajatului cu tot cu prima este: " 
		+ angajat.getPrima()+" lei.");
	}
	
}
