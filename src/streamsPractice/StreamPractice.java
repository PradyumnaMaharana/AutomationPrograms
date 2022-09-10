package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abraham");
		names.add("Babar");
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Alok");
		names.add("Ajay");
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		System.out.println("-------------------------------");
		//Here we are adding strings directly into the collection
		Long d=Stream.of("Aram","Ajay","Pradyumna","Bobby","Alok").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		System.out.println("-------------------------------");
		//Print all names in uppercase whose length is >4
		names.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("-------------------------------");
		//Print only one name in upper case whose length is >4
		names.stream().filter(s->s.length()>4).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("-------------------------------");
		//Print names which have last letter as "a" with uppercase
		Stream.of("abha","rama","sujan","sita","ajay","piku").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("-------------------------------");
		//Print names which have first letter as "a" with uppercase and sorted
		List<String> names1=Arrays.asList("Ajay","Abhi","Don","Alekhya","Alok","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("-------------------------------");		
	}

}
