package myListMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("банан");
        list.add("яблоко");
        list.add("банан");
        list.add("мандарин");
        list.add("вишня");
        list.add("банан");
        list.add("персик");
        list.add("виноград");
        list.add("самолёт");
        list.add("спутник");

        MyMethods myMethods = new MyMethods();
        System.out.println(myMethods.countOccurance(list, "банан"));

        int[] intArray = {1, 2, 3};
        System.out.println(myMethods.toList(intArray));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(myMethods.findUnique(integerList));

        List<String> stringList = new ArrayList<>();
        stringList.add("банан");
        stringList.add("яблоко");
        stringList.add("банан");
        stringList.add("мандарин");
        stringList.add("вишня");
        stringList.add("банан");
        stringList.add("персик");
        stringList.add("виноград");
        stringList.add("персик");
        stringList.add("спутник");
        myMethods.calcOccurance(stringList);
    }
}
