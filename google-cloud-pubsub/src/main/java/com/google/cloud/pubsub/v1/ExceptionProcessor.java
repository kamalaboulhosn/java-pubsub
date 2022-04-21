/**
 * An interface that can be implemented by users of {@code Subscriber} to
 * be informed of non-fatal errors.
 */
public interface ExceptionProcessor {
  /**
   * Process an exception received by the underlying Subscriber library that
   * was non-fatal. These are provided for informational purposes only.
   */
  void processException(Exception e) {

  }
}
