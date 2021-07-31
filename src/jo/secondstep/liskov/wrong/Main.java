package jo.secondstep.liskov.wrong;

public class Main {
	public static void Test(WashingMachine [] machines) {
		for(int i=0;i<machines.length;i++) {
			machines[i].AddWater();
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
