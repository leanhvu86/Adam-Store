/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Windows 10 Quanh
 */
@Embeddable
public class OrderDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ProductIsbn")
    private int productIsbn;
    @Basic(optional = false)
    @Column(name = "OrderId")
    private int orderId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int productIsbn, int orderId) {
        this.productIsbn = productIsbn;
        this.orderId = orderId;
    }

    public int getProductIsbn() {
        return productIsbn;
    }

    public void setProductIsbn(int productIsbn) {
        this.productIsbn = productIsbn;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productIsbn;
        hash += (int) orderId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailPK)) {
            return false;
        }
        OrderDetailPK other = (OrderDetailPK) object;
        if (this.productIsbn != other.productIsbn) {
            return false;
        }
        if (this.orderId != other.orderId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OrderDetailPK[ productIsbn=" + productIsbn + ", orderId=" + orderId + " ]";
    }
    
}
