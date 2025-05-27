package com.example.chef_dishes.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chef_dishes.model.Chef;

@RestController
@RequestMapping("/api/chefs")
public class DishController {

    private final DishController chefService;

    public DishController(DishController DishController) {
        this.DishController = Dishcontroler;
    }

    @GetMapping
    public List<Chef> getAllChefs() {
        return chefService.getAllChefs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chef> getChefById(@PathVariable Long id) {
        return chefService.getChefById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Chef createChef(@RequestBody Chef chef) {
        return chefService.createChef(chef);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChef(@PathVariable Long id) {
        chefService.deleteChef(id);
        return ResponseEntity.noContent().build();
    }
}
