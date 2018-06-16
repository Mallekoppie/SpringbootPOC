package cb.platform.aspects;

import java.lang.annotation.Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import cb.platform.contract.annotations.TrackExecutionTime;

@Aspect
@Component
public class TrackExecutionAspect {

	@Around(value = "@annotation(cb.platform.contract.annotations.TrackExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

		MethodSignature method = (MethodSignature)joinPoint.getSignature();
		TrackExecutionTime annotation = method.getMethod().getAnnotation(TrackExecutionTime.class);

		long maxExecutionTimeLong = (long)annotation.MaxTimeInMS();
		System.out.println("Configured max execution time in ms" + maxExecutionTimeLong);
		
		long startTime = System.currentTimeMillis();

		Object proceed = joinPoint.proceed();

		long executionTime = System.currentTimeMillis() - startTime;

		if (executionTime > 0 && executionTime > maxExecutionTimeLong) {
			System.out.println(String.format("Method %s execution time: %d", joinPoint.getSignature(), executionTime));
		}

		return proceed;
	}

}
