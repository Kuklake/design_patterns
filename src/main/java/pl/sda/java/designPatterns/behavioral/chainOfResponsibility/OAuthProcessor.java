package pl.sda.java.designPatterns.behavioral.chainOfResponsibility;

public class OAuthProcessor extends AuthenticationProcessor{

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor );
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof OAuthTokenProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }

        return false;
    }
}
