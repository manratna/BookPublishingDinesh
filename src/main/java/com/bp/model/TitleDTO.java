package com.bp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TitleDTO {
    private Long id;
    private String title;
    private String type;
    private PublisherDTO publisher;
    private BigDecimal price;
    private BigDecimal advance;
    private Integer royalty;
    private Integer ytdSales;
    private String notes;
    private LocalDateTime pubdate;
}

