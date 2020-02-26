package study.daydayup.wolf.business.pay.api.domain.enums;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;

/**
 * study.daydayup.wolf.common.lang.enums
 *
 * @author Wingle
 * @since 2019/9/29 4:51 PM
 **/
@Getter
public enum PaymentStateEnum implements CodeBasedEnum {

    PARTIAL_REFUNDED(6, "部分退款"),
    REFUNDED(5, "已退款"),
    PAID(2, "支付成功"),
    FAIL(1, "支付失败"),
    WAIT_TO_PAY(0, "待支付"),
    ;

    private int code;
    private String desc;

    PaymentStateEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}