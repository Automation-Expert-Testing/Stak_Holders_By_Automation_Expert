import java.io.BufferedReader;
import java.io.IOException;

public class Requirement {
    /*
    By K.MEKDOUD
    */
    private Integer id;
    private String description;
    private User createdBy;
    private User assignedTo;
    private Integer planTime;
    private Float budget;
    private Boolean requiementStatus;

    public Requirement(Integer id, String description,Float budget ,Integer planTime ) {
        this.id = id;
        this.description = description;
        this.planTime = planTime;
        this.budget = budget;
    }
    public Requirement(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
    public Integer getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public User getAssignedTo() {
        return assignedTo;
    }
    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }
    public Integer getPlanTime() {
        return planTime;
    }
    public void setPlanTime(Integer planTime) {
        this.planTime = planTime;
    }
    public Float getBudget() {
        return budget;
    }
    public void setBudget(Float budget) {
        this.budget = budget;
    }

Requirement(){

}
    public Requirement(Integer id, String description, User createdBy, User assignedTo, Integer planTime, Float budget, Boolean requiementStatus) {
        this.id = id;
        this.description = description;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.planTime = planTime;
        this.budget = budget;
        this.requiementStatus = requiementStatus;
    }

}
