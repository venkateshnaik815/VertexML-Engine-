package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity187;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity187Repository extends JpaRepository<GenEntity187, UUID> {
    List<GenEntity187> findByName(String name);
    List<GenEntity187> findByStatus(String status);
    List<GenEntity187> findByType(String type);
    List<GenEntity187> findByIsActiveTrue();
}
