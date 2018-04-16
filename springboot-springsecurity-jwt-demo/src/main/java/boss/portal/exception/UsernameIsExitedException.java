package boss.portal.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author lb_chen
 */
public class UsernameIsExitedException extends AuthenticationException {
	private static final long serialVersionUID = 2491570422672205408L;

	public UsernameIsExitedException(String msg) {
		super(msg);
	}

	public UsernameIsExitedException(String msg, Throwable t) {
		super(msg, t);
	}
}