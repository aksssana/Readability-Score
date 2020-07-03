package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        try (Scanner scan = new Scanner(file)) {

            String text = scan.nextLine();
            String words[] = text.split("\\s+");
            String[] wordsnew = text.replaceAll("[\\.\\?,!]", "").split("\\s+");
            System.out.println("Words: " + words.length);
            System.out.println("Sentences: " + text.split("[\\.!?]").length);
            int symbols = 0;

            for (int i = 0; i < words.length; i++) {
                symbols += words[i].length();
            }
            System.out.println("Characters: " + symbols);
            double score = 4.71 * symbols / words.length + 0.5 * words.length / text.split("[\\.!?]").length - 21.43;
            int x = findAge(score);
            int syllables = 0;
            int polysyllables = 0;
            for (String word : wordsnew) {
                syllables += countSyllables(word);
                if (countSyllables(word) > 2)
                    polysyllables++;
            }
            double score1 = 0.39 * words.length / text.split("[\\.!\\?]").length + 11.8 * syllables / words.length - 15.59;
            double score2 = 1.043 * Math.sqrt(polysyllables * 30 / text.split("[\\.!\\?]").length) + 3.1291;
            double score3 = 5.88 * symbols / words.length - 29.6 * text.split("[\\.!\\?]").length / words.length - 15.8;
            System.out.println("Syllables: " + syllables);
            System.out.println("Polysyllables: " + polysyllables);
            System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): all\n");
            System.out.printf("Automated Readability Index: %.2f (about %d year olds).\n", score, x);
            System.out.printf("Flesch–Kincaid readability tests: %.2f (about %d year olds).\n", score1, findAge(score1));
            System.out.printf("Simple Measure of Gobbledygook: %.2f (about %d year olds).\n", score2, findAge(score2));
            System.out.printf("Coleman–Liau index: %.2f (about %d year olds).\n", score3, findAge(score3));
        } catch (FileNotFoundException e) {
            System.out.println(e.getCause());
        }
    }

    static int countSyllables(String word) {
        String i = "(?i)[aiouye]+[^ ]";
        Matcher m = Pattern.compile(i).matcher(word);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return Math.max(count, 1);
    }

    static int findAge(double score) {
        int x;
        switch (Math.toIntExact(Math.round(score))) {
            case 1:
                x = 6;
                break;
            case 2:
                x = 7;
                break;
            case 3:
                x = 9;
                break;
            case 4:
                x = 10;
                break;
            case 5:
                x = 11;
                break;
            case 6:
                x = 12;
                break;
            case 7:
                x = 13;
                break;
            case 8:
                x = 14;
                break;
            case 9:
                x = 15;
                break;
            case 10:
                x = 16;
                break;
            case 11:
                x = 17;
                break;
            case 12:
                x = 18;
                break;
            case 13:
                x = 24;
                break;
            default:
                x = 24;
        }
        return x;
    }
}
