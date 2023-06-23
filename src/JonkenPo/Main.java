import java.util.*;
import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        List <Player> list = new ArrayList<>();
        Menu menu = new Menu();
        Player player = new Player();

        writeln("Programa do Jonken-Pô");
        write("Digite seu nome: ");
        String name = player.setName();

        list.add(player.Player(name, score));
        
        menu(ArrayList<Player>);



    }
    
    public void writeln(String sentence){
        System.out.println(sentence);
    }

    public void write(String sentence){
        System.out.print(sentece)
    }
}