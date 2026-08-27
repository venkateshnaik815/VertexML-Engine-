package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity103;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity103Repository extends JpaRepository<GenEntity103, UUID> {
    List<GenEntity103> findByName(String name);
    List<GenEntity103> findByStatus(String status);
    List<GenEntity103> findByType(String type);
    List<GenEntity103> findByIsActiveTrue();
}
