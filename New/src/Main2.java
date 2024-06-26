class A{
	void meth(){
		System.out.println("overide");
	}
}

class B extends A{
	@Override
	void meth() {
	System.out.println("overide2");
	}
}


public class Main2 {
public static void main(String[] args) {
	B b = new B();
	b.meth();
}
}
