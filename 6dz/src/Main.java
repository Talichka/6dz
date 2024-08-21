import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] [] arraytest = new String [][]{{"3","2"},{"7","5","6"}};

        for (int k = 0; k < arraytest.length; k++) {
            System.out.println(Arrays.toString(arraytest[k]));
            for (int j = 0; j < arraytest[k].length; j++)
                System.out.println(String.format("element with index k [%d] then index j [%d] is %s", k, j, arraytest[k][j]));
        }
            {System.out.println(arraytest.length);}
        Arrays.sort(arraytest[1]);
        //String [] new1 = arraytest[1];
        //for (String d: new1)
        {System.out.println(Arrays.toString(arraytest[1]));}


    }
//        Dog dog = new Dog();
//        Dog dog2 = new Dog();
//
//        System.out.println(Dog.doVoice());
//        System.out.println(dog2.doVoice());
//        System.out.println(dog.doAction());
//        System.out.println(dog2.doAction());
//            }
}