package main;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Lead {
    private int leadId;
    private String leadName;
    private String leadDescription;
    private int productQuantity;
    private BigDecimal leadTotal;

    @Id
    @Column(name = "lead_id", nullable = false)
    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
    }

    @Basic
    @Column(name = "lead_name", nullable = false, length = 80)
    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    @Basic
    @Column(name = "lead_description", nullable = false, length = 200)
    public String getLeadDescription() {
        return leadDescription;
    }

    public void setLeadDescription(String leadDescription) {
        this.leadDescription = leadDescription;
    }

    @Basic
    @Column(name = "product_quantity", nullable = false)
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Basic
    @Column(name = "lead_total", nullable = true, precision = 2)
    public BigDecimal getLeadTotal() {
        return leadTotal;
    }

    public void setLeadTotal(BigDecimal leadTotal) {
        this.leadTotal = leadTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lead lead = (Lead) o;

        if (leadId != lead.leadId) return false;
        if (productQuantity != lead.productQuantity) return false;
        if (leadName != null ? !leadName.equals(lead.leadName) : lead.leadName != null) return false;
        if (leadDescription != null ? !leadDescription.equals(lead.leadDescription) : lead.leadDescription != null)
            return false;
        if (leadTotal != null ? !leadTotal.equals(lead.leadTotal) : lead.leadTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = leadId;
        result = 31 * result + (leadName != null ? leadName.hashCode() : 0);
        result = 31 * result + (leadDescription != null ? leadDescription.hashCode() : 0);
        result = 31 * result + productQuantity;
        result = 31 * result + (leadTotal != null ? leadTotal.hashCode() : 0);
        return result;
    }
}
