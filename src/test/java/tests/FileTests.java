package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.FileUtils;

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
        String actualFileText = new FileUtils().readStringFromFile("src/test/resources/files/file.txt");
        System.out.println("Actual text from file: \n" + actualFileText);

        assertThat(actualFileText, containsString(expectedFileText));  // схожий метод assertTrue(actualFileText.contains(expectedFileText),"Expected text: \n" + expectedFileText + "\n" + "Actual text: \n" + actualFileText);

    }
}