package ua.ucu.edu.apps.flower_contnue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ucu.edu.apps.flower_contnue.model.Flower;
import ua.ucu.edu.apps.flower_contnue.service.FlowerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerService.addFlower(flower);
    }
}

