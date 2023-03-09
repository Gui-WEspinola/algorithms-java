package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        List<Character> characterList = new ArrayList<>();
        List<Character> duplicateList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            characterList.add(text.toLowerCase().charAt(i));
        }
        for (int i = 0; i < characterList.size(); i++) {
            for (int j = 0; j < characterList.size(); j++) {
                if (characterList.get(j) == characterList.get(i)
                        && i != j
                        && !duplicateList.contains(characterList.get(j))){
                    duplicateList.add(characterList.get(j));
                }
            }
        }
        return duplicateList.size();
    }
}