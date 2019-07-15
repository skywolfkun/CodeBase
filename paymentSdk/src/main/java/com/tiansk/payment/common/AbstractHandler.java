package com.tiansk.payment.common;

import com.tiansk.payment.bean.LoanBean;
import com.tiansk.payment.bean.PaymentBean;
import com.tiansk.payment.bean.ResultBean;

public abstract class AbstractHandler {
    /**
     * 发起支付
     * @param paymentBean
     * @return
     */
    abstract public ResultBean sendPayment(PaymentBean paymentBean);

    /**
     * 发起代付
     * @param loanBean
     * @return
     */
    abstract public ResultBean sendLoan(LoanBean loanBean);
}
