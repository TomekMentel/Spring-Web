package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
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
}

