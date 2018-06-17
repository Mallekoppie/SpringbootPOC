package cb.platform.test.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlertOnLongExecutionTimeAspect {

	@Around(value = "@annotation(cb.platform.test.annotations.AlertOnLongExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

		var maxExecutionTimeLong = 1l;

		System.out.println("Configured max execution time in ms" + maxExecutionTimeLong);

		long startTime = System.currentTimeMillis();

		Object proceed = joinPoint.proceed();

		long executionTime = System.currentTimeMillis() - startTime;

		System.out.println(String.format("Method %s execution time: %d", joinPoint.getSignature(), executionTime));

		return proceed;
	}
}
