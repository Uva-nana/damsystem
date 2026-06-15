package com.example.damsystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {

    // the controller does NOT do the work itself — it asks the service
    private final AssetService service;

    // constructor injection: Spring hands us the AssetService automatically (Dependency Injection)
    public AssetController(AssetService service) {
        this.service = service;
    }

    // CREATE → POST /assets   (asset comes in as JSON in the request body)
    @PostMapping("/assets")
    public Asset addAsset(@RequestBody Asset asset) {
        return service.add(asset);
    }

    // READ all → GET /assets
    @GetMapping("/assets")
    public List<Asset> getAllAssets() {
        return service.getAll();
    }

    // READ one → GET /assets/2   (the 2 comes from the URL)
    @GetMapping("/assets/{id}")
    public Asset getAsset(@PathVariable int id) {
        return service.getById(id);
    }

    // DELETE → DELETE /assets/2
    @DeleteMapping("/assets/{id}")
    public String deleteAsset(@PathVariable int id) {
        service.delete(id);
        return "Asset " + id + " deleted";
    }
}
