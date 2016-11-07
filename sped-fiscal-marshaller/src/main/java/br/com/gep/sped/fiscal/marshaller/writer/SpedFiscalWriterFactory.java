package br.com.gep.sped.fiscal.marshaller.writer;

import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import br.com.gep.sped.marshaller.common.reflection.BeanIORecordLocator;
import br.com.gep.sped.marshaller.common.writer.SpedWriterFactory;
import org.beanio.builder.StreamBuilder;

import java.io.IOException;

public class SpedFiscalWriterFactory extends SpedWriterFactory {

    private static volatile SpedWriterFactory instance;

    private SpedFiscalWriterFactory() {
        super("spedfiscal");
    }

    public static SpedWriterFactory getInstance() {
        if (instance == null) {
            synchronized (SpedFiscalWriterFactory.class) {
                if (instance == null) {
                    instance = new SpedFiscalWriterFactory()
                            .initializeFactory();
                }
            }
        }

        return instance;
    }

    @Override
    protected void addRecords(StreamBuilder builder) {
        try {
            BeanIORecordLocator.findAllFrom("br.com.gep.sped.fiscal.marshaller.registros")
                .forEach(builder::addRecord);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        builder
            .addRecord(Reg9001.class)
            .addRecord(Reg9900.class)
            .addRecord(Reg9990.class)
            .addRecord(Reg9999.class);
    }
}
