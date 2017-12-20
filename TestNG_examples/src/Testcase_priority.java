import org.testng.annotations.Test;

public class Testcase_priority {
  @Test (priority=1)
  public void first() {
	  System.out.println("this is first testcase");
	  
  }
  @Test (priority=0)
  public void second(){
	  System.out.println("this is second testcase");
  }
}
