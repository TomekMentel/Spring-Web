package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrelloCardDto {
    private String name;
    private String description;
    private String pos;
    private String listId;
    private TrelloBadgesDto votes;
    private TrelloBadgesDto badgesDto;
    private AttachmentsByType attachments;
    private Trello trello;
    private Trello board;
    private Trello card;

    public TrelloCardDto(String name) {
        this.name=name;
    }
    public TrelloCardDto(String name, String description, String pos, String listId) {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPos() {
        return pos;
    }

    public String getListId() {
        return listId;
    }

    public TrelloBadgesDto getVotes() {
        return votes;
    }

    public TrelloBadgesDto getBadgesDto() {
        return badgesDto;
    }

    public AttachmentsByType getAttachments() {
        return attachments;
    }

    public Trello getTrello() {
        return trello;
    }

    public Trello getBoard() {
        return board;
    }

    public Trello getCard() {
        return card;
    }


}