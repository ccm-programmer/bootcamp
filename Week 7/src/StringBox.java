public class StringBox { // Simulate StringBuilder.class
  private char[] chs;
  
  public StringBox(String s){
    this.chs = s.toCharArray();
  }

  public char charAt(int idx){
    return this.chs[idx];
  }

  // !String Design
  public StringBox append2(String s2){
    
  }
  // !StringBuilder Design
  public void append(String s2){
    char[] arr = new char[this.chs.length + s2.length()];
    int idx = 0;
    for (int i = 0; i < this.chs.length; i++){
      arr[idx++] = this.chs[i];
    }
    for (int i = 0; i < s2.length(); i++){
      arr[idx++] = s2.charAt(i);
    }
    this.chs = arr;
  }

  @Override
  public String toString(){
    return String.valueOf(this.chs);
  }

  public static void main(String[] args) {
    StringBox sb = new StringBox("abc");
    System.out.println(sb.charAt(1));
  }
  
}
