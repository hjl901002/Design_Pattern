package com.pattern.strategy;

// 订单管理员(有B操作权限)
public class OrderAdminRole implements RoleOperation {

    private String roleName;

    public OrderAdminRole (String roleName){
        this.roleName = roleName;
    }

    @Override
    public String op() {
        return roleName + " has BBB permission";
    }
}
