package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity68;
import com.vertexml.generated.repo.GenEntity68Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity68Service {
    private final GenEntity68Repository repo;
    public GenEntity68Service(GenEntity68Repository repo) { this.repo = repo; }
    
    public List<GenEntity68> getAll() { return repo.findAll(); }
    public GenEntity68 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity68 create(GenEntity68 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity68 update(UUID id, GenEntity68 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity68> all = repo.findAll();
        for(GenEntity68 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
