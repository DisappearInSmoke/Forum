package com.example.demo.domain;

public class Module { //模块表实体
    private int moduleId; //模块编号
    private String moduleName; //模块名
    private int leftNumber; //左编号
    private int rightNumber; //右编号

    public Module() {
    }

    public Module(int moduleId, String moduleName, int leftNumber, int rightNumber) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleId=" + moduleId +
                ", moduleName='" + moduleName + '\'' +
                ", leftNumber=" + leftNumber +
                ", rightNumber=" + rightNumber +
                '}';
    }
}
