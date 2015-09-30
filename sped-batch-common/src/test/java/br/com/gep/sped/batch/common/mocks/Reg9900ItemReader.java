package br.com.gep.sped.batch.common.mocks;

import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Component
public class Reg9900ItemReader extends JdbcCursorItemReader<Reg9900> {

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @PostConstruct
    private void init() {
        setSql(queryPartsProvider.getQueryParts(Reg9900.class).toString());
        setRowMapper(BeanPropertyRowMapper.newInstance(Reg9900.class));
    }

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }
}
