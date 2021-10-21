/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Shipping;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long>{ }
