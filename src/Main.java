import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] in = {"каждый", "охотник", "каждый", "знать", "знать"};
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }

            System.out.println(" ");
            String[] out = Arrays.stream(in).distinct().toArray(String[]::new);


            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i] + " ");
            }
        }
    }
