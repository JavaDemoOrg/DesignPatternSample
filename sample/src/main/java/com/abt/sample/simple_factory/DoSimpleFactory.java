package com.abt.sample.simple_factory;

/**
 * @描述： @DoSimpleFactory
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class DoSimpleFactory {

    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(10);
        oper.setNumberB(7);
        System.out.println(oper.getResult());

        oper = OperationFactory.createOperate("-");
        oper.setNumberA(10);
        oper.setNumberB(7);
        System.out.println(oper.getResult());

        oper = OperationFactory.createOperate("*");
        oper.setNumberA(10);
        oper.setNumberB(7);
        System.out.println(oper.getResult());

        oper = OperationFactory.createOperate("/");
        oper.setNumberA(10);
        oper.setNumberB(7);
        System.out.println(oper.getResult());
    }

}