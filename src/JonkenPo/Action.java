import java.util.*;

public class Action{

    public static Scanner read = new Scanner(System.in);

    public static void Rules(){
        writeln("Regras - JonkenPo");
        writeln("\n1º passo - Cada jogador deve inserir seu nickname.");        
        writeln("2º passo - Assim que os jogadores inserirem seus nickname, cada um deverá escrever sua jogada.");
        writeln("3º passo - O computador mostrar o vencedor.");    
        write("Digite 0 para sair");
        int number = read.nextInt();

        if (number==0){
            read.close();
        }

        else{
            writeln("Opção inválida");
        }
    }
    public static void Play(){
        write("Digite seu nome do primeiro jogador: ");
        String name1 = read.nextLine();
        write("Digite seu nome do segundo jogador: ");
        String name2 = read.nextLine();

        write("Digite a opção do primeiro jogador: ");
        String option1 = read.nextLine();
        write("Digite a opção do segundo jogador: ");
        String option2 = read.nextLine();

        if((option1.equalsIgnoreCase("Pedra")) && (option2.equalsIgnoreCase("Pedra"))){
            writeln("Empatou!");            
        }

        else if((option1.equalsIgnoreCase("Pedra")) && (option2.equalsIgnoreCase("Tesoura"))){
            writeln(name1 + " ganhou!");            
        }
        
        else if((option1.equalsIgnoreCase("Pedra")) && (option2.equalsIgnoreCase("Papel"))){
            writeln(name2 + " ganhou!");            
        }
        
        else if((option1.equalsIgnoreCase("Tesoura")) && (option2.equalsIgnoreCase("Tesoura"))){
            writeln("Empatou!");            
        }

        else if((option1.equalsIgnoreCase("Tesoura")) && (option2.equalsIgnoreCase("Papel"))){
            writeln(name1 + " ganhou!");            
        }
        
        else if((option1.equalsIgnoreCase("Tesoura")) && (option2.equalsIgnoreCase("Pedra"))){
            writeln(name2 + " ganhou!");            
        }
        
        else if((option1.equalsIgnoreCase("Papel")) && (option2.equalsIgnoreCase("Papel"))){
            writeln("Empatou!");            
        }

        else if((option1.equalsIgnoreCase("Papel")) && (option2.equalsIgnoreCase("Pedra"))){
            writeln(name1 + " ganhou!");            
        }
        
        else if((option1.equalsIgnoreCase("Papel")) && (option2.equalsIgnoreCase("Tesoura"))){
            writeln(name2 + " ganhou!");            
        }       
        

    }
/*
    public void Ranking(ArrayList<Player>list){
        for(Player item: list){
            writeln(item.getName() + " " + item.getScore() + " pontos\n");
        }
    }
 */
    public static void writeln(String sentence){
        System.out.println(sentence);
    }

    public static void write(String sentence){
        System.out.print(sentence);
    }
}
