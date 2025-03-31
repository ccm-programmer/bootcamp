package bigtwo;

import java.util.Objects;
import javax.swing.event.SwingPropertyChangeSupport;

public class Card {
  public static final char[] SUITS = new char[]{'♠', '♡', '♢', '♣'};
  public static final char[] RANK = new char[]{'A','2','3','4','5','6','7','8','9','T','K','Q','J'};
  private char rank; //13
  private char suit; //D, C, H, S
  
  public Card(char rank, char suit){
    this.rank = rank;
    this.suit = suit;
  }

  public char getRank(){
    return this.rank;
  }

  public char getSuit(){
    return this.suit;
  }

  //toString
  public String toString(){
    return "Card["
    + "rank= " + this.rank 
    + "suit= " + this.suit;
  }
  
  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if(!(obj instanceof Card))
    return false;
    Card card = (Card) obj;
    return Objects.equals(card.getRank(), this.rank)//
    && Objects.equals(card.getSuit(), this.suit);
  }


// hashcode(), by default, Object.hashCode() returns an int value representing the object reference
@Override
public int hashCode(){
  return Objects.hash(this.rank, this.suit);
}
}