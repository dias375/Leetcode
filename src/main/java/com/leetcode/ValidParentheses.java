package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String brackets) {
        return listSolution(brackets);
    }

    List<Character> OPEN_BRACKETS = Arrays.asList('(', '[', '{');
    List<Character> CLOSE_BRACKETS = Arrays.asList(')', ']', '}');

    private boolean listSolution(String brackets) {
        char[] bracketsArray = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char currentBracket : bracketsArray){
            if(OPEN_BRACKETS.contains(currentBracket)){
                stack.push(currentBracket);
            }
            if(CLOSE_BRACKETS.contains(currentBracket)){
                if(stack.isEmpty()) return false;
                int index = OPEN_BRACKETS.indexOf(stack.pop());
                if(!CLOSE_BRACKETS.get(index).equals(currentBracket)) return false;

            }
        }
        return stack.isEmpty();
    }

    HashMap<Character, Character> BRACKETS_PAIRS = new HashMap<>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    private boolean mapSolution(String brackets) {
        char[] bracketsArray = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char currentBracket : bracketsArray){
            if(BRACKETS_PAIRS.containsKey(currentBracket)){
                stack.push(currentBracket);
            }
            if(BRACKETS_PAIRS.containsValue(currentBracket)){
                if(stack.isEmpty() || !BRACKETS_PAIRS.get(stack.pop()).equals(currentBracket)) return false;
            }
        }
        return stack.isEmpty();
    }

}
