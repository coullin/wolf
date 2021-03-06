package study.daydayup.wolf.business.pay.api.dto.base.manage;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import study.daydayup.wolf.framework.layer.api.Request;
import study.daydayup.wolf.framework.rpc.page.PageRequest;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

/**
 * study.daydayup.wolf.business.pay.api.dto
 *
 * @author Wingle
 * @since 2020/2/27 3:53 下午
 **/
@EqualsAndHashCode(callSuper = false)
@Data
@SuperBuilder
@NoArgsConstructor
public class SettlementQuery extends PageRequest implements Request {
    @NotNull @Positive
    protected Long accountId;
    protected Integer settlementType;
    protected Integer state;

    protected String settlementNo;

    protected String createdBefore;
    protected String createdAfter;
    protected LocalDateTime createdStart;
    protected LocalDateTime createdEnd;

}
