package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity63;
import com.vertexml.generated.repo.GenEntity63Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity63Service {
    private final GenEntity63Repository repo;
    public GenEntity63Service(GenEntity63Repository repo) { this.repo = repo; }
    
    public List<GenEntity63> getAll() { return repo.findAll(); }
    public GenEntity63 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity63 create(GenEntity63 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity63 update(UUID id, GenEntity63 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity63> all = repo.findAll();
        for(GenEntity63 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
