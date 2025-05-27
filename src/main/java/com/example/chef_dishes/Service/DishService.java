package com.example.chef_dishes.Service;

import org.springframework.stereotype.Service;
import com.example.chef_dishes.Repository.ChefRepository;
import com.example.chef_dishes.model.Chef;
import java.util.List;
import java.util.Optional;

@Service
public class ChefService {

    private final ChefRepository chefRepository;

    public ChefService(ChefRepository chefRepository) {
        this.chefRepository = chefRepository;
    }

    public List<Chef> getAllChefs() {
        return chefRepository.findAll();
    }

    public Optional<Chef> getChefById(Long id) {
        return chefRepository.findById(id);
    }

    public Chef saveChef(Chef chef) {
        return chefRepository.save(chef);
    }

    public void deleteChef(Long id) {
        chefRepository.deleteById(id);
    }
}
