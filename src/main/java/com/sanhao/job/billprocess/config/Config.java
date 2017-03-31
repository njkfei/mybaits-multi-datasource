package com.sanhao.job.billprocess.config;

public class Config {

    // 常量定义

    public static final int BILL_ORDER_PAY = 1; // "订单支付";
    public static final int BILL_REBACK = 2;//  "退款";
    public static final int BILL_APPLY_CASH = 3;//"提现";
    public static final int BILL_CHARGE = 4;//"充值";
    public static final int BILL_PLAT_CHARGE = 5;//"平台充值";
    public static final int BILL_PLAT_SERVICE_FEE = 6; // 老师订单的平台服务费用
    public static final int BILL_PLAT_KOUFEI = 7; // 老师订单的平台服务费用
    public static final int BILL_BUY_COUPON = 8; // 学生购买券
    public static final int BILL_HHR_IN = 9;  // 合伙人计划收入
    public static final int BILL_BUTIE_IN = 10; //补贴充值用户收入
    public static final int BILL_BUTIE_OUT = 11; // 补贴扣除用户收入
    public static final int BILL_HXB_OUT = 12;    // 买好学宝支出
    public static final int BILL_UR_IN = 13;    //  用户推荐有礼奖励收入

    // 收入支出
    public static final int INCOME_DEFAULT = 0;
    public static final int INCOME_OUT = 2;
    public static final int INCOME_IN = 1;

    // bill_state
    public static final int BILL_STATE_DEFAULT = 0;
    public static final int BILL_STATE_PAY_OK = 1; // 支付成功
    public static final int BILL_STATE_CHARGE_OK = 2; // 充值成功
    public static final int BILL_STATE_REBACK = 3; // 退款
    public static final int BILL_STATE_AC = 4; // 提现
    public static final int BILL_STATE_CHARGE_ADMIN = 5; //管理员充值
    public static final int BILL_STATE_KOUFEI_ADMIN = 6; //管理员充值
    public static final int BILL_STATE_CHARGE_USER = 7; //管理员充值
    public static final int BILL_STATE_COUPON_BUY = 8; // 学生购买券
    public static final int BILL_STATE_HHR_IN = 9; // 合伙人计划收入
    public static final int BILL_STATE_BUTIE_IN = 10; //补贴充值用户收入
    public static final int BILL_STATE_BUTIE_OUT = 11; // 补贴扣除用户收入
    public static final int BILL_STATE_HXB_OUT = 12;    // 买好学宝支出
    public static final int BILL_STATE_UR_IN = 68;    //  用户推荐有礼奖励收入

    // detail_type
    public static final int DETAIL_TYPE_DEFAULT = 0;
    public static final int DETAIL_TYPE_ORDER = 1; // 表示详情是订单
    public static final int DETAIL_TYPE_REBACK = 2; // 表示详情是退款
    public static final int DETAIL_TYPE_AC = 3; // 表示详情是申请提现

    // PAY_TYPE
    public static final int PAY_TYPE_DEFALUT = 0; // 刚购买课程时的记录
    public static final int PAY_TYPE_ALL = 1;
    public static final int PAY_TYPE_PART = 2;
    public static final int PAY_TYPE_NO = 3;
    public static final int PAY_TYPE_CANCEL = 4; //订单取消

    // user type
    public static final int USER_TYPE_TEACHER = 1; //教师身份
    public static final int USER_TYPE_STUDENT = 2; // 学生身份
}
