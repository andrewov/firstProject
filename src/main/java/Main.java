import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,1,2,5};
        String wordsLine = "";
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
        System.out.println(smallWord("Жизнь - Кастинг,горим и гаснем! \n У лукоморья - дуб зеленый, \n Златая цепь на дубе том."));

        Scanner words = new Scanner(System.in);
        System.out.println("Введите строку: ");
        wordsLine = words.nextLine();
        System.out.println("Кол-во слов в введённой строке = " + countWords(wordsLine));
        System.out.println("Новая строка: \n" + deleteOfLastWord(wordsLine));
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

    ///////////////////////////////////////////////////////

    //чётное число
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

    //определение координат
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

    //нахождение факториала
    public static int valueFact(int n){
        return n <= 1 ? 1: n * valueFact(n - 1);
    }

    //зеркальное отображение числа
    public static int valueMirror(int n){
        int tmp = 0;

        while( n > 0){
            tmp = 10 * tmp + n % 10;
            n /= 10;
        }
        return tmp;
    }

    // реверс массива
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

    // сортировка пузырьком
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

    // парсим целое число в строку
    public static String parseValueIntToString(int a){
        String str = "";

        str = Integer.toString(a);

        return str;
    }

    // парсим число с точкой в строку
    public static String parseValueDoubleToString(double a){
        String str = "";

        str = Double.toString(a);

        return str;
    }

    // парсим строку в целое число
    public static int parseValueStringToInt(String a){
        int str = 0;

        str = Integer.parseInt(a);

        return str;
    }

    // парсим строку в число с точкой
    public static double parseValueStringToDouble(String a){
        double str = 0.0d;

        str = Double.parseDouble(a);

        return str;
    }

    // нахождение минимального слова в строке
    public static String smallWord(String a){
        String[] minWord = a.trim().split("[\\s\\p{Punct}]");

        int minIndex = 0;

        for(int i = 0; i < minWord.length; i++){
            if(minWord[i].length() < minWord[minIndex].length()){
                if((minWord[i].length() != 0) && (minWord[i].length() != 1)) {
                    minIndex = i;
                }
            }
        }

        return minWord[minIndex];

    }

    // считаем кол-во слов во введенной строке
    public static int countWords(String a){
        int count = 0;

        String[] word = a.trim().split("[\\s\\p{Punct}]");

        for(int i = 0; i < word.length; i++){
            if((word[i].length() != 0) && (word[i].length() != 1)) {
                count++;
            }
        }

        return count;
    }

    // удаляем последнее слово в строке, работает если написали строку правильно)))
    public static String deleteOfLastWord(String a){

       String word = a.trim().substring(0, a.lastIndexOf(" "));

        return word;
    }
}
