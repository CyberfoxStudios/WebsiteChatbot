package com.chatbottutorial.cyberfoxstudios;

import spark.Spark;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");

        Spark.staticFileLocation("public_html");
        Spark.get("/", (request, response) -> {
            return "hello world";
        });
    }
}