package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity96;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity96Repository extends JpaRepository<GenEntity96, UUID> {
    List<GenEntity96> findByName(String name);
    List<GenEntity96> findByStatus(String status);
    List<GenEntity96> findByType(String type);
    List<GenEntity96> findByIsActiveTrue();
}
