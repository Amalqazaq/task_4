package jo.secondstep.DependencyInversion.correct;

import java.util.ArrayList;
import java.util.List;

public class Client {
  public static void main(String[] args) {
	SoftwareProjects softwareProjects =new SoftwareProjects();
	List<Programmers> list=new ArrayList<Programmers>();
	list.add( new FrontEndProgrammers("AMAL ALQAZAQ"));
	list.add( new BackEndProgrammers("OMAR MOHAMMAD"));
	
	softwareProjects.setProgrammers(list);
	
	List<Programmers> list2=softwareProjects.GetProgrammersInformation();
	
	for(Programmers programmer: list2) {
		
		System.out.println(programmer.toString());
	}
  }
}
