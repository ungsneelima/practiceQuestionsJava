package coding;

public class Encapsulation {
	private String sname;
	private int spassword;
	
public void setName(String sname) {
	this.sname = sname;
}
public String getName() {
	return sname;
}
 public void setPassword(int spassword) {
	this.spassword = spassword;
}
 public int getPassword() {
	 return spassword;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob = new Encapsulation();
		ob.setName("Neelima");
		ob.setPassword(12345678);
		ob.getName();
		ob.getPassword();
		System.out.println("The username is "+ob.getName());
		System.out.println("The password is "+ob.getPassword());
		


	}

}
