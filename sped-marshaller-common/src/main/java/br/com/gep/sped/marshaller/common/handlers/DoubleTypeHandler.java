package br.com.gep.sped.marshaller.common.handlers;

import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DoubleTypeHandler implements TypeHandler {

    @Override
    public Object parse(String text) throws TypeConversionException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String format(Object value) {
        if (value == null) return "";

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        return new DecimalFormat("#0.#####", symbols).format(value);
    }

    @Override
    public Class<?> getType() {
        return Double.class;
    }
}
