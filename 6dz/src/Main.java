public class Main {
    public static void main(String[] args) {
        int a = 1000;
        int b = 1000;
        int sumAB = a + b;
        int c = 200;
        int d = 200;
        int sumCD = c + d;
        String result1 = sumAB > sumCD ? "true" : "no";
        System.out.println(result1);
        sumAB  = ++sumAB;
       sumCD -=30;
        String result2 = sumAB > sumCD ? "true" : "no";
        System.out.println(result2);
        System.out.println(((sumAB % 2 == 0) || (sumCD % 2 == 0)));
        System.out.println(sumAB % sumCD);
        System.out.println(sumCD % 2);
    }
}