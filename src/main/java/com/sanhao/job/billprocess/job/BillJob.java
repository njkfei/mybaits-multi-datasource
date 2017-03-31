package com.sanhao.job.billprocess.job;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import com.sanhao.job.billprocess.config.Config;

import com.sanhao.job.lesson.dao.PackageDAO;
import com.sanhao.job.billprocess.dao.UserDAO;
import com.sanhao.job.billprocess.model.ApplyCash;
import com.sanhao.job.billprocess.model.Bill;
import com.sanhao.job.billprocess.model.BillDetail;
import com.sanhao.job.billprocess.model.BillInfo;
import com.sanhao.job.billprocess.model.Coupon;
import com.sanhao.job.billprocess.model.CouponTemplate;
import com.sanhao.job.billprocess.model.FeeLog;
import com.sanhao.job.billprocess.model.Order;
import com.sanhao.job.billprocess.model.OrderCT;
import com.sanhao.job.billprocess.model.Pay;
import com.sanhao.job.billprocess.model.User;
import com.sanhao.job.lesson.model.Package;

public class BillJob {

    static Logger logger = LoggerFactory.getLogger("bill");

    @Value("${bill_id_mode:1}")
    private int mode; // 工作模式：bill_id起始值从mysql取 1 mysql 0 配置

    @Value("${start_bill_id:0}")
    private int curr_bill_id; // 增量工作时，处理起始时间

    @Value("${count_per_time:10}")
    private int count_per_time; // 增量时，每次处理的数量


    @Autowired
    private UserDAO userDAO;


    @Autowired
    private PackageDAO packageDAO;


    @Value("#{T(java.util.Arrays).asList('${bill.filter:2,4,6}')}")
    private List<Integer> filter;

    @Value("#{T(java.util.Arrays).asList('${bill.filter.users}')}")
    private List<Integer> filterUsers;

    @Value("#{T(java.util.Arrays).asList('${bill.filter.id:17065}')}")
    private List<Integer> filterBillIds;

    @Value("${test.mode:false}")
    private boolean test_mode;

    @Value("${test.id:971}")
    private int test_id;


    // @Scheduled(fixedDelay = 150000000)
    @Scheduled(cron = "${app.cron:*/2 * * * * *}")
    public void JobStart() {
        // something that should execute periodically
        logger.info(new Date() + "　==> JOB START ...");


        System.out.println(userDAO.getName(1));
        System.out.println(packageDAO.getCourseName(1));
    }


}