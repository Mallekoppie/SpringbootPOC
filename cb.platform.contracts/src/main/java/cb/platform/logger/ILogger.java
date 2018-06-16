package cb.platform.logger;

public interface ILogger {
	void WriteInfo(String message);
	void WriteWarn(String message);
	void WriteError(String message);
}
