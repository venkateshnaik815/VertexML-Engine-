package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity114;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity114Repository extends JpaRepository<GenEntity114, UUID> {
    List<GenEntity114> findByName(String name);
    List<GenEntity114> findByStatus(String status);
    List<GenEntity114> findByType(String type);
    List<GenEntity114> findByIsActiveTrue();
}
