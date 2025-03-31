package bigtwo;

public class Deck {
  private Card[] cards;

  public Deck(){
    this.cards = new Card[52];

    int idx = 0;
    //for-each loop
    for (char suit : Card.SUITS){
      for (char rank: Card.RANK){
        this.cards[idx] = new Card (rank, suit);
        idx++;
      }
    }
  }

  public int size(){
    return this.cards.length;
  }

  // ! input and return?
  public Card[] shuffle(Card[] cards){

  }

  @Override
  public String toString(){
    String value = "Deck[cards=";
    for (Card card : this.cards){
      value += card.toString()+",";
    }
    value = value.substring(0,value.length()-1)+"]";
  }
  
  public static void main(String[] args) {
    Deck deck = new Deck();  //empty constructor -> 52 cards
    System.out.println(deck);
    System.out.println(deck.size());
  }
}
