package jo.secondstep.DependencyInversion.correct;

public class FrontEndProgrammers implements Programmers {
    private String name;
    
    public FrontEndProgrammers(String name) {
    	this.name=name;
    }
	@Override
	public String LevelOfProgrammers() {
		return "FRONTEND DEVELOPER";
	
	}

	@Override
	public String LanguageUsed() {
		return "JAVASCRIPT ,HTML AND CSS";
		
	}

	
	 @Override
	public String toString() {
		return name+ " "+LevelOfProgrammers()+ " " + LanguageUsed();
	}
}
