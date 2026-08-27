package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity7;
import com.vertexml.generated.repo.GenEntity7Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity7Service {
    private final GenEntity7Repository repo;
    public GenEntity7Service(GenEntity7Repository repo) { this.repo = repo; }
    
    public List<GenEntity7> getAll() { return repo.findAll(); }
    public GenEntity7 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity7 create(GenEntity7 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity7 update(UUID id, GenEntity7 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity7> all = repo.findAll();
        for(GenEntity7 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
