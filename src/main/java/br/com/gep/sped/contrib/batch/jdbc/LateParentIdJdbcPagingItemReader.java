package br.com.gep.sped.contrib.batch.jdbc;

import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * ItemReader paginado para ler registros que dependem de um registro pai.
 * Uma vez que o id do registro pai é dinâmico, o parâmetro só pode ser setado antes
 * de a leitura ser realizada.
 * O JdbcPagingItemReader não tem nenhum tipo de callback para setar os parâmetros tardiamente.
 * @param <T> Tipo do registro a ser lido
 * @param <P> Tipo do registro pai
 */
public class LateParentIdJdbcPagingItemReader<T, P> extends JdbcPagingItemReader<T> {

    private final Class<P> parentRegClass;
    private final RegIdHolder regIdHolder;

    public LateParentIdJdbcPagingItemReader(Class<P> parentRegClass, RegIdHolder regIdHolder) {
        Assert.notNull(parentRegClass, "parentRegClass is null");
        Assert.notNull(regIdHolder, "regIdHolder is null");

        this.parentRegClass = parentRegClass;
        this.regIdHolder = regIdHolder;
    }

    @Override
    public T read() throws Exception, UnexpectedInputException, ParseException {
        setParentIdParameter();
        return super.read();
    }

    private void setParentIdParameter() {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("1", regIdHolder.getId(parentRegClass));
        setParameterValues(params);
    }
}
