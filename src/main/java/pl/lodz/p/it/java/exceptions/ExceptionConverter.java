package pl.lodz.p.it.java.exceptions;
import javax.ejb.EJBAccessException;
import javax.ejb.EJBException;
import javax.ejb.EJBTransactionRequiredException;
import javax.ejb.EJBTransactionRolledbackException;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
/**
 *
 * @author Tomasz Berger
 */
public class ExceptionConverter {
    
    private static String parseMessage(PersistenceException e) {
        if (e.getMessage().contains("login_unique")) {
            return "Exception.unique.login";
        } else if (e.getMessage().contains("email_uniqe")) {
            return "Exception.unique.email";
        } else if (e.getMessage().contains("klient_pesel_key")) {
            return "Exception.unique.pesel";
        }
        return "Exception.UnhandledException";
    }
    static public AbstractException convert(Exception e) {
        if (e instanceof AbstractException) {
            return (AbstractException) (Exception) e;
        }
        else if (e instanceof OptimisticLockException) {
            return new OptLockException("Exception.OptLockException", e);
        }
        if (e instanceof PersistenceException) {
            return new PersException(parseMessage((PersistenceException) e), e);
        }
        else if (e instanceof EJBAccessException) {
            return new AccessException("Exception.access", e);
        }
        else if (e instanceof EJBTransactionRequiredException) {
            return new TransactionReqException("Exception.required", e);
        }
        else if (e instanceof EJBTransactionRolledbackException) {
            return new RollBackException("Exception.rollback", e);
        }
        else if (e instanceof EJBException) {
            return new MyEJBException("Exception.EJB", e);
        }
        else return new CriticalAppException("Exception.UnhandledException", e);
    }
}
