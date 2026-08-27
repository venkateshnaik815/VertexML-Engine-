package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity244;
import com.vertexml.generated.repo.GenEntity244Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity244Service {
    private final GenEntity244Repository repo;
    public GenEntity244Service(GenEntity244Repository repo) { this.repo = repo; }
    
    public List<GenEntity244> getAll() { return repo.findAll(); }
    public GenEntity244 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity244 create(GenEntity244 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity244 update(UUID id, GenEntity244 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity244> all = repo.findAll();
        for(GenEntity244 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
