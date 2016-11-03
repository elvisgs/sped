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
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.*;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.stereotype.Component;

/**
 * Representa a árvore de registros do SPED Fiscal.
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
        addBranchesBlocoK();
        addBranchesBloco1();
        addBranchesBloco9();
    }

    private void addBranchesBloco0() {
        addNode(new RegNode(Reg0000.class));
        addNode(new RegNode(Reg0001.class, Reg0000.class));
        addNode(new RegNode(Reg0005.class, Reg0001.class));
        addNode(new RegNode(Reg0015.class, Reg0001.class));
        addNode(new RegNode(Reg0100.class, Reg0001.class));
        addNode(new RegNode(Reg0150.class, Reg0001.class).addChildren(
                new RegNode(Reg0175.class)
        ));
        addNode(new RegNode(Reg0190.class, Reg0001.class));
        addNode(new RegNode(Reg0200.class, Reg0001.class).addChildren(
                new RegNode(Reg0205.class),
                new RegNode(Reg0206.class),
                new RegNode(Reg0220.class)
        ));
        addNode(new RegNode(Reg0300.class, Reg0001.class).addChildren(
                new RegNode(Reg0305.class)
        ));
        addNode(new RegNode(Reg0400.class, Reg0001.class));
        addNode(new RegNode(Reg0450.class, Reg0001.class));
        addNode(new RegNode(Reg0460.class, Reg0001.class));
        addNode(new RegNode(Reg0500.class, Reg0001.class));
        addNode(new RegNode(Reg0600.class, Reg0001.class));
        addNode(new RegNode(Reg0990.class, Reg0000.class));
    }

    private void addBranchesBlocoC() {
        addNode(new RegNode(RegC001.class, Reg0000.class));
        addNode(new RegNode(RegC100.class, RegC001.class).addChildren(
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
        addNode(new RegNode(RegC300.class, RegC001.class).addChildren(
                new RegNode(RegC310.class),
                new RegNode(RegC320.class).addChildren(
                        new RegNode(RegC321.class)
                )
        ));
        addNode(new RegNode(RegC350.class, RegC001.class).addChildren(
                new RegNode(RegC370.class),
                new RegNode(RegC390.class)
        ));
        addNode(new RegNode(RegC400.class, RegC001.class).addChildren(
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
        addNode(new RegNode(RegC500.class, RegC001.class).addChildren(
                new RegNode(RegC510.class),
                new RegNode(RegC590.class)
        ));
        addNode(new RegNode(RegC600.class, RegC001.class).addChildren(
                new RegNode(RegC601.class),
                new RegNode(RegC610.class),
                new RegNode(RegC690.class)
        ));
        addNode(new RegNode(RegC700.class, RegC001.class).addChildren(
                new RegNode(RegC790.class).addChildren(
                        new RegNode(RegC791.class)
                )
        ));
        addNode(new RegNode(RegC800.class, RegC001.class).addChildren(
                new RegNode(RegC850.class)
        ));
        addNode(new RegNode(RegC860.class, RegC001.class).addChildren(
                new RegNode(RegC890.class)
        ));
        addNode(new RegNode(RegC990.class));
    }

    private void addBranchesBlocoD() {
        addNode(new RegNode(RegD001.class, Reg0000.class));
        addNode(new RegNode(RegD100.class, RegD001.class).addChildren(
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
        addNode(new RegNode(RegD300.class, RegD001.class).addChildren(
                new RegNode(RegD301.class),
                new RegNode(RegD310.class)
        ));
        addNode(new RegNode(RegD350.class, RegD001.class).addChildren(
                new RegNode(RegD355.class).addChildren(
                        new RegNode(RegD360.class),
                        new RegNode(RegD365.class).addChildren(
                                new RegNode(RegD370.class)
                        ),
                        new RegNode(RegD390.class)
                )
        ));
        addNode(new RegNode(RegD400.class, RegD001.class).addChildren(
                new RegNode(RegD410.class).addChildren(
                        new RegNode(RegD411.class)
                ),
                new RegNode(RegD420.class)
        ));
        addNode(new RegNode(RegD500.class, RegD001.class).addChildren(
                new RegNode(RegD510.class),
                new RegNode(RegD530.class),
                new RegNode(RegD590.class)
        ));
        addNode(new RegNode(RegD600.class, RegD001.class).addChildren(
                new RegNode(RegD610.class),
                new RegNode(RegD690.class)
        ));
        addNode(new RegNode(RegD695.class, RegD001.class).addChildren(
                new RegNode(RegD696.class).addChildren(
                        new RegNode(RegD697.class)
                )
        ));
        addNode(new RegNode(RegD990.class));
    }

    private void addBranchesBlocoE() {
        addNode(new RegNode(RegE001.class, Reg0000.class));
        addNode(new RegNode(RegE100.class, RegE001.class).addChildren(
                new RegNode(RegE110.class).addChildren(
                        new RegNode(RegE111.class).addChildren(
                                new RegNode(RegE112.class),
                                new RegNode(RegE113.class)
                        ),
                        new RegNode(RegE115.class),
                        new RegNode(RegE116.class)
                )
        ));
        addNode(new RegNode(RegE200.class, RegE001.class).addChildren(
                new RegNode(RegE210.class).addChildren(
                        new RegNode(RegE220.class).addChildren(
                                new RegNode(RegE230.class),
                                new RegNode(RegE240.class)
                        ),
                        new RegNode(RegE250.class)
                )
        ));
        addNode(new RegNode(RegE500.class, RegE001.class).addChildren(
                new RegNode(RegE510.class),
                new RegNode(RegE520.class).addChildren(
                        new RegNode(RegE530.class)
                )
        ));
        addNode(new RegNode(RegE990.class));
    }

    private void addBranchesBlocoG() {
        addNode(new RegNode(RegG001.class, Reg0000.class));
        addNode(new RegNode(RegG110.class, RegG001.class).addChildren(
                new RegNode(RegG125.class).addChildren(
                        new RegNode(RegG126.class),
                        new RegNode(RegG130.class).addChildren(
                                new RegNode(RegG140.class)
                        )
                )
        ));
        addNode(new RegNode(RegG990.class));
    }

    private void addBranchesBlocoH() {
        addNode(new RegNode(RegH001.class, Reg0000.class));
        addNode(new RegNode(RegH005.class, RegH001.class).addChildren(
                new RegNode(RegH010.class).addChildren(
                        new RegNode(RegH020.class)
                )
        ));
        addNode(new RegNode(RegH990.class));
    }

    private void addBranchesBlocoK() {
        addNode(new RegNode(RegK001.class, Reg0000.class));
        addNode(new RegNode(RegK100.class, RegK001.class).addChildren(
            new RegNode(RegK200.class),
            new RegNode(RegK220.class),
            new RegNode(RegK230.class).addChildren(
                new RegNode(RegK235.class)
            ),
            new RegNode(RegK250.class).addChildren(
                new RegNode(RegK255.class)
            )
        ));
        addNode(new RegNode(RegK990.class));
    }

    private void addBranchesBloco1() {
        addNode(new RegNode(Reg1001.class, Reg0000.class));
        addNode(new RegNode(Reg1010.class, Reg1001.class));
        addNode(new RegNode(Reg1100.class, Reg1001.class).addChildren(
                new RegNode(Reg1105.class).addChildren(
                        new RegNode(Reg1110.class)
                )
        ));
        addNode(new RegNode(Reg1200.class, Reg1001.class).addChildren(
                new RegNode(Reg1210.class)
        ));
        addNode(new RegNode(Reg1300.class, Reg1001.class).addChildren(
                new RegNode(Reg1310.class).addChildren(
                        new RegNode(Reg1320.class)
                )
        ));
        addNode(new RegNode(Reg1350.class, Reg1001.class).addChildren(
                new RegNode(Reg1360.class),
                new RegNode(Reg1370.class)
        ));
        addNode(new RegNode(Reg1390.class, Reg1001.class).addChildren(
                new RegNode(Reg1391.class)
        ));
        addNode(new RegNode(Reg1400.class, Reg1001.class));
        addNode(new RegNode(Reg1500.class, Reg1001.class).addChildren(
                new RegNode(Reg1510.class)
        ));
        addNode(new RegNode(Reg1600.class, Reg1001.class));
        addNode(new RegNode(Reg1700.class, Reg1001.class).addChildren(
                new RegNode(Reg1710.class)
        ));
        addNode(new RegNode(Reg1800.class, Reg1001.class));
        addNode(new RegNode(Reg1900.class, Reg1001.class).addChildren(
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
        addNode(new RegNode(Reg1990.class));
    }

    private void addBranchesBloco9() {
        addNode(new RegNode(Reg9001.class, Reg0000.class));
        addNode(new RegNode(Reg9900.class, Reg9001.class));
        addNode(new RegNode(Reg9990.class));
        addNode(new RegNode(Reg9999.class));
    }
}
