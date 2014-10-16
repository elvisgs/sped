package br.com.gep.sped.fiscal.batch.util;

import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.SpedTree;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.*;
import br.com.gep.sped.fiscal.marshaller.registros.bloco1.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoC.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoD.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoE.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoG.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoH.*;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.stereotype.Component;

/**
 * Representa a árvore de registros do SPED Fiscal.
 * Obs: Registros *001 não são considerados filhos do registro 0000.
 */
@Component
public class SpedFiscalTree extends SpedTree {

    @Override
    protected void addBranches() {
        addBranchesBloco0();
        addBranchesBlocoC();
        addBranchesBlocoD();
        addBranchesBlocoE();
        addBranchesBlocoG();
        addBranchesBlocoH();
        addBranchesBloco1();
        addBranchesBloco9();
    }

    private void addBranchesBloco0() {
        nodes.put(Reg0000.class, new RegNode(Reg0000.class));
        nodes.put(Reg0001.class, new RegNode(Reg0001.class));
        nodes.put(Reg0005.class, new RegNode(Reg0005.class));
        nodes.put(Reg0015.class, new RegNode(Reg0015.class));
        nodes.put(Reg0100.class, new RegNode(Reg0100.class));
        nodes.put(Reg0150.class, new RegNode(Reg0150.class).addChildren(
                new RegNode(Reg0175.class)
        ));
        nodes.put(Reg0190.class, new RegNode(Reg0190.class));
        nodes.put(Reg0200.class, new RegNode(Reg0200.class).addChildren(
                new RegNode(Reg0205.class),
                new RegNode(Reg0206.class),
                new RegNode(Reg0220.class)
        ));
        nodes.put(Reg0300.class, new RegNode(Reg0300.class).addChildren(
                new RegNode(Reg0305.class)
        ));
        nodes.put(Reg0400.class, new RegNode(Reg0400.class));
        nodes.put(Reg0450.class, new RegNode(Reg0450.class));
        nodes.put(Reg0460.class, new RegNode(Reg0460.class));
        nodes.put(Reg0500.class, new RegNode(Reg0500.class));
        nodes.put(Reg0600.class, new RegNode(Reg0600.class));
        nodes.put(Reg0990.class, new RegNode(Reg0990.class));
    }

    private void addBranchesBlocoC() {
        nodes.put(RegC001.class, new RegNode(RegC001.class));
        nodes.put(RegC100.class, new RegNode(RegC100.class).addChildren(
                new RegNode(RegC105.class),
                new RegNode(RegC110.class).addChildren(
                        new RegNode(RegC111.class),
                        new RegNode(RegC112.class),
                        new RegNode(RegC113.class),
                        new RegNode(RegC114.class),
                        new RegNode(RegC115.class),
                        new RegNode(RegC116.class)
                ),
                new RegNode(RegC120.class),
                new RegNode(RegC130.class),
                new RegNode(RegC140.class).addChildren(
                        new RegNode(RegC141.class)
                ),
                new RegNode(RegC160.class),
                new RegNode(RegC165.class),
                new RegNode(RegC170.class).addChildren(
                        new RegNode(RegC171.class),
                        new RegNode(RegC172.class),
                        new RegNode(RegC173.class),
                        new RegNode(RegC174.class),
                        new RegNode(RegC175.class),
                        new RegNode(RegC176.class),
                        new RegNode(RegC177.class),
                        new RegNode(RegC178.class),
                        new RegNode(RegC179.class)
                ),
                new RegNode(RegC190.class),
                new RegNode(RegC195.class).addChildren(
                        new RegNode(RegC197.class)
                )
        ));
        nodes.put(RegC300.class, new RegNode(RegC300.class).addChildren(
                new RegNode(RegC310.class),
                new RegNode(RegC320.class).addChildren(
                        new RegNode(RegC321.class)
                )
        ));
        nodes.put(RegC350.class, new RegNode(RegC350.class).addChildren(
                new RegNode(RegC370.class),
                new RegNode(RegC390.class)
        ));
        nodes.put(RegC400.class, new RegNode(RegC400.class).addChildren(
                new RegNode(RegC405.class).addChildren(
                        new RegNode(RegC410.class),
                        new RegNode(RegC420.class).addChildren(
                                new RegNode(RegC425.class)
                        ),
                        new RegNode(RegC460.class).addChildren(
                                new RegNode(RegC465.class),
                                new RegNode(RegC470.class)
                        ),
                        new RegNode(RegC490.class)
                )
        ));
        nodes.put(RegC500.class, new RegNode(RegC500.class).addChildren(
                new RegNode(RegC510.class),
                new RegNode(RegC590.class)
        ));
        nodes.put(RegC600.class, new RegNode(RegC600.class).addChildren(
                new RegNode(RegC601.class),
                new RegNode(RegC610.class),
                new RegNode(RegC690.class)
        ));
        nodes.put(RegC700.class, new RegNode(RegC700.class).addChildren(
                new RegNode(RegC790.class).addChildren(
                        new RegNode(RegC791.class)
                )
        ));
        nodes.put(RegC800.class, new RegNode(RegC800.class).addChildren(
                new RegNode(RegC850.class)
        ));
        nodes.put(RegC860.class, new RegNode(RegC860.class).addChildren(
                new RegNode(RegC890.class)
        ));
        nodes.put(RegC990.class, new RegNode(RegC990.class));
    }

