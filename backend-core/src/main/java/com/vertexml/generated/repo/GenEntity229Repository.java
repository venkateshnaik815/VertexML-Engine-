package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity229;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity229Repository extends JpaRepository<GenEntity229, UUID> {
    List<GenEntity229> findByName(String name);
    List<GenEntity229> findByStatus(String status);
    List<GenEntity229> findByType(String type);
    List<GenEntity229> findByIsActiveTrue();
}
