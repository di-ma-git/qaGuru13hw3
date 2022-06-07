import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestDemoQA {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

//    @AfterEach


    @Test
    void firstTest() {
        System.out.println("----------------Started first test----------------");
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Dima");
        $("[id=lastName]").setValue("Maltsev");
        $("[id=userEmail]").setValue("dimamaltsev@gmail.com");
        $("[id=userNumber]").setValue("89229612909");
        $("[id=dateOfBirthInput]").setValue("14.10.1983");
        $("[id=subjectsInput]").setValue("QA Automation");
        $("[id=currentAddress]").setValue("Centralnaya Street");
        $("[id=submit]").click();

        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Dima"));



    }
}
