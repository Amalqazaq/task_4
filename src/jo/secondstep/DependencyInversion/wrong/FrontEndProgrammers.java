package jo.secondstep.DependencyInversion.wrong;

public class FrontEndProgrammers {
    private String name;
    
    public FrontEndProgrammers(String name) {
    	this.name=name;
    }

	public String LevelOfProgrammers() {
		return "FRONTEND DEVELOPER";
	
	}

	public String LanguageUsed() {
		return "JAVASCRIPT ,HTML AND CSS";
		
	}

	
	public String toString() {
		return name+ " "+LevelOfProgrammers()+ " " + LanguageUsed();
	}
}
