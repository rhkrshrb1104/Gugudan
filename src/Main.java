// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("구구단 시작");
        for (int i = 2; i < 10; i++){
            System.out.println(System.lineSeparator() + "구구단 " + i + "단");

            for (int j = 1; j < 10; j++){
                System.out.println( i + "x" + j + "=" + i*j);
            }
        }
    }
}