import java.util.*;

public class Action{

    public Scanner read = new Scanner(System.in);

    public void Rules(){
        writeln("Regras - JonkenPo");
        writeln("\n[ 1 ] - Cada jogador deve inserir seu nickname.");        
        writeln("[ 2 ] - Assim que os jogadores inserirem seus nomes, cada um deverá escrever sua jogada.");
        writeln("[ 3 ] - O computador vai armazenar o resultado.");
    }

    public void Play(){

    }

    public void Ranking(ArrayList<Player>list){
        for(Player item: list{
            writeln(item.getName() + " " + item.getScore() + " pontos\n");
        }
    }

    public void writeln(String sentence){
        System.out.println(sentence);
    }

    public void write(String sentence){
        System.out.print(sentece)
    }
}
