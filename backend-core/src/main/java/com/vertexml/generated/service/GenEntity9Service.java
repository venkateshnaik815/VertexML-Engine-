package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity9;
import com.vertexml.generated.repo.GenEntity9Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity9Service {
    private final GenEntity9Repository repo;
    public GenEntity9Service(GenEntity9Repository repo) { this.repo = repo; }
    
    public List<GenEntity9> getAll() { return repo.findAll(); }
    public GenEntity9 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity9 create(GenEntity9 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity9 update(UUID id, GenEntity9 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity9> all = repo.findAll();
        for(GenEntity9 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
