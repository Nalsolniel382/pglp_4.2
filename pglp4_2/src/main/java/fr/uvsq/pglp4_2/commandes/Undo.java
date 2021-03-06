package fr.uvsq.pglp4_2.commandes;
import java.util.Stack;
public class Undo implements Commandes{
	
	private Stack<Double> pile;
	private Stack<Stack<Double>> listePile;
	
	public Undo(Stack<Double> pile) {
		this.pile = pile;
		listePile = new Stack<Stack<Double>>();
	}
	
	public void actualisationPile() {
		Stack<Double> tmp = (Stack<Double>) pile.clone();
		listePile.push(tmp);
		
	}
	
	private void rempliPile() {
		for (double d : listePile.lastElement()) {
			pile.push(d);
		}
	}
	public void exeCommande() 
	{
		if(!listePile.isEmpty())
		{
			while(!pile.isEmpty())
			{
				pile.pop();
			}
			
			listePile.pop();
			rempliPile();
			
			System.out.println("element enlever ");
			}
		
		
	}
	
	
}