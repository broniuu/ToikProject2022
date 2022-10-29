package com.example.toikprojekt2022.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Klasa reprezentuje restaurację
 */

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ_ZONE")
    private int restaurantId;
    private String name;
    private String imageUrl;
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Dish> dishes;


    public Restaurant(int restaurantId, String name, String imageUrl) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Restaurant() {

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

}
