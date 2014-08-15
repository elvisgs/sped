package br.com.gep.sped.contrib.batch.common;

import org.springframework.batch.core.ExitStatus;

public class CustomExitStatus {

    public static final String NO_MORE_REG_CODE = "NO_MORE_REG";
    public static final String PROCESS_CHILD_REG_CODE = "PROCESS_CHILD_REG";

    public static final ExitStatus NoMoreReg = new ExitStatus(NO_MORE_REG_CODE);
    public static final ExitStatus ProcessChildReg = new ExitStatus(PROCESS_CHILD_REG_CODE);
}
