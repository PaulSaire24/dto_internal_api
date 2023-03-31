package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class GoodASO extends AbstractDTO {
    private GoodDetailASO goodDetail;

    public GoodDetailASO getGoodDetail() {return goodDetail;}
    public void setGoodDetail(GoodDetailASO goodDetail) {this.goodDetail = goodDetail;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GoodASO{");
        sb.append("goodDetail=").append(this.getGoodDetail());
        sb.append("}");
        return sb.toString();
    }
}
