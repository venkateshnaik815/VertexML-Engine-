package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity230;
import com.vertexml.generated.repo.GenEntity230Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity230Service {
    private final GenEntity230Repository repo;
    public GenEntity230Service(GenEntity230Repository repo) { this.repo = repo; }
    
    public List<GenEntity230> getAll() { return repo.findAll(); }
    public GenEntity230 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity230 create(GenEntity230 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity230 update(UUID id, GenEntity230 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity230> all = repo.findAll();
        for(GenEntity230 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
