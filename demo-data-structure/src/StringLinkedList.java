public class StringLinkedList {
  private String value;
  private StringLinkedList next;
  private StringLinkedList prev;  //Original LinkedList

  public StringLinkedList(String value){
    this.value = value;
  }

  public StringLinkedList(StringLinkedList next){
    this.next = next;
  }

  public void remove (String s){
    StringLinkedList head = this;
    StringLinkedList prev = null;
    while(head != null){
      if (head.value.equals(s)}
      if (prev != null){
        prev.next = head.next;
      }else{
        head = head.next;
      }

    }

  public void add(String value){
    // Final tail
    StringLinkedList tail = this;
    while (tail.next !=  null){
    )
    this.next = new StringLinkedList(value);
  }

  public String toString(){
    StringLinkedList head = this;
    String str = "StringLinkedList[";
    while (head != null){
      str += head.value;
      head = head.next;
    }
    return str;
  }

  public static void main(String[] args) {
    StringLinkedList strings = new StringLinkedList("abc");  //object 1
    //strings.next(new StringLinkedList("def"));
    strings.add("def");
    strings.add("ijk");
    System.out.println(strings);
    // ! Object reference -> strings -> object1()


  }
  
}
