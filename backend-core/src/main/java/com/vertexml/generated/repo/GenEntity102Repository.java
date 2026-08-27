package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity102;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity102Repository extends JpaRepository<GenEntity102, UUID> {
    List<GenEntity102> findByName(String name);
    List<GenEntity102> findByStatus(String status);
    List<GenEntity102> findByType(String type);
    List<GenEntity102> findByIsActiveTrue();
}
