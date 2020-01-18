package study.daydayup.wolf.business.trade.api.dto.tm.contract.seller;

import study.daydayup.wolf.business.trade.api.dto.tm.trade.SellerRequest;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * study.daydayup.wolf.business.trade.api.dto.tm.contract
 *
 * @author Wingle
 * @since 2020/1/14 10:51 上午
 **/
public class StateRequest extends SellerRequest {
    @NotNull @Min(1)
    private Integer state;
}
