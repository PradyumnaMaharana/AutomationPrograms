package streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListModifyUsingStream {

	public static void main(String[] args) {
		//Here we are modifying the list and sending the rult back to the list
		List<String> ls=Stream.of("Abhi","Don","Ara","Adam","Rama").filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		System.out.println("-------------------------------");
		//Print unique number from an array
		List<Integer> li=Arrays.asList(1,2,2,3,5,7,9,2,3,1,4,9);
		li.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("-------------------------------");
		//now sort the array and print the 3rd index
		li.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		System.out.println("-------------------------------");
	}

}
