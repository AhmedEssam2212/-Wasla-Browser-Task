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
    // Note : the time complexity of reverseSentence Function is O(n),
    // and the Space complexity is O(n) as we’re storing string in the new variable.
    // I didn't implement it with the recursion function to avoid using extra space,
    // because if we used a recursion the OS would build a stack automatically
    // then it will be much better if we can do it with iteration " without needing to build a stack manually ".
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
