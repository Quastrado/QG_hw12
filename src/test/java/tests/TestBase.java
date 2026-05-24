package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import tests.secrets.Secrets;


public class TestBase {

    @BeforeAll
    static void setupSelenideEnv(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://qa-guru.github.io/one-page-form";
        Configuration.remote = Secrets.remoteBrowserUrl;

    }
}
