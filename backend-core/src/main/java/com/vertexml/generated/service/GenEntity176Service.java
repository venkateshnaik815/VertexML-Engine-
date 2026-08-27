package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity176;
import com.vertexml.generated.repo.GenEntity176Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity176Service {
    private final GenEntity176Repository repo;
    public GenEntity176Service(GenEntity176Repository repo) { this.repo = repo; }
    
    public List<GenEntity176> getAll() { return repo.findAll(); }
    public GenEntity176 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity176 create(GenEntity176 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity176 update(UUID id, GenEntity176 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity176> all = repo.findAll();
        for(GenEntity176 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
