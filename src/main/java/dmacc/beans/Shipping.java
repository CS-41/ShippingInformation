/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipId;
	private String customerName;
	private double shippingCost;
	private boolean shipStatus;
	private int totalOrderBoxes;
	
	public Shipping() {
		super();
		this.shippingCost = 5.00;
		this.totalOrderBoxes = 1;
	}
	
	public Shipping(int shipId, String customerName, double shippingCost, 
			boolean shipStatus, int totalOrderBoxes) {
		super();
		this.shipId = shipId;
		this.customerName = customerName;
		this.shippingCost = shippingCost;
		this.shipStatus = shipStatus;
		this.totalOrderBoxes = totalOrderBoxes;
	}
	
	public Shipping(String customerName, double shippingCost, 
			boolean shipStatus, int totalOrderBoxes) {
		super();
		this.customerName = customerName;
		this.shippingCost = shippingCost;
		this.shipStatus = shipStatus;
		this.totalOrderBoxes = totalOrderBoxes;
	}
	
	public Shipping(String customerName, boolean shipStatus, int totalOrderBoxes) {
		super();
		this.customerName = customerName;
		this.shipStatus = shipStatus;
		this.totalOrderBoxes = totalOrderBoxes;
	}
	
	/**
	 * @return the shipId
	 */
	public int getShipId() {
		return shipId;
	}

	/**
	 * @param shipId the shipId to set
	 */
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the shippingCost
	 */
	public double getShippingCost() {
		return shippingCost;
	}

	/**
	 * @param shippingCost the shippingCost to set
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 * @return the shipStatus
	 */
	public boolean isShipStatus() {
		return shipStatus;
	}

	/**
	 * @param shipStatus the shipStatus to set
	 */
	public void setShipStatus(boolean shipStatus) {
		this.shipStatus = shipStatus;
	}

	/**
	 * @return the totalOrderBoxes
	 */
	public int getTotalOrderBoxes() {
		return totalOrderBoxes;
	}

	/**
	 * @param totalOrderBoxes the totalOrderBoxes to set
	 */
	public void setTotalOrderBoxes(int totalOrderBoxes) {
		this.totalOrderBoxes = totalOrderBoxes;
	}

	@Override
	public String toString() {
		return "Shipping [shipId=" + shipId + ", customerName=" + customerName + ", shippingCost=" + shippingCost
				+ ", shipStatus=" + shipStatus + ", totalOrderBoxes=" + totalOrderBoxes + "]";
	}
}
