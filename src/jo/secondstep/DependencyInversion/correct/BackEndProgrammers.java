package jo.secondstep.DependencyInversion.correct;

public class BackEndProgrammers implements Programmers{
private String name;
    
    public BackEndProgrammers(String name) {
    	this.name=name;
    }
	@Override
	public String LevelOfProgrammers() {
		return "BACKEND DEVELOPER";
		
	}
	@Override
	public String LanguageUsed() {
		 return "JAVA LANGUAGE , C++ AND C#";
		
	}
	
	 @Override
	 public String toString() {
			return name + " "+LevelOfProgrammers()+ " " + LanguageUsed();
	 }
	
}
