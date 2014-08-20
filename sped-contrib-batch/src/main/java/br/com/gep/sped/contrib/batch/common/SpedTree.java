package br.com.gep.sped.contrib.batch.common;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.*;
import br.com.gep.spedcontrib.arquivo.registros.bloco1.*;
import br.com.gep.spedcontrib.arquivo.registros.bloco9.Reg9001;
import br.com.gep.spedcontrib.arquivo.registros.bloco9.Reg9900;
import br.com.gep.spedcontrib.arquivo.registros.bloco9.Reg9990;
import br.com.gep.spedcontrib.arquivo.registros.bloco9.Reg9999;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoC.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoD.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoF.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoI.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoM.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoP.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Representa a árvore de registros do SPED.
 * Obs: Registros *010 não são considerados filhos do registro *001 do bloco.
 */
@Component
public class SpedTree {

    private Map<Class<? extends RegBase>, RegNode> nodes;

    @PostConstruct
    private void init() {
        nodes = new HashMap<Class<? extends RegBase>, RegNode>();
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

    // TODO: implementar busca profunda de nós
    public RegNode getNode(Class<? extends RegBase> regClass) {
        return nodes.get(regClass);
    }

    public Map<Class<? extends RegBase>, RegNode> getNodes() {
        return nodes;
    }

    private void addBranchesBloco0() {
        nodes.put(Reg0000.class, new RegNode(Reg0000.class));
        nodes.put(Reg0001.class, new RegNode(Reg0001.class));
        nodes.put(Reg0035.class, new RegNode(Reg0035.class));
        nodes.put(Reg0100.class, new RegNode(Reg0100.class));
        nodes.put(Reg0110.class, new RegNode(Reg0110.class).addChildren(
                new RegNode(Reg0111.class)
        ));
        nodes.put(Reg0120.class, new RegNode(Reg0120.class));
        nodes.put(Reg0140.class, new RegNode(Reg0140.class).addChildren(
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
        nodes.put(Reg0500.class, new RegNode(Reg0500.class));
        nodes.put(Reg0600.class, new RegNode(Reg0600.class));
        nodes.put(Reg0990.class, new RegNode(Reg0990.class));
    }

    private void addBranchesBlocoA() {
        nodes.put(RegA001.class, new RegNode(RegA001.class));
        nodes.put(RegA010.class, new RegNode(RegA010.class).addChildren(
                new RegNode(RegA100.class).addChildren(
                        new RegNode(RegA110.class),
                        new RegNode(RegA111.class),
                        new RegNode(RegA120.class),
                        new RegNode(RegA170.class)
                )
        ));
        nodes.put(RegA990.class, new RegNode(RegA990.class));
    }

    private void addBranchesBlocoC() {
        nodes.put(RegC001.class, new RegNode(RegC001.class));
        nodes.put(RegC010.class, new RegNode(RegC010.class).addChildren(
                new RegNode(RegC100.class).addChildren(
                        new RegNode(RegC110.class),
                        new RegNode(RegC111.class),
                        new RegNode(RegC120.class),
                        new RegNode(RegC170.class)
                        // TODO: ver registro C175
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
        nodes.put(RegC990.class, new RegNode(RegC990.class));
    }

    private void addBranchesBlocoD() {
        nodes.put(RegD001.class, new RegNode(RegD001.class));
        nodes.put(RegD010.class, new RegNode(RegD010.class).addChildren(
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
        nodes.put(RegD990.class, new RegNode(RegD990.class));
    }

    private void addBranchesBlocoF() {
        nodes.put(RegF001.class, new RegNode(RegF001.class));
        nodes.put(RegF010.class, new RegNode(RegF010.class).addChildren(
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
                // TODO: esses registros dependem da versão do SPED e estão relacionados ao registro 0110
//                new RegNode(RegF500.class).addChildren(
//                        new RegNode(RegF509.class)
//                ),
//                new RegNode(RegF510.class).addChildren(
//                        new RegNode(RegF519.class)
//                ),
//                new RegNode(RegF525.class),
//                new RegNode(RegF550.class).addChildren(
//                        new RegNode(RegF559.class)
//                ),
//                new RegNode(RegF560.class).addChildren(
//                        new RegNode(RegF569.class)
//                ),
                new RegNode(RegF600.class),
                new RegNode(RegF700.class),
                new RegNode(RegF800.class)
        ));
        nodes.put(RegF990.class, new RegNode(RegF990.class));
    }

    private void addBranchesBlocoI() {
        nodes.put(RegI001.class, new RegNode(RegI001.class));
        nodes.put(RegI010.class, new RegNode(RegI010.class).addChildren(
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
        nodes.put(RegI990.class, new RegNode(RegI990.class));
    }

    private void addBranchesBlocoM() {
        nodes.put(RegM001.class, new RegNode(RegM001.class));
        nodes.put(RegM100.class, new RegNode(RegM100.class).addChildren(
                new RegNode(RegM105.class),
                new RegNode(RegM110.class)
        ));
        nodes.put(RegM200.class, new RegNode(RegM200.class).addChildren(
                // TODO: esse registro depende da versão do SPED
                //new RegNode(RegM205.class),
                new RegNode(RegM210.class).addChildren(
                        new RegNode(RegM211.class),
                        new RegNode(RegM220.class),
                        new RegNode(RegM230.class)
                )
        ));
        nodes.put(RegM300.class, new RegNode(RegM300.class));
        nodes.put(RegM350.class, new RegNode(RegM350.class));
        nodes.put(RegM400.class, new RegNode(RegM400.class).addChildren(
                new RegNode(RegM410.class)
        ));
        nodes.put(RegM500.class, new RegNode(RegM500.class).addChildren(
                new RegNode(RegM505.class),
                new RegNode(RegM510.class)
        ));
        nodes.put(RegM600.class, new RegNode(RegM600.class).addChildren(
                // TODO: esse registro depende da versão do SPED
                //new RegNode(RegM605.class),
                new RegNode(RegM610.class).addChildren(
                        new RegNode(RegM611.class),
                        new RegNode(RegM620.class),
                        new RegNode(RegM630.class)
                )
        ));
        nodes.put(RegM700.class, new RegNode(RegM700.class));
        nodes.put(RegM800.class, new RegNode(RegM800.class).addChildren(
                new RegNode(RegM810.class)
        ));
        nodes.put(RegM990.class, new RegNode(RegM990.class));
    }

    private void addBranchesBlocoP() {
        nodes.put(RegP001.class, new RegNode(RegP001.class));
        nodes.put(RegP010.class, new RegNode(RegP010.class).addChildren(
                new RegNode(RegP100.class).addChildren(
                        new RegNode(RegP110.class),
                        new RegNode(RegP199.class)
                )
        ));
        nodes.put(RegP200.class, new RegNode(RegP200.class).addChildren(
                new RegNode(RegP210.class)
        ));
        nodes.put(RegP990.class, new RegNode(RegP990.class));
    }

    private void addBranchesBloco1() {
        nodes.put(Reg1001.class, new RegNode(Reg1001.class));
        nodes.put(Reg1010.class, new RegNode(Reg1010.class));
        nodes.put(Reg1020.class, new RegNode(Reg1020.class));
        nodes.put(Reg1100.class, new RegNode(Reg1100.class));
        nodes.put(Reg1300.class, new RegNode(Reg1300.class));
        nodes.put(Reg1500.class, new RegNode(Reg1500.class));
        nodes.put(Reg1700.class, new RegNode(Reg1700.class));
        nodes.put(Reg1800.class, new RegNode(Reg1800.class));
        nodes.put(Reg1900.class, new RegNode(Reg1900.class));
        nodes.put(Reg1990.class, new RegNode(Reg1990.class));
    }

    private void addBranchesBloco9() {
        nodes.put(Reg9001.class, new RegNode(Reg9001.class));
        nodes.put(Reg9900.class, new RegNode(Reg9900.class));
        nodes.put(Reg9990.class, new RegNode(Reg9990.class));
        nodes.put(Reg9999.class, new RegNode(Reg9999.class));
    }
}
