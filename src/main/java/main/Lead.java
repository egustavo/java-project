package main;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Lead {
    private int leadId;
    private String leadName;
    private String leadDescription;
    private int productQuantity;
    private BigDecimal leadTotal;
    private Set<Note> notes;

    Salesperson salesperson;
    Stage stage;
    Contact contact;

    @ManyToOne()
    @JoinColumn(name = "salesperson_id")
    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    @ManyToOne()
    @JoinColumn(name = "stage_id")
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @ManyToOne()
    @JoinColumn(name = "contact_id")
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "lead",cascade = CascadeType.ALL)
    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        notes.forEach(note -> note.setLead(this));
        this.notes = notes;
    }
}
