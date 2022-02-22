package lab.oodp.ood.animals;

/**
 * Represents a horse.
 *
 * TODO Make this implement IAnimal and IFamous, and provide appropriate implementations of those methods.
 */
public class Horse implements IAnimal, IFamous {
	   public String sayHello() {
		   return "neigh";
	   }
	   
	   public boolean isMammal() {
		   return true;
	   }
	   
	   public String myName() {
		   return "Mr. Ed the horse";
	   }
	   
	   public int legCount() {
		   return 4;
	   }
	   
	   public String famous() {
	        return "PharLap";
	    }
}
