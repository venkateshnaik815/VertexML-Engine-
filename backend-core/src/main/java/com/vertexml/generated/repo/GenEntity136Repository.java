package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity136;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity136Repository extends JpaRepository<GenEntity136, UUID> {
    List<GenEntity136> findByName(String name);
    List<GenEntity136> findByStatus(String status);
    List<GenEntity136> findByType(String type);
    List<GenEntity136> findByIsActiveTrue();
}
