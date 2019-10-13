class Card {
	private String rank;
	private String suit;
	private int pointvalue;
	public static void main(String[] args) {
		Card cardo = new Card("hi","hi",1);
		System.out.println(cardo.suit());
		
	}
	public Card (String r, String s, int v){
		rank = r;
		suit = s;
		pointvalue = v;
	}
	public String rank(){
		return rank;
	}
	public String suit(){
		return suit;
	}
	public int pointValue(){
		return pointvalue;
	}
	public boolean isEqual(Card o){
		if(rank.equals(o.rank()) && suit.equals(o.suit()) && pointvalue==o.pointValue()){
			return true;
		}
		else return false;
	}
	public String toString(){
		return ""+rank+"of"+suit+"(point value = "+pointvalue+")";
	}
	
}