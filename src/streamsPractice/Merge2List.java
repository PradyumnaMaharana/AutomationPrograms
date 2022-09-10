package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ajay");
		names.add("Sonu");
		names.add("Ram");
		List<String> names1=Arrays.asList("Sita","Arjun","Hanuman");
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		System.out.println("-------------------------------");
	}

}
