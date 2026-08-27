package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity53;
import com.vertexml.generated.repo.GenEntity53Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity53Service {
    private final GenEntity53Repository repo;
    public GenEntity53Service(GenEntity53Repository repo) { this.repo = repo; }
    
    public List<GenEntity53> getAll() { return repo.findAll(); }
    public GenEntity53 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity53 create(GenEntity53 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity53 update(UUID id, GenEntity53 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity53> all = repo.findAll();
        for(GenEntity53 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
