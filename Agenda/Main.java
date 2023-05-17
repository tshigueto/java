import java.util.*;
import java.text.*;

class Main1 {
  
  public static void main(String[] args) throws Exception{
    Scanner ler = new Scanner(System.in);  
    ArrayList <Evento> agenda = new ArrayList <Evento> ();
    Evento e = new Evento();
    Acao a = new Acao();
    int opcao = 1;

    while(opcao!=0){
      msg1("--- Agenda ---");
      msg1("\n[ 1 ] Adicionar evento:");
      msg1("[ 2 ] Remover evento:");
      msg1("[ 3 ] Listar futuros eventos:");
      msg1("[ 4 ] Listar eventos passados:");
      msg1("[ 0 ] Sair:");

      msg2("\nInforme a opção desejada: ");
      opcao = ler.nextInt();

      switch(opcao){

        case 1:          
          a.adicionar(agenda);
        break;
          
        case 2:
          a.remover(agenda);
        break;
          
        case 3:
          a.listarFutura(agenda);
        break;
          
        case 4:
          a.listarPassado(agenda);
        break;

        case 0:
        msg1("Finalizando sistema...");
        ler.close();
        break;

        default:
        msg1("Opção inválida");
        break;                
      }
    }    
  }
  
  public static void msg1(String frase1){
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){
    System.out.print(frase2);
  }
  
}