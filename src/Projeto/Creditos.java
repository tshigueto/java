import java.util.*; //importar java.util toda

public class Creditos{ //criando a classe

  public static void credito(){ //criando metodo para mostrar os créditos

    Scanner ler =  new Scanner(System.in);    
    
    msg1("\nAnálise e Desenvolvimento de de Sistemas - Turma D");
    msg1("\nSENAC"); 
    msg1("\nAlunos:"); 
    msg1("Camila Pereira"); 
    msg1("Juliana Camargo"); 
    msg1("Thiago Shigueto"); 
    msg1("\nDigite 0 para voltar ao menu principal.");
    int opcao = ler.nextInt();

    while (opcao!=0){ //criando laço de repetição para usuário dar comando e voltar para menu inicial
      switch(opcao){
        case 0:

        break;

        default:
          msg1("opção inválida");
        break;
      }
    }         
  }
  
  public static void msg1(String frase1){ //criando um método para imprimir mensagens
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){ //criando um método para imprimir mensagens
    System.out.print(frase2);
  }
  
}