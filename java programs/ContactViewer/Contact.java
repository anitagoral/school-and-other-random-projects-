public class Contact {
	   private String firstName; 
	   private String lastName; 
	   private String email;
	   private String phone;

	   public Contact(String firstName, String lastName, String email, String phone) {
	      this.firstName =firstName;
	      this.lastName = lastName;
	      this.email = email;
	      this.phone = phone;
	   }
	   
	   public String getfirstName() {return firstName;}
	   public void setfirstName(String firstName) {this.firstName = firstName;}
	   
	   public String getlastName() {return lastName;}
	   public void setlastName(String lastName) {this.lastName = lastName;}
	   
	   public String getemail() {return email;}
	   public void setemail(String email) {this.email = email;}
	   
	   public String getphone() {return phone;}
	   public void setphone(String phone) {this.phone = phone;}
	   
	   @Override
	   public String toString() {return getlastName();}
	}