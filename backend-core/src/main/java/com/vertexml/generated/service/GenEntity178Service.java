package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity178;
import com.vertexml.generated.repo.GenEntity178Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity178Service {
    private final GenEntity178Repository repo;
    public GenEntity178Service(GenEntity178Repository repo) { this.repo = repo; }
    
    public List<GenEntity178> getAll() { return repo.findAll(); }
    public GenEntity178 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity178 create(GenEntity178 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity178 update(UUID id, GenEntity178 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity178> all = repo.findAll();
        for(GenEntity178 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
