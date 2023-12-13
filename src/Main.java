import java.util.Scanner;

/*
 Создайте класс "Пользователь" с приватными полями имя, возраст и электронная почта.
Реализуйте методы getName(), getAge() и getEmail(), которые возвращают соответствующие значения.
Добавьте метод sendEmail(), который отправляет электронное письмо пользователю, и метод changePassword(),
который позволяет пользователю изменить пароль.
*/
public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.registration();
        user1.showUserData();
        user1.sendEmail();
    }


}

class User{
    Scanner scanner = new Scanner(System.in);

    private String name;
    private  String email;
    private int age;

    public  void registration() {
        System.out.println("Здравствуйте, необходимо зарегистрироваться.");

        System.out.println("Здравствуйте " + name);
    }
        public void setAge ( int age){
            System.out.print("Введите ваш возраст: ");
            this.age = scanner.nextInt();

        }
        public int getAge () {
            return age;
        }

        public void setEmail (String email){
            System.out.print("Введите ваш email: ");
            this.email = scanner.nextLine();
        }
        public String getEmail () {
            return email;
        }

        public void setName (String name){
            System.out.print("Введите ваше имя: ");
            this.name = scanner.nextLine();
        }
        public String getName () {
            return name;
        }


    public void sendEmail(){
        System.out.println("Напишите почту на которую хотите отправить письмо: ");
        String nameSendEmail = scanner.nextLine();
        System.out.println("Напишите письмо: ");
        String userMail = scanner.nextLine();

        System.out.println("Ваше письмо " + userMail +" отправлено на адрес "+ nameSendEmail);
    }

    public void showUserData(){
        System.out.println("Ваши данные: email = "+email+", возраст = "+age+", имя = "+name+".");

    }
}


