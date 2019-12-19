package com.pattern.strategy;

public class Test {
    public static void main(String[] args) {
        JudgeRole judgeRole = new JudgeRole();
        String result1 = judgeRole.judge(new RootAdminRole("ROLE_ROOT_ADMIN"));
        System.out.println(result1);
        String result2 = judgeRole.judge(new OrderAdminRole("ROLE_ORDER_ADMIN"));
        System.out.println(result2);
        String result3 = judgeRole.judge(new NormalRole("ROLE_NORMAL"));
        System.out.println(result3);
    }
}
