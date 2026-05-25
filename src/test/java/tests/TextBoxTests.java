package tests;

import org.junit.jupiter.api.Test;

import tests.testdata.TestDataTextBox;


public class TextBoxTests extends TestBase {
    TestDataTextBox testData = new TestDataTextBox();

    @Test // Успешное заполнение и отправка формы
    void successfulFormCompletionTest(){
        textBoxPage.openPage()
                .typeUserName(testData.userName)
                .typeUserEmail(testData.userEmail)
                .typeCurrentAddress(testData.address)
                .typePermanentAddress(testData.address)
                .submitForm()
                .checkField("name", testData.expectedName)
                .checkField("email", testData.expectedEmail)
                .checkField("currentAddress", testData.expectedCurrentAddress)
                .checkField("permanentAddress", testData.expectedPermanentAddress);
    }

    @Test // Отправка формы при некорректном значении Email
    void incorrectEmail(){
        textBoxPage.openPage()
                .typeUserEmail(testData.incorrectUserEmail)
                .submitForm()
                .noOutput("email");
    }
}
