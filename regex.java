import java.util.regex.*;

public class regex {
    public static void main(String[] args) {

        String str = "Hii hello helloeveryone";
        Pattern p1 = Pattern.compile("hello");
        Matcher m1 = p1.matcher(str);
        while (m1.find()) {
            System.out.println(m1.group());
        }
        System.out.println();

        String s1 = "ababcabcdaabdc";
        Pattern p2 = Pattern.compile("abc");
        Matcher m2 = p2.matcher(s1);
        while (m2.find()) {
            System.out.println(m2.group() + " starts at " + m2.start());
        }
        System.out.println();

        String s2 = "abcdef";
        Pattern p3 = Pattern.compile("[^abc]");
        Matcher m3 = p3.matcher(s2);
        while (m3.find()) {
            System.out.println(m3.group() + " starts at " + m3.start());
        }
        System.out.println();

        /*
         * Pattern p4 = Pattern.compile("[a-z]"); it gives alphabets from a-z within the
         * pattern
         * Pattern p4 = Pattern.compile("[^a-z]"); it gives all the characters except
         * a-z
         * ^ --> it is used to deselect
         */
        String s3 = "abcdef52367348ewguyercgby7tc@#%#$%&^%*^()";
        Pattern p4 = Pattern.compile("[^a-z]");
        Matcher m4 = p3.matcher(s3);
        while (m3.find()) {
            System.out.println(m4.group() + " starts at " + m4.start());
        }
        System.out.println();

        /*
         * Quantifires are
         * + -->checks atleast one match
         * * -->checks any number of match if a match not present then it shows space
         * ? -->Atmost one match
         * {} -->Checks the no of occurence of patterns with the braces
         * example : Pattern p6 = Pattern.compile("a{3}"); it checks minimum 3 occurence
         * of "a";
         * Pattern p6 = Pattern.compile("a{1,3}"); it checks minimum 1-3 ocuurence of
         * "a";
         */
        String s4 = "abaabaacbdaababaacda";
        Pattern p5 = Pattern.compile("a+"); // Quantifiers prints how many the pattern occurs
        Matcher m5 = p5.matcher(s4);
        while (m5.find()) {
            System.out.println(m5.group() + " starts at " + m5.start());
        }
        System.out.println();
        String s5 = "abaabaacbdaababaacda";
        Pattern p6 = Pattern.compile("a{1,4}"); // Quantifiers prints how many the pattern occurs
        Matcher m6 = p6.matcher(s5);
        while (m6.find()) {
            System.out.println(m6.group() + " starts at " + m6.start());
        }
        System.out.println();

    }
}
