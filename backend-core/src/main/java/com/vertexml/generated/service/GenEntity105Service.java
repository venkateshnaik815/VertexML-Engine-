package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity105;
import com.vertexml.generated.repo.GenEntity105Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity105Service {
    private final GenEntity105Repository repo;
    public GenEntity105Service(GenEntity105Repository repo) { this.repo = repo; }
    
    public List<GenEntity105> getAll() { return repo.findAll(); }
    public GenEntity105 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity105 create(GenEntity105 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity105 update(UUID id, GenEntity105 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity105> all = repo.findAll();
        for(GenEntity105 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
