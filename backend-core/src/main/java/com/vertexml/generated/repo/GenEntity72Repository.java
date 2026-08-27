package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity72;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity72Repository extends JpaRepository<GenEntity72, UUID> {
    List<GenEntity72> findByName(String name);
    List<GenEntity72> findByStatus(String status);
    List<GenEntity72> findByType(String type);
    List<GenEntity72> findByIsActiveTrue();
}
