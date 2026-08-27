package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity129;
import com.vertexml.generated.repo.GenEntity129Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity129Service {
    private final GenEntity129Repository repo;
    public GenEntity129Service(GenEntity129Repository repo) { this.repo = repo; }
    
    public List<GenEntity129> getAll() { return repo.findAll(); }
    public GenEntity129 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity129 create(GenEntity129 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity129 update(UUID id, GenEntity129 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity129> all = repo.findAll();
        for(GenEntity129 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
