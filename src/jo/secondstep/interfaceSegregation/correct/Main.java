package jo.secondstep.interfaceSegregation.correct;


public class Main {
  public static void ShowCompetitors(Artists [] artists) {
		for(int i=0;i<artists.length;i++) {
			String GetTalent=artists[i].ReturnTalent();			
			System.out.println("THE TALENT:"+GetTalent);
			artists[i].Competitors();
			
		}
	  
	  
  }
  
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Artists [] artists=new Artists[3];
	    artists[0]=new BreakDancers();
	    artists[0]. SetTalent("DANCER");
	    artists[1]=new OperaSinger();
	    artists[1]. SetTalent("SINGER");
	    artists[2]=new Caricature();
	    artists[2]. SetTalent("PAINTER");
	    ShowCompetitors(artists);
   }
	
}
