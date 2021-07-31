package jo.secondstep.openclose.correct;

class Main {
	  public static void MakeSound(Animal[] animals){
	    for(int i=0;i<animals.length;i++){
	       animals[i].AnimalSound();
	    }
	  }
	  
	  public static void main(String[] args) {
	    System.out.println("Write your Animal Name:");
	    Animal[] animals=new Animal[2];
	    animals[0]=new Cat();
	    animals[1]=new Dog();
	    MakeSound(animals);
	  }
	}