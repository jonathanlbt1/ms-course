package com.example.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;

}
