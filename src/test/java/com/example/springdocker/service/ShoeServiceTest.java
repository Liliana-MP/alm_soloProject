package com.example.springdocker.service;

import com.example.springdocker.model.Shoe;
import com.example.springdocker.repository.ShoeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) //Junit 5
class ShoeServiceTest {

    ShoeService shoeService;

    @Mock
    ShoeRepository mockrepo;


    @BeforeEach
    public void init(){
        shoeService = new ShoeService(mockrepo);
    }

    @Test
    void getShoes() {
        Shoe mockshoe = new Shoe();
        mockshoe.setName("nike");
        mockshoe.setCanIWearIt(true);
        mockshoe.setDoesItLookGood(false);

        when(mockrepo.findAll()).thenReturn(Arrays.asList(mockshoe));
        List<Shoe> actual = shoeService.getShoes();

        assertEquals(mockshoe.getName(), actual.get(0).getName());
        assertEquals(mockshoe.isCanIWearIt(), actual.get(0).isCanIWearIt());
        assertEquals(mockshoe.isDoesItLookGood(),actual.get(0).isDoesItLookGood());
        verify(mockrepo).findAll();
    }

    @Test
    void saveSuccess() {
        String expectedName = "name";
        boolean expectedCanIWearIt = true;
        boolean expectedDoesItLookGood = false;

        Shoe savingShoe = new Shoe();
        savingShoe.setName(expectedName);
        savingShoe.setCanIWearIt(expectedCanIWearIt);
        savingShoe.setDoesItLookGood(expectedDoesItLookGood);

        when(mockrepo.save(any())).thenReturn(savingShoe);

        Shoe actual = shoeService.saveNewShoe(savingShoe);

        assertEquals(savingShoe.getName(), actual.getName());

    }

}