    private void addBranchesBlocoD() {
        nodes.put(RegD001.class, new RegNode(RegD001.class));
        nodes.put(RegD100.class, new RegNode(RegD100.class).addChildren(
                new RegNode(RegD110.class).addChildren(
                        new RegNode(RegD120.class)
                ),
                new RegNode(RegD130.class),
                new RegNode(RegD140.class),
                new RegNode(RegD150.class),
                new RegNode(RegD160.class).addChildren(
                        new RegNode(RegD161.class),
                        new RegNode(RegD162.class)
                ),
                new RegNode(RegD170.class),
                new RegNode(RegD180.class),
                new RegNode(RegD190.class),
                new RegNode(RegD195.class).addChildren(
                        new RegNode(RegD197.class)
                )
        ));
        nodes.put(RegD300.class, new RegNode(RegD300.class).addChildren(
                new RegNode(RegD301.class),
                new RegNode(RegD310.class)
        ));
        nodes.put(RegD350.class, new RegNode(RegD350.class).addChildren(
                new RegNode(RegD355.class).addChildren(
                        new RegNode(RegD360.class),
                        new RegNode(RegD365.class).addChildren(
                                new RegNode(RegD370.class)
                        ),
                        new RegNode(RegD390.class)
                )
        ));
        nodes.put(RegD400.class, new RegNode(RegD400.class).addChildren(
                new RegNode(RegD410.class).addChildren(
                        new RegNode(RegD411.class)
                ),
                new RegNode(RegD420.class)
        ));
        nodes.put(RegD500.class, new RegNode(RegD500.class).addChildren(
                new RegNode(RegD510.class),
                new RegNode(RegD530.class),
                new RegNode(RegD590.class)
        ));
        nodes.put(RegD600.class, new RegNode(RegD600.class).addChildren(
                new RegNode(RegD610.class),
                new RegNode(RegD690.class)
        ));
        nodes.put(RegD695.class, new RegNode(RegD695.class).addChildren(
                new RegNode(RegD696.class).addChildren(
                        new RegNode(RegD697.class)
                )
        ));
        nodes.put(RegD990.class, new RegNode(RegD990.class));
    }

