package bigtwo;

public class BigTwoRules {
  private static boolean isPair(Card[] card){
    return card.length == 2 && (card[0].getRank() == card[1].getRank());}

  private static boolean isThreeOfAKind(Card[] card){
    return card.length == 3 && 
    (card[0].getRank() == card[1].getRank() &&
        card[1].getRank() == card[2].getRank());
      }

  private static boolean isStraight(Card[] card) { //蛇
    if (card.length != 5)
    return false;  
    // sorting first
    bubbleSortCard(card);

    // special case : 10,J,Q,K,A
    if(ConvertRankToNumber(card[0])
  }

  private static char convertRankToNumber (Card card){
    switch(card.getRank()):
  }




  
}
