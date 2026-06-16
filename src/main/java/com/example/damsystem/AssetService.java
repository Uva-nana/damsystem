package com.example.damsystem;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    // the database access layer — injected by Spring (Dependency Injection again)
    private final AssetRepository repository;

    public AssetService(AssetRepository repository) {
        this.repository = repository;
    }

    // CREATE — save an asset to the database
    public Asset add(Asset asset) {
        return repository.save(asset);
    }

    // READ all — get every asset from the database
    public List<Asset> getAll() {
        return repository.findAll();
    }

    // READ one — find an asset by id (returns null if not found)
    public Asset getById(int id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE — remove an asset by id
    public void delete(int id) {
        repository.deleteById(id);
    }
}
