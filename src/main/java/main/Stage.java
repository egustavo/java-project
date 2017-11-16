package main;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stage {
    private int stageId;
    private String stageName;
    private String stageDescription;

    @Id
    @Column(name = "stage_id", nullable = false)
    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    @Basic
    @Column(name = "stage_name", nullable = false, length = 40)
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Basic
    @Column(name = "stage_description", nullable = false, length = 200)
    public String getStageDescription() {
        return stageDescription;
    }

    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stage stage = (Stage) o;

        if (stageId != stage.stageId) return false;
        if (stageName != null ? !stageName.equals(stage.stageName) : stage.stageName != null) return false;
        if (stageDescription != null ? !stageDescription.equals(stage.stageDescription) : stage.stageDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stageId;
        result = 31 * result + (stageName != null ? stageName.hashCode() : 0);
        result = 31 * result + (stageDescription != null ? stageDescription.hashCode() : 0);
        return result;
    }
}
