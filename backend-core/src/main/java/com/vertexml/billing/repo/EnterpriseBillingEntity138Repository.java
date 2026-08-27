package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity138;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity138Repository extends JpaRepository<EnterpriseBillingEntity138, UUID> {
    List<EnterpriseBillingEntity138> findByName(String name);
    List<EnterpriseBillingEntity138> findByStatus(String status);
    List<EnterpriseBillingEntity138> findByType(String type);
    List<EnterpriseBillingEntity138> findByIsActiveTrue();
}
