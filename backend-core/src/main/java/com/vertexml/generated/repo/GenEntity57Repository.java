package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity57;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity57Repository extends JpaRepository<GenEntity57, UUID> {
    List<GenEntity57> findByName(String name);
    List<GenEntity57> findByStatus(String status);
    List<GenEntity57> findByType(String type);
    List<GenEntity57> findByIsActiveTrue();
}
