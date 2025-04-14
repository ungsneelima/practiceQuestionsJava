package coding;
class Employee{
	int Salary=60000;
	void displaySalary() {
		System.out.println(Salary);
	}
}
	class programmer extends Employee{
		int bonus= 5000;
		void displayBonus() {
			System.out.println(bonus);
		}
	}


public class Inheritence {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer ob = new programmer();

		System.out.println(ob.displaySalary());


	}

}
