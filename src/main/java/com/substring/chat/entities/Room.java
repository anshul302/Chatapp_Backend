package com.substring.chat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "rooms")
public class Room {


    @Id
    private String id; // Mongo DB Unique Identifier
    private String roomId;
    private List<Message> messages = new ArrayList<>();

    // No-argument constructor
    public Room() {
        this.messages = new ArrayList<>();
    }

    // Constructor with parameters
    public Room(String id, String roomId, List<Message> messages) {
        this.id = id;
        this.roomId = roomId;
        this.messages = messages;
    }

    // Getter and Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
