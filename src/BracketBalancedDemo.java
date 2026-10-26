//Yunus Emre Çaparoğlu
//240444044
//26.10.2026

public class BracketBalancedDemo {
    public static void main(String[] args) {


        String[] exprs = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        for (String e : exprs) {
            boolean res = BalancedBrackets.isBalanced(e);
            System.out.println(e + " -> " + res);
        }
    }
}