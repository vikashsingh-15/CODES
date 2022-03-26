import java.util.*;

class ChemicalNumberTheory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] CharArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b',
                'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z' };

        String str = sc.nextLine();
        String strArray[] = str.split(" ");
        int reactivity[] = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            String element = strArray[i];
            int res = 0;
            if (element.length() == 1) {
                res = Seracher(CharArray, element.charAt(0));
            } else if (element.length() == 2) {
                int pos1 = Seracher(CharArray, element.charAt(0));
                int pos2 = Seracher(CharArray, element.charAt(1));
                res = pos1 * (pos2 + 1) + pos2;
            }
            reactivity[i] = res;
        }

        int Max = 1;
        for (int i = 0; i < reactivity.length - 1; i++) {
            if (!isprime(reactivity[i])) {
                for (int j = i + 1; j < reactivity.length; j++) {
                    Max = Math.max(HCF(reactivity[i], reactivity[j]), Max);
                }
            } 
        }
        System.out.println(Max);

    }

    static int Seracher(char[] CharArray, char ch) {
        int low = 0;
        int high = CharArray.length - 1;
        int pos = 0;
        for (int i = 0; i < CharArray.length; i++) {
            if (CharArray[i] == ch) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    static int HCF(int a, int b) {
        int c = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        c = a + b;
        return c;
    }

    static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3 || n == 5) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        } else if (n % 3 == 0) {
            return false;
        } else if (n % 5 == 0) {
            return false;
        }
        for (int i = 6; i * i <= n; i = i + 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

}