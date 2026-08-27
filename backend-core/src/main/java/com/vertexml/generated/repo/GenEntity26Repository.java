package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity26;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity26Repository extends JpaRepository<GenEntity26, UUID> {
    List<GenEntity26> findByName(String name);
    List<GenEntity26> findByStatus(String status);
    List<GenEntity26> findByType(String type);
    List<GenEntity26> findByIsActiveTrue();
}
