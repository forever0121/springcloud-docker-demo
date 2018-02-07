package com.forever;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by 刘晓杰 on 2018/2/1.
 */
public class Test {

    public static void main(String[] args) {
//        Person p1 = new Person(1,"aa");
//        Person p2 = new Person(2,"bb");
//        Person p3 = new Person(3,"cc");
//        List<Person> personList = Lists.newArrayList(p1,p2,p3);
////        ImmutableMap<Integer, Person> map = Maps.uniqueIndex(personList.iterator(), Person::getId);
////        map.forEach((id,person) -> System.out.println(id + person.getName()));
//        //List<Person> list = personList.stream().filter((Person person) -> person.getName().equals("aa")).collect(Collectors.toList());
//        List<String> list = personList.stream().map((person -> person.getName().toUpperCase())).collect(Collectors.toList());
//        System.out.println(list);

//        List<String> languages = Lists.newArrayList("Java", "Scala", "C++", "Haskell", "Lisp");
//
//        System.out.println("Languages which starts with J :");
//        List list = filter(languages, (str) -> str.toString().startsWith("J"));
//        list.forEach((e) -> System.out.println(e));
//
//        System.out.println("Languages which ends with a ");
//        filter(languages, (str)->str.toString().endsWith("a"));
//
//        System.out.println("Print all languages :");
//        filter(languages, (str)->true);
//
//        System.out.println("Print no language : ");
//        filter(languages, (str)->false);
//
//        System.out.println("Print language whose length greater than 4:");
//        filter(languages, (str)->str.toString().length() > 4);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats.getCount());
    }

    public static List filter(List<String> names, Predicate<String> condition) {
        return names.stream().filter(condition).collect(Collectors.toList());
    }
}
