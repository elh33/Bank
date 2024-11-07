package ma.ensa.bank;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private TypeTransaction type;
    private Date timestamp;
    private String reference;

    public Transaction(Client client1, Client client2, Date timestamp, String reference) {
        this.type = TypeTransaction.calculerTypeTransaction(client1, client2);
        this.timestamp = timestamp;
        this.reference = reference;
    }

    /**
     * Convertit l'objet Transaction en JSON.
     */
    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    /**
     * Crée un objet Transaction à partir d'une chaîne JSON.
     */
    public static Transaction fromJson(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction.class);
    }
}
