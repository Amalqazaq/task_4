package jo.secondstep.interfaceSegregation.wrong;

import jo.secondstep.interfaceSegregation.correct.Artists;
import jo.secondstep.interfaceSegregation.correct.BreakDancers;

public class Main 
{
	  public static void ShowCompetitors(Artists [] artists) {
			for(int i=0;i<artists.length;i++) {			
				System.out.println("THE TALENT:"+artists[i].ReturnTalent());
				artists[i].Competitors();
			}
				
			}

	  
	  
	  
	  
		public static void main(String[] args) {
			Artists [] artists=new Artists[1];
			artists[0]=new BreakDancers();
			artists[0]. SetTalent("DANCER");
			 ShowCompetitors(artists);
			
		}
}
		  
		  
	 
	  