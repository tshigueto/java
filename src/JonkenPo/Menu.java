import java.util.*;

public class Menu{

    Scanner read = new Scanner(System.in);
    Action action = new Action();
    int opcao = 1;
    
    do{
        writeln("[ 1 ] - Regras");
        writeln("[ 2 ] - Jogar");
        writeln("[ 3 ] - Ranking");
        writeln("[ 0 ] - Sair");

        write("\nInforme a opção desejada: ");
        opcao = read.nextInt();

        switch(opcao){
            case 1:
                action.Rules();
            break;

            case 2:
                action.Play();
            break;

            case 3:
                action.Ranking();
            break;
                
        }while(opcao!=0);

    close.read();
    }

    public void writeln(String sentence){
        System.out.println(sentence);
    }

    public void write(String sentence){
        System.out.print(sentece)
    }
}