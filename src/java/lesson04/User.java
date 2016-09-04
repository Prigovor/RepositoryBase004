package lesson04;

/**
 * Created by nucleos on 04.09.16.
 */
public class User {

    private String name;
    private String surname;
    private Integer age;
    private String login;
    private String password;

    public User(String name, String surname, Integer age, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return (name.hashCode()
                + surname.hashCode()
                + login.hashCode()
                + password.hashCode()) /** age*/;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object instanceof User) {
            User user = (User) object;
            if (name.equals(user.name)
                    && surname.equals(user.surname)
                    && age == user.age
                    && login.equals(user.login)
                    && password.equals(user.password)) {
                return true;
            }
        }
        return false;
    }
}
