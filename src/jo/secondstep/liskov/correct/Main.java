package jo.secondstep.liskov.correct;

public class Main {
	public static void Test(WashingMachine [] machines) {
		for(int i=0;i<machines.length;i++) {
			machines[i].AddWater(WaterModeFactory.GetType(machines[i]));
			machines[i].Start();
			machines[i].Stop();
		}
		
	}
	
	public static void main(String[] args) {
		WashingMachine [] machines=new WashingMachine[2];
		machines[0]=new NormalMachine();
		machines[1]=new AutomaticMachine();
		Test(machines);
   
   }
}
