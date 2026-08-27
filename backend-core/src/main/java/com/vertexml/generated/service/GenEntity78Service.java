package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity78;
import com.vertexml.generated.repo.GenEntity78Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity78Service {
    private final GenEntity78Repository repo;
    public GenEntity78Service(GenEntity78Repository repo) { this.repo = repo; }
    
    public List<GenEntity78> getAll() { return repo.findAll(); }
    public GenEntity78 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity78 create(GenEntity78 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity78 update(UUID id, GenEntity78 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity78> all = repo.findAll();
        for(GenEntity78 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
