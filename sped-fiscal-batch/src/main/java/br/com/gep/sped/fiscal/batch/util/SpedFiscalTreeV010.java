package br.com.gep.sped.fiscal.batch.util;

import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoC.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoD.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoE.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoG.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoH.*;
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.*;
import br.com.gep.sped.fiscal.marshaller.registros.bloco1.*;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9990;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Representa a árvore de registros do SPED Fiscal v010.
 */
@Component
public class SpedFiscalTreeV010 extends SpedTree {

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
        addNode(RegNode.of(Reg0000.class));
        addNode(RegNode.of(Reg0001.class).withParent(Reg0000.class));
        addNode(RegNode.of(Reg0005.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0015.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0100.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0150.class).withParent(Reg0001.class).withChildren(
            RegNode.of(Reg0175.class)
        ));
        addNode(RegNode.of(Reg0190.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0200.class).withParent(Reg0001.class).withChildren(
            RegNode.of(Reg0205.class),
            RegNode.of(Reg0206.class),
            RegNode.of(Reg0210.class),
            RegNode.of(Reg0220.class)
        ));
        addNode(RegNode.of(Reg0300.class).withParent(Reg0001.class).withChildren(
            RegNode.of(Reg0305.class)
        ));
        addNode(RegNode.of(Reg0400.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0450.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0460.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0500.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0600.class).withParent(Reg0001.class));
        addNode(RegNode.of(Reg0990.class).withParent(Reg0000.class));
    }

    private void addBranchesBlocoC() {
        addNode(RegNode.of(RegC001.class).withParent(Reg0000.class));
        addNode(RegNode.of(RegC100.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC101.class),
            RegNode.of(RegC105.class),
            RegNode.of(RegC110.class).withChildren(
                RegNode.of(RegC111.class),
                RegNode.of(RegC112.class),
                RegNode.of(RegC113.class),
                RegNode.of(RegC114.class),
                RegNode.of(RegC115.class),
                RegNode.of(RegC116.class)
            ),
            RegNode.of(RegC120.class),
            RegNode.of(RegC130.class),
            RegNode.of(RegC140.class).withChildren(
                RegNode.of(RegC141.class)
            ),
            RegNode.of(RegC160.class),
            RegNode.of(RegC165.class),
            RegNode.of(RegC170.class).withChildren(
                RegNode.of(RegC171.class),
                RegNode.of(RegC172.class),
                RegNode.of(RegC173.class),
                RegNode.of(RegC174.class),
                RegNode.of(RegC175.class),
                RegNode.of(RegC176.class),
                RegNode.of(RegC177.class),
                RegNode.of(RegC178.class),
                RegNode.of(RegC179.class)
            ),
            RegNode.of(RegC190.class),
            RegNode.of(RegC195.class).withChildren(
                RegNode.of(RegC197.class)
            )
        ));
        addNode(RegNode.of(RegC300.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC310.class),
            RegNode.of(RegC320.class).withChildren(
                RegNode.of(RegC321.class)
            )
        ));
        addNode(RegNode.of(RegC350.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC370.class),
            RegNode.of(RegC390.class)
        ));
        addNode(RegNode.of(RegC400.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC405.class).withChildren(
                RegNode.of(RegC410.class),
                RegNode.of(RegC420.class).withChildren(
                    RegNode.of(RegC425.class)
                ),
                RegNode.of(RegC460.class).withChildren(
                    RegNode.of(RegC465.class),
                    RegNode.of(RegC470.class)
                ),
                RegNode.of(RegC490.class)
            )
        ));
        addNode(RegNode.of(RegC500.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC510.class),
            RegNode.of(RegC590.class)
        ));
        addNode(RegNode.of(RegC600.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC601.class),
            RegNode.of(RegC610.class),
            RegNode.of(RegC690.class)
        ));
        addNode(RegNode.of(RegC700.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC790.class).withChildren(
                RegNode.of(RegC791.class)
            )
        ));
        addNode(RegNode.of(RegC800.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC850.class)
        ));
        addNode(RegNode.of(RegC860.class).withParent(RegC001.class).withChildren(
            RegNode.of(RegC890.class)
        ));
        addNode(RegNode.of(RegC990.class).withParent(Reg0000.class));
    }

    private void addBranchesBlocoD() {
        addNode(RegNode.of(RegD001.class).withParent(Reg0000.class));
        addNode(RegNode.of(RegD100.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD101.class),
            RegNode.of(RegD110.class).withChildren(
                RegNode.of(RegD120.class)
            ),
            RegNode.of(RegD130.class),
            RegNode.of(RegD140.class),
            RegNode.of(RegD150.class),
            RegNode.of(RegD160.class).withChildren(
                RegNode.of(RegD161.class),
                RegNode.of(RegD162.class)
            ),
            RegNode.of(RegD170.class),
            RegNode.of(RegD180.class),
            RegNode.of(RegD190.class),
            RegNode.of(RegD195.class).withChildren(
                RegNode.of(RegD197.class)
            )
        ));
        addNode(RegNode.of(RegD300.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD301.class),
            RegNode.of(RegD310.class)
        ));
        addNode(RegNode.of(RegD350.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD355.class).withChildren(
                RegNode.of(RegD360.class),
                RegNode.of(RegD365.class).withChildren(
                    RegNode.of(RegD370.class)
                ),
                RegNode.of(RegD390.class)
            )
        ));
        addNode(RegNode.of(RegD400.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD410.class).withChildren(
                RegNode.of(RegD411.class)
            ),
            RegNode.of(RegD420.class)
        ));
        addNode(RegNode.of(RegD500.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD510.class),
            RegNode.of(RegD530.class),
            RegNode.of(RegD590.class)
        ));
        addNode(RegNode.of(RegD600.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD610.class),
            RegNode.of(RegD690.class)
        ));
        addNode(RegNode.of(RegD695.class).withParent(RegD001.class).withChildren(
            RegNode.of(RegD696.class).withChildren(
                RegNode.of(RegD697.class)
            )
        ));
        addNode(RegNode.of(RegD990.class).withParent(Reg0000.class));
    }

    private void addBranchesBlocoE() {
        addNode(RegNode.of(RegE001.class).withParent(Reg0000.class));
        addNode(RegNode.of(RegE100.class).withParent(RegE001.class).withChildren(
            RegNode.of(RegE110.class).withChildren(
                RegNode.of(RegE111.class).withChildren(
                    RegNode.of(RegE112.class),
                    RegNode.of(RegE113.class)
                ),
                RegNode.of(RegE115.class),
                RegNode.of(RegE116.class)
            )
        ));
        addNode(RegNode.of(RegE200.class).withParent(RegE001.class).withChildren(
            RegNode.of(RegE210.class).withChildren(
                RegNode.of(RegE220.class).withChildren(
                    RegNode.of(RegE230.class),
                    RegNode.of(RegE240.class)
                ),
                RegNode.of(RegE250.class)
            )
        ));
        addNode(RegNode.of(RegE300.class).withParent(RegE001.class).withChildren(
            RegNode.of(RegE310.class).withChildren(
                RegNode.of(RegE311.class).withChildren(
                    RegNode.of(RegE312.class),
                    RegNode.of(RegE313.class)
                ),
                RegNode.of(RegE316.class)
            )
        ));
        addNode(RegNode.of(RegE500.class).withParent(RegE001.class).withChildren(
            RegNode.of(RegE510.class),
            RegNode.of(RegE520.class).withChildren(
                RegNode.of(RegE530.class)
            )
        ));
        addNode(RegNode.of(RegE990.class).withParent(Reg0000.class));
    }

    private void addBranchesBlocoG() {
        addNode(RegNode.of(RegG001.class).withParent(Reg0000.class));
        addNode(RegNode.of(RegG110.class).withParent(RegG001.class).withChildren(
            RegNode.of(RegG125.class).withChildren(
                RegNode.of(RegG126.class),
                RegNode.of(RegG130.class).withChildren(
                    RegNode.of(RegG140.class)
                )
            )
        ));
        addNode(RegNode.of(RegG990.class).withParent(Reg0000.class));
    }

    private void addBranchesBlocoH() {
        addNode(RegNode.of(RegH001.class).withParent(Reg0000.class));
        addNode(RegNode.of(RegH005.class).withParent(RegH001.class).withChildren(
            RegNode.of(RegH010.class).withChildren(
                RegNode.of(RegH020.class)
            )
        ));
        addNode(RegNode.of(RegH990.class).withParent(Reg0000.class));
    }

    private void addBranchesBlocoK() {
        addNode(RegNode.of(RegK001.class).withParent(Reg0000.class));
        addNode(RegNode.of(RegK100.class).withParent(RegK001.class).withChildren(
            RegNode.of(RegK200.class),
            RegNode.of(RegK220.class),
            RegNode.of(RegK230.class).withChildren(
                RegNode.of(RegK235.class)
            ),
            RegNode.of(RegK250.class).withChildren(
                RegNode.of(RegK255.class)
            )
        ));
        addNode(RegNode.of(RegK990.class).withParent(Reg0000.class));
    }

    private void addBranchesBloco1() {
        addNode(RegNode.of(Reg1001.class).withParent(Reg0000.class));
        addNode(RegNode.of(Reg1010.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1100.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1105.class).withChildren(
                RegNode.of(Reg1110.class)
            )
        ));
        addNode(RegNode.of(Reg1200.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1210.class)
        ));
        addNode(RegNode.of(Reg1300.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1310.class).withChildren(
                RegNode.of(Reg1320.class)
            )
        ));
        addNode(RegNode.of(Reg1350.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1360.class),
            RegNode.of(Reg1370.class)
        ));
        addNode(RegNode.of(Reg1390.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1391.class)
        ));
        addNode(RegNode.of(Reg1400.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1500.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1510.class)
        ));
        addNode(RegNode.of(Reg1600.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1700.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1710.class)
        ));
        addNode(RegNode.of(Reg1800.class).withParent(Reg1001.class));
        addNode(RegNode.of(Reg1900.class).withParent(Reg1001.class).withChildren(
            RegNode.of(Reg1910.class).withChildren(
                RegNode.of(Reg1920.class).withChildren(
                    RegNode.of(Reg1921.class).withChildren(
                        RegNode.of(Reg1922.class),
                        RegNode.of(Reg1923.class)
                    ),
                    RegNode.of(Reg1925.class),
                    RegNode.of(Reg1926.class)
                )
            )
        ));
        addNode(RegNode.of(Reg1990.class).withParent(Reg0000.class));
    }

    private void addBranchesBloco9() {
        addNode(RegNode.of(Reg9001.class).withParent(Reg0000.class));
        addNode(RegNode.of(Reg9900.class).withParent(Reg9001.class));
        addNode(RegNode.of(Reg9990.class).withParent(Reg0000.class));
        addNode(RegNode.of(Reg9999.class));
    }

    @Override
    public List<Character> getBlocs() {
        return Arrays.asList('0', 'C', 'D', 'E', 'G', 'H', 'K', '1', '9');
    }
}
