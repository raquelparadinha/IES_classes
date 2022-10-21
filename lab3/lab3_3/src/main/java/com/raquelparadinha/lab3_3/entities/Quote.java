package com.raquelparadinha.lab3_3.entities;

import javax.persistence.*;

@Entity
@Table(name = "quotes_table")
public class Quote {
    private long id;
    private String quote;
}
