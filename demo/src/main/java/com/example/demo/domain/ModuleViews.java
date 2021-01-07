package com.example.demo.domain;

public class ModuleViews {
    private int moduleId; //模块编号
    private String moduleName; //模块名
    private int leftNumber; //左编号
    private int rightNumber; //右编号
    private int level;//等级

    public ModuleViews() {
    }

    public ModuleViews(int moduleId, String moduleName, int leftNumber, int rightNumber, int level) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ModuleViews{" +
                "moduleId=" + moduleId +
                ", moduleName='" + moduleName + '\'' +
                ", leftNumber=" + leftNumber +
                ", rightNumber=" + rightNumber +
                ", level=" + level +
                '}';
    }
}
