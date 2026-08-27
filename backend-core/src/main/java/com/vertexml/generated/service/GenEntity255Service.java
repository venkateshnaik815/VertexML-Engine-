package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity255;
import com.vertexml.generated.repo.GenEntity255Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity255Service {
    private final GenEntity255Repository repo;
    public GenEntity255Service(GenEntity255Repository repo) { this.repo = repo; }
    
    public List<GenEntity255> getAll() { return repo.findAll(); }
    public GenEntity255 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity255 create(GenEntity255 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity255 update(UUID id, GenEntity255 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity255> all = repo.findAll();
        for(GenEntity255 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
