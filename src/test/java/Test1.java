import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://habr.com/ru/company/otus/blog/450872/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text() [contains(.,'Все потоки')]]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[text() [contains(.,'Лучшие блоги')]]")).click();
        driver.close();
    }
}
