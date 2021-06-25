package homework3.services;

import homework3.entities.Client;
import homework3.exceptions.UserExpectedError;
import homework3.utils.Helper;

public class TransactionService {
    public void transferOfMoney(Client client, String clientAccountID) throws UserExpectedError {
        Helper helper = new Helper();
        helper.checkAccountIdEquality(client.getClientAccountID(), clientAccountID);
    }
}
