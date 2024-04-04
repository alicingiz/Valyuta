import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" valyuta daxil edin ");
        String valyuta = scanner.nextLine();

        System.out.println("hedef valyuta");
        String hedef = scanner.nextLine();

        System.out.println("deyeri daxil edin");
        double deyer = scanner.nextInt();

        switch (valyuta) {
            case "USD":
                switch (hedef) {
                    case "AZN" -> System.out.println(deyer * 1.7);
                    case "EUR" -> System.out.println(deyer * 0.92);
                }
                break;
            case "AZN":
                switch (hedef) {
                    case "USD" ->
                        System.out.println(deyer * 0.588);
                    case "EUR" -> System.out.println(deyer * 0.542);
                }
                break;

            case "EUR":
                switch (hedef) {
                    case "AZN" -> System.out.println(deyer * 1.84);
                    case "USD" ->
                        System.out.println(deyer * 1.085);
                }
                 break;
        }
    }
}

