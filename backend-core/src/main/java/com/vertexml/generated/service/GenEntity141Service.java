package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity141;
import com.vertexml.generated.repo.GenEntity141Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity141Service {
    private final GenEntity141Repository repo;
    public GenEntity141Service(GenEntity141Repository repo) { this.repo = repo; }
    
    public List<GenEntity141> getAll() { return repo.findAll(); }
    public GenEntity141 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity141 create(GenEntity141 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity141 update(UUID id, GenEntity141 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity141> all = repo.findAll();
        for(GenEntity141 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
