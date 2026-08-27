package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity274;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity274Repository extends JpaRepository<GenEntity274, UUID> {
    List<GenEntity274> findByName(String name);
    List<GenEntity274> findByStatus(String status);
    List<GenEntity274> findByType(String type);
    List<GenEntity274> findByIsActiveTrue();
}
