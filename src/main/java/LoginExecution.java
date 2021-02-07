import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.MainPage;

public class LoginExecution {
    public static void main(String[] args) {

        LoginPage page = new LoginPage();
        page.preencheFormLogin("teste","teste");

    }
}
