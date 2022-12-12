import java.util.Arrays;
import java.util.Scanner;
class Calculator {
    public static void main(String[] agrs) throws Exception {
        System.out.println("Введите операцию - два операнда и один оператор (разделяя пробелом).");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b;
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rome =  {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] rome2={null,"I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
        b = a.split(" ");
        String x = b[0];
        String o = b[1];
        String y = b[2];
        int x1;
        int y1;
        if (Arrays.asList(arab).contains(x)&&Arrays.asList(rome).contains(y)||Arrays.asList(rome).contains(x)&&Arrays.asList(arab).contains(y)) {
            throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно.");
        }
        if (b.length > 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
        }
        if (Arrays.asList(rome).contains(x)&&Arrays.asList(rome).contains(y)){
            String[]rome1={null,"I","II","III","IV","V","VI","VII","VIII","IX","X",
                    "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                    "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                    "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                    "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                    "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                    "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                    "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                    "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                    "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
            x1 = Arrays.asList(rome1).indexOf(b[0]);
            y1 = Arrays.asList(rome1).indexOf(b[2]);
        } else {
            x1 = Integer.parseInt(x);
            y1 = Integer.parseInt(y);
        }
        char o1 = o.charAt(0);
        int result = calc(x1, y1, o1);
        if (Arrays.asList(rome).contains(x)) {
            if (result < 0) {
                throw new Exception("В римской системе нет отрицательных чисел.");
            }
            String result1 = rome2[result];
            System.out.println("Результат операции: " + result1);
            System.exit(0);
        }
        System.out.println("Результат операции: " + result);
    }
    public static int calc(int x1, int y1, char o1) throws Exception {
        int result;
        switch (o1) {
            case '+':
                result = x1 + y1;
                break;
            case '-':
                result = x1 - y1;
                break;
            case '*':
                result = x1 * y1;
                break;
            case '/':
                result = x1 / y1;
                break;
            default:
                throw new Exception("Операция не распознана. Повторите ввод.");
        }
        return result;
    }


}
