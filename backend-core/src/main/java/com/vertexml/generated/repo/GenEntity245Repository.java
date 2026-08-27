package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity245;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity245Repository extends JpaRepository<GenEntity245, UUID> {
    List<GenEntity245> findByName(String name);
    List<GenEntity245> findByStatus(String status);
    List<GenEntity245> findByType(String type);
    List<GenEntity245> findByIsActiveTrue();
}
