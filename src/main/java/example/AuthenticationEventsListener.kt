package example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent
import org.springframework.security.authentication.event.AuthenticationSuccessEvent
import org.springframework.stereotype.Component

@Component
class AuthenticationEventsListener {
    var logger: Logger = LoggerFactory.getLogger(AuthenticationEventsListener::class.java)

    @EventListener
    fun onSuccess(success: AuthenticationSuccessEvent?) {
        logger.info("Authentication event onSuccess: {}", success)
    }

    @EventListener
    fun onFailure(failures: AbstractAuthenticationFailureEvent?) {
        logger.info("Authentication event onFailure: {}", failures)
    }
}