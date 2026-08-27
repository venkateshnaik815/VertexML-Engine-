package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity41;
import com.vertexml.generated.repo.GenEntity41Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity41Service {
    private final GenEntity41Repository repo;
    public GenEntity41Service(GenEntity41Repository repo) { this.repo = repo; }
    
    public List<GenEntity41> getAll() { return repo.findAll(); }
    public GenEntity41 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity41 create(GenEntity41 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity41 update(UUID id, GenEntity41 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity41> all = repo.findAll();
        for(GenEntity41 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
