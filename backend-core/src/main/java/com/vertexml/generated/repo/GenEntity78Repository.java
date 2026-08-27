package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity78;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity78Repository extends JpaRepository<GenEntity78, UUID> {
    List<GenEntity78> findByName(String name);
    List<GenEntity78> findByStatus(String status);
    List<GenEntity78> findByType(String type);
    List<GenEntity78> findByIsActiveTrue();
}
