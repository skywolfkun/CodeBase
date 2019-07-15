package com.tiansk.payment.heepay;

import com.tiansk.payment.bean.LoanBean;
import com.tiansk.payment.bean.PaymentBean;
import com.tiansk.payment.bean.ResultBean;
import com.tiansk.payment.common.AbstractHandler;
import com.tiansk.payment.common.PaymentType;
import org.springframework.stereotype.Component;

@Component
@PaymentType("HEEPAY")
public class HeepayHandler extends AbstractHandler {

    @Override
    public ResultBean sendPayment(PaymentBean paymentBean) {
        return null;
    }

    @Override
    public ResultBean sendLoan(LoanBean loanBean) {
        return null;
    }
}
