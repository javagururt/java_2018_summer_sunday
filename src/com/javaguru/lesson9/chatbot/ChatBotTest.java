package com.javaguru.lesson9.chatbot;

class ChatBotTest {

    public static void main(String[] args) {
        ChatBot chatBot = new AdvancedChatBot();
        work(chatBot, "How old are you ?");
    }

    private static void work(ChatBot chatBot, String question) {
        chatBot.answer(question);
    }
}
