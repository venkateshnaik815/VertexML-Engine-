package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity156;
import com.vertexml.generated.repo.GenEntity156Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity156Service {
    private final GenEntity156Repository repo;
    public GenEntity156Service(GenEntity156Repository repo) { this.repo = repo; }
    
    public List<GenEntity156> getAll() { return repo.findAll(); }
    public GenEntity156 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity156 create(GenEntity156 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity156 update(UUID id, GenEntity156 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity156> all = repo.findAll();
        for(GenEntity156 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
