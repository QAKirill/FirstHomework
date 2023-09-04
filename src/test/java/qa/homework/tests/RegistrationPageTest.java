package qa.homework.tests;

import org.junit.jupiter.api.Test;
import qa.homework.pages.RegistrationPage;

import static qa.homework.utils.TestData.*;

public class RegistrationPageTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setUserNumber(phone)
                .setBirthDate(day, month, year)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadPicture(fileName)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .submitButtonClick();

        registrationPage
                .checkModalContent()
                .checkResultByRows("Student Name", firstName + " " + lastName)
                .checkResultByRows("Student Email", email)
                .checkResultByRows("Gender", gender)
                .checkResultByRows("Mobile", phone)
                .checkResultByRows("Date of Birth", day + " " + month + "," + year)
                .checkResultByRows("Subjects", subject)
                .checkResultByRows("Hobbies", hobby)
                .checkResultByRows("Picture", fileName)
                .checkResultByRows("Address", address)
                .checkResultByRows("State and City", state + " " + city);
    }
}
