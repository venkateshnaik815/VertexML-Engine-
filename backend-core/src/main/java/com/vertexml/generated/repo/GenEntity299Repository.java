package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity299;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity299Repository extends JpaRepository<GenEntity299, UUID> {
    List<GenEntity299> findByName(String name);
    List<GenEntity299> findByStatus(String status);
    List<GenEntity299> findByType(String type);
    List<GenEntity299> findByIsActiveTrue();
}
