
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pa = new Parent();
		Child ch = new Child();

		Parent pa1 = ch;
		pa1.grow();
		dogrow(ch);

	}


public static void dogrow(Parent parent) {
	parent.grow();
}}
