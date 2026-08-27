package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity254;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity254Repository extends JpaRepository<GenEntity254, UUID> {
    List<GenEntity254> findByName(String name);
    List<GenEntity254> findByStatus(String status);
    List<GenEntity254> findByType(String type);
    List<GenEntity254> findByIsActiveTrue();
}
