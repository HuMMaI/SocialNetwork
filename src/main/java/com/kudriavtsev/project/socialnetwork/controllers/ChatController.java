package com.kudriavtsev.project.socialnetwork.controllers;

import com.kudriavtsev.project.socialnetwork.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kudriavtsev.project.socialnetwork.entities.Chat;

import java.util.List;

@RestController
@RequestMapping("api/chats")
@CrossOrigin("*")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping
    public List<Chat> getChats() {
        return chatService.findAllChats();
    }

    @PostMapping("/{name}")
    public void createNewChat(@PathVariable("name") String name) {
        chatService.addChat(name);
    }

}
