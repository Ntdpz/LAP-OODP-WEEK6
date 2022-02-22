package lab.oodp.ood.animals;

/**
 * Represents a dog.
 *
 * TODO Make this class implement the IAnimal interface, then implement all its methods.
 */
public class Dog implements IAnimal {
	   public String sayHello() {
		   return "woof woof";
	   }
	   
	   public boolean isMammal() {
		   return true;
	   }
	   
	   public String myName() {
		   return "Bruno the dog";
	   }
	   
	   public int legCount() {
		   return 4;
	   }
}
