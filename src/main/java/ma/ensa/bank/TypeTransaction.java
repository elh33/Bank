package ma.ensa.bank;

public enum TypeTransaction {
    VIRINI,    // Transaction entre deux clients de la même banque et du même pays
    VIREST,    // Transaction entre deux clients de la même banque, mais de pays différents
    VIRMULTA,  // Transaction entre deux clients de banques différentes mais du même pays
    VIRCHAC;   // Transaction entre deux clients de banques et de pays différents

    /**
     * Calcule automatiquement le type de transaction en fonction des banques et pays des clients.
     */
    public static TypeTransaction calculerTypeTransaction(Client client1, Client client2) {
        if (client1.getBanque().getId() == client2.getBanque().getId()) {
            if (client1.getBanque().getPays().equals(client2.getBanque().getPays())) {
                return VIRINI;
            } else {
                return VIREST;
            }
        } else {
            if (client1.getBanque().getPays().equals(client2.getBanque().getPays())) {
                return VIRMULTA;
            } else {
                return VIRCHAC;
            }
        }
    }
}
