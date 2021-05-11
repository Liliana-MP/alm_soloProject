package com.example.springdocker.service;

import com.example.springdocker.model.Shoe;
import com.example.springdocker.repository.ShoeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ShoeService {

    private final ShoeRepository shoeRepository;

    public List<Shoe> getShoes() {
        return shoeRepository.findAll();
    }

    public void saveNewShoe(Shoe shoe) {
        shoeRepository.save(shoe);
    }

    public List<String> getWearableShoes() {
        List<Shoe> wearableShoes = shoeRepository.findShoesByCanIWearIt(true);

        return wearableShoes.stream()
                .map(shoe -> shoe.getName())
                .collect(Collectors.toList());
    }
}
