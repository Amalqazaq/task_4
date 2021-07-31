package jo.secondstep.openclose.correct;

abstract class Animal{
    private String animalName;


public void SetName(String name){
  animalName=name;
}
public String GetName(){
  return animalName;
}

abstract void AnimalSound();


}