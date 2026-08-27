package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity167;
import com.vertexml.generated.repo.GenEntity167Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity167Service {
    private final GenEntity167Repository repo;
    public GenEntity167Service(GenEntity167Repository repo) { this.repo = repo; }
    
    public List<GenEntity167> getAll() { return repo.findAll(); }
    public GenEntity167 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity167 create(GenEntity167 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity167 update(UUID id, GenEntity167 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity167> all = repo.findAll();
        for(GenEntity167 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
