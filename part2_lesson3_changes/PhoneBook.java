package ru.geekbrains;

import java.util.*;

public class PhoneBook {
    private static String surname;
    private static String mobnum;
    public static HashMap<String, ArrayList<String>> records = new HashMap<>();

    public PhoneBook(String surname, String mobnum) {
        this.surname=surname;
        this.mobnum=mobnum;
    }

    public static void addRecord(String surname, String mobnum){
        ArrayList<String> mobnums = records.get(surname);
        if(mobnums != null){
            mobnums.add(mobnum);
        } else {
            mobnums = new ArrayList<>();
            mobnums.add(mobnum);
            records.put(surname, mobnums);
        }
    }

    public static void getRecords(String surname){
        Set<Map.Entry<String, ArrayList<String>>> rec = records.entrySet();

        for (HashMap.Entry<String, ArrayList<String>> record : rec) {
            if(record.getKey().equals(surname)) {
                System.out.print(record.getKey() + ": ");
                System.out.println(record.getValue());
            }
        }
    }
}
