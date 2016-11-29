package br.com.gep.sped.marshaller.common.writer;

import lombok.Data;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

import java.util.Date;

@Record
@Data
public class TestRecord {

    @Field(at = 1)
    private String stringField;

    @Field(at = 2)
    private Date dateField;

    @Field(at = 3)
    private Double doubleField;

    @Field(at = 4)
    private Integer intField;
}
