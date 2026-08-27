package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity141;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity141Repository extends JpaRepository<GenEntity141, UUID> {
    List<GenEntity141> findByName(String name);
    List<GenEntity141> findByStatus(String status);
    List<GenEntity141> findByType(String type);
    List<GenEntity141> findByIsActiveTrue();
}
