public class Permutation {

    static void permute(String str, String ans) {
        // Base case: agar string empty ho gayi
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursive case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // remaining string after choosing ch
            String ros = str.substring(0, i) + str.substring(i + 1);

            // recursive call
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        permute(s, "");
    }
}

