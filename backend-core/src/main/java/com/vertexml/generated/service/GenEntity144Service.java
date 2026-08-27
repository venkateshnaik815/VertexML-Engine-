package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity144;
import com.vertexml.generated.repo.GenEntity144Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity144Service {
    private final GenEntity144Repository repo;
    public GenEntity144Service(GenEntity144Repository repo) { this.repo = repo; }
    
    public List<GenEntity144> getAll() { return repo.findAll(); }
    public GenEntity144 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity144 create(GenEntity144 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity144 update(UUID id, GenEntity144 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity144> all = repo.findAll();
        for(GenEntity144 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
