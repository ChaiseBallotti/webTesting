import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.guru99.com/test/login.html");

        // Add/Delete web element
        chrome.findElement(By.id())

        WebElement email = chrome.findElement(By.cssSelector("input[name=email]"));
        email.sendKeys("dskjahfdsaijhfewads");

        String s = chrome.getCurrentUrl();
        s = s + "\n" + chrome.getTitle();
        System.out.println(s);

        /*
        chrome.get("https://demo.automationtesting.in/Register.html");

        WebElement dropdown = chrome.findElement(By.id("skills"));
        Select dd = new Select(dropdown);
        dd.selectByIndex(4);

         */

        /*
        chrome.get("https://demo.opencart.com/");
        chrome.manage().window().maximize();

        chrome.findElement(By.name("search")).sendKeys("laptop");
         */
    }
}
