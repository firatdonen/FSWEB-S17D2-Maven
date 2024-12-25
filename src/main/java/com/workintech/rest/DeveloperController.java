package com.workintech.rest;

import com.workintech.model.Developer;
import com.workintech.model.Experience;
import com.workintech.tax.Taxable;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/workintech")
public class DeveloperController {
    Map<Integer, Developer> developers = new HashMap<>();
    private final Taxable taxable;

    @Autowired
    public DeveloperController(Taxable taxable) {
        this.taxable = taxable;
    }

    @PostConstruct
    public void init() {
        developers.put(1, new Developer(1, "Initial Developer", 5000.0, Experience.JUNIOR));
    }

    @GetMapping("/developers")
    public List<Developer> getAllDevelopers() {
        return new ArrayList<>(developers.values());
    }

    @GetMapping("/developers/{id}")
    public Developer getDeveloperById(@PathVariable int id) {
        return developers.get(id);
    }

    @PostMapping("/developers")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDeveloper(@RequestBody Developer developer) {
        developers.put(developer.getId(), developer);
    }

    @PutMapping("/developers/{id}")
    public void updateDeveloper(@PathVariable int id, @RequestBody Developer developer) {
        developers.put(id, developer);
    }

    @DeleteMapping("/developers/{id}")
    public void deleteDeveloper(@PathVariable int id) {
        developers.remove(id);
    }
}
