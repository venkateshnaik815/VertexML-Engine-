package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity111;
import com.vertexml.generated.repo.GenEntity111Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity111Service {
    private final GenEntity111Repository repo;
    public GenEntity111Service(GenEntity111Repository repo) { this.repo = repo; }
    
    public List<GenEntity111> getAll() { return repo.findAll(); }
    public GenEntity111 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity111 create(GenEntity111 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity111 update(UUID id, GenEntity111 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity111> all = repo.findAll();
        for(GenEntity111 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
