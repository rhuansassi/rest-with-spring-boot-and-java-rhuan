package br.com.rhuanjava.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String massage;
    private String datails;

    public ExceptionResponse(Date timestamp, String massage, String datails) {
        this.timestamp = timestamp;
        this.massage = massage;
        this.datails = datails;
    }


    public Date getTimestamp() {
        return timestamp;
    }
    public String getMassage() {
        return massage;
    }
    public String getDatails() {
        return datails;
    }

}
