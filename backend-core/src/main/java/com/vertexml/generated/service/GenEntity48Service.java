package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity48;
import com.vertexml.generated.repo.GenEntity48Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity48Service {
    private final GenEntity48Repository repo;
    public GenEntity48Service(GenEntity48Repository repo) { this.repo = repo; }
    
    public List<GenEntity48> getAll() { return repo.findAll(); }
    public GenEntity48 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity48 create(GenEntity48 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity48 update(UUID id, GenEntity48 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity48> all = repo.findAll();
        for(GenEntity48 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
