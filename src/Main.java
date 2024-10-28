import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do comprimento: ");
        float comprimento = scanner.nextFloat();
        System.out.print("Valor da largura: ");
        float largura = scanner.nextFloat();

        Retangulo retangulo = new Retangulo(comprimento, largura);

        System.out.println(retangulo);
        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Perimetro: " + retangulo.getPerimetro());

        scanner.close();
    }
}
