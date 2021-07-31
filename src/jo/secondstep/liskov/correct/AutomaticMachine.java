package jo.secondstep.liskov.correct;

public class AutomaticMachine implements WashingMachine
{

	@Override
	public void AddWater(WaterMode watermode) {
		watermode.GetWater();
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
