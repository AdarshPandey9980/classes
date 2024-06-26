class OverLode{
	void meth1(){
		System.out.println("first");
	}
	
	void meth1(int a){
		System.out.println(a);
	}
}


public class Main {
public static void main(String[] args) {
	OverLode lode = new OverLode();
	lode.meth1();
	lode.meth1(1);
}
}
