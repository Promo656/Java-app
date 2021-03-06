package contacts;

import java.time.LocalDate;

class Person extends Contact {
    String surname;
    LocalDate birthDate;
    String gender;

    Person(String name, String surname, LocalDate birthDate, String gender, String phoneNumber) {
        super(name, phoneNumber);
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        String birthDate = getBirthDate() == null ? "[no data]" : getBirthDate().toString();
        return "Name: " + getName() + "\n" +
                "Surname: " + getSurname() + "\n" +
                "Birth date: " + birthDate + "\n" +
                "Gender: " + getGender() + "\n" +
                "Number: " + getPhoneNumber() + "\n" +
                "Time created: " + getTimeCreated() + "\n" +
                "Time last edit: " + getTimeLastEdit();
    }
}