    private void addBranchesBlocoE() {
        nodes.put(RegE001.class, new RegNode(RegE001.class));
        nodes.put(RegE100.class, new RegNode(RegE100.class).addChildren(
                new RegNode(RegE110.class).addChildren(
                        new RegNode(RegE111.class).addChildren(
                                new RegNode(RegE112.class),
                                new RegNode(RegE113.class)
                        ),
                        new RegNode(RegE115.class),
                        new RegNode(RegE116.class)
                )
        ));
        nodes.put(RegE200.class, new RegNode(RegE200.class).addChildren(
                new RegNode(RegE210.class).addChildren(
                        new RegNode(RegE220.class).addChildren(
                                new RegNode(RegE230.class),
                                new RegNode(RegE240.class)
                        ),
                        new RegNode(RegE250.class)
                )
        ));
        nodes.put(RegE500.class, new RegNode(RegE500.class).addChildren(
                new RegNode(RegE510.class),
                new RegNode(RegE520.class).addChildren(
                        new RegNode(RegE530.class)
                )
        ));
        nodes.put(RegE990.class, new RegNode(RegE990.class));
    }

    private void addBranchesBlocoG() {
        nodes.put(RegG001.class, new RegNode(RegG001.class));
        nodes.put(RegG110.class, new RegNode(RegG110.class).addChildren(
                new RegNode(RegG125.class).addChildren(
                        new RegNode(RegG126.class),
                        new RegNode(RegG130.class).addChildren(
                                new RegNode(RegG140.class)
                        )
                )
        ));
        nodes.put(RegG990.class, new RegNode(RegG990.class));
    }

    private void addBranchesBlocoH() {
        nodes.put(RegH001.class, new RegNode(RegH001.class));
        nodes.put(RegH005.class, new RegNode(RegH005.class).addChildren(
                new RegNode(RegH010.class).addChildren(
                        new RegNode(RegH020.class)
                )
        ));
        nodes.put(RegH990.class, new RegNode(RegH990.class));
    }

    private void addBranchesBloco1() {
        nodes.put(Reg1001.class, new RegNode(Reg1001.class));
        nodes.put(Reg1010.class, new RegNode(Reg1010.class));
        nodes.put(Reg1100.class, new RegNode(Reg1100.class).addChildren(
                new RegNode(Reg1105.class).addChildren(
                        new RegNode(Reg1110.class)
                )
        ));
        nodes.put(Reg1200.class, new RegNode(Reg1200.class).addChildren(
                new RegNode(Reg1210.class)
        ));
        nodes.put(Reg1300.class, new RegNode(Reg1300.class).addChildren(
                new RegNode(Reg1310.class).addChildren(
                        new RegNode(Reg1320.class)
                )
        ));
        nodes.put(Reg1350.class, new RegNode(Reg1350.class).addChildren(
                new RegNode(Reg1360.class),
                new RegNode(Reg1370.class)
        ));
        nodes.put(Reg1390.class, new RegNode(Reg1390.class).addChildren(
                new RegNode(Reg1391.class)
        ));
        nodes.put(Reg1400.class, new RegNode(Reg1400.class));
        nodes.put(Reg1500.class, new RegNode(Reg1500.class).addChildren(
                new RegNode(Reg1510.class)
        ));
        nodes.put(Reg1600.class, new RegNode(Reg1600.class));
        nodes.put(Reg1700.class, new RegNode(Reg1700.class).addChildren(
                new RegNode(Reg1710.class)
        ));
        nodes.put(Reg1800.class, new RegNode(Reg1800.class));
        nodes.put(Reg1900.class, new RegNode(Reg1900.class).addChildren(
                new RegNode(Reg1910.class).addChildren(
                        new RegNode(Reg1920.class).addChildren(
                                new RegNode(Reg1921.class).addChildren(
                                        new RegNode(Reg1922.class),
                                        new RegNode(Reg1923.class)
                                ),
                                new RegNode(Reg1925.class),
                                new RegNode(Reg1926.class)
                        )
                )
        ));
        nodes.put(Reg1990.class, new RegNode(Reg1990.class));
    }

    private void addBranchesBloco9() {
        nodes.put(Reg9001.class, new RegNode(Reg9001.class));
        nodes.put(Reg9900.class, new RegNode(Reg9900.class));
        nodes.put(Reg9990.class, new RegNode(Reg9990.class));
        nodes.put(Reg9999.class, new RegNode(Reg9999.class));
    }
}
