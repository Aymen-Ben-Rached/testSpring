package com.example.test.DAO.RestControllers;

import com.example.test.DAO.Entities.Restaurant;
import com.example.test.DAO.Services.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("restaurant")
@RestController
@AllArgsConstructor
public class RestaurantRestController {
    IRestaurantService iRestaurantService;
    @PostMapping("ajouterRestaurant")
    public Restaurant ajouterRestaurant(@RequestBody Restaurant restaurant) {
        return iRestaurantService.ajouterRestaurant(restaurant);
    }
}
