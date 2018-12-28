package com.mycompany.app.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class ProfilingInterceptor implements MethodInterceptor {
  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    StopWatch sw = new StopWatch();
    sw.start(invocation.getMethod().getName());

    Object returnValue = invocation.proceed();
    sw.stop();
    dumpInfo(invocation, sw.getTotalTimeMillis());

    return returnValue;
  }

  private void dumpInfo(MethodInvocation invocation, long ms){
    Method m = invocation.getMethod();
    Object target = invocation.getThis();
    Object[] args = invocation.getArguments();

    System.out.println("Executed method: "+ m.getName());
    System.out.println("On object type: " + target.getClass().getName() );
    System.out.println("with arg: ");
    for (int x=0; x<args.length; x++){
      System.out.print(" > "+args[x]);
    }
    System.out.println("\nTook: "+ ms);
  }
}





