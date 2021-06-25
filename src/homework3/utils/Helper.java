package homework3.utils;

import homework3.exceptions.UserExpectedError;
import homework3.exceptions.WrongFieldException;
import homework3.exceptions.WrongSumException;

public class Helper {

    public void checkClientAccountID(String clientAccountID) throws WrongFieldException {
        if (clientAccountID.length() == 10) {
            throw new WrongFieldException("Incorrect client Account Id length: "
                    + clientAccountID.length());
        }
    }

    public void checkSum(double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException("Incorrect sum: " + sum);
        }
    }

    public void checkAccountIdEquality(String clientAccountIDSend, String clientAccountIDAccept) throws UserExpectedError {
        if (clientAccountIDSend.equals(clientAccountIDAccept)) {
            throw new UserExpectedError("Account Id Who Sends should not match Account Id who accepts.\n" + "Transaction failed.");
        }
    }
}
