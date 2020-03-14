package cts.teme.tema1;

public class Angajat implements Prima {
	
	private String nume;
	private String prenume;
	private String departament;
	private float salariu;
	private boolean ok;
	
	public Angajat(String nume, String prenume, String departament, float salariu, boolean ok) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.departament = departament;
		this.salariu = salariu;
		this.ok = ok;
	}
	
@Override
	public float getPrima() {
		if(ok=true)
			{
			return salariu+1000;
			}else 
				return salariu;
	}
	
	
}
