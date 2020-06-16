package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.FileUtils;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@Epic("QA.GURU automation course")
@Story("File tests")
@Tag("File")
class FileTests extends TestBase {

    @Test
    @DisplayName("Проверка наличия текста {expectedFileText} в файле")
    void successfulFileCheck() {
        String expectedFileText = "Hello ugly world!";
        String actualFileText = new FileUtils().readStringFromFile("src/test/resources/files/file.txt");

        System.out.println("Actual text from file: \n" + actualFileText);

        step("Проверяем наличие текста", () -> assertThat(actualFileText, containsString(expectedFileText)));
    }
}