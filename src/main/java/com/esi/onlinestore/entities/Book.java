package com.esi.onlinestore.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private boolean active;

    private int unitsInstock;


    @Temporal(TemporalType.DATE)
    private Date createdOn;

    @Temporal(TemporalType.DATE)
    private Date updateOn;

    @ManyToOne
    @JoinColumn(name = "categody_id", nullable = true)
    private BookCategory category;


}
