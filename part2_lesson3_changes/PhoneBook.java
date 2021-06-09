package ru.geekbrains;

import java.util.*;

public class PhoneBook {
    private static String surname;
    private static String mobnum;
    private static HashMap<String, HashSet<String>> records = new HashMap<>();

    public static void addRecord(String surname, String mobnum){
        HashSet<String> mobnums = records.get(surname);
        if(mobnums != null){
            mobnums.add(mobnum);
        } else {
            mobnums = new HashSet<>();
            mobnums.add(mobnum);
            records.put(surname, mobnums);
        }
    }

    public static void getRecords(String surname){
        System.out.print(surname + ": "+records.get(surname));
        }
}

