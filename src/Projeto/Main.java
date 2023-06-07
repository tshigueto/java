import java.util.*; //importar Scanner

class ProjetoFinal{ //criando classe ProjetoFinal
  
  public static void main(String[] args) {

    ArrayList<Ranking> l = new ArrayList<>(); //criando ArrayList
    Scanner ler = new Scanner(System.in); //criando classe Scanner
    Creditos c = new Creditos(); //criando classe Creditos
    Instrucao i = new Instrucao(); //criando classe Instruçao
    Chaves cha = new Chaves(); //criando classe Chaves
    Chiquinha chi = new Chiquinha(); //criando classe Chiquinha
    Kiko kik = new Kiko(); //criando classe Kiko
        
    int opcao = 1; //criando uma variável para ficar no laço de repetição enquanto usuário não decidir sair
    
    while(opcao!=0){ //criando Menu com repetição 
      
    msg1("\nMenu");
    msg1(" ");
    msg1("[1] - Intruções");
    msg1("[2] - Jogar");
    msg1("[3] - Créditos");
    msg1("[4] - Imprimir Ranking");
    msg1("[0] - Sair");    
    msg1(" ");
    msg2("Digite a opção desejada: ");
    opcao = ler.nextInt();
      
    switch(opcao){ //Lista das opções do menu que o usuário escolher
        
      case 1:
      i.instrucoes();
      break;

      case 2:
      msg1("Opções de Personagens:");  //Menu de personagens para o usuário escolher
      msg1("\n[ 1 ] - Chaves");
      msg1("[ 2 ] - Chiquinha");
      msg1("[ 3 ] - Kiko");
      msg1("\nCom qual personagem você deseja jogar? ");
      int x = ler.nextInt();
        if(x==1){ //condição para saber qual personagem o usuário escolheu
          cha.jogarChaves(l);
        }
        else if (x==2){ //condição para saber qual personagem o usuário escolheu
          chi.jogarChiquinha(l);
        }
        else if (x==3){ //condição para saber qual personagem o usuário escolheu
          kik.jogarKiko(l);
        }
        else {
          msg1("Opção inválida!");
        }
      break;

      case 3: 
      c.credito();
      break;
      
      case 4: 
      r.imprimirRanking(l);
      break;          
          
      case 0:
      System.exit(0);
      break;

      default: //retorno quando o usuário digitar uma opção inválida
      msg1("Opção Inexistente! \nTente novamente!");
      }
    }
  
  }
  
  public static void msg1(String frase1){ //função para substituir System.out.println
    System.out.println(frase1);
  }
  
  public static void msg2(String frase2){ //função para substituir System.out.print
    System.out.print(frase2);
  }
  
}
