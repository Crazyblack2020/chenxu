package day08.demo04;

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {

        String str = "fjkldsjflafjljfinvpqnr334";

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
