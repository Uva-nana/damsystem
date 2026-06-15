package com.example.damsystem;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService {

    // our in-memory storage (a simple list — later we swap this for a database)
    private List<Asset> assets = new ArrayList<>();

    // CREATE — add a new asset
    public Asset add(Asset asset) {
        assets.add(asset);
        return asset;
    }

    // READ all — return every asset
    public List<Asset> getAll() {
        return assets;
    }

    // READ one — find an asset by its id
    public Asset getById(int id) {
        for (Asset a : assets) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;   // not found
    }

    // DELETE — remove an asset by its id
    public void delete(int id) {
        assets.removeIf(a -> a.getId() == id);
    }
}
