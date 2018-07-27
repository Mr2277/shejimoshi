package com.shejimoshi.builder;

public class ConBuilder extends Builder {
    //创建产品实例
    Computer computer = new Computer();
    @Override
    public void BuildCPU() {
        computer.Add("组装CPU");

    }

    @Override
    public void BuildMainboard() {
        computer.Add("组装主板");

    }

    @Override
    public void BuildHD() {
        computer.Add("组装主板");

    }

    @Override
    public Computer GetComputer() {
        return computer;
    }
}
