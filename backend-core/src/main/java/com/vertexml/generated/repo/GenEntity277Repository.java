package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity277;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity277Repository extends JpaRepository<GenEntity277, UUID> {
    List<GenEntity277> findByName(String name);
    List<GenEntity277> findByStatus(String status);
    List<GenEntity277> findByType(String type);
    List<GenEntity277> findByIsActiveTrue();
}
