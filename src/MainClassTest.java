import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        if (a == 14) {
            System.out.println(" равно 14");
        } else {
            System.out.println("не равно 14");
        }
        System.out.println();
    }

    @Test
    public void testGetClassNumber() {
        int a = this.getClassNumber();
        if (a > 45) {
            System.out.println(" Число больше 45");
        } else {
            System.out.println("Число меньше 45");
        }
    }

    @Test
    public void testGetClassString() {
        java.lang.String c = "Hello";
        java.lang.String d = "hello";
        if (this.getClassString().contains(c)) {
            System.out.println("Строка содержит Hello");
        } else if (this.getClassString().contains(d)){
            System.out.println("Строка содержит hello");}
        else
            Assert.fail("Строка не содержится");
        }
    }


