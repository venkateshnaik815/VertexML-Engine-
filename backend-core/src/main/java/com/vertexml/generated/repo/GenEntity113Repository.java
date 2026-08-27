package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity113;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity113Repository extends JpaRepository<GenEntity113, UUID> {
    List<GenEntity113> findByName(String name);
    List<GenEntity113> findByStatus(String status);
    List<GenEntity113> findByType(String type);
    List<GenEntity113> findByIsActiveTrue();
}
