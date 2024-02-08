package com.app.model;

public class Ticket {
    //--------ATTRIBUTES--------
    private long id;
    private String summary;
    private String description;
    private long statusId;
    private long reporterId;
    private long assigneId;
    private long projectId;
    private String type;
    private long sprintID;
    private long labelId;


    //--------GETTERS/SETTERS-------


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    public long getReporterId() {
        return reporterId;
    }

    public void setReporterId(long reporterId) {
        this.reporterId = reporterId;
    }

    public long getAssigneId() {
        return assigneId;
    }

    public void setAssigneId(long assigneId) {
        this.assigneId = assigneId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSprintID() {
        return sprintID;
    }

    public void setSprintID(long sprintID) {
        this.sprintID = sprintID;
    }

    public long getLabelId() {
        return labelId;
    }

    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }
}
