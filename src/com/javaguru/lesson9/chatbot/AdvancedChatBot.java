package com.javaguru.lesson9.chatbot;

import java.util.HashMap;
import java.util.Map;

class AdvancedChatBot implements ChatBot {

    private Map<String, String> vocabulary;

    public AdvancedChatBot() {
        vocabulary = new HashMap<>();
        vocabulary.put("?", "Thanks!");
        vocabulary.put("you", "I'm");
        vocabulary.put("old", "20 years old");
    }

    @Override
    public void answer(String question) {
        String[] words = question.split(" ");

        String answer = generateAnswer(words);
        System.out.println(answer);
    }

    private String generateAnswer(String[] words) {
        StringBuilder answer = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String key = words[i];
            if (vocabulary.containsKey(key)) {
                answer.append(" ").append(vocabulary.get(key));
            }
        }
        return answer.toString();
    }
}
