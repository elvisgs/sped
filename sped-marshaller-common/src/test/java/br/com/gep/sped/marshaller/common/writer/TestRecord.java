package br.com.gep.sped.marshaller.common.writer;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

import java.util.Date;

@Record
public class TestRecord {

    @Field(at = 1)
    private String stringField;

    @Field(at = 2)
    private Date dateField;

    @Field(at = 3)
    private Double doubleField;

    @Field(at = 4)
    private Integer intField;

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public Date getDateField() {
        return dateField;
    }

    public void setDateField(Date dateField) {
        this.dateField = dateField;
    }

    public Double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(Double doubleField) {
        this.doubleField = doubleField;
    }

    public Integer getIntField() {
        return intField;
    }

    public void setIntField(Integer intField) {
        this.intField = intField;
    }
}
