package com.pattern.strategy;

public class JudgeRole {
    public String judge (RoleOperation roleOperation) {
        RoleContext roleContext = new RoleContext(roleOperation);
        return roleContext.execute();
    }
}
