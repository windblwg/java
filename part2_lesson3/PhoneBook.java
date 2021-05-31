package ru.geekbrains;

import java.util.*;

public class PhoneBook {
    private static String surname;
    private static String mobnum;
    public static HashMap<String, String> records = new HashMap<>();

    public PhoneBook(String surname, String mobnum) {
        this.surname=surname;
        this.mobnum=mobnum;
    }

    public static void addRecord(String surname, String mobnum){
        records.put(mobnum, surname);
    }

    public static void getRecords(String surname){
        Set<Map.Entry<String, String>> rec = records.entrySet();

        for (HashMap.Entry<String, String> record : rec) {
            if(record.getValue().equals(surname)) {
                System.out.print(record.getKey() + ": ");
                System.out.println(record.getValue());
            }
        }
    }
}
