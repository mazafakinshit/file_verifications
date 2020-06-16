package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.FileUtils;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Epic("QA.GURU automation course")
@Story("File tests")
@Tag("file")
class FileTests {


    @Test
    void successfulFileCheck() {
        String expectedFileText = "Hello ugly world!";
        final String[] actualFileText = {""};

        step("read file", ()-> {
            actualFileText[0] = new FileUtils().readStringFromFile("src/test/resources/files/file.txt");
            System.out.println("Actual text from file: \n" + actualFileText[0]);
        });

        step("assert content in file", ()-> {
            assertThat(actualFileText[0], containsString(expectedFileText));  // схожий метод assertTrue(actualFileText.contains(expectedFileText),"Expected text: \n" + expectedFileText + "\n" + "Actual text: \n" + actualFileText);
        });
    }
}