package homeWork3;

public class Person {

    private final String name;
    private final String surname;
    private final String patronymic;
    private final String birthday;
    private final String numberPhone;
    private final String gender;

    public String getSurname() {
        return surname;
    }

    public Person(String surname, String name, String patronymic, String birthday, String numberPhone, String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<" + surname + ">" +
                "<" + name + ">" +
                "<" + patronymic + ">" +
                "<" + birthday + ">" +
                "<" + numberPhone + ">" +
                "<" + gender + ">" + "\n";
    }
}
