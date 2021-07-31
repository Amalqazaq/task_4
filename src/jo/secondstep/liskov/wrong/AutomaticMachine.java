package jo.secondstep.liskov.wrong;

public class AutomaticMachine implements WashingMachine
{

	@Override
	public void AddWater() {
	throw new UnsupportedOperationException("THE WATER IS ADDED AUTOMATICALLY");
	}

	@Override
	public void Start() {
		System.out.println("THE MACHINE IS STARTED");
		
	}

	@Override
	public void Stop() {

		System.out.println("THE MACHINE IS STOPED");
		
		
	}

}
