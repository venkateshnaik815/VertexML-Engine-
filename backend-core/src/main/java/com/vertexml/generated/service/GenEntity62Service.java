package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity62;
import com.vertexml.generated.repo.GenEntity62Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity62Service {
    private final GenEntity62Repository repo;
    public GenEntity62Service(GenEntity62Repository repo) { this.repo = repo; }
    
    public List<GenEntity62> getAll() { return repo.findAll(); }
    public GenEntity62 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity62 create(GenEntity62 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity62 update(UUID id, GenEntity62 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity62> all = repo.findAll();
        for(GenEntity62 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
