// Address and human class'es are examples part of refactoring exercise.
// adding a statement as part of commit
// added at 10:46 am
public class Human {
	   private String name;
	   private String age;
	   private Address address;

	   private String getFullAddress() {
	       return address.getFullAddress();
	   }
}
