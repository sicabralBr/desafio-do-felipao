import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome = "";
        int xp = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do herói: ");
        nome = scanner.nextLine();

        System.out.println("Informe a quantidade de XP: ");
        xp = scanner.nextInt();

        if ((xp > 0) && (xp < 1001)) {
            System.out.printf("O Herói %s está no nível de Ferro \n", nome);
            
        } else if (xp < 2001) {
            System.out.printf("O Herói %s está no nível de Bronze \n", nome);
            
        } else if (xp < 5001) {
            System.out.printf("O Herói %s está no nível de Prata \n", nome);
            
        } else if (xp < 7001) {
            System.out.printf("O Herói %s está no nível de Ouro \n", nome);
            
        } else if (xp < 8001) {
            System.out.printf("O Herói %s está no nível de Platina \n", nome);
            
        } else if (xp < 9001) {
            System.out.printf("O Herói %s está no nível de Ascendente \n", nome);

        } else if (xp < 10001) {
            System.out.printf("O Herói %s está no nível de Imortal \n", nome);

        } else if (xp > 10001) {
             System.out.printf("O Herói %s está no nível de Radiante \n", nome);

        }else {
            System.out.println("Quantidade de XP não representa pontuação válida!");
        }

        scanner.close();

    }
}