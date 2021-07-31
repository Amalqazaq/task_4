package jo.secondstep.liskov.correct;

import java.text.Normalizer;

public interface WaterModeFactory {
  public static WaterMode GetType(WashingMachine machine) {
	 if(machine instanceof NormalMachine)
		 return new ManualWaterMode();
	 
	 else
		 return new AutomaticWaterMode() ;
  }
}
