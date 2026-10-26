//Yunus Emre Çaparoğlu
//240444044
//26.10.2026

public class ReverseEquationDemo {
    public static void main(String[] args) {
        String[] list = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };

        for (String item : list) {
            System.out.println("Input:  " + item);
            System.out.println("Output: " + EquationReverser.reverseEquation(item));
            System.out.println();
        }
    }
}