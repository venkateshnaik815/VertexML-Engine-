package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity28;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity28Repository extends JpaRepository<GenEntity28, UUID> {
    List<GenEntity28> findByName(String name);
    List<GenEntity28> findByStatus(String status);
    List<GenEntity28> findByType(String type);
    List<GenEntity28> findByIsActiveTrue();
}
