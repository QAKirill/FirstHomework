package qa.homework.utils;

public class TestData {
    public static String
            firstName = "Kirill",
            lastName = "Ivanov",
            email = "my@mail.ru",
            gender = "Male",
            phone = "1555232325",
            month = "August",
            year = "1992",
            day = "18",
            subject = "English",
            hobby = "Music",
            fileName = "128.png",
            address = "Lenina 1",
            state = "NCR",
            city= "Gurgaon";

    public void setValues(int min, int max) {
        RandomTestData rnd = new RandomTestData();

        firstName= rnd.getRandomFirstName();
        lastName = rnd.getRandomLastName();
        email= rnd.getRandomEmail();
        gender = rnd.getRandomGender();
        phone = rnd.getRandomPhone();
        month = rnd.getRandomMonth();
        year = rnd.getRandomYear(min, max);
        day = rnd.getRandomDay();
        subject = rnd.getRandomSubject();
        hobby = rnd.getRandomHobby();
        address = rnd.getRandomAddress();
        state = rnd.getRandomState();
        city = rnd.getRandomCity(state);
    }

    public TestData(int minYear, int maxYear) {
        setValues(minYear, maxYear);
    }

    public void restoreDefaults(){
        firstName = "Kirill";
        lastName = "Ivanov";
        email = "my@mail.ru";
        gender = "Male";
        phone = "1555232325";
        month = "August";
        year = "1992";
        day = "18";
        subject = "English";
        hobby = "Music";
        address = "Lenina 1";
        state = "NCR";
        city= "Gurgaon";
    }
}