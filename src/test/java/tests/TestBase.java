package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.PracticeFormPage;
import pages.TextBoxPage;
import pages.components.ResultModalComponent;



public class TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    ResultModalComponent resultModalComponent = new ResultModalComponent();
    TextBoxPage textBoxPage = new TextBoxPage();

    @BeforeAll
    static void setupSelenideEnv(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://qa-guru.github.io/one-page-form";
//        Configuration.browserVersion = "128.0";
//        Configuration.browser = "chrome";
////        Configuration.webDriverManager = false;
//        Configuration.remote = Secrets.remoteBrowserUrl;

    }

//    @BeforeEach
//     void prepareTests() {
//        Selenide.open("/");
//    }
}
