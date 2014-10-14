package br.com.gep.sped.contrib.marshaller.writer;

import br.com.gep.sped.contrib.marshaller.registros.bloco0.*;
import br.com.gep.sped.contrib.marshaller.registros.bloco1.*;
import br.com.gep.sped.contrib.marshaller.registros.bloco9.Reg9001;
import br.com.gep.sped.contrib.marshaller.registros.bloco9.Reg9900;
import br.com.gep.sped.contrib.marshaller.registros.bloco9.Reg9990;
import br.com.gep.sped.contrib.marshaller.registros.bloco9.Reg9999;
import br.com.gep.sped.contrib.marshaller.registros.blocoA.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoC.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoD.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoF.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoI.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoM.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoP.*;
import br.com.gep.sped.marshaller.common.writer.SpedWriterFactory;
import org.beanio.builder.StreamBuilder;

public class SpedContribWriterFactory extends SpedWriterFactory {

    private static volatile SpedWriterFactory instance;

    private SpedContribWriterFactory() {
        super("spedcontrib");
    }

    public static SpedWriterFactory getInstance() {
        if (instance == null) {
            synchronized (SpedContribWriterFactory.class) {
                if (instance == null) {
                    instance = new SpedContribWriterFactory()
                            .initializeFactory();
                }
            }
        }

        return instance;
    }

