package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity202;
import com.vertexml.generated.repo.GenEntity202Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity202Service {
    private final GenEntity202Repository repo;
    public GenEntity202Service(GenEntity202Repository repo) { this.repo = repo; }
    
    public List<GenEntity202> getAll() { return repo.findAll(); }
    public GenEntity202 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity202 create(GenEntity202 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity202 update(UUID id, GenEntity202 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity202> all = repo.findAll();
        for(GenEntity202 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
