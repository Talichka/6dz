import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();

        System.out.println(Dog.doVoice());
        System.out.println(dog2.doVoice());
        System.out.println(dog.doAction());
        System.out.println(dog2.doAction());
            }
}