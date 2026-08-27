package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity19;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity19Repository extends JpaRepository<GenEntity19, UUID> {
    List<GenEntity19> findByName(String name);
    List<GenEntity19> findByStatus(String status);
    List<GenEntity19> findByType(String type);
    List<GenEntity19> findByIsActiveTrue();
}
