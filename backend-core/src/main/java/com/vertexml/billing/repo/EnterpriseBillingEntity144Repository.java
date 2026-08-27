package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity144;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity144Repository extends JpaRepository<EnterpriseBillingEntity144, UUID> {
    List<EnterpriseBillingEntity144> findByName(String name);
    List<EnterpriseBillingEntity144> findByStatus(String status);
    List<EnterpriseBillingEntity144> findByType(String type);
    List<EnterpriseBillingEntity144> findByIsActiveTrue();
}
