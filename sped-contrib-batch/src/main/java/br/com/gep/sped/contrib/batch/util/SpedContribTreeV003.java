package br.com.gep.sped.contrib.batch.util;

import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
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

import java.util.Arrays;
import java.util.List;

/**
 * Representa a árvore de registros do SPED Contrib v003.
 */
@Component
public class SpedContribTreeV003 extends SpedTree {

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
        addNode(RegNode.of(Reg0000.class));
        addNode(RegNode.of(Reg0001.class));
        addNode(RegNode.of(Reg0035.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0100.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0110.class).withParent(Reg0001.class).withChildren(
            RegNode.of(Reg0111.class)
        ));
        addNode(RegNode.of(Reg0120.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0140.class).withParent(Reg0001.class).withChildren(
            RegNode.of(Reg0145.class),
            RegNode.of(Reg0150.class),
            RegNode.of(Reg0190.class),
            RegNode.of(Reg0200.class).withChildren(
                RegNode.of(Reg0205.class),
                RegNode.of(Reg0206.class),
                RegNode.of(Reg0208.class)
            ),
            RegNode.of(Reg0400.class),
            RegNode.of(Reg0450.class)
        ));
        addNode(RegNode.of(Reg0500.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0600.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0990.class));
    }

    private void addBranchesBlocoA() {
        addNode(RegNode.of(RegA001.class));
        addNode(RegNode.of(RegA010.class).withParent(RegA001.class).withChildren(
            RegNode.of(RegA100.class).withChildren(
                RegNode.of(RegA110.class),
                RegNode.of(RegA111.class),
                RegNode.of(RegA120.class),
                RegNode.of(RegA170.class)
            )
        ));
        addNode(RegNode.of(RegA990.class));
    }

    private void addBranchesBlocoC() {
        addNode(RegNode.of(RegC001.class));
        addNode(RegNode.of(RegC010.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC100.class).withChildren(
                RegNode.of(RegC110.class),
                RegNode.of(RegC111.class),
                RegNode.of(RegC120.class),
                RegNode.of(RegC170.class),
                RegNode.of(RegC175.class)
            ),
            RegNode.of(RegC180.class).withChildren(
                RegNode.of(RegC181.class),
                RegNode.of(RegC185.class),
                RegNode.of(RegC188.class)
            ),
            RegNode.of(RegC190.class).withChildren(
                RegNode.of(RegC191.class),
                RegNode.of(RegC195.class),
                RegNode.of(RegC198.class),
                RegNode.of(RegC199.class)
            ),
            RegNode.of(RegC380.class).withChildren(
                RegNode.of(RegC381.class),
                RegNode.of(RegC385.class)
            ),
            RegNode.of(RegC395.class).withChildren(
                RegNode.of(RegC396.class)
            ),
            RegNode.of(RegC400.class).withChildren(
                RegNode.of(RegC405.class).withChildren(
                    RegNode.of(RegC481.class),
                    RegNode.of(RegC485.class)
                ),
                RegNode.of(RegC489.class)
            ),
            RegNode.of(RegC490.class).withChildren(
                RegNode.of(RegC491.class),
                RegNode.of(RegC495.class),
                RegNode.of(RegC499.class)
            ),
            RegNode.of(RegC500.class).withChildren(
                RegNode.of(RegC501.class),
                RegNode.of(RegC505.class),
                RegNode.of(RegC509.class)
            ),
            RegNode.of(RegC600.class).withChildren(
                RegNode.of(RegC601.class),
                RegNode.of(RegC605.class),
                RegNode.of(RegC609.class)
            ),
            RegNode.of(RegC860.class).withChildren(
                RegNode.of(RegC870.class),
                RegNode.of(RegC880.class),
                RegNode.of(RegC890.class)
            )
        ));
        addNode(RegNode.of(RegC990.class));
    }

    private void addBranchesBlocoD() {
        addNode(RegNode.of(RegD001.class));
        addNode(RegNode.of(RegD010.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD100.class).withChildren(
                RegNode.of(RegD101.class),
                RegNode.of(RegD105.class),
                RegNode.of(RegD111.class)
            ),
            RegNode.of(RegD200.class).withChildren(
                RegNode.of(RegD201.class),
                RegNode.of(RegD205.class),
                RegNode.of(RegD209.class)
            ),
            RegNode.of(RegD300.class).withChildren(
                RegNode.of(RegD309.class)
            ),
            RegNode.of(RegD350.class).withChildren(
                RegNode.of(RegD359.class)
            ),
            RegNode.of(RegD500.class).withChildren(
                RegNode.of(RegD501.class),
                RegNode.of(RegD505.class),
                RegNode.of(RegD509.class)
            ),
            RegNode.of(RegD600.class).withChildren(
                RegNode.of(RegD601.class),
                RegNode.of(RegD605.class),
                RegNode.of(RegD609.class)
            )
        ));
        addNode(RegNode.of(RegD990.class));
    }

    private void addBranchesBlocoF() {
        addNode(RegNode.of(RegF001.class));
        addNode(RegNode.of(RegF010.class).withParent(RegF001.class).withChildren(
            RegNode.of(RegF100.class).withChildren(
                RegNode.of(RegF111.class)
            ),
            RegNode.of(RegF120.class).withChildren(
                RegNode.of(RegF129.class)
            ),
            RegNode.of(RegF130.class).withChildren(
                RegNode.of(RegF139.class)
            ),
            RegNode.of(RegF150.class),
            RegNode.of(RegF200.class).withChildren(
                RegNode.of(RegF205.class),
                RegNode.of(RegF210.class),
                RegNode.of(RegF211.class)
            ),
            RegNode.of(RegF500.class).withChildren(
                RegNode.of(RegF509.class)
            ),
            RegNode.of(RegF510.class).withChildren(
                RegNode.of(RegF519.class)
            ),
            RegNode.of(RegF525.class),
            RegNode.of(RegF550.class).withChildren(
                RegNode.of(RegF559.class)
            ),
            RegNode.of(RegF560.class).withChildren(
                RegNode.of(RegF569.class)
            ),
            RegNode.of(RegF600.class),
            RegNode.of(RegF700.class),
            RegNode.of(RegF800.class)
        ));
        addNode(RegNode.of(RegF990.class));
    }

    private void addBranchesBlocoI() {
        addNode(RegNode.of(RegI001.class));
        addNode(RegNode.of(RegI010.class).withParent(RegI001.class).withChildren(
            RegNode.of(RegI100.class).withChildren(
                RegNode.of(RegI199.class),
                RegNode.of(RegI200.class).withChildren(
                    RegNode.of(RegI299.class),
                    RegNode.of(RegI300.class).withChildren(
                        RegNode.of(RegI399.class)
                    )
                )
            )
        ));
        addNode(RegNode.of(RegI990.class));
    }

    private void addBranchesBlocoM() {
        addNode(RegNode.of(RegM001.class));
        addNode(RegNode.of(RegM100.class).withParent(RegM001.class).withChildren(
            RegNode.of(RegM105.class),
            RegNode.of(RegM110.class).withChildren(
                RegNode.of(RegM115.class)
            )
        ));
        addNode(RegNode.of(RegM200.class).withParent(RegM001.class).withChildren(
            RegNode.of(RegM205.class),
            RegNode.of(RegM210.class).withChildren(
                RegNode.of(RegM211.class),
                RegNode.of(RegM220.class).withChildren(
                    RegNode.of(RegM225.class)
                ),
                RegNode.of(RegM230.class)
            )
        ));
        addNode(RegNode.of(RegM300.class).withParent(RegM001.class));
        addNode(RegNode.of(RegM350.class).withParent(RegM001.class));
        addNode(RegNode.of(RegM400.class).withParent(RegM001.class).withChildren(
            RegNode.of(RegM410.class)
        ));
        addNode(RegNode.of(RegM500.class).withParent(RegM001.class).withChildren(
            RegNode.of(RegM505.class),
            RegNode.of(RegM510.class).withChildren(
                RegNode.of(RegM515.class)
            )
        ));
        addNode(RegNode.of(RegM600.class).withParent(RegM001.class).withChildren(
            RegNode.of(RegM605.class),
            RegNode.of(RegM610.class).withChildren(
                RegNode.of(RegM611.class),
                RegNode.of(RegM620.class).withChildren(
                    RegNode.of(RegM625.class)
                ),
                RegNode.of(RegM630.class)
            )
        ));
        addNode(RegNode.of(RegM700.class).withParent(RegM001.class));
        addNode(RegNode.of(RegM800.class).withParent(RegM001.class).withChildren(
            RegNode.of(RegM810.class)
        ));
        addNode(RegNode.of(RegM990.class));
    }

    private void addBranchesBlocoP() {
        addNode(RegNode.of(RegP001.class));
        addNode(RegNode.of(RegP010.class).withParent(RegP001.class).withChildren(
            RegNode.of(RegP100.class).withChildren(
                RegNode.of(RegP110.class),
                RegNode.of(RegP199.class)
            )
        ));
        addNode(RegNode.of(RegP200.class).withParent(RegP001.class).withChildren(
            RegNode.of(RegP210.class)
        ));
        addNode(RegNode.of(RegP990.class));
    }

    private void addBranchesBloco1() {
        addNode(RegNode.of(Reg1001.class));
        addNode(RegNode.of(Reg1010.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1020.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1100.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1300.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1500.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1700.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1800.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1809.class)
        ));
        addNode(RegNode.of(Reg1900.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1990.class));
    }

    private void addBranchesBloco9() {
        addNode(RegNode.of(Reg9001.class));
        addNode(RegNode.of(Reg9900.class).withParent(Reg9001.class));
        addNode(RegNode.of(Reg9990.class));
        addNode(RegNode.of(Reg9999.class));
    }

    @Override
    public List<Character> getBlocs() {
        return Arrays.asList('0', 'A', 'C', 'D', 'F', 'I', 'M', 'P', '1', '9');
    }
}
