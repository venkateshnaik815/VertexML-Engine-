package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity5;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity5Repository extends JpaRepository<GenEntity5, UUID> {
    List<GenEntity5> findByName(String name);
    List<GenEntity5> findByStatus(String status);
    List<GenEntity5> findByType(String type);
    List<GenEntity5> findByIsActiveTrue();
}
