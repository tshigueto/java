import java.util.*;
import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        List <Player> list = new ArrayList<>();
        Action action = new Action();
        Player player = new Player();

        writeln("Programa do Jonken-Pô");

        int option = 1;

        while(option!=0){
            writeln("\n[ 1 ] - Regras");
            writeln("[ 2 ] - Jogar");
   //         writeln("[ 3 ] - Ranking");
            writeln("[ 0 ] - Sair");

            write("\nInforme a opção desejada: ");
            option = read.nextInt();

            switch(option){
                case 1:
                    action.Rules();
                break;

                case 2:
                    action.Play();
                break;
/*
                case 3:
                    action.Ranking(ArrayList<Player>());
                break;
*/
                
                case 0:
                    read.close();
                break;
                
                default:
                    writeln("Opção inválida");
                break;
            }        
        }
    }
    
    public static void writeln(String sentence){
        System.out.println(sentence);
    }

    public static void write(String sentence){
        System.out.print(sentence);
    }
}