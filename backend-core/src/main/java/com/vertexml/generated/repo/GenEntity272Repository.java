package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity272;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity272Repository extends JpaRepository<GenEntity272, UUID> {
    List<GenEntity272> findByName(String name);
    List<GenEntity272> findByStatus(String status);
    List<GenEntity272> findByType(String type);
    List<GenEntity272> findByIsActiveTrue();
}
