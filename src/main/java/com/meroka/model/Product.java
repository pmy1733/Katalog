package com.meroka.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.GenericArrayType;

//mark class as an Entity
    @Entity
    @Table
    @Getter
    @Setter
    @NoArgsConstructor
    public class Products
    {
        //Defining book id as primary key
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer productId;
        private String itemName;
        private String team;
        private String division;
        private String description;
        private String link;

        public Products(String itemName, String team, String division, String description, String link) {
            this.itemName = itemName;
            this.team = team;
            this.division = division;
            this.description = description;
            this.link = link;
        }
    }
