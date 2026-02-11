package com.mss.backOffice.websocket;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BatchStatusUpdateMessage {

    private String type = "STATUS_UPDATE";
    private Long batchHId;
    private Integer status;
    private String batchName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    private Date timestamp;

    private String message;

    // Default constructor
    public BatchStatusUpdateMessage() {
        this.timestamp = new Date();
    }

    // Constructor with parameters
    public BatchStatusUpdateMessage(Long batchHId, Integer status, String batchName) {
        this.batchHId = batchHId;
        this.status = status;
        this.batchName = batchName;
        this.timestamp = new Date();
        this.message = getStatusMessage(status);
    }

    // Helper method to get status message
    private String getStatusMessage(Integer status) {
        if (status == null) {
            return "Unknown";
        }
        switch (status) {
            case -1:
                return "Pending";
            case 0:
                return "Parsing started";
            case 1:
                return "Done";
            case 2:
                return "Error";
            case 3:
                return "Parsing completed";
            default:
                return "Status " + status;
        }
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getBatchHId() {
        return batchHId;
    }

    public void setBatchHId(Long batchHId) {
        this.batchHId = batchHId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        this.message = getStatusMessage(status);
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BatchStatusUpdateMessage{" +
                "type='" + type + '\'' +
                ", batchHId=" + batchHId +
                ", status=" + status +
                ", batchName='" + batchName + '\'' +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }
}
