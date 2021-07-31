package jo.secondstep.DependencyInversion.wrong;

import java.util.ArrayList;
import java.util.List;

public class Client {
  public static void main(String[] args) {
	SoftwareProjects softwareProjects =new SoftwareProjects();
	List<FrontEndProgrammers> list=new ArrayList<FrontEndProgrammers>();
	list.add( new FrontEndProgrammers("AMAL ALQAZAQ"));
	list.add( new FrontEndProgrammers("OMAR MOHAMMAD"));
	
	softwareProjects.setProgrammers(list);
	
	List<FrontEndProgrammers> list2=softwareProjects.GetProgrammersInformation();
	
	for(FrontEndProgrammers programmer: list2) {
		
		System.out.println(programmer.toString());
	}
  }
}
