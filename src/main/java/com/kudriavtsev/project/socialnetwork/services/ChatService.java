package com.kudriavtsev.project.socialnetwork.services;

import com.kudriavtsev.project.socialnetwork.entities.Chat;
import com.kudriavtsev.project.socialnetwork.repos.ChatRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    private final ChatRepo chatRepo;

    public ChatService(ChatRepo chatRepo) {
        this.chatRepo = chatRepo;
    }

    public List<Chat> findAllChats() {
        return chatRepo.findAll();
    }

    public void addChat(String name) {
        Chat chat = new Chat();
        chat.setName(name);
        chat.setDeleteMark(false);

        chatRepo.save(chat);
    }
}
