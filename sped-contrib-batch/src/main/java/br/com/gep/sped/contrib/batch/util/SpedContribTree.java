package br.com.gep.sped.contrib.batch.util;

import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.SpedTree;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.*;
import br.com.gep.sped.contrib.marshaller.registros.bloco1.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoA.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoC.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoD.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoF.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoI.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoM.*;
import br.com.gep.sped.contrib.marshaller.registros.blocoP.*;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.stereotype.Component;

/**
 * Representa a árvore de registros do SPED Contribuições.
 */
@Component
public class SpedContribTree extends SpedTree {

    @Override
    protected void addBranches() {
        addBranchesBloco0();
        addBranchesBlocoA();
        addBranchesBlocoC();
        addBranchesBlocoD();
        addBranchesBlocoF();
        addBranchesBlocoI();
        addBranchesBlocoM();
        addBranchesBlocoP();
        addBranchesBloco1();
        addBranchesBloco9();
    }

    private void addBranchesBloco0() {
        addNode(new RegNode(Reg0000.class));
        addNode(new RegNode(Reg0001.class));
        addNode(new RegNode(Reg0035.class, Reg0001.class));
        addNode(new RegNode(Reg0100.class, Reg0001.class));
        addNode(new RegNode(Reg0110.class, Reg0001.class).addChildren(
            new RegNode(Reg0111.class)
        ));
        addNode(new RegNode(Reg0120.class, Reg0001.class));
        addNode(new RegNode(Reg0140.class, Reg0001.class).addChildren(
            new RegNode(Reg0145.class),
            new RegNode(Reg0150.class),
            new RegNode(Reg0190.class),
            new RegNode(Reg0200.class).addChildren(
                new RegNode(Reg0205.class),
                new RegNode(Reg0206.class),
                new RegNode(Reg0208.class)
            ),
            new RegNode(Reg0400.class),
            new RegNode(Reg0450.class)
        ));
        addNode(new RegNode(Reg0500.class, Reg0001.class));
        addNode(new RegNode(Reg0600.class, Reg0001.class));
        addNode(new RegNode(Reg0990.class));
    }

    private void addBranchesBlocoA() {
        addNode(new RegNode(RegA001.class));
        addNode(new RegNode(RegA010.class, RegA001.class).addChildren(
            new RegNode(RegA100.class).addChildren(
                new RegNode(RegA110.class),
                new RegNode(RegA111.class),
                new RegNode(RegA120.class),
                new RegNode(RegA170.class)
            )
        ));
        addNode(new RegNode(RegA990.class));
    }

    private void addBranchesBlocoC() {
        addNode(new RegNode(RegC001.class));
        addNode(new RegNode(RegC010.class, RegC001.class).addChildren(
            new RegNode(RegC100.class).addChildren(
                new RegNode(RegC110.class),
                new RegNode(RegC111.class),
                new RegNode(RegC120.class),
                new RegNode(RegC170.class),
                new RegNode(RegC175.class)
            ),
            new RegNode(RegC180.class).addChildren(
                new RegNode(RegC181.class),
                new RegNode(RegC185.class),
                new RegNode(RegC188.class)
            ),
            new RegNode(RegC190.class).addChildren(
                new RegNode(RegC191.class),
                new RegNode(RegC195.class),
                new RegNode(RegC198.class),
                new RegNode(RegC199.class)
            ),
            new RegNode(RegC380.class).addChildren(
                new RegNode(RegC381.class),
                new RegNode(RegC385.class)
            ),
            new RegNode(RegC395.class).addChildren(
                new RegNode(RegC396.class)
            ),
            new RegNode(RegC400.class).addChildren(
                new RegNode(RegC405.class).addChildren(
                    new RegNode(RegC481.class),
                    new RegNode(RegC485.class)
                ),
                new RegNode(RegC489.class)
            ),
            new RegNode(RegC490.class).addChildren(
                new RegNode(RegC491.class),
                new RegNode(RegC495.class),
                new RegNode(RegC499.class)
            ),
            new RegNode(RegC500.class).addChildren(
                new RegNode(RegC501.class),
                new RegNode(RegC505.class),
                new RegNode(RegC509.class)
            ),
            new RegNode(RegC600.class).addChildren(
                new RegNode(RegC601.class),
                new RegNode(RegC605.class),
                new RegNode(RegC609.class)
            )
        ));
        addNode(new RegNode(RegC990.class));
    }

    private void addBranchesBlocoD() {
        addNode(new RegNode(RegD001.class));
        addNode(new RegNode(RegD010.class, RegD001.class).addChildren(
            new RegNode(RegD100.class).addChildren(
                new RegNode(RegD101.class),
                new RegNode(RegD105.class),
                new RegNode(RegD111.class)
            ),
            new RegNode(RegD200.class).addChildren(
                new RegNode(RegD201.class),
                new RegNode(RegD205.class),
                new RegNode(RegD209.class)
            ),
            new RegNode(RegD300.class).addChildren(
                new RegNode(RegD309.class)
            ),
            new RegNode(RegD350.class).addChildren(
                new RegNode(RegD359.class)
            ),
            new RegNode(RegD500.class).addChildren(
                new RegNode(RegD501.class),
                new RegNode(RegD505.class),
                new RegNode(RegD509.class)
            ),
            new RegNode(RegD600.class).addChildren(
                new RegNode(RegD601.class),
                new RegNode(RegD605.class),
                new RegNode(RegD609.class)
            )
        ));
        addNode(new RegNode(RegD990.class));
    }

