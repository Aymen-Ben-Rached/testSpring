package com.example.test.DAO.Services;

import com.example.test.DAO.Entities.Restaurant;
import com.example.test.DAO.Repositories.ClientRepository;
import com.example.test.DAO.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService{
    RestaurantRepository restaurantRepository;

    @Override
    public Restaurant ajouterRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
