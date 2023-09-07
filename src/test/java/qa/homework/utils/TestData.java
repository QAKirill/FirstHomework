package qa.homework.utils;

public class TestData {
    RandomTestData rnd = new RandomTestData();

    public String
            firstName= rnd.getRandomFirstName(),
            lastName = rnd.getRandomLastName(),
            email= rnd.getRandomEmail(),
            gender = rnd.getRandomGender(),
            phone = rnd.getRandomPhone(),
            month = rnd.getRandomMonth(),
            year,
            day = rnd.getRandomDay(),
            subject = rnd.getRandomSubject(),
            hobby = rnd.getRandomHobby(),
            address = rnd.getRandomAddress(),
            state = rnd.getRandomState(),
            city = rnd.getRandomCity(state),
            fileName = "128.png";

    public TestData(int minYear, int maxYear) {
        year  = rnd.getRandomYear(minYear, maxYear);
    }
}