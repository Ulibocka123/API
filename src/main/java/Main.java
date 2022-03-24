public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Сергей";
        post.passport = "4444 № 44444444";
        post.patronymic = "Вячеславович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Афанасьев";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 17;
        post.birthday.month = 9;
        post.birthday.year = 1993;
    }
}
