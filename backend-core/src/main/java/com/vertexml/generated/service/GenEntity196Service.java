package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity196;
import com.vertexml.generated.repo.GenEntity196Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity196Service {
    private final GenEntity196Repository repo;
    public GenEntity196Service(GenEntity196Repository repo) { this.repo = repo; }
    
    public List<GenEntity196> getAll() { return repo.findAll(); }
    public GenEntity196 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity196 create(GenEntity196 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity196 update(UUID id, GenEntity196 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity196> all = repo.findAll();
        for(GenEntity196 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