    @Override
    protected void addRecords(StreamBuilder builder) {
        builder
                .addRecord(Reg0000.class)
                .addRecord(Reg0001.class)
                .addRecord(Reg0035.class)
                .addRecord(Reg0100.class)
                .addRecord(Reg0110.class)
                .addRecord(Reg0111.class)
                .addRecord(Reg0120.class)
                .addRecord(Reg0140.class)
                .addRecord(Reg0145.class)
                .addRecord(Reg0150.class)
                .addRecord(Reg0190.class)
                .addRecord(Reg0200.class)
                .addRecord(Reg0205.class)
                .addRecord(Reg0206.class)
                .addRecord(Reg0208.class)
                .addRecord(Reg0400.class)
                .addRecord(Reg0450.class)
                .addRecord(Reg0500.class)
                .addRecord(Reg0600.class)
                .addRecord(Reg0990.class)
                .addRecord(RegA001.class)
                .addRecord(RegA010.class)
                .addRecord(RegA100.class)
                .addRecord(RegA110.class)
                .addRecord(RegA111.class)
                .addRecord(RegA120.class)
                .addRecord(RegA170.class)
                .addRecord(RegA990.class)
                .addRecord(RegC001.class)
                .addRecord(RegC010.class)
                .addRecord(RegC100.class)
                .addRecord(RegC110.class)
                .addRecord(RegC111.class)
                .addRecord(RegC120.class)
                .addRecord(RegC170.class)
                .addRecord(RegC180.class)
                .addRecord(RegC181.class)
                .addRecord(RegC185.class)
                .addRecord(RegC188.class)
                .addRecord(RegC190.class)
                .addRecord(RegC191.class)
                .addRecord(RegC195.class)
                .addRecord(RegC198.class)
                .addRecord(RegC199.class)
                .addRecord(RegC380.class)
                .addRecord(RegC381.class)
                .addRecord(RegC385.class)
                .addRecord(RegC395.class)
                .addRecord(RegC396.class)
                .addRecord(RegC400.class)
                .addRecord(RegC405.class)
                .addRecord(RegC481.class)
                .addRecord(RegC485.class)
                .addRecord(RegC489.class)
                .addRecord(RegC490.class)
                .addRecord(RegC491.class)
                .addRecord(RegC495.class)
                .addRecord(RegC499.class)
                .addRecord(RegC500.class)
                .addRecord(RegC501.class)
                .addRecord(RegC505.class)
                .addRecord(RegC509.class)
                .addRecord(RegC600.class)
                .addRecord(RegC601.class)
                .addRecord(RegC605.class)
                .addRecord(RegC609.class)
                .addRecord(RegC990.class)
                .addRecord(RegD001.class)
                .addRecord(RegD010.class)
                .addRecord(RegD100.class)
                .addRecord(RegD101.class)
                .addRecord(RegD105.class)
                .addRecord(RegD111.class)
                .addRecord(RegD200.class)
                .addRecord(RegD201.class)
                .addRecord(RegD205.class)
                .addRecord(RegD209.class)
                .addRecord(RegD300.class)
                .addRecord(RegD309.class)
                .addRecord(RegD350.class)
                .addRecord(RegD359.class)
                .addRecord(RegD500.class)
                .addRecord(RegD501.class)
                .addRecord(RegD505.class)
                .addRecord(RegD509.class)
                .addRecord(RegD600.class)
                .addRecord(RegD601.class)
                .addRecord(RegD605.class)
                .addRecord(RegD609.class)
                .addRecord(RegD990.class)
                .addRecord(RegF001.class)
                .addRecord(RegF010.class)
                .addRecord(RegF100.class)
                .addRecord(RegF111.class)
                .addRecord(RegF120.class)
                .addRecord(RegF129.class)
                .addRecord(RegF130.class)
                .addRecord(RegF139.class)
                .addRecord(RegF150.class)
                .addRecord(RegF200.class)
                .addRecord(RegF205.class)
                .addRecord(RegF210.class)
                .addRecord(RegF211.class)
                .addRecord(RegF500.class)
                .addRecord(RegF509.class)
                .addRecord(RegF510.class)
                .addRecord(RegF519.class)
                .addRecord(RegF525.class)
                .addRecord(RegF550.class)
                .addRecord(RegF559.class)
                .addRecord(RegF560.class)
                .addRecord(RegF569.class)
                .addRecord(RegF600.class)
                .addRecord(RegF700.class)
                .addRecord(RegF800.class)
                .addRecord(RegF990.class)
                .addRecord(RegI001.class)
                .addRecord(RegI010.class)
                .addRecord(RegI100.class)
                .addRecord(RegI200.class)
                .addRecord(RegI300.class)
                .addRecord(RegI399.class)
                .addRecord(RegI299.class)
                .addRecord(RegI199.class)
                .addRecord(RegI990.class)
                .addRecord(RegM001.class)
                .addRecord(RegM100.class)
                .addRecord(RegM105.class)
                .addRecord(RegM110.class)
                .addRecord(RegM200.class)
                .addRecord(RegM205.class)
                .addRecord(RegM210.class)
                .addRecord(RegM211.class)
                .addRecord(RegM220.class)
                .addRecord(RegM230.class)
                .addRecord(RegM300.class)
                .addRecord(RegM350.class)
                .addRecord(RegM400.class)
                .addRecord(RegM410.class)
                .addRecord(RegM500.class)
                .addRecord(RegM505.class)
                .addRecord(RegM510.class)
                .addRecord(RegM600.class)
                .addRecord(RegM605.class)
                .addRecord(RegM610.class)
                .addRecord(RegM611.class)
                .addRecord(RegM620.class)
                .addRecord(RegM630.class)
                .addRecord(RegM700.class)
                .addRecord(RegM800.class)
                .addRecord(RegM810.class)
                .addRecord(RegM990.class)
                .addRecord(RegP001.class)
                .addRecord(RegP010.class)
                .addRecord(RegP100.class)
                .addRecord(RegP110.class)
                .addRecord(RegP199.class)
                .addRecord(RegP200.class)
                .addRecord(RegP210.class)
                .addRecord(RegP990.class)
                .addRecord(Reg1001.class)
                .addRecord(Reg1010.class)
                .addRecord(Reg1020.class)
                .addRecord(Reg1100.class)
                .addRecord(Reg1300.class)
                .addRecord(Reg1500.class)
                .addRecord(Reg1700.class)
                .addRecord(Reg1800.class)
                .addRecord(Reg1900.class)
                .addRecord(Reg1990.class)
                .addRecord(Reg9001.class)
                .addRecord(Reg9900.class)
                .addRecord(Reg9990.class)
                .addRecord(Reg9999.class);
    }
}