    private void addBranchesBlocoF() {
        addNode(new RegNode(RegF001.class));
        addNode(new RegNode(RegF010.class, RegF001.class).addChildren(
            new RegNode(RegF100.class).addChildren(
                new RegNode(RegF111.class)
            ),
            new RegNode(RegF120.class).addChildren(
                new RegNode(RegF129.class)
            ),
            new RegNode(RegF130.class).addChildren(
                new RegNode(RegF139.class)
            ),
            new RegNode(RegF150.class),
            new RegNode(RegF200.class).addChildren(
                new RegNode(RegF205.class),
                new RegNode(RegF210.class),
                new RegNode(RegF211.class)
            ),
            new RegNode(RegF500.class).addChildren(
                    new RegNode(RegF509.class)
            ),
            new RegNode(RegF510.class).addChildren(
                    new RegNode(RegF519.class)
            ),
            new RegNode(RegF525.class),
            new RegNode(RegF550.class).addChildren(
                    new RegNode(RegF559.class)
            ),
            new RegNode(RegF560.class).addChildren(
                    new RegNode(RegF569.class)
            ),
            new RegNode(RegF600.class),
            new RegNode(RegF700.class),
            new RegNode(RegF800.class)
        ));
        addNode(new RegNode(RegF990.class));
    }

    private void addBranchesBlocoI() {
        addNode(new RegNode(RegI001.class));
        addNode(new RegNode(RegI010.class, RegI001.class).addChildren(
            new RegNode(RegI100.class).addChildren(
                new RegNode(RegI200.class).addChildren(
                    new RegNode(RegI300.class).addChildren(
                        new RegNode(RegI399.class)
                    ),
                    new RegNode(RegI299.class)
                ),
                new RegNode(RegI199.class)
            )
        ));
        addNode(new RegNode(RegI990.class));
    }

    private void addBranchesBlocoM() {
        addNode(new RegNode(RegM001.class));
        addNode(new RegNode(RegM100.class, RegM001.class).addChildren(
            new RegNode(RegM105.class),
            new RegNode(RegM110.class)
        ));
        addNode(new RegNode(RegM200.class, RegM001.class).addChildren(
            new RegNode(RegM205.class),
            new RegNode(RegM210.class).addChildren(
                new RegNode(RegM211.class),
                new RegNode(RegM220.class),
                new RegNode(RegM230.class)
            )
        ));
        addNode(new RegNode(RegM300.class, RegM001.class));
        addNode(new RegNode(RegM350.class, RegM001.class));
        addNode(new RegNode(RegM400.class, RegM001.class).addChildren(
            new RegNode(RegM410.class)
        ));
        addNode(new RegNode(RegM500.class, RegM001.class).addChildren(
            new RegNode(RegM505.class),
            new RegNode(RegM510.class)
        ));
        addNode(new RegNode(RegM600.class, RegM001.class).addChildren(
            new RegNode(RegM605.class),
            new RegNode(RegM610.class).addChildren(
                new RegNode(RegM611.class),
                new RegNode(RegM620.class),
                new RegNode(RegM630.class)
            )
        ));
        addNode(new RegNode(RegM700.class, RegM001.class));
        addNode(new RegNode(RegM800.class, RegM001.class).addChildren(
            new RegNode(RegM810.class)
        ));
        addNode(new RegNode(RegM990.class));
    }

    private void addBranchesBlocoP() {
        addNode(new RegNode(RegP001.class));
        addNode(new RegNode(RegP010.class, RegP001.class).addChildren(
            new RegNode(RegP100.class).addChildren(
                new RegNode(RegP110.class),
                new RegNode(RegP199.class)
            )
        ));
        addNode(new RegNode(RegP200.class, RegP001.class).addChildren(
            new RegNode(RegP210.class)
        ));
        addNode(new RegNode(RegP990.class));
    }

    private void addBranchesBloco1() {
        addNode(new RegNode(Reg1001.class));
        addNode(new RegNode(Reg1010.class, Reg1001.class));
        addNode(new RegNode(Reg1020.class, Reg1001.class));
        addNode(new RegNode(Reg1100.class, Reg1001.class));
        addNode(new RegNode(Reg1300.class, Reg1001.class));
        addNode(new RegNode(Reg1500.class, Reg1001.class));
        addNode(new RegNode(Reg1700.class, Reg1001.class));
        addNode(new RegNode(Reg1800.class, Reg1001.class));
        addNode(new RegNode(Reg1900.class));
        addNode(new RegNode(Reg1990.class));
    }

    private void addBranchesBloco9() {
        addNode(new RegNode(Reg9001.class));
        addNode(new RegNode(Reg9900.class, Reg9001.class));
        addNode(new RegNode(Reg9990.class));
        addNode(new RegNode(Reg9999.class));
    }
}
