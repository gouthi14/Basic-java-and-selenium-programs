 // Use iterators with a Hashtable.
import java.util.*;
class HashTableDemo {
public static void main(String args[]) {
Hashtable balance = new Hashtable();
String str;
double bal;
balance.put("nandita", new String("fjb"));
balance.put("nandini", new Double(123.22));
balance.put("rockson", new Double(1378.00));
balance.put("nisha", new Double(99.22));
balance.put("dhruv", new Double(-19.08));
// show all balances in hashtable
Set set = balance.keySet(); // get set-view of keys
// get iterator
Iterator itr = set.iterator();
while(itr.hasNext()) {
str = (String) itr.next();
System.out.println(str + ": " +
balance.get(str));
}
System.out.println();
// Deposit 1,000 into John Doe's account
bal = ((Double)balance.get("nisha")).doubleValue();
balance.put("nisha", new Double(bal+1000));
System.out.println("nisha's new balance: " +
balance.get("nisha"));
}
}
