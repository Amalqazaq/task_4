package jo.secondstep.single.correct;

public class Employee {

	
	
	private String employeeName;
	private int salary;
	private String JobType;

	 public void SetemployeeName(String t){
	   employeeName=t;
	 }
	 public void SetSalary(int t){
	   salary=t;
	 }
	 
	 public void SetJobtype(String t){
	   JobType=t;
	 }

	 public String getemployeeName(){
	   return employeeName;
	 }

	 public int getSalary(){
	   return salary;

	 }

	 public String getJobtype(){
	   return JobType;

	 }


}
