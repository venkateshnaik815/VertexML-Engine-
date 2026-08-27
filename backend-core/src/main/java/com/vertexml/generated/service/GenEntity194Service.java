package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity194;
import com.vertexml.generated.repo.GenEntity194Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity194Service {
    private final GenEntity194Repository repo;
    public GenEntity194Service(GenEntity194Repository repo) { this.repo = repo; }
    
    public List<GenEntity194> getAll() { return repo.findAll(); }
    public GenEntity194 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity194 create(GenEntity194 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity194 update(UUID id, GenEntity194 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity194> all = repo.findAll();
        for(GenEntity194 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
