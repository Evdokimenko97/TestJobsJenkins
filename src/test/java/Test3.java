import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test3 extends BaseTest {
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://habr.com/ru/company/otus/blog/450872/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text() [contains(.,'�����������������')]]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text() [contains(.,'������')]]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text() [contains(.,'����������')]]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
