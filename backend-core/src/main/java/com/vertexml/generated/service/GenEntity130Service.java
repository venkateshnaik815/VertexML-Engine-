package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity130;
import com.vertexml.generated.repo.GenEntity130Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity130Service {
    private final GenEntity130Repository repo;
    public GenEntity130Service(GenEntity130Repository repo) { this.repo = repo; }
    
    public List<GenEntity130> getAll() { return repo.findAll(); }
    public GenEntity130 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity130 create(GenEntity130 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity130 update(UUID id, GenEntity130 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity130> all = repo.findAll();
        for(GenEntity130 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
