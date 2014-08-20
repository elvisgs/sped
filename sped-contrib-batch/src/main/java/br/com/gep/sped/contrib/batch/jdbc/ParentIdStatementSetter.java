package br.com.gep.sped.contrib.batch.jdbc;

import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParentIdStatementSetter<T> implements PreparedStatementSetter {

    private final Class<T> parentClass;
    private final RegIdHolder regIdHolder;

    public ParentIdStatementSetter(Class<T> parentClass, RegIdHolder regIdHolder) {
        this.parentClass = parentClass;
        this.regIdHolder = regIdHolder;
    }

    @Override
    public void setValues(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setInt(1, regIdHolder.getId(parentClass));
    }
}
