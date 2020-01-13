package study.daydayup.wolf.common.model.type.string;

import lombok.NonNull;
import study.daydayup.wolf.common.model.contract.DataType;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * study.daydayup.wolf.common.model.type.string
 *
 * @author Wingle
 * @since 2020/1/12 1:03 上午
 **/
public class Decimal implements DataType {
    private BigDecimal value;

    public static Decimal of(@NonNull String strNum) {
        return new Decimal(strNum);
    }

    public static Decimal of(long longNum) {
        return new Decimal(longNum);
    }

    public static Decimal of(int intNum) {
        return new Decimal(intNum);
    }

    public static Decimal of(BigDecimal big) {
        return new Decimal(big);
    }

    public Decimal(String strNum) {
        value = new BigDecimal(strNum);
    }

    public Decimal(BigDecimal big) {
        value = big;
    }

    public Decimal(long longNum) {
        value = BigDecimal.valueOf(longNum);
    }

    public long toLong() {
        if (value.compareTo(BigDecimal.ZERO) > 0) {
            return value.longValue();
        }
        BigDecimal num = value.setScale(0, BigDecimal.ROUND_HALF_UP);
        return num.longValue();
    }

    public int toInt() {
        if (value.compareTo(BigDecimal.ZERO) > 0) {
            return value.intValue();
        }

        BigDecimal num = value.setScale(0, BigDecimal.ROUND_HALF_UP);
        return num.intValue();
    }

    public void setValue(BigDecimal newValue) {
        if (newValue == null) {
            return;
        }
        value = newValue;
    }

    public BigDecimal toBigDecimal() {
        return value;
    }

    public String toString() {
        return value.toString();
    }

    public String toString(int scale) {
        if (scale < 1) {
            return toString();
        }

        return value.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decimal decimal = (Decimal) o;
        return value.equals(decimal.toBigDecimal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}