public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1313 № 66666666";
        post.patronymic = "Иванович";
        post.phone = "+7(920)-654-78-23";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 9;
        post.birthday.year = 1994;
    }
}
