import java.util.*;

class Deck {
	private  ArrayList<Card> cardList =new ArrayList<Card>();
	private ArrayList <Card> dealtList= new ArrayList<Card>();//list for dealt list of cards; used for algorithm one of deal
	private int size = 0;
	private int ogsize=0;
	public static void main(String[] args) {
		
	}
	public Deck(String[] ranks, String[] suits, int[] values){
		for(int i = 0; i<suits.length; i++){
			for(int n = 0; n<ranks.length;n++){
				Card tempcard = new Card(ranks[n],suits[i],values[n]);
				cardList.add(tempcard);
				size++;
			}
		}
		ogsize=size;
		shuffle();
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		else return false;
	}
	public int size(){
		//return cardList.size();
		return size;
	}
	/*/public Card deal(){
		if(cardList.size()!=0){
		dealtList.add(cardList.get(cardList.size()-1));
		cardList.remove(cardList.get(cardList.size()-1));
		return dealtList.get(dealtList.size()-1);
		}
		return null;
		
	}/*/
	public Card deal(){
		size--;
		return cardList.get(size);
		
		
	}
	public void shuffle(){
		/*/for(int i = 0; i<dealtList.size(); i++){
			cardList.add(dealtList.get(i));
		}/*/
		for (int k=cardList.size()-1; k>0; k--){
			int r = (int)(Math.random()*k);
			Card temporarycard = cardList.get(k);
			cardList.set(k,cardList.get(r));
			cardList.set(r,temporarycard);
		}
		size = ogsize;
	}
}