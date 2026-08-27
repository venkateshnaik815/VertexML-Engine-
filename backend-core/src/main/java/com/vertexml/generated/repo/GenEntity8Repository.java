package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity8;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity8Repository extends JpaRepository<GenEntity8, UUID> {
    List<GenEntity8> findByName(String name);
    List<GenEntity8> findByStatus(String status);
    List<GenEntity8> findByType(String type);
    List<GenEntity8> findByIsActiveTrue();
}
