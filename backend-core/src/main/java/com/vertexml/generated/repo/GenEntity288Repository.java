package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity288;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity288Repository extends JpaRepository<GenEntity288, UUID> {
    List<GenEntity288> findByName(String name);
    List<GenEntity288> findByStatus(String status);
    List<GenEntity288> findByType(String type);
    List<GenEntity288> findByIsActiveTrue();
}
