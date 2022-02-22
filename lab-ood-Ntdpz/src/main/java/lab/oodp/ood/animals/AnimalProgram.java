package lab.oodp.ood.animals;

/**
 * Main program for Exercise Two.
 */
public class AnimalProgram {

    public void start() {

        IAnimal[] animals = new IAnimal[3];
        animals[0]=new Bird();
        animals[1]=new Dog();
        animals[2]=new Horse();
        // TODO Populate the animals array with a Bird, a Dog and a Horse.
        

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
    	for(IAnimal animal : list) {
    		System.out.println(animal.myName() + " says "+ animal.sayHello());
    		System.out.print(animal.myName()+" is a ");{
    			if (animal.isMammal()) {
    				System.out.print("mammal.");
    			}else 
    				System.out.print("non-mammal.");
    		}
    		
    		System.out.print("Did I forget to tell you that I have "+animal.legCount()+" legs.");
    		
    		
    		 if (animal instanceof IFamous) {
                 System.out.println("This is a famous name of my animal type: " + ((IFamous) animal).famous());
             }
    	}
        // TODO Loop through all the animals in the given list, and print their details as shown in the lab handout.
        // TODO If the animal also implements IFamous, print out that corresponding info too.
    	
    	// TODO Use println below to break between each animal
    	//System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        new AnimalProgram().start();
    }
}
