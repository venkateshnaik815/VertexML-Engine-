package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity143;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity143Repository extends JpaRepository<GenEntity143, UUID> {
    List<GenEntity143> findByName(String name);
    List<GenEntity143> findByStatus(String status);
    List<GenEntity143> findByType(String type);
    List<GenEntity143> findByIsActiveTrue();
}
