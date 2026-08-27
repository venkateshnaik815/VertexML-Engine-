package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity257;
import com.vertexml.generated.repo.GenEntity257Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity257Service {
    private final GenEntity257Repository repo;
    public GenEntity257Service(GenEntity257Repository repo) { this.repo = repo; }
    
    public List<GenEntity257> getAll() { return repo.findAll(); }
    public GenEntity257 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity257 create(GenEntity257 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity257 update(UUID id, GenEntity257 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity257> all = repo.findAll();
        for(GenEntity257 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
