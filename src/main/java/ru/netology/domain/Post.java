package ru.netology.domain;

public class Post {
    public Post() {
        birthday = new FormDate();
    }

    public String name;
    public String patronymic;
    public String surname;
    public String passport;
    public String phone;
    public boolean subscription;
    public FormDate birthday;

}
