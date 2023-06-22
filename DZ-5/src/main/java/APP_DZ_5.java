public class APP_DZ_5 {
    public static void main(String[] args) {
        int val1 = 23;
        int val2 = 34;
        int val3 = 125;
        int val4 = 200;
        int sum1 = val1 + val2;
        int sum2 = val3 + val4;
        boolean com = sum1 < sum2;
        System.out.println(com);
        sum1 = ++sum1;
        sum2 = sum2-2;
        boolean com1 = sum1 > sum2;
        System.out.println(com1);
        sum1 = sum1 % 2;
        sum2 = sum2 % 2;
        boolean com2 = sum1==0 | sum2==0;
        System.out.println(com2);

    }
}
