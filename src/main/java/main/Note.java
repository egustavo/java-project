package main;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Note {
    private int noteId;
    private String noteContent;
    private Timestamp dateCreated;

    Lead lead;
    Salesperson salesperson;

    @ManyToOne()
    @JoinColumn(name = "lead_id")
    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }

    @ManyToOne()
    @JoinColumn(name = "salesperson_id")
    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id", nullable = false)
    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "note_content", nullable = false, length = 250)
    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Basic
    @Column(name = "date_created", nullable = false)
    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (noteId != note.noteId) return false;
        if (noteContent != null ? !noteContent.equals(note.noteContent) : note.noteContent != null) return false;
        if (dateCreated != null ? !dateCreated.equals(note.dateCreated) : note.dateCreated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId;
        result = 31 * result + (noteContent != null ? noteContent.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        return result;
    }
}
