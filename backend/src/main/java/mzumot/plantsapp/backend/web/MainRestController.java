package mzumot.plantsapp.backend.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mzumot.plantsapp.backend.model.Plant;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
public class MainRestController {
        private List<Plant> plants = new ArrayList<>(); 


@CrossOrigin(origins = "*")
    @GetMapping("/plants")
    public List<Plant> getAllPlants() {
        Plant plantA = new Plant(12344L, "Max", "Maxima Pilantes", "a very lovely plant");
        Plant plantB = new Plant(11412L, "Vivi", "Verosita Barontes", "a very lovely plant");
        Plant plantC = new Plant(16323L, "Pila", "Loompi Ceuta", "a very lovely plant");
        Plant plantD = new Plant(12563L, "Kooki", "Holithia Antes", "a very lovely plant");
        Plant plantE = new Plant(15745L, "Slim", "Monsteraas aslantes", "a very lovely plant");
        
        this.plants.add(plantA);
        this.plants.add(plantB);
        this.plants.add(plantC);
        this.plants.add(plantD);
        this.plants.add(plantE);
        return plants;
}


}