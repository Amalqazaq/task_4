package jo.secondstep.liskov.correct;

public class AutomaticWaterMode implements WaterMode {

	@Override
	public int GetWater() {
		System.out.println("THE WATER IS ADDED AUTOMATICALLY!");
		return 0;
	}

}
