// Address and human class'es are examples part of refactoring exercise.
public class Human {
	   private String name;
	   private String age;
	   private Address address;

	   private String getFullAddress() {
	       return address.getFullAddress();
	   }
}
