package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aryan");
        names.add("john");
        names.add("Robert");
//        names.add(112);

//        names.remove(2);
        for (String a : names) {
            System.out.println(a);
        }

        Map<String, String> emailList = new HashMap<>();
        emailList.put("aryan", "aryanak9163@gmail.com");
        emailList.put("kush", "kush@gmail.com");
        System.out.println(emailList.get("aryan"));
        System.out.println(emailList.containsKey("aryan"));
        System.out.println(emailList.containsValue("aryanak9163@gmail.com"));
        System.out.println(emailList.keySet());

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aryan", 1058));
        students.addLast(new Student("John", 9999));
        for (Student s : students) {
            System.out.println(s.getName());
            System.out.println(s.getId());
        }

    }
}
