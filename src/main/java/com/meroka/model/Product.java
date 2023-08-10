package com.meroka.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

//mark class as an Entity
    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name="products")
    public class Product
    {
        //Defining book id as primary key
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long productId;
        private String itemName;
        private String team;
        private String division;
        private String description;
        private String link;

//        public Product(String itemName, String team, String division, String description, String link) {
//            this.itemName = itemName;
//            this.team = team;
//            this.division = division;
//            this.description = description;
//            this.link = link;
//        }
    }
