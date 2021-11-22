
interface A {
	int k = 10;
	
	int sum(int a, int b);
}

/*interface B extends A {
	int k = 20;
}*/

class C implements A {
	//int k = 30;
	
	
	public int sum(int a, int b){
		return a+b;
	}
	
	public void display(){
		//int k=40;
		A a1 = new C();
		System.out.println(k);
	}
}

public class Test {

	public static void main(String[] args) {
		new C().display();

	}

}
