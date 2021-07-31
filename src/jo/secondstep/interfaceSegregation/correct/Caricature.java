package jo.secondstep.interfaceSegregation.correct;

public class Caricature implements Painters {
    private String Talent="";
	@Override
	public void Competitors() {
		System.out.println("THE CARICATURE IS ONE OF THE COMPTITORS!");
		
		
	}

	@Override
	public void Paint() {
		System.out.println("THE PAINTER STARTED PAINTING!");
		
	}
    
	
	@Override
	public void SetTalent(String t) {
		Talent=t;
		
	}
	@Override
	public String ReturnTalent() {
		
		return Talent;
	}

	

	
}
