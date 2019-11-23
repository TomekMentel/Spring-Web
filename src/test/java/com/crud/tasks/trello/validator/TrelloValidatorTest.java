package com.crud.tasks.trello.validator;

import com.crud.tasks.domain.TrelloBoard;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TrelloValidatorTest {

    @Test
    public void validateTrelloBoards() {
        //Given
        List<TrelloBoard> trelloBoards = new ArrayList<>();
        TrelloBoard trelloBoard1 = new TrelloBoard("1", "Test", new ArrayList<>());
        TrelloBoard trelloBoard2 = new TrelloBoard("2", "Name", new ArrayList<>());
        trelloBoards.add(trelloBoard1);
        trelloBoards.add(trelloBoard2);
        TrelloValidator validator = new TrelloValidator();
        //When
        List<TrelloBoard> result = validator.validateTrelloBoards(trelloBoards);
        //Then
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("Name", result.get(0).getName());
    }
}
