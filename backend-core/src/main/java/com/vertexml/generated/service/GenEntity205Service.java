package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity205;
import com.vertexml.generated.repo.GenEntity205Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity205Service {
    private final GenEntity205Repository repo;
    public GenEntity205Service(GenEntity205Repository repo) { this.repo = repo; }
    
    public List<GenEntity205> getAll() { return repo.findAll(); }
    public GenEntity205 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity205 create(GenEntity205 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity205 update(UUID id, GenEntity205 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity205> all = repo.findAll();
        for(GenEntity205 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
