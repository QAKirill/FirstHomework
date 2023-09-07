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
        int x = (int)(Math.random() * 3);
        return Gender.values()[x].toString();
    }

    public String getRandomPhone(){
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomYear(int min, int max) {
        max -= min;
        return Integer.toString((int) (Math.random() * ++max) + min);
    }

    public String getRandomMonth(){
        int x = (int)(Math.random() * 12);
        return Months.values()[x].toString();
    }

    public String getRandomDay(){
        int first = (int)(Math.random() * 4);
        int second;
        if(first == 3){
            second = (int)(Math.random() * 2);
        }
        else if(first == 0){
            second = (int)(Math.random() * 9) + 1;
        }
        else {
            second = (int)(Math.random() * 10);
        }

        return Integer.toString(first) + second;
    }

    public String getRandomSubject(){
        int x = (int)(Math.random() * 14);
        return Subjects.values()[x].getValue();
    }

    public String getRandomHobby(){
        int x = (int)(Math.random() * 3);
        return Hobbies.values()[x].toString();
    }

    public String getRandomAddress(){
        return faker.address().streetAddress();
    }

    public String getRandomState(){
        int x = (int)(Math.random() * 4);
        return States.values()[x].getValue();
    }

    public String getRandomCity(String state){
        String city = "";

        if (state != null) {
            switch (state) {
                case "NCR":
                    city = CitiesNCR.values()[(int) (Math.random() * 3)].toString();
                    break;

                case "Uttar Pradesh":
                    city = CitiesUttarPradesh.values()[(int) (Math.random() * 3)].toString();
                    break;

                case "Haryana":
                    city = CitiesHaryana.values()[(int) (Math.random() * 2)].toString();
                    break;

                case "Rajasthan":
                    city = CitiesRajasthan.values()[(int) (Math.random() * 2)].toString();
                    break;
            }
        }

        return city;
    }
}