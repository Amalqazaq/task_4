package jo.secondstep.interfaceSegregation.correct;

public class BreakDancers implements Dancers {
	 private String Talent="";
	@Override
	public void Competitors() {
		System.out.println("THE BREAJDANCER IS ONE OF THE COMPTITORS!");
		
	}

	@Override
	public void dancing() {
		
		System.out.println("THE DANCER STARTED DANCING!");
	}

	
	@Override
	public void SetTalent(String t) {
		Talent=t;
		
	}
	@Override
	public String ReturnTalent() {
		// TODO Auto-generated method stub
		return Talent;
	}

	

}


