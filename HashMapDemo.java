import java.util.*;
class HashMapDemo {
public static void main(String args[]) {
Map<String, Integer> hm = new HashMap<String, Integer>();
hm.put("Anu", new Integer(1));
hm.put("sinu", new Integer(2));
hm.put("Jinu", new Integer(3));
// Traversing through the map
for (Map.Entry<String, Integer> me : hm.entrySet()) {
System.out.print(me.getKey() + ":");
System.out.println(me.getValue()); }
} }
