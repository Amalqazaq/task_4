package jo.secondstep.interfaceSegregation.wrong;

public class BreakDance implements Artists {
	 private String Talent="";
		
	@Override
	public void Competitors() {
	System.out.println("THE BREAKDANCER IS ONE OF COMPETITORS!");
		
	}

	@Override
	public void Singing() {
		throw new UnsupportedOperationException("HE CAN NOT SINGING");
	}

	@Override
	public void Paint() {
		throw new UnsupportedOperationException("HE CAN NOT PAINT");
		
	}

	@Override
	public void dancing() {
		System.out.println("THE BREAKDANCER STARTED DANCING!");
		
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
