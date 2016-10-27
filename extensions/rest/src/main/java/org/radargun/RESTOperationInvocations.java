package org.radargun;

import java.util.List;
import javax.ws.rs.core.Cookie;
import org.radargun.stages.test.Invocation;
import org.radargun.traits.RESTOperations;

/**
 * Provides {@link Invocation} implementations for operations from traits
 * {@link RESTOperationInvocations}
 *
 * @author Martin Gencur
 */
public class RESTOperationInvocations {
   public static final class Get implements Invocation<WrappedHttpResponse> {
      public static final Operation GET_NULL = RESTOperations.GET.derive("Null");
      private final RESTOperations.RESTOperationInvoker httpInvoker;
      private WrappedHttpResponse returnValue;
      private List<Cookie> cookies;

      public Get(RESTOperations.RESTOperationInvoker httpInvoker, List<Cookie> cookies) {
         this.httpInvoker = httpInvoker;
         this.cookies = cookies;
      }

      @Override
      public WrappedHttpResponse invoke() {
         return returnValue = httpInvoker.get(cookies);
      }

      @Override
      public Operation operation() {
         return returnValue == null ? GET_NULL : RESTOperations.GET;
      }

      @Override
      public Operation txOperation() {
         return GET_NULL;
      }
   }
}