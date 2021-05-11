package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Shoe;
import com.example.springdocker.service.FoodService;
import com.example.springdocker.service.ShoeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ShoeController {

    private final ShoeService shoeService;

    @GetMapping("/shoes")
    public List<Shoe> getShoes() {
        return shoeService.getShoes();
    }

    @PostMapping("/shoes")
    public void saveNewShoe(@RequestBody Shoe shoe) {
        shoeService.saveNewShoe(shoe);
    }

    @GetMapping("/shoes/wearable")
    public List<String> getWearableShoes() {
        return shoeService.getWearableShoes();
    }
}
