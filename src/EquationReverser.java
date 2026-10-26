//Yunus Emre Çaparoğlu
//240444044
//26.10.2026

public class EquationReverser {

    public static String reverseEquation(String eq) {
        TokenStack stack = new TokenStack();
        int i = 0;
        int len = eq.length();

        while (i < len) {
            char ch = eq.charAt(i);

            if (Character.isDigit(ch)) {
                int sIdx = i;
                while (i < len && Character.isDigit(eq.charAt(i))) {
                    i++;
                }
                stack.push(eq.substring(sIdx, i));
            } else {
                stack.push(String.valueOf(ch));
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}