package jo.secondstep.DependencyInversion.correct;
import java.util.*;
public class SoftwareProjects {
   private  List<Programmers> programmerlist;

public List<Programmers> getProgrammers() {
	return programmerlist;
}

public void setProgrammers(List<Programmers> programmerlist) {
	this.programmerlist = programmerlist;
}


  public List<Programmers> GetProgrammersInformation() {
	return programmerlist;
	   
   }
   
	
	
}
