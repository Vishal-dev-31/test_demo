package com.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Test_2 {

	public static void main(String[] args) {

	HashMap<String, Integer> Hm = new HashMap();
    Hm.put("vishal", 24);
	Hm.put("santosh", 30);
	Hm.put("swapnil", 25);
	Hm.put("dhananjay", 26);
	Hm.put("yogesh", 28);

	System.out.println("retrieve HashMap elements without set and Itrating: ");
	for (Map.Entry map : Hm.entrySet()) {
	System.out.println(map.getKey() + "->" + map.getValue());
	}

	System.out.println("retrieve Hashmap elements by  using set and Iterator interface :");
	Set set = Hm.entrySet();
	Iterator itr = set.iterator();

	while (itr.hasNext()) {
	// System.out.println(itr.next());

	Map.Entry entry = (Entry) itr.next();
    System.out.println(entry.getKey() + "->" + entry.getValue());

while (itr.hasNext()) {
	// System.out.println(itr.next());

	Map.Entry entry = (Entry) itr.next();
    System.out.println(entry.getKey() + "->" + entry.getValue());

while (itr.hasNext()) {
	// System.out.println(itr.next());

	Map.Entry entry = (Entry) itr.next();
    System.out.println(entry.getKey() + "->" + entry.getValue());
while (itr.hasNext()) {
	// System.out.println(itr.next());

	Map.Entry entry = (Entry) itr.next();
    System.out.println(entry.getKey() + "->" + entry.getValue());
while (itr.hasNext()) {
	// System.out.println(itr.next());

	Map.Entry entry = (Entry) itr.next();
    System.out.println(entry.getKey() + "->" + entry.getValue());


		}
	}

}