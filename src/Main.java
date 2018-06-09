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

        for ( int i = 1; i <= 10; i++) {
            String valorConvertido = converterDecimalParaRomano(i);
            System.out.println(valorConvertido);
        }

        int i = 1;//
        while (i<= 10) {
            String valorConvertido = converterDecimalParaRomano(i);
            System.out.println(valorConvertido);
            i++;
        }


                System.out.println("MENU");
                System.out.println("[1] Pistolas");
                System.out.println("[2] Pesadas");
                System.out.println("[3] Submetralhadoras");
                System.out.println("[4] Rifles");
                System.out.println("[5] Diversos");
                int menu = scanner.nextInt();
            switch (menu){
                case 1 :
                    System.out.println("Pistolas");
                    System.out.println("[1] USP $200");
                    System.out.println("[2] Glock $200");
                    System.out.println("[3] Desert Eagle $700");
                    System.out.println("[0] Voltar");
                    break;
                case 2 :
                    System.out.println("Pesadas");
                    System.out.println("[1] Shotgun $500");
                    System.out.println("[2] Shotgun Auto $700");
                    System.out.println("[3] M-249 $1200");
                    System.out.println("[0] Voltar");
                    break;
                case 3 :
                    System.out.println("Submetralhadoras");
                    System.out.println("[1] Micro Uzi $300");
                    System.out.println("[2] UMP 45 $350");
                    System.out.println("[3] P-90 $noob");
                    System.out.println("[0] Voltar");
                    break;
                case 4 :
                    System.out.println("Rifles");
                    System.out.println("[1] M4A4 $ 950");
                    System.out.println("[2] AK 47 $ 900");
                    System.out.println("[3] AWP $ 1300");
                    System.out.println("[0] Voltar");
                    break;
                case 5 :
                    System.out.println("Diversos");
                    System.out.println("[1] Granada de Fragmentação $ 100");
                    System.out.println("[2] Granada de Fumaça $ 100");
                    System.out.println("[3] Colete + Capacete $200");
                    System.out.println("[0] Voltar");
                    break;
            }
    }
}
// http://respostas.guj.com.br/233-como-retornar-ao-menu-principal
// http://www.javaprogressivo.net/2012/09/aplicativo-menu-simples-usando-metodos.html