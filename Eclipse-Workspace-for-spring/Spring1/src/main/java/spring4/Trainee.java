package spring4;

public class Trainee {
	private Accomodation accomodation;
	public void setAccomodation(Accomodation accomodation) {
		this.accomodation = accomodation;
	}
	
	public void showAccomodation() {
		accomodation.getAccomodation();
	}
}
