package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity112;
import com.vertexml.generated.repo.GenEntity112Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity112Service {
    private final GenEntity112Repository repo;
    public GenEntity112Service(GenEntity112Repository repo) { this.repo = repo; }
    
    public List<GenEntity112> getAll() { return repo.findAll(); }
    public GenEntity112 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity112 create(GenEntity112 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity112 update(UUID id, GenEntity112 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity112> all = repo.findAll();
        for(GenEntity112 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
