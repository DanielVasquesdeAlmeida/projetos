package Jogo;
import java.util.Scanner;


public class Humano extends Jogador {
	public Scanner entrada = new Scanner (System.in);
	public Humano (int jogador) {
		super(jogador);
		this.jogador = jogador;
		System.out.println("Jogador 'Humano' criado!");
		
	}
	public void jogar(Tabuleiro tabuleiro) {
		Dificuldade(tabuleiro);
		tabuleiro.setPosicao(dificuldade, jogador);
	}
	public void Dificuldade (Tabuleiro tabuleiro) {
		do {
			 do{
				 System.out.print("Linha:");
				 dificuldade[0] = entrada.nextInt();
				 if(dificuldade[1]> 3 || dificuldade[0]<1)
					 System.out.println("Linha inválida. É 1,2 ou 3");
				 
			 }while(dificuldade[1] > 3 || dificuldade[0] < 1);
			 
			 do{
				 System.out.println("Coluna:");
				 dificuldade[1] = entrada.nextInt();
				 
				 if(dificuldade [1] > 3 || dificuldade [0] < 1)
					 System.out.println("Coluna inválida. É 1,2 ou 3");
			 }while(dificuldade[1] > 3 || dificuldade [1] < 1);
			 dificuldade[0]--;
			 dificuldade[1]--;
			 if(checaDificuldade(dificuldade,tabuleiro))
				 System.out.println("Esse local já foi marcado. Tente outro.");
		
		  }while( !checaDificuldade(dificuldade, tabuleiro));
		}
		
	}

