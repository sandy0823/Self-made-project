package com.example.demo.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamJava8Demo {
   public static void main(String[] args){
	   List<Person> list = Arrays.asList(new Person("fd"),new Person("tt"),new Person("rr"));
	   list.stream()
               .map(Person::getName)
               .collect(Collectors.toList()).forEach(System.out::println);
   }
   
   public static class Person{
	   
	   public Person(String name){
		   this.name =name;
	   }
	   private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}   
   }
}
