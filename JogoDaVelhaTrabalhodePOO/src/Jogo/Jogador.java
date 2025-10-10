package Jogo;

public abstract class Jogador {
	protected int [] dificuldade = new int [2];
	protected int jogador;
	
	public Jogador(int jogador) {
		this.jogador = jogador;
		
	}
	public abstract void jogar(Tabuleiro tabuleiro);
	public abstract void Dificuldade(Tabuleiro tabuleiro);
	public boolean checaDificuldade(int[] dificuldade, Tabuleiro tabuleiro) {
		if(tabuleiro.getPosicao(dificuldade)==0)
			return true;
		else
			return false;
		
	}

}
