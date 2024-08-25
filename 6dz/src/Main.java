import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        myList.add("Aa");
        myList.add("Bb");
        myList.add("Cc");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(1));
            if (i == i) {
                myList.remove(1);

            }

        }
    }

//        String [] [] arraytest = new String [][]{{"3","2"},{"7","5","6"}};
//
//        for (int k = 0; k < arraytest.length; k++) {
//            System.out.println(Arrays.toString(arraytest[k]));
//            for (int j = 0; j < arraytest[k].length; j++)
//                System.out.println(String.format("element with index k [%d] then index j [%d] is %s", k, j, arraytest[k][j]));
//        }
//            {System.out.println(arraytest.length);}
//        Arrays.sort(arraytest[1]);
//        //String [] new1 = arraytest[1];
//        //for (String d: new1)
//        {System.out.println(Arrays.toString(arraytest[1]));}
//
//
//    }
    //------------------------------------------------
//        Dog dog = new Dog();
//        Dog dog2 = new Dog();
//
//        System.out.println(Dog.doVoice());
//        System.out.println(dog2.doVoice());
//        System.out.println(dog.doAction());
//        System.out.println(dog2.doAction());
//            }
}