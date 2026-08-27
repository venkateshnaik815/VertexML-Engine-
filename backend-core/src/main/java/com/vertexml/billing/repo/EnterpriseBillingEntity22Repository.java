package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity22;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity22Repository extends JpaRepository<EnterpriseBillingEntity22, UUID> {
    List<EnterpriseBillingEntity22> findByName(String name);
    List<EnterpriseBillingEntity22> findByStatus(String status);
    List<EnterpriseBillingEntity22> findByType(String type);
    List<EnterpriseBillingEntity22> findByIsActiveTrue();
}
