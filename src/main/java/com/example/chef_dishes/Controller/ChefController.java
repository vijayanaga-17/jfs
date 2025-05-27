package com.example.chef_dishes.Controller;

import com.example.chef_dishes.model.Chef;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChefController {

    private final Map<Long, Chef> chefs = new HashMap<>();

    public List<Chef> getAllChefs() {
        return new ArrayList<>(chefs.values());
    }

    public Optional<Chef> getChefById(Long id) {
        return Optional.ofNullable(chefs.get(id)); // ✅ This line is important
    }

    public Chef createChef(Chef chef) {
        chefs.put(chef.getId(), chef);
        return chef;
    }

    public void deleteChef(Long id) {
        chefs.remove(id);
    }
}
