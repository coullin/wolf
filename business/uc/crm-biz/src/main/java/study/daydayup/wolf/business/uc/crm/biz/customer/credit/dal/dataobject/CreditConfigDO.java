package study.daydayup.wolf.business.uc.crm.biz.customer.credit.dal.dataobject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CreditConfigDO implements Serializable {
    private Long id;

    private Long orgId;

    private Boolean enable;

    private BigDecimal promotePerOrder;

    private BigDecimal minAmount;

    private BigDecimal maxAmount;

    private Integer currency;

    private Integer minPromotionPeriod;

    private Integer maxTimesPerDay;

    private Integer maxTimesPerWeek;

    private Integer maxTimesPerMonth;

    private Integer maxTimesPerYear;

    private Integer version;

    private Integer deleteFlag;

    private Long lastEditor;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgId=").append(orgId);
        sb.append(", enable=").append(enable);
        sb.append(", promotePerOrder=").append(promotePerOrder);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", currency=").append(currency);
        sb.append(", minPromotionPeriod=").append(minPromotionPeriod);
        sb.append(", maxTimesPerDay=").append(maxTimesPerDay);
        sb.append(", maxTimesPerWeek=").append(maxTimesPerWeek);
        sb.append(", maxTimesPerMonth=").append(maxTimesPerMonth);
        sb.append(", maxTimesPerYear=").append(maxTimesPerYear);
        sb.append(", version=").append(version);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CreditConfigDO other = (CreditConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getPromotePerOrder() == null ? other.getPromotePerOrder() == null : this.getPromotePerOrder().equals(other.getPromotePerOrder()))
            && (this.getMinAmount() == null ? other.getMinAmount() == null : this.getMinAmount().equals(other.getMinAmount()))
            && (this.getMaxAmount() == null ? other.getMaxAmount() == null : this.getMaxAmount().equals(other.getMaxAmount()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getMinPromotionPeriod() == null ? other.getMinPromotionPeriod() == null : this.getMinPromotionPeriod().equals(other.getMinPromotionPeriod()))
            && (this.getMaxTimesPerDay() == null ? other.getMaxTimesPerDay() == null : this.getMaxTimesPerDay().equals(other.getMaxTimesPerDay()))
            && (this.getMaxTimesPerWeek() == null ? other.getMaxTimesPerWeek() == null : this.getMaxTimesPerWeek().equals(other.getMaxTimesPerWeek()))
            && (this.getMaxTimesPerMonth() == null ? other.getMaxTimesPerMonth() == null : this.getMaxTimesPerMonth().equals(other.getMaxTimesPerMonth()))
            && (this.getMaxTimesPerYear() == null ? other.getMaxTimesPerYear() == null : this.getMaxTimesPerYear().equals(other.getMaxTimesPerYear()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getLastEditor() == null ? other.getLastEditor() == null : this.getLastEditor().equals(other.getLastEditor()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getPromotePerOrder() == null) ? 0 : getPromotePerOrder().hashCode());
        result = prime * result + ((getMinAmount() == null) ? 0 : getMinAmount().hashCode());
        result = prime * result + ((getMaxAmount() == null) ? 0 : getMaxAmount().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getMinPromotionPeriod() == null) ? 0 : getMinPromotionPeriod().hashCode());
        result = prime * result + ((getMaxTimesPerDay() == null) ? 0 : getMaxTimesPerDay().hashCode());
        result = prime * result + ((getMaxTimesPerWeek() == null) ? 0 : getMaxTimesPerWeek().hashCode());
        result = prime * result + ((getMaxTimesPerMonth() == null) ? 0 : getMaxTimesPerMonth().hashCode());
        result = prime * result + ((getMaxTimesPerYear() == null) ? 0 : getMaxTimesPerYear().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getLastEditor() == null) ? 0 : getLastEditor().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}