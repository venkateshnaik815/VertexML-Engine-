package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity154;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity154Repository extends JpaRepository<GenEntity154, UUID> {
    List<GenEntity154> findByName(String name);
    List<GenEntity154> findByStatus(String status);
    List<GenEntity154> findByType(String type);
    List<GenEntity154> findByIsActiveTrue();
}
