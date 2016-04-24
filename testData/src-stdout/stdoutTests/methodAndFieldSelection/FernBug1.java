package stdoutTests.methodAndFieldSelection;

public class FernBug1 {
	void foo(Object o) { 
		onMe("");
		System.out.println("foo object: " + o); 
		}
	
	void onMe(Object o) {
		System.out.println("onMe");
		}
	
	static class Inner extends FernBug1 {
		void foo(String s) {
			onMe("");
			System.out.println("foo string: " + s);
			}
	}
	
	public static void main(String[] args) {
		new FernBug1.Inner().foo((Object) "test");
		//this decompiled to the following, which is wrong
		//new FernBug1.Inner().foo("test");
		new FernBug1.Inner().onMe("");
		new FernBug1().onMe("");
	}
}
