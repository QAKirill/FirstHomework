package qa.homework.tests;

import org.junit.jupiter.api.Test;
import qa.homework.pages.RegistrationPage;
import qa.homework.utils.TestData;

public class RegistrationPageTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        TestData testData = new TestData(1900, 2100);

        registrationPage
                .openPage()
                .removeBanners()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.phone)
                .setBirthDate(testData.day, testData.month, testData.year)
                .setSubject(testData.subject)
                .setHobby(testData.hobby)
                .uploadPicture(testData.fileName)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .submitButtonClick();

        registrationPage
                .checkModalContent()
                .checkResultByRows("Student Name", testData.firstName + " " + testData.lastName)
                .checkResultByRows("Student Email", testData.email)
                .checkResultByRows("Gender", testData.gender)
                .checkResultByRows("Mobile", testData.phone)
                .checkResultByRows("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResultByRows("Subjects", testData.subject)
                .checkResultByRows("Hobbies", testData.hobby)
                .checkResultByRows("Picture", testData.fileName)
                .checkResultByRows("Address", testData.address)
                .checkResultByRows("State and City", testData.state + " " + testData.city);
    }
}
