import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String originalString = scan();
        String words[] = originalString.split("\\s");
        String reversedSentence = "";
        reversedSentence = reverseSentence(reversedSentence,words);
        System.out.print("Reversed sentence : " + reversedSentence);
    }

    public static String scan()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String originalString = scanner.nextLine();
        scanner.close();
        return originalString;
    }
    public static String reverseSentence(String reversedSentence,String words[])
    {
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedSentence = words[i] + reversedSentence;
            else
                reversedSentence = " " + words[i] + reversedSentence;
        }
    return  reversedSentence;
    }

}
