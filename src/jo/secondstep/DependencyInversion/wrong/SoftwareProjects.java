package jo.secondstep.DependencyInversion.wrong;
import java.util.*;
public class SoftwareProjects {
   private  List<FrontEndProgrammers> programmerlist;
   
   
   
   
   public List<FrontEndProgrammers> getProgrammers() {
	return programmerlist;
   }

  public void setProgrammers(List<FrontEndProgrammers> programmerlist) {
	this.programmerlist = programmerlist;
   }


  public List<FrontEndProgrammers> GetProgrammersInformation() {
	return programmerlist;
	   
   }
   
	
	
}
