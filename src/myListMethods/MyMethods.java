package myListMethods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyMethods {
    public int countOccurance(List<String> list, String currentWord) {
        int counter = 0;
        for (String listTmp : list) {
            if (listTmp.contains(currentWord)) {
                counter++;
            }
        }

        return counter;
    }

    public List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList();
        for (int arrayTmp : array) {
            list.add(arrayTmp);
        }
        return list;
    }

    public List<Integer> findUnique(List<Integer> userList) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer listCycle : userList) {
            if (!uniqueList.contains(listCycle)) {
                uniqueList.add(listCycle);
            }
        }
        return uniqueList;
    }

    public void calcOccurance(List<String> stringList) {
        List<String> unique = new ArrayList<>();
        for (String wordFromList : stringList) {
            if (unique.contains(wordFromList)) {
                continue;
            }
            unique.add(wordFromList);
            int wordCounter = 0;
            for (int i = 0; i < stringList.size(); i++) {
                String word = wordFromList;
                if (stringList.get(i).contains(word)) {
                    wordCounter++;
                }
            }
            System.out.println(wordFromList + " " + wordCounter);
            wordCounter = 0;
        }
    }
}