package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity139;
import com.vertexml.generated.repo.GenEntity139Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity139Service {
    private final GenEntity139Repository repo;
    public GenEntity139Service(GenEntity139Repository repo) { this.repo = repo; }
    
    public List<GenEntity139> getAll() { return repo.findAll(); }
    public GenEntity139 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity139 create(GenEntity139 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity139 update(UUID id, GenEntity139 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity139> all = repo.findAll();
        for(GenEntity139 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
