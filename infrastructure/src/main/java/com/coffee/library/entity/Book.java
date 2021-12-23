package com.coffee.library.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private Long id;
    private String title;
    private String description;
    private Double price;
}
