package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity89;
import com.vertexml.generated.repo.GenEntity89Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity89Service {
    private final GenEntity89Repository repo;
    public GenEntity89Service(GenEntity89Repository repo) { this.repo = repo; }
    
    public List<GenEntity89> getAll() { return repo.findAll(); }
    public GenEntity89 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity89 create(GenEntity89 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity89 update(UUID id, GenEntity89 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity89> all = repo.findAll();
        for(GenEntity89 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
