package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity259;
import com.vertexml.generated.repo.GenEntity259Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity259Service {
    private final GenEntity259Repository repo;
    public GenEntity259Service(GenEntity259Repository repo) { this.repo = repo; }
    
    public List<GenEntity259> getAll() { return repo.findAll(); }
    public GenEntity259 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity259 create(GenEntity259 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity259 update(UUID id, GenEntity259 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity259> all = repo.findAll();
        for(GenEntity259 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
