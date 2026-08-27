package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity27;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity27Repository extends JpaRepository<GenEntity27, UUID> {
    List<GenEntity27> findByName(String name);
    List<GenEntity27> findByStatus(String status);
    List<GenEntity27> findByType(String type);
    List<GenEntity27> findByIsActiveTrue();
}
