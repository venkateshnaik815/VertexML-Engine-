package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity152;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity152Repository extends JpaRepository<GenEntity152, UUID> {
    List<GenEntity152> findByName(String name);
    List<GenEntity152> findByStatus(String status);
    List<GenEntity152> findByType(String type);
    List<GenEntity152> findByIsActiveTrue();
}
