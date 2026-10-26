//Yunus Emre Çaparoğlu
//240444044
//26.10.2026

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        BracketStack st = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) return false;
                char open = st.pop();
                if (!isMatchingPair(open, c)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean isMatchingPair(char o, char c) {
        if (o == '(' && c == ')') return true;
        if (o == '[' && c == ']') return true;
        if (o == '{' && c == '}') return true;
        return false;
    }
}