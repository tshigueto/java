import java.util.*; //importar java.util toda

public class Ranking{ //criando classe Ranking

  private int ponto; //atributos da classe
  private String nome;

  public int getPonto(){
    return this.ponto;
  }
  public void setPonto(int ponto){
    this.ponto = ponto;
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }  

  public static void imprimirRanking (ArrayList<Ranking>lista){ //método para imprimir o Rankgin
    System.out.println(lista);
  }
}