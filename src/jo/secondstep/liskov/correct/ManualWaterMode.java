package jo.secondstep.liskov.correct;

public class ManualWaterMode implements WaterMode {

	@Override
	public int GetWater() {
	    System.out.println("THE WATER IS ADDED!");
		return 30;
	}

}
