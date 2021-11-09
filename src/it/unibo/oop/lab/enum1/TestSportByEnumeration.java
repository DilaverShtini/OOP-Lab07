package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.nesting1.SportSocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
      
    	 final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<>("Davide", "Cassani", "dcassani", 53);
         final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<>("Bernie", "Ecclestone", "becclestone", 83);
         final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<>("Fernando", "Alonso", "falonso", 34);

         
    
	}
}
