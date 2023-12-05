package com.bp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {
    private StoreDTO store;
    private Long orderNumber;
    private LocalDateTime orderDate;
    private Short qty;
    private String payterms;
    private TitleDTO title;
}

