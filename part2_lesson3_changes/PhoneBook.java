package ru.geekbrains;

import java.util.*;

public class PhoneBook {
    private static String surname;
    private static String mobnum;
    public static HashMap<String, HashSet<String>> records = new HashMap<>();

    public PhoneBook(String surname, String mobnum) {
        this.surname=surname;
        this.mobnum=mobnum;
    }

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
        Set<Map.Entry<String, HashSet<String>>> rec = records.entrySet();

        for (HashMap.Entry<String, HashSet<String>> record : rec) {
            if(record.getKey().equals(surname)) {
                System.out.print(record.getKey() + ": ");
                System.out.println(record.getValue());
            }
        }
    }
}

