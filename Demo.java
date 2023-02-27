import org.testng.annotations.Test;

public class Demo {
    @Test(priority = 1)
    void setup(){
        System.out.println("open browser");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("login with data");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("shut down");
    }
}
