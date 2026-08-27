package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity115;
import com.vertexml.generated.repo.GenEntity115Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity115Service {
    private final GenEntity115Repository repo;
    public GenEntity115Service(GenEntity115Repository repo) { this.repo = repo; }
    
    public List<GenEntity115> getAll() { return repo.findAll(); }
    public GenEntity115 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity115 create(GenEntity115 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity115 update(UUID id, GenEntity115 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity115> all = repo.findAll();
        for(GenEntity115 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
