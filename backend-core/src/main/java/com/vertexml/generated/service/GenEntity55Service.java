package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity55;
import com.vertexml.generated.repo.GenEntity55Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity55Service {
    private final GenEntity55Repository repo;
    public GenEntity55Service(GenEntity55Repository repo) { this.repo = repo; }
    
    public List<GenEntity55> getAll() { return repo.findAll(); }
    public GenEntity55 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity55 create(GenEntity55 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity55 update(UUID id, GenEntity55 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity55> all = repo.findAll();
        for(GenEntity55 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
