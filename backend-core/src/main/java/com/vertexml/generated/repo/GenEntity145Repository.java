package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity145;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity145Repository extends JpaRepository<GenEntity145, UUID> {
    List<GenEntity145> findByName(String name);
    List<GenEntity145> findByStatus(String status);
    List<GenEntity145> findByType(String type);
    List<GenEntity145> findByIsActiveTrue();
}
