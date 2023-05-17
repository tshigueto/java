import java.util.*;
import java.text.*;

public class Acao{
  public static Scanner ler = new Scanner(System.in);
  
  public static void adicionar(ArrayList <Evento> agenda) throws Exception{
    Evento e = new Evento();
    
    msg1("\nOpção escolhida: Adicionar evento");
    msg2("Informe o nome do evento: ");
    ler.nextLine();
    String nome = ler.nextLine();
    e.setNome(nome);
          
    msg2("Informe a data do evento (formato: dd/MM/yyyy): ");
    ler.nextLine();
    String x = ler.nextLine();  
    Date data = new SimpleDateFormat("dd/MM/yyyy").parse(x);

    agenda.add(e);    
  }

  public static void remover(ArrayList <Evento> agenda){
    Evento e = new Evento();
    
    msg1("\nOpção escolhida: Adicionar evento");
    msg2("Informe o nome do evento: ");    
    ler.nextLine();
    String nome = ler.nextLine();
    e.setNome(nome);
    String eventoRemover = null;

    /*for (int i = 0; i<agenda.size(); i++){
      if(nome.equalsIgnoreCase().e.getNome()){
       evento.remove(e.getNome); 
      }      
    }*/
    
    
    for (Evento lista : agenda){
      if (lista.getNome().equalsIgnoreCase(nome)){
        eventoRemover = lista;
        msg1("Evento removido!");
      }      
    }
    
    if (eventoRemover != null)
      e.remove(eventoRemover);
  }
  
  public static void listarFutura(ArrayList <Evento> agenda){
    Date agora = new Date();
      
    for(Evento lista : agenda){
      if(agora.after(lista.getData())) {
      msg1(lista+"");
      }
    }
  }

  public static void listarPassado(ArrayList <Evento> agenda){
    Date agora = new Date();
      
    for(Evento lista : agenda){
      if(agora.before(lista.getData())) {
      msg1(lista+"");
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