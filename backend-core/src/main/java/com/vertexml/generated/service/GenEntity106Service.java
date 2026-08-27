package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity106;
import com.vertexml.generated.repo.GenEntity106Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity106Service {
    private final GenEntity106Repository repo;
    public GenEntity106Service(GenEntity106Repository repo) { this.repo = repo; }
    
    public List<GenEntity106> getAll() { return repo.findAll(); }
    public GenEntity106 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity106 create(GenEntity106 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity106 update(UUID id, GenEntity106 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity106> all = repo.findAll();
        for(GenEntity106 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
