package de.hhu.stups.propra.alcomat.model;

public class Person {

	private long gewicht;
	private double promille;

	public Person() {
	}

	public long getGewicht() {
		return gewicht;
	}

	public void setGewicht(long gewicht) {
		this.gewicht = gewicht;
		updatePromille();
	}

	private void updatePromille() {
		// Formel: https://de.wikipedia.org/wiki/Blutalkoholkonzentration#Berechnung_der_BAK
		promille = 0;
	}

	public String getPromille() {
		return Double.toString(promille);
	}

}
