package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.sun.xml.internal.ws.util.StringUtils;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("something, something, something", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("dark side", (text) -> text.toUpperCase());
        poemBeautifier.beautify("   something, something, something  ", (text) -> text.trim());
        poemBeautifier.beautify("complete", (text) -> StringUtils.capitalize(text));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
