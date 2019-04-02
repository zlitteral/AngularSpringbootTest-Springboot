package restservice.controller;

import org.springframework.web.bind.annotation.*;
import restservice.entity.Shipwreck;
import restservice.repository.ShipRepository;

import javax.persistence.NoResultException;
import java.util.List;

public class ShipwreckController {
    private final ShipRepository repository;

    ShipwreckController(ShipRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/shipwrecks")
    List<Shipwreck> all() {
        return repository.findAll();
    }

    @PostMapping("/shipwrecks")
    Shipwreck newShipwreck(@RequestBody Shipwreck newShipwreck) {
        return repository.save(newShipwreck);
    }

    // Single item

    @GetMapping("/shipwrecks/{id}")
    Shipwreck one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new NoResultException("idk what to put here"));
    }

    @PutMapping("/shipwrecks/{id}")
    Shipwreck replaceShipwreck(@RequestBody Shipwreck newShipwreck, @PathVariable Integer id) {

        return repository.findById(id)
                .map(shipwreck -> {
                    shipwreck.setName(newShipwreck.getName());
                    shipwreck.setCondition(newShipwreck.getCondition());
                    shipwreck.setDescription(newShipwreck.getDescription());
                    shipwreck.setDepth(newShipwreck.getDepth());
                    shipwreck.setYearDiscovered(newShipwreck.getYearDiscovered());
                    return repository.save(shipwreck);
                })
                .orElseGet(() -> {
                    newShipwreck.setId(id);
                    return repository.save(newShipwreck);
                });
    }

    @DeleteMapping("/shipwrecks/{id}")
    void deleteShipwreck(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
