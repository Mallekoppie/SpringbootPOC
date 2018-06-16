package cb.platform.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TrackExecutionAspect {
	//, argNames="MaxTimeInMS"
	@Around(value= "@annotation(cb.platform.contract.annotations.TrackExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		Object proceed = joinPoint.proceed();
		
		long executionTime = System.currentTimeMillis() - startTime;
		
		System.out.println(String.format("Method execution time: %d", executionTime));
		
		return proceed;
	}

}
