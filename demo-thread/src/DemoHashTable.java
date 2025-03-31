import java.util.HashMap;
import java.util.Map;

public class DemoHashTable {
  private Map<Integer, Integer> stringMap;

  public DemoHashTable(){
    // stringMap = new Hashtable<>();
    stringMap = new HashMap<>();
  }

    public void put (Integer key){
      this.stringMap.put(key, 999);
    }

    public Map<Integer, Integer> getStringMap(){
      return this.stringMap;
    }

    

  }
  

