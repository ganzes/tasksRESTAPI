package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class TrelloMapperTestSuite {

    //@Autowired
   // public static TrelloMapper trelloMapper;

    @Test
    public void mapToBoardsTest() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloListDto> testTrelloListDto = new ArrayList<>();
        List<TrelloBoardDto> testTrelloBoardDto = new ArrayList<>();
        testTrelloBoardDto.add(new TrelloBoardDto("testId01", "testName01", testTrelloListDto));
        //When
        List<TrelloBoard> trelloBoards = trelloMapper.mapToBoards(testTrelloBoardDto);
        //Then
        assertEquals(1, trelloBoards.size());
    }

    @Test
    public void mapToBoardsDtoTest() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloList> testTrelloList = new ArrayList<>();
        List<TrelloBoard> testTrelloBoard = new ArrayList<>();
        testTrelloBoard.add(new TrelloBoard("testId01", "testName01", testTrelloList));
        //When
        List<TrelloBoardDto> trelloBoards = trelloMapper.mapToBoardsDto(testTrelloBoard);
        System.out.println(trelloBoards.size());
        //Then
        assertEquals(1, trelloBoards.size());
        assertEquals("testName01", trelloBoards.get(0).getName());
    }

    @Test
    public void mapToListTest() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloListDto> testTrelloListDto = new ArrayList<>();
        testTrelloListDto.add(new TrelloListDto("testIdListDto01", "testNameListDto01",true));
        //When
        List<TrelloList> trelloLists = trelloMapper.mapToList(testTrelloListDto);
        //Then
        assertEquals(1, trelloLists.size());
    }

    @Test
    public void mapToListDtoTest() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloList> testTrelloList = new ArrayList<>();
        testTrelloList.add(new TrelloList("testIdList01", "testNameList01",true));
        //When
        List<TrelloListDto> trelloListsDto = trelloMapper.mapToListDto(testTrelloList);
        //Then
        assertEquals(1, trelloListsDto.size());
    }

    @Test
    public void mapToCardDtoTest() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        TrelloCard testTrelloCard = new TrelloCard("testName01","testDescription01", "testPos01", "testListId01");
        //When
        TrelloCardDto testTrelloCardDto = trelloMapper.mapToCardDto(testTrelloCard);
        //Then
        assertEquals("testName01", testTrelloCardDto.getName());
    }

    @Test
    public void mapToCardTest() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        TrelloCardDto testTrelloCardDto = new TrelloCardDto("testName01","testDescription01", "testPos01", "testListId01");
        //When
        TrelloCard testTrelloCard = trelloMapper.mapToCard(testTrelloCardDto);
        //Then
        assertEquals("testName01", testTrelloCard.getName());
    }
}
