package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shoe {
    String id;
    String name;
    boolean canIWearIt;
    boolean doesItLookGood;
}
