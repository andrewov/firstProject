import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,1,2,5};
        System.out.println(valueEvent(4, 4, 4));
        System.out.println("Координаты находятся в " + valueCoordinates(3, -5) + " четверти.");
        System.out.println("Факториал: " + valueFact(6));
        System.out.println(valueMirror(123));
        reversArray(array);
        System.out.println("-----------");
        bubleSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("------------");
        System.out.println(parseValueIntToString(256));
        System.out.println(parseValueDoubleToString(13.56432d));
        System.out.println(parseValueStringToInt("756"));
        System.out.println(parseValueStringToDouble("0.456222554"));
//        System.out.println(smallWord("Кастинг, горим и гаснем!"));
    }

    public int valueSumm(int a, int b) {
        return a + b;
    }

    public static int valueDiff(int a, int b) {
        return a - b;
    }

    public static int valueDivide(int a, int b) {
        if (a == 0) {
            return 0;
        }
        return a / b;
    }

    public static int valueMult(int a, int b) {
        return a * b;
    }

    public int valueDiv(int a, int b) {
        return a % b;
    }

    public static int valueEvent(int a, int b, int c) {
        int result = 0;

        if (a % 2 == 0) {
            result = a * b / c;
        } else if ((a + b) % 2 == 0 || (b + c) % 2 == 0) {
            result = (int) Math.pow(a, c);
        } else {
            result = a + b - c;
        }

        return result;
    }

    public static int valueCoordinates(int x, int y){
        int result = 0;

        if(x > 0 && y > 0){
            result = 1;
        }else if(x < 0 && y > 0){
            result = 2;
        }else if(x < 0 && y < 0){
            result = 3;
        }else if(x > 0 && y < 0){
            result = 4;
        }else{
            result = 0;
        }

        return result;
    }

    public static int valueFact(int n){
        return n <= 1 ? 1: n * valueFact(n - 1);
    }

    public static int valueMirror(int n){
        int tmp = 0;

        while( n > 0){
            tmp = 10 * tmp + n % 10;
            n /= 10;
        }
        return tmp;
    }

    public static void reversArray(int[] array){

        int border = (array.length + 1)/ 2;

        for(int i = 0; i < array.length/2; i++){
            int tmp = array[i];
            array[i] = array[border+i];
            array[border+i] = tmp;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void bubleSort(int[] array){
        int tmp = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static String parseValueIntToString(int a){
        String str = "";

        str = Integer.toString(a);

        return str;
    }

    public static String parseValueDoubleToString(double a){
        String str = "";

        str = Double.toString(a);

        return str;
    }

    public static int parseValueStringToInt(String a){
        int str = 0;

        str = Integer.parseInt(a);

        return str;
    }

    public static double parseValueStringToDouble(String a){
        double str = 0.0d;

        str = Double.parseDouble(a);

        return str;
    }

//    public static String smallWord(String a){
//        String[] minWord = a.split("[\\p{Punct}\\s]+");
//        Set set = new TreeSet<String>(/*(o1, o2) -> o1.length() - o2.length()*/);
//        set.addAll(Arrays.asList(minWord));
//
//        String shortest = (String) set.toArray()[0];
//        return shortest;
//    }
}
