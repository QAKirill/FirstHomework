package qa.homework.utils;

import com.github.javafaker.Faker;
import qa.homework.pages.enums.*;
import qa.homework.pages.enums.cities.CitiesHaryana;
import qa.homework.pages.enums.cities.CitiesNCR;
import qa.homework.pages.enums.cities.CitiesRajasthan;
import qa.homework.pages.enums.cities.CitiesUttarPradesh;

import java.util.Locale;

public class RandomTestData {
    Faker faker = new Faker(new Locale("en"));

    public String getRandomFirstName(){
        return faker.name().firstName();
    }

    public String getRandomLastName(){
        return faker.name().lastName();
    }

    public String getRandomEmail(){
        return faker.internet().emailAddress();
    }

    public String getRandomGender(){
        int x = (int)(Math.random() * Gender.values().length);
        return Gender.values()[x].toString();
    }

    public String getRandomPhone(){
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomYear(int min, int max) {
        return faker.random().nextInt(min, max).toString();
    }

    public String getRandomMonth(){
        int x = (int)(Math.random() * Months.values().length);
        return Months.values()[x].toString();
    }

    public String getRandomDay(){
        StringBuilder builder = new StringBuilder(Integer.toString((int)(Math.random() * 30) + 1));
        if (builder.length() == 1){
            builder.insert(0,"0");
        }
        return builder.toString();
    }

    public String getRandomSubject(){
        int x = (int)(Math.random() * Subjects.values().length);
        return Subjects.values()[x].getValue();
    }

    public String getRandomHobby(){
        int x = (int)(Math.random() * Hobbies.values().length);
        return Hobbies.values()[x].toString();
    }

    public String getRandomAddress(){
        return faker.address().streetAddress();
    }

    public String getRandomState(){
        int x = (int)(Math.random() * States.values().length);
        return States.values()[x].getValue();
    }

    public String getRandomCity(String state){
        String city = "";

        if (state != null) {
            switch (state) {
                case "NCR":
                    city = CitiesNCR.values()[(int) (Math.random() * CitiesNCR.values().length)].toString();
                    break;

                case "Uttar Pradesh":
                    city = CitiesUttarPradesh.values()
                            [(int) (Math.random() * CitiesRajasthan.values().length)].toString();
                    break;

                case "Haryana":
                    city = CitiesHaryana.values()[(int) (Math.random() * CitiesHaryana.values().length)].toString();
                    break;

                case "Rajasthan":
                    city = CitiesRajasthan.values()
                            [(int) (Math.random() * CitiesRajasthan.values().length)].toString();
                    break;
            }
        }

        return city;
    }
}