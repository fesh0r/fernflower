package stdoutTests.ExampleTest;

public class Sample {
  
    //all main methods will be called automatically, stdout will be compared
    public static void main(String[] args) {
        System.out.println("Dummy Test output...");
        X x = new X();
        x.f();
    }
    
    //this will be renamed by renamer, don't print stuff that depends on the names
    //if the names are so that renamer kicks in...
    public static class X {
      public void f() {
        System.out.println("called x.foo, but in renamer case the class and method will have different name");
      }
    }
}
