package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity217;
import com.vertexml.generated.repo.GenEntity217Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity217Service {
    private final GenEntity217Repository repo;
    public GenEntity217Service(GenEntity217Repository repo) { this.repo = repo; }
    
    public List<GenEntity217> getAll() { return repo.findAll(); }
    public GenEntity217 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity217 create(GenEntity217 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity217 update(UUID id, GenEntity217 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity217> all = repo.findAll();
        for(GenEntity217 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
