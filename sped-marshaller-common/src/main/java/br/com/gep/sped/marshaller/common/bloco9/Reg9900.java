package br.com.gep.sped.marshaller.common.bloco9;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registros do Arquivo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "9900"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg9900 extends Registro {
    
    @Field(at = 2)
    private String regBlc;
    
    @Field(at = 3)
    private Integer qtdRegBlc;
    
    
    /**
     * Obtém Registro que será totalizado no próximo campo
     */
    public String getRegBlc() {
        return regBlc;
    }

    /**
     * Seta Registro que será totalizado no próximo campo
     * <p>0000;0001;0005;0015;0100;0150;0175;0190;0200;0205;0206;0220;0300;0305;0400;0450;0460;0500;0600;0990;C001;C100;C105;C110;C111;C112;C113;C114;C115;C116;C120;C130;C140;C141;C160;C165;C170;C171;C172;C173;C174;C175;C176;C177;C178;C179;C190;C195;C197;C300;C310;C320;C321;C350;C370;C390;C400;C405;C410;C420;C425;C460;C465;C470;C490;C500;C510;C590;C600;C601;C610;C690;C700;C790;C791;C800;C850;C860;C890;C990;D001;D100;D110;D120;D130;D140;D150;D160;D161;D162;D170;D180;D190;D195;D197;D300;D301;D310;D350;D355;D360;D365;D370;D390;D400;D410;D411;D420;D500;D510;D530;D590;D600;D610;D690;D695;D696;D697;D990;E001;E100;E110;E111;E112;E113;E115;E116;E200;E210;E220;E230;E240;E250;E500;E510;E520;E530;E990;G001;G110;G125;G126;G130;G140;G990;H001;H005;H010;H020;H990;1001;1010;1100;1105;1110;1200;1210;1300;1310;1320;1350;1360;1370;1390;1391;1400;1500;1510;1600;1700;1710;1800;1900;1910;1920;1921;1922;1923;1925;1926;1990;9001;9900;9990;9999</p>
     */
    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }
    
    /**
     * Obtém Total de registros do tipo informado no campo anterior
     */
    public Integer getQtdRegBlc() {
        return qtdRegBlc;
    }

    /**
     * Seta Total de registros do tipo informado no campo anterior
     */
    public void setQtdRegBlc(Integer qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
    }
    
}