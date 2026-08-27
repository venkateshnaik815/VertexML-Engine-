package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity42;
import com.vertexml.generated.repo.GenEntity42Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity42Service {
    private final GenEntity42Repository repo;
    public GenEntity42Service(GenEntity42Repository repo) { this.repo = repo; }
    
    public List<GenEntity42> getAll() { return repo.findAll(); }
    public GenEntity42 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity42 create(GenEntity42 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity42 update(UUID id, GenEntity42 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity42> all = repo.findAll();
        for(GenEntity42 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
