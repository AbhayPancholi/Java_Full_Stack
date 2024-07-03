package spring2;

public class Trainee {
	private String traineeName;
	public Trainee() {
		System.out.println("Trainee Object Created only once as thr default dp is singleton");
		
	}
 
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	
	public void displayTraineeDetails() {
		System.out.println("Emp name is: "+traineeName);
	}
}
