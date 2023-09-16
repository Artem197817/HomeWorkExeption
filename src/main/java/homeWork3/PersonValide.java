package homeWork3;

public class PersonValide {

    ValidatorInterface validator;

    public PersonValide(ValidatorInterface validator) {
        this.validator = validator;
    }

    public Person personCreate(String str) {
        String[] arr = str.split(" ");
        if (validator.checkSizeArray(arr, 6)) {
            try {
                validator.checkFCs(arr[0]);
                String surname = arr[0];
                validator.checkFCs(arr[1]);
                String name = arr[1];
                validator.checkFCs(arr[2]);
                String patronymic = arr[2];
                validator.checkBirthday(arr[3]);
                String birthday = arr[3];
                validator.checkNumberPhone(arr[4]);
                String numberPhone = arr[4];
                validator.checkGender(arr[5]);
                String gender = arr[5];
                return new Person(surname, name, patronymic, birthday, numberPhone, gender);
            } catch (MyCheckStringDataException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
