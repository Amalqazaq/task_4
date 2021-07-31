package jo.secondstep.interfaceSegregation.correct;

public class OperaSinger implements Singers {
	 private String Talent="";
	@Override
	public void Competitors() {
		System.out.println("THE OPERASINGER IS ONE OF THE COMPTITORS!");
		
	}

	@Override
	public void Singing() {
		System.out.println("THE DANCER STARTED SINGING!");
		
	}

	
	public void SetTalent(String t) {
		Talent=t;
		
	}


	@Override
	public String ReturnTalent() {
		// TODO Auto-generated method stub
		return Talent;
	}
}

	
