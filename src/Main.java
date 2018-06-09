import java.util.Scanner;

public class Main {
    public static String converterDecimalParaRomano(int numero){ // funçao e swtich exercio hardcore 1
        switch (numero) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            default:
                return ("número inválido, digite um número de 1 a 10.");
        }
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        String nome = "Jorge Henrique Carvalho";
        Integer idade = 12;
        Boolean sexoFeminino = false;
        Double peso = 72.5;
        System.out.println ("Olá, meu nome é " +nome+ " tenho " +idade+ " anos de idade. ");

        if (idade <= 18){
            System.out.println (" novinho ");
        } else if ( idade <= 30 ){
            System.out.println (" Tiozinho ");
        } else {
            System.out.println(" Tiozão ");
        } // exercicio 1,2,3.

        Integer diaDaSemana = 0;
        switch (diaDaSemana){
            case 0 :
                System.out.println ("Domingo");
                break;
            case 1 :
                System.out.println ("Segunda");
                break;
            case 2 :
                System.out.println ("Terça");
                break;
            case 3 :
                System.out.println ("Quarta");
                break;
            case 4 :
                System.out.println ("Quinta");
                break;
            case 5 :
                System.out.println ("Sexta");
                break;
            default:
                System.out.println ("Sábado");
                break;
        } // exrecicio 4. Switch.

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        int numero = scanner.nextInt();
        System.out.println(converterDecimalParaRomano(numero));// invocando função exercicio hardcore 1
    }
}

