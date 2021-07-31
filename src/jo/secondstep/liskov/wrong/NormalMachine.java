package jo.secondstep.liskov.wrong;

public class NormalMachine implements WashingMachine {
    private int waterLevel;
	@Override
	public void AddWater() {
		waterLevel=50;	
	}

	@Override
	public void Start() {
		 if(waterLevel>10)
		  System.out.println("THE MACHINE IS STARTED");
		
	}

	@Override
	public void Stop() {
		System.out.println("THE MACHINE IS STOPED");
		
	}

}
