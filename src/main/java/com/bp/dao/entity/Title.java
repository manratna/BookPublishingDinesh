package com.bp.dao.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "titles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "title_id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "pub_id")
    private Publisher publisher;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "advance")
    private BigDecimal advance;

    @Column(name = "royalty")
    private Integer royalty;

    @Column(name = "ytd_sales")
    private Integer ytdSales;

    @Column(name = "notes")
    private String notes;

    @Column(name = "pubdate", nullable = false)
    private LocalDateTime pubdate;

}
