package lab.oodp.ood.animals;

/**
 * Represents a Bird.
 *
 * TODO Correctly implement these methods, as instructed in the lab handout.
 */
public class Bird implements IAnimal {

   public String sayHello() {
	   return "tweet tweet";
   }
   
   public boolean isMammal() {
	   return false;
   }
   
   public String myName() {
	   return "Tweety the bird";
   }
   
   public int legCount() {
	   return 2;
   }
}
