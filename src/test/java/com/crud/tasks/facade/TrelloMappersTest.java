package com.crud.tasks.facade;

import com.crud.tasks.domain.*;
import com.crud.tasks.mapper.TrelloMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloMappersTest {

    @Autowired
    private TrelloMapper trelloMapper;

    @Test
    public void mapToCard() {
        //Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("name", "description", "pos", "id");
        //When
        TrelloCard trelloCard = trelloMapper.mapToCard(trelloCardDto);
        //Then
        assertThat(trelloCard).isNotNull()
                .hasFieldOrPropertyWithValue("name", trelloCard.getName());
    }

    @Test
    public void mapToCardDto() {
        //Given
        TrelloCard trelloCard = new TrelloCard("name", "description", "pos", "id");
        //When
        TrelloCardDto trelloCardDto = trelloMapper.mapToCardDto(trelloCard);
        //That
        assertThat(trelloCardDto).isNotNull();
    }

    @Test
    public void mapToList() {
        //Given
        TrelloListDto trelloListDto = new TrelloListDto("name", "id", true);
        List<TrelloListDto> listDtos = new ArrayList<>();
        listDtos.add(trelloListDto);
        //When
        List<TrelloList> trelloList = trelloMapper.mapToList(listDtos);
        //That
        assertThat(trelloList).isNotNull();
    }

    @Test
    public void mapToListDto() {
        //Given
        TrelloList trelloList = new TrelloList("id", "name", false);
        List<TrelloList> lists = new ArrayList<>();
        lists.add(trelloList);
        //When
        List<TrelloListDto> trelloListDtos = trelloMapper.mapToListDto(lists);
        //That
        assertThat(lists).isNotNull();
    }

    @Test
    public void mapToBoards() {
        //Given
        TrelloListDto trelloListDto = new TrelloListDto("id", "name", false);
        List<TrelloListDto> lists = new ArrayList<>();
        lists.add(trelloListDto);
        TrelloBoardDto trelloBoardDto = new TrelloBoardDto("name", "id", lists);
        List<TrelloBoardDto> boardDtos = new ArrayList<>();
        boardDtos.add(trelloBoardDto);
        //When
        List<TrelloBoard> trelloBoardList = trelloMapper.mapToBoards(boardDtos);
        //Then
        assertThat(trelloBoardList).isNotNull();
    }
}



