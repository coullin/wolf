package study.daydayup.wolf.business.trade.buy.biz.virture.flow;

import org.springframework.stereotype.Component;
import study.daydayup.wolf.business.trade.buy.biz.base.AbstractTradeFlow;
import study.daydayup.wolf.business.trade.buy.biz.base.TradeFlow;
import study.daydayup.wolf.business.trade.buy.biz.base.TradeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * study.daydayup.wolf.business.trade.buy.loan
 *
 * @author Wingle
 * @since 2019/12/13 4:42 下午
 **/
@Component
public class AuditFlow extends AbstractTradeFlow implements TradeFlow {

    @Override
    public List<TradeNode> buildConfirmFlow() {
        return null;
    }

    @Override
    public List<TradeNode> buildPreviewFlow() {
        List<TradeNode> nodeList = new ArrayList<>();

        return null;
    }

    @Override
    public List<TradeNode> buildPayFlow() {
        return null;
    }

    @Override
    public List<TradeNode> buildPayNotifyFlow() {
        return null;
    }
}