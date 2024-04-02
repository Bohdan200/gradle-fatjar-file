package org2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org2.name.Name;

public class App {
    public static void main(String[] args) {
        Name myName = new Name("Bohdan", "Orlovskiy");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String myNameToJson = gson.toJson(myName);

        System.out.println(myNameToJson);
    }
}