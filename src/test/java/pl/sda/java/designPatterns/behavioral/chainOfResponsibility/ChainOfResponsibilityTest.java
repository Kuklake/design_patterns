package pl.sda.java.designPatterns.behavioral.chainOfResponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityTest {

    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }

    @Test
    public void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProvider authProvider = new OAuthTokenProvider();

        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();

        assertTrue(authProcessorChain.isAuthorized(authProvider));
    }

    @Test
    public void givenSamlProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProvider authProvider = new SamlAuthenticationProvider();

        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();

        assertFalse(authProcessorChain.isAuthorized(authProvider));
    }

}