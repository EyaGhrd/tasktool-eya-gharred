package com.eyaghrd.tasktool.part1;

public class TaskManager {
    public boolean task(String text){
        String newText = convertString(text);
        String rev = "";
        for (int i = newText.length() - 1; i >= 0; i--) {
            rev = rev + newText.charAt(i);
        }
        return newText.equals(rev);
    }
    public String convertString(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                result += c;
            }
        }
        return result.toLowerCase();
    }
}
