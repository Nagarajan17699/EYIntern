///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Day10;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.util.Scanner;
//
///**
// *
// * @author Nagarajan
// */
//public class Subjection {
//
//    public static void main(String[] args) {
//
//        Object n = new Nagarajan();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Created Nagarajan...");
//        s.next();
//
//        Engineer e = new Engineer();
//        n = Proxy.newProxyInstance(Nagarajan.class.getClassLoader(), new Class[]{Engineering.class}, new MyInvocator(e));
//        Engineering EngineerN = (Engineering)n;
//        EngineerN.doCreate();
//        
//
//    }
//}
//
//interface Engineering {
//
//    public void doCreate();
//}
//
//class Nagarajan {
//}
//
//class MyInvocator implements InvocationHandler {
//
//    Object obj;
//
//    MyInvocator(Object obj) {
//        this.obj = obj;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("Executing additional features...");
//        return method.invoke(obj, args);
//    }
//
//}
//class Engineer implements Engineering{
//
//        @Override
//        public void doCreate() {
//               System.out.println("Engineer is building a new software...");
//        }
//}